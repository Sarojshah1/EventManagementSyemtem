package DAO;

import Model.EventsModel;
import Model.UserId;
import database.DatabaseConnection;
import java.util.Arrays;

public class Event extends DatabaseConnection {

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
private int userid;
    public void CreateEvent(EventsModel event) {
        String query = "INSERT INTO events(IMAGE,NAME,PRICE,DESCRIPTION,PLACE,CAPACITY,ISPUBLIC,USERID,VENUEID,date) VALUES('" + Arrays.toString(event.getImage()) + "','" + event.getEvent_name() + "','" + event.getPrice() + "','" + event.getDescription() + "','" + event.getVanue() + "','" + event.getCapacity() + "','" + 0 + "'," + userid + "','" + 1 + "','" + event.getDate() + "')";
        manipulate(query);

    }

}
