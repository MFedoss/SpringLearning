package ru.fedoseev.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// My main method here
public class TestSpring {
    public static void main(String[] args) {
        // the configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        // Creating a musicPlayer from a bean
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        // Testing whether it works (worked! :D)
        System.out.println(musicPlayer.playMusic());
        context.close();
    }
}