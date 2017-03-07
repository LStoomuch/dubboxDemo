package com.alibaba.Provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by liaosheng on 2017/3/2.
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(new String[] {"src/provider.xml"});
        context.start();
        System.out.println("请按任意键退出");
        System.in.read(); // 按任意键退出
    }

}