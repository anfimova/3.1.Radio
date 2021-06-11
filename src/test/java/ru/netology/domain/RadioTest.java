package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio defRadio = new Radio();
    Radio stationQuantityRadio = new Radio(15);

    @ParameterizedTest
    @CsvSource(value = {
            "Станция 0 подходит | 0",
            "Станция 9 подходит | 9",
            }, delimiter = '|')
    public void shouldSetDefRadioStation(String testName, int station) {
        defRadio.setCurrentStation(station);
        assertEquals(station, defRadio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Станция -1 не подходит | -1",
            "Станция 11 не подходит | 11"
    }, delimiter = '|')
    public void shouldNotSetDefRadioStation(String testName, int station) {
        defRadio.setCurrentStation(station);
        assertEquals(0, defRadio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Увеличить станцию 0 до 1 | 0 | 1",
            "Увеличить станцию 10 до 0 | 10 | 0"
    }, delimiter = '|')
    public void shouldNextDefRadioStation(String testName, int currentStation, int nextStation) {
        defRadio.setCurrentStation(currentStation);
        defRadio.nextStation();
        assertEquals(nextStation, defRadio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Уменьшить станцию 0 до 10 | 0 | 10",
            "Уменьшить станцию 1 до 0 | 1 | 0"
    }, delimiter = '|')
    public void shouldPrevDefRadioStation(String testName, int currentStation, int prevStation) {
        defRadio.setCurrentStation(currentStation);
        defRadio.prevStation();
        assertEquals(prevStation, defRadio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Громкость 0 подходит | 0",
            "Громкость 100 подходит | 100",
    }, delimiter = '|')
    public void shouldSetDefRadioVolume(String testName, int volume) {
        defRadio.setCurrentVolume(volume);
        assertEquals(volume, defRadio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Громкость -1 не подходит | -1",
            "Громкость 101 не подходит | 101"
    }, delimiter = '|')
    public void shouldNotSetDefRadioVolume(String testName, int volume) {
        defRadio.setCurrentVolume(volume);
        assertEquals(0, defRadio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Увеличить громкость с 0 до 1 | 0 | 1",
            "Увеличить громкость с 100 до 100 | 100 | 100"
    }, delimiter = '|')
    public void shouldNextDefRadioVolume(String testName, int currentVolume, int nextVolume) {
        defRadio.setCurrentVolume(currentVolume);
        defRadio.nextVolume();
        assertEquals(nextVolume, defRadio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Уменьшить громкость с 0 до 0 | 0 | 0",
            "Уменьшить громкость с 100 до 99 | 100 | 99"
    }, delimiter = '|')
    public void shouldPrevDefRadioVolume(String testName, int currentVolume, int prevVolume) {
        defRadio.setCurrentVolume(currentVolume);
        defRadio.prevVolume();
        assertEquals(prevVolume, defRadio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Станция 0 подходит | 0",
            "Станция 15 подходит | 15",
    }, delimiter = '|')
    public void shouldSetQuantityRadioStation(String testName, int station) {
        stationQuantityRadio.setCurrentStation(station);
        assertEquals(station, stationQuantityRadio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Станция -1 не подходит | -1",
            "Станция 16 не подходит | 16"
    }, delimiter = '|')
    public void shouldNotSetQuantityRadioStation(String testName, int station) {
        stationQuantityRadio.setCurrentStation(station);
        assertEquals(0, stationQuantityRadio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Увеличить станцию 0 до 1 | 0 | 1",
            "Увеличить станцию 15 до 0 | 15 | 0"
    }, delimiter = '|')
    public void shouldNextQuantityRadioStation(String testName, int currentStation, int nextStation) {
        stationQuantityRadio.setCurrentStation(currentStation);
        stationQuantityRadio.nextStation();
        assertEquals(nextStation, stationQuantityRadio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Уменьшить станцию 0 до 15 | 0 | 15",
            "Уменьшить станцию 1 до 0 | 1 | 0"
    }, delimiter = '|')
    public void shouldPrevQuantityRadioStation(String testName, int currentStation, int prevStation) {
        stationQuantityRadio.setCurrentStation(currentStation);
        stationQuantityRadio.prevStation();
        assertEquals(prevStation, stationQuantityRadio.getCurrentStation());
    }

}