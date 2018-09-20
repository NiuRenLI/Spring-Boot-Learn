package me.niurenli.chapter01.greet;

/**
 * 1：为什么要用final修饰成员变量
 * 2：为什么只有get方法？
 *
 * RESTful的资源类。
 */
public class Greeting {
    //final修饰的变量，内容不能被修改。相当于将变量变成了常量
    //必须在声明时初始化，有两种方式：1 声明时直接提供。2 在构造函数中赋值
    //final还可修饰方法参数和局部变量
    private final Long id;
    private final String name;


    public Greeting(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
