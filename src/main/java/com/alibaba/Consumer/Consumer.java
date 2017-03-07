package com.alibaba.Consumer;

import com.alibaba.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by liaosheng on 2017/3/2.
 */

public class Consumer {

    public static void main(String[] args) throws Exception {

        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(new String[] {"src/consumer.xml"});
        context.start();

        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String res = demoService.sayHello("world"); // 执行远程方法
        System.out.println( res ); // 显示调用结果
        System.out.println( demoService.allMethod("廖晟",Consumer.class)); // 显示调用结果
        System.in.read(); // 按任意键退出
    }

}