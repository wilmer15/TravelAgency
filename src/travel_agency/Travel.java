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
public class Travel {
    private Date start;
    private int duration;
    private TravelAgency offeredTravels;
    private Hotel hotel;
    private BookedFlight B1;
    private BookedFlight B2;

    public BookedFlight getB1() {
        return B1;
    }

    public void setB1(BookedFlight B1) {
        this.B1 = B1;
    }

    public BookedFlight getB2() {
        return B2;
    }

    public void setB2(BookedFlight B2) {
        this.B2 = B2;
    }
    
    
    
    public Travel(){
        this.offeredTravels = new TravelAgency();
        this.hotel= new Hotel();
        this.B1 = new BookedFlight();
        this.B2 = new BookedFlight();
    }
    public Travel(BookedFlight b,BookedFlight b1){
        this.offeredTravels = new TravelAgency();
        this.hotel= new Hotel();
        this.B1 = new BookedFlight(b.getFlightNumber(),b.getDeparture(),b.getFrom(),b.getTo());
        this.B1.setArrival(b.getArrival());
        this.B2 = new BookedFlight(b1.getFlightNumber(),b1.getDeparture(),b1.getTo(),b1.getFrom());
        this.B2.setArrival(b1.getArrival());
    }

        
    
    public void addHotel(Hotel H2){
        this.hotel = H2;
    }
        
       
    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
