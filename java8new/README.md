
# Lambda 表达式 − Lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中。

# 方法引用 − 方法引用提供了非常有用的语法，可以直接引用已有Java类或对象（实例）的方法或构造器。与lambda联合使用，方法引用可以使语言的构造更紧凑简洁，减少冗余代码。

# 默认方法 − 默认方法就是一个在接口里面有了一个实现的方法。

# 新工具 − 新的编译工具，如：Nashorn引擎 jjs、 类依赖分析器jdeps。

# Stream API −新添加的Stream API（java.util.stream） 把真正的函数式编程风格引入到Java中。

# Date Time API − 加强对日期与时间的处理。

# Optional 类 − Optional 类已经成为 Java 8 类库的一部分，用来解决空指针异常。

# Nashorn, JavaScript 引擎 − Java 8提供了一个新的Nashorn javascript引擎，它允许我们在JVM上运行特定的javascript应用。
```java
// 1. 不需要参数,返回值为 5  
() -> 5  
  
// 2. 接收一个参数(数字类型),返回其2倍的值  
x -> 2 * x  
  
// 3. 接受2个参数(数字),并返回他们的差值  
(x, y) -> x – y  
  
// 4. 接收2个int型整数,返回他们的和  
(int x, int y) -> x + y  
  
// 5. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)  
(String s) -> System.out.print(s)
```