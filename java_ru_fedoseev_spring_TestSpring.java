package ru.fedoseev.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer.playSong(Genre.CLASSICAL));
        System.out.println(computer.playSong(Genre.ROCK));

        context.close();
    }
}