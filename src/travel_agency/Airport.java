/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_agency;

/**
 *
 * @author Acer
 */
public class Airport {
    private String description;
    private TravelAgency travel ;
    
    
    public Airport(){
     this.travel = new TravelAgency();
    }
        
        

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
