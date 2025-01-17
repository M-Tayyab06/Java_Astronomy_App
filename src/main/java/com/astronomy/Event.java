package com.astronomy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event {
    private String name;
    private String dateTime;

    public LocalDate getEventDate() {
        return LocalDate.parse(this.dateTime, DateTimeFormatter.ISO_DATE_TIME);
    }

    @Override
    public String toString() {
        return "Event: " + name + " at " + dateTime;
    }
}
