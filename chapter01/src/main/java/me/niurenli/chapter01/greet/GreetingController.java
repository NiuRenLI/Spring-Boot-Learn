package me.niurenli.chapter01.greet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * RESTful Web Service Controller
 * 和普通MVC控制器最大区别是：返回不同。前者返回资源类对象（@RestController），后者返回视图（@Controller）
 * 如果想在普通Controller中返回JSON，需要借助@ResponseBody注解
 */
@RestController
public class GreetingController {
    private static final String template = "Hello,%s!";

    private final AtomicLong counter = new AtomicLong();//线程安全

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
