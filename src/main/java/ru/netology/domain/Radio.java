package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 & currentStation <= 9) {
            this.currentStation = currentStation;
        }
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation += 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation -= 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        if (volume > 0 & volume <= 10) {
            this.currentVolume = volume;
        }
    }

    public void nextVolume() {
        if (currentVolume != 10) {
            currentVolume += 1;
        }
    }

    public void prevVolume() {
        if (currentVolume != 0) {
            currentVolume -= 1;
        }
    }

}
