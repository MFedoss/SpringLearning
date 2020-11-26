package ru.fedoseev.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    public List<String> rockMusicList = new ArrayList<>();

    {
        rockMusicList.add("RockSong1");
        rockMusicList.add("RockSong2");
        rockMusicList.add("RockSong3");
    }

    @Override
    public List getSong() {
        return rockMusicList;
    }
}