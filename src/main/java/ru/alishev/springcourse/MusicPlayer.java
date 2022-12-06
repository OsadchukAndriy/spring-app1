package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private List<Music> music;

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public String PlayMusic() {
        Random random = new Random();

            return "Playing: " + music.get(random.nextInt(music.size())).getSong();
    }
}
