package com.alibaba.Service;

/**
 * Created by liaosheng on 2017/3/2.
 */
public class DemoServiceImpl implements DemoService{

    public String sayHello(String msg) {
        return "Hello "+msg;
    }

    public String allMethod(String msg,Class c) {
        return "服务端已处理此次请求  "+msg+"   "+c;
    }
}
