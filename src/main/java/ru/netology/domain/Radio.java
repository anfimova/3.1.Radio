package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int stationQuantity = 10;

    public Radio() {
    }

    public Radio(int stationQuantity) {
        this.stationQuantity = stationQuantity;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 & currentStation <= stationQuantity) {
            this.currentStation = currentStation;
        }
    }

    public void nextStation() {
        if (currentStation == stationQuantity) {
            currentStation = 0;
        } else {
            currentStation += 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = stationQuantity;
        } else {
            currentStation -= 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        if (volume > 0 & volume <= 100) {
            this.currentVolume = volume;
        }
    }

    public void nextVolume() {
        if (currentVolume != 100) {
            currentVolume += 1;
        }
    }

    public void prevVolume() {
        if (currentVolume != 0) {
            currentVolume -= 1;
        }
    }

}
