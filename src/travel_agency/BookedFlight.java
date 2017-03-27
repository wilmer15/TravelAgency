/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_agency;
import java.util.*;

/**
 *
 * @author Acer
 */
public class BookedFlight {
    private int flightNumber;
    private Date departure;
    private Date arrival;
    private Airport from;
    private Airport to;
    private Travel outbound;
    private Travel return1;
    
    public BookedFlight(){
        this.from = new Airport();
        this.to = new Airport();
    }
    public BookedFlight(int f,Date d,Airport a1,Airport a2){
        this.from = a1;
        this.to = a2;
        this.flightNumber = f;
        this.departure=d;
    }

    public Airport getFrom() {
        return from;
    }

    public void setFrom(Airport from) {
        this.from = from;
    }

    public Airport getTo() {
        return to;
    }

    public void setTo(Airport to) {
        this.to = to;
    }
    
        
        

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }
  
}
