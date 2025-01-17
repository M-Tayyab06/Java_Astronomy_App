package com.astronomy;

import java.time.LocalDate;
import java.util.List;

public class AstronomyApp {
    public static void main(String[] args) {
        EventFetcher fetcher = new EventFetcher();
        
        LocalDate today = LocalDate.now();
        LocalDate startDate = today.minusMonths(3);
        LocalDate endDate = today.plusMonths(3);

        List<Event> events = fetcher.getEventsForRange(startDate, endDate);

        if (events.isEmpty()) {
            System.out.println("No astronomical events in the past three months or the next three months.");
        } else {
            System.out.println("Astronomical events from " + startDate + " to " + endDate + ":");
            events.forEach(event -> System.out.println(event));
        }
    }
}
