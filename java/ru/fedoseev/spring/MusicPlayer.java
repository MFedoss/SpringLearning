package ru.fedoseev.spring;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> musicList;

    // constructor that receives a List of music genres
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    // Getting the name and volume from my resources package (musicPlayer.properties)
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    // getters
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //Playing a random song from the music list
    public String playMusic() {
        Random rand = new Random();
        return "Playing: " + musicList.get(rand.nextInt(musicList.size())).getSong();
    }
}
