package cn.goingtodo.functional;


/*
*
*函数式接口就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。
*函数式接口可以被隐式转换为lambda表达式.
*/
public class Main {
    public static void main(String[] args) {
        //java8函数式接口
        GreetingService greetService1 = message -> System.out.println("Hello " + message);
        greetService1.saymessage("livingbody");
    }
}
