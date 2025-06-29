package ru.example.server.utils;

import lombok.experimental.UtilityClass;

import java.util.concurrent.ThreadLocalRandom;

@UtilityClass
public class TimeUtils {

    public static void sleepForSeconds(long secondsToSleep) {
        try {
            Thread.sleep(secondsToSleep * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    public static void sleepForRandomSeconds(long maxSecondsToSleep) {
        long randomValue = ThreadLocalRandom.current().nextLong(maxSecondsToSleep);
        sleepForSeconds(randomValue);
    }
}