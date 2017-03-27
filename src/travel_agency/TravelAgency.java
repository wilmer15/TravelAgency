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
public class TravelAgency {
    private String name;
    private Hotel[] H;
    private Travel[] T;
    private Airport[] A;
    
    public TravelAgency(Hotel[] H1,Travel[] T1,Airport[] A1){
      this.H = new Hotel[5];
      this.T = new Travel[10];
      this.A = new Airport[4];
      for(int i=0; i<5;i++){
         this.H[i] = new Hotel();
         this.H[i].setName(H1[i].getName());
         this.H[i].setAdress(H[i].getAdress());
      }
      for(int i=0; i<10;i++){
         this.T[i] = new Travel();
         this.T[i].setDuration(T1[i].getDuration());
         this.T[i].setStart(T1[i].getStart());
         this.T[i].setB1(T1[i].getB1());
         this.T[i].setB2(T1[i].getB2());
      }
       for(int i=0; i<4;i++){
         this.A[i] = new Airport();
         this.A[i].setDescription(A1[i].getDescription());
      }   
    }
    
   public void list_travels(){
       int cont=1;
       for(Travel t1: this.T){
          System.out.println("Viaje numero "  + cont++ + " Duracion " +  t1.getDuration()  + " Vuelo de Salida " +  t1.getB1().getFlightNumber() + " Aeropuerto " + t1.getB1().getFrom().getDescription());
          System.out.println(" Vuelo de llegada " +  t1.getB2().getFlightNumber() + " Vuelo de llegada " +t1.getB2().getTo().getDescription());
          System.out.println("Llegada " + t1.getB1().getArrival() + " Salida " + t1.getB1().getDeparture());
       }       
   }
     
   public void menor_mayor(){
       int cont=0;
       int duracion[] = new int[10];
       for(Travel t1: this.T){
          duracion[cont++]= t1.getDuration();
       }   
       int i, j, aux;
       for(i=0;i<duracion.length-1;i++){
              for(j=0;j<duracion.length-i-1;j++)
                   if(duracion[j+1]<duracion[j]){
                      aux=duracion[j+1];
                      duracion[j+1]=duracion[j];
                      duracion[j]=aux;
                   }
         }
       for(int t=0;t<10;t++){
           System.out.println("Duracion de viajes de menor a Mayor " + duracion[t]);
       }
   }

    
   public TravelAgency(){
       
   }
    
    
    
}
