package ru.fedoseev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(Genre genre) {
        Random rand = new Random();

        switch (genre){
            case ROCK:
                return "Playing: " + music1.getSong().get(rand.nextInt(music1.getSong().size()));
            case CLASSICAL:
                return "Playing: " + music2.getSong().get(rand.nextInt(music2.getSong().size()));
        }
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
}