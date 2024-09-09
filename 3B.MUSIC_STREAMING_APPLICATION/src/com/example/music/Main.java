package com.example.music;

public class Main {
    public static void main(String[] args) {
        RadioStationSource radioStation = new RadioStationSource();
        MusicSourceAdapter adapter = new RadioStationAdapter(radioStation);
        MusicSource musicSource = adapter.adapt();
        musicSource.playMusic();
    }
}
