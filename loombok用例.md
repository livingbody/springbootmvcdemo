# lombok 用例

## pom.xml引入

```xml

        <!--使用@Data,自动生成get、set、toString方法-->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
```

## java类引入

```java
/**
 * 1.lombok.Data不用多说了吧，这个真心好用，一个Data，省去getter/setter/toString
 * 2.lombok.AllArgsConstructor全参数构造函数，也有用的 @AllArgsConstructor
 */

@Data
public class User {
    private int id;
    private String user_name;
    private String user_password;
}

```

## 更多自行琢磨，我用的最多的就是这两种了

