package cherenkov;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void lastStationSwitchesToFirst() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    public void StationSwitchesToNext() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(8);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void firstStationSwitchedToLast() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void StationSwitchedToPrevious() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void invalidStationAboveNine() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(10);


        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void invalidStationLessThanZero() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(-1);


        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    public void lastVolumeNoSwitchedToFirst() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.plus();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void VolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.plus();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void firstVolumeNoSwitchedToLast() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.minus();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void VolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.minus();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void invalidVolumeLessThanZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);


        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void invalidVolumeAboveTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);


        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}
