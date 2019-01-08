# SPRINGBOOT2 & JPA 实做
## pom.xml引入
```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <!--使用@Data,自动生成get、set、toString方法-->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
```
## pojo生成
```java
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Customer {

    /**
     * 使用@GeneratedValue，将发生下列错误
     * 2019-01-08 16:35:39.818  WARN 28272 --- [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : SQL Error: 1146, SQLState: 42S02
     * 2019-01-08 16:35:39.818 ERROR 28272 --- [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : Table 'test.hibernate_sequence' doesn't exist
     * 2019-01-08 16:35:39.825  INFO 28272 --- [           main] ConditionEvaluationReportLoggingListener :
     * 建议使用@GeneratedValue(strategy = GenerationType.IDENTITY)
     */
    @Id
//    @GeneratedValue
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * firstname 对应first_name
     * firstname 对应firstname
     */
    private String firstname;
    private String lastname;

    protected Customer() {
    }

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

}

```

## DAO 代码
```java

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByLastnameStartsWithIgnoreCase(String lastName);
}

```
## Main Test
```java

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(CustomerRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Customer customer = repository.findById(1L).get();
            log.info("Customer found with findOne(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customer found with findByLastNameStartsWithIgnoreCase('Bauer'):");
            log.info("--------------------------------------------");
            for (Customer bauer : repository
                    .findByLastnameStartsWithIgnoreCase("Bauer")) {
                log.info(bauer.toString());
            }
            log.info("");
        };
    }
}
```