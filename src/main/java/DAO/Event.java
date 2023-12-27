package DAO;

import Model.EventsModel;
import Model.UserId;
import database.DatabaseConnection;
import java.util.Arrays;

public class Event extends DatabaseConnection {

    public void CreateEvent(EventsModel event, UserId id) {
        String query = "INSERT INTO events(IMAGE,NAME,PRICE,DESCRIPTION,PLACE,CAPACITY,ISPUBLIC,USERID,VENUEID,date) VALUES('" + Arrays.toString(event.getImage()) + "','" + event.getEvent_name() + "','" + event.getPrice() + "','" + event.getDescription() + "','" + event.getVanue() + "','" + event.getCapacity() + "','" + 0 + "'," + id.getUserid() + "','" + 1 + "','" + event.getDate() + "')";
        manipulate(query);

    }

}
