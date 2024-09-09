package com.example.music;

public class RadioStationSource implements MusicSource {
    @Override
    public void playMusic() {
        System.out.println("Playing music from the radio station.");
    }
}
