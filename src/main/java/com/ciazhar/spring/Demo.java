package com.ciazhar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo{
  public static void main(String[] args) {
    //Buat Objek ApplicationContext bernama ctx dengan classpath:ioc.xml
    ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:ioc.xml");
    ///Buat Objek Person bernama p berdasarkan Bean dari ctx
    Person p = (Person) ctx.getBean("ciazhar");

    System.out.println("Nama : "+p.getNama());
    System.out.println("Alamat : "+p.getAlamat().getJalan());

  }
}
