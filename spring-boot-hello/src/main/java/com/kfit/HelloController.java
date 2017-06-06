package com.kfit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaloo on 2017/6/5.
 */
@RestController
public class HelloController {

  @RequestMapping("/hello")
  public String hello() {
    return "hello world!";
  }

  @RequestMapping("/getDemo")
  public Demo getDemo(){
    Demo demo  = new Demo();
    demo.setId(1);
    demo.setName("张三");
    return demo;
  }
}