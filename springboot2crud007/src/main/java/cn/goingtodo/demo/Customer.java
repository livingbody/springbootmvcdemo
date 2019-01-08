package cn.goingtodo.demo;

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
