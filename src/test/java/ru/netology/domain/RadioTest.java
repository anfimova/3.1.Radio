package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @ParameterizedTest
    @CsvSource(value = {
            "0 подходит | 0",
            "9 подходит | 9",
            }, delimiter = '|')
    public void shouldSetStation(String testName, int station) {
        radio.setCurrentStation(station);
        assertEquals(station, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "-1 не подходит | -1",
            "10 не подходит | 10"
    }, delimiter = '|')
    public void shouldNotSetStation(String testName, int station) {
        radio.setCurrentStation(station);
        assertEquals(0, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Увеличить станцию 0 до 1 | 0 | 1",
            "Увеличить станцию 9 до 0 | 9 | 0"
    }, delimiter = '|')
    public void shouldNextStation(String testName, int currentStation, int nextStation) {
        radio.setCurrentStation(currentStation);
        radio.nextStation();
        assertEquals(nextStation, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Уменьшить станцию 0 до 9 | 0 | 9",
            "Уменьшить станцию 1 до 0 | 1 | 0"
    }, delimiter = '|')
    public void shouldPrevStation(String testName, int currentStation, int prevStation) {
        radio.setCurrentStation(currentStation);
        radio.prevStation();
        assertEquals(prevStation, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0 подходит | 0",
            "10 подходит | 10",
    }, delimiter = '|')
    public void shouldSetVolume(String testName, int volume) {
        radio.setCurrentVolume(volume);
        assertEquals(volume, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "-1 не подходит | -1",
            "11 не подходит | 11"
    }, delimiter = '|')
    public void shouldNotSetVolume(String testName, int volume) {
        radio.setCurrentVolume(volume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Увеличить громкость с 0 до 1 | 0 | 1",
            "Увеличить громкость с 10 до 10 | 10 | 10"
    }, delimiter = '|')
    public void shouldNextVolume(String testName, int currentVolume, int nextVolume) {
        radio.setCurrentVolume(currentVolume);
        radio.nextVolume();
        assertEquals(nextVolume, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Уменьшить громкость с 0 до 0 | 0 | 0",
            "Уменьшить громкость с 10 до 9 | 10 | 9"
    }, delimiter = '|')
    public void shouldPrevVolume(String testName, int currentVolume, int prevVolume) {
        radio.setCurrentVolume(currentVolume);
        radio.prevVolume();
        assertEquals(prevVolume, radio.getCurrentVolume());
    }

}