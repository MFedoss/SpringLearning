package ru.fedoseev.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    public List<String> classicalMusicList = new ArrayList<>();

    {
        classicalMusicList.add("ClassicalSong1");
        classicalMusicList.add("ClassicalSong2");
        classicalMusicList.add("ClassicalSong3");
    }

    @Override
    public List getSong() {
        return classicalMusicList;
    }
}