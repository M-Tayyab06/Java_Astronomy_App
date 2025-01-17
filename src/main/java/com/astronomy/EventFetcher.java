package com.astronomy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EventFetcher {

    public List<Event> getEventsForRange(LocalDate startDate, LocalDate endDate) {
        List<Event> events = loadEvents();
        List<Event> filteredEvents = new ArrayList<>();

        for (Event event : events) {
            LocalDate eventDate = event.getEventDate();
            if ((eventDate.isEqual(startDate) || eventDate.isAfter(startDate)) &&
                (eventDate.isEqual(endDate) || eventDate.isBefore(endDate))) {
                filteredEvents.add(event);
            }
        }

        return filteredEvents;
    }

    private List<Event> loadEvents() {
        try (InputStreamReader reader = new InputStreamReader(
                getClass().getResourceAsStream("/events.json"))) {
            Type listType = new TypeToken<List<Event>>() {}.getType();
            return new Gson().fromJson(reader, listType);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
