package me.niurenli.chapter01.greet;

/**
 * 1：为什么要用final修饰成员变量
 * 2：为什么只有get方法？
 */
public class Greeting {
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
