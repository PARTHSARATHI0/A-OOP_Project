package com.example.music;

public class RadioStationAdapter implements MusicSourceAdapter {
    private RadioStationSource radioStationSource;

    public RadioStationAdapter(RadioStationSource radioStationSource) {
        this.radioStationSource = radioStationSource;
    }

    @Override
    public MusicSource adapt() {
        return radioStationSource;
    }
}
