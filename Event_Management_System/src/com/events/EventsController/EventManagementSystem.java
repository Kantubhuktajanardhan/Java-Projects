package com.events.EventsController;
import com.events.EventsDAO.*;
import com.events.EventsService.*;

public class EventManagementSystem {
 
public static void main(String[] args) {
		
		EventsDAO dao = new EventDAOImpl(10);
		EventsService service = new EventsServiceImpl(dao);
		EventsController controller = new EventsController(service);
		
		controller.start();
}

}
