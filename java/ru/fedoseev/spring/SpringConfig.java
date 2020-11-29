package ru.fedoseev.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

/*
      This is my Configuration file, I have decided to create beans and go through
    Dependency Injection without using @Autowired, @Component and etc. This is for
    personal practicing reasons.
 */
@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
      
    // Three simple beans for three music genres:
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public YiddishMusic yiddishMusic() {return new YiddishMusic(); }

    // A list bean with those three beans
    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), rockMusic(), yiddishMusic()); }

    // Injecting the musicList bean into musicPlayer
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    // A computer bean (not used in this time)
    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
