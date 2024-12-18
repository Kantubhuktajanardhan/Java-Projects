package com.events.EventsDAO;

import com.events.Eventspojos.Event;

public class EventDAOImpl implements EventsDAO {

	private Event[] events;
	private int eventCount;
	
	
	public EventDAOImpl(int capacity) {
		events=new Event[capacity];
		this.eventCount=0;
	}

	@Override
	public boolean addEvent(Event event) {
		
		if(events.length == 0)
		{
			events[eventCount++]=event;
		}
		
		else if(eventCount>events.length)
		{
			return false;
		}
		else
		{
			events[eventCount++]=event;
		}
		return true;
	}

	@Override
	public Event[] getAllEvents() {
		
		Event[] avaliableEvents=new Event[eventCount];
		System.arraycopy(events, 0, avaliableEvents, 0, eventCount);
		if(events.length<=0)
		return null;
		else
			return avaliableEvents;
	}

	@Override
	public boolean deleteEvent(String eventId) {
		
		for(int i=0;i<eventCount;i++)
		{
			if(events[i].getEventId().equals(eventId))
			{
				for(int j=i;j<eventCount-1;j++)
				{
					events[j]=events[j+1];
				}
			}
			events[--eventCount]=null;
			return true;
		}
		return false;
	}

	@Override
	public Event getEventById(String eventId) {
		Event res=null;
		for(int i=0;i<eventCount;i++)
		{
			if(events[i].getEventId().equals(eventId))
			{
				res=events[i];
			}
		}
		
		return res;
	}

	@Override
	public Event updateEvent(Event newEvent) {
		Event res=null;
		for(int i=0;i<eventCount;i++)
		{
			if(events[i].getEventId().equals(newEvent.getEventId()))
			{
				events[i]=newEvent;
				res=newEvent;
			}
		}
		
		return res;
	}
	
}
