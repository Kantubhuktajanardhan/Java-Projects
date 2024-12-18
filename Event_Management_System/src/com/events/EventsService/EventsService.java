package com.events.EventsService;

import com.events.Eventspojos.Event;

public interface EventsService {
	boolean addEvent(Event event);
	   Event[] getAllEvents();
	   boolean deleteEvent(String eventId);
	   Event getEventById(String eventId);
	   Event updateEvent(Event newEvent);
	   String registerForEvent(String eventId);
}
