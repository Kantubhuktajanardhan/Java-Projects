package com.events.EventsDAO;
import com.events.Eventspojos.*;

public interface EventsDAO {
   boolean addEvent(Event event);
   Event[] getAllEvents();
   boolean deleteEvent(String eventId);
   Event getEventById(String eventId);
   Event updateEvent(Event newEvent);
}