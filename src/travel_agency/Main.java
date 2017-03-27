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
public class Main {
    public static void main(String[] agrs){
      java.util.Date utilDate = new java.util.Date();
      Scanner leer = new Scanner(System.in);
      Hotel hotel1[] = new Hotel[5];          
      hotel1[0] = new Hotel();
      hotel1[0].setAdress("Cra. 21a #159a-28");
      hotel1[0].setName("Fontanar");

      int j;
      for(int i=1; i<5; i++){
          hotel1[i] = new Hotel();
          System.out.println("Digite El nombre del Hotel a ingresar");
          hotel1[i].setName(leer.next());
          System.out.println("Digite la direccion del Hotel a ingresar");
          hotel1[i].setName(leer.next());
    }
      
      Airport[] aeropuerto= new Airport[4];
      aeropuerto[0] = new Airport();
      aeropuerto[0].setDescription("José María Córdoba");
      aeropuerto[1] = new Airport();
      aeropuerto[1].setDescription("El Dorado");
      
      for(int i=0;i<2;i++){
          aeropuerto[(i+2)] = new Airport();
          System.out.println("Digite el nombre del aeropuerto a ingresar");
          aeropuerto[(i+2)].setDescription(leer.next());
      }
      
      utilDate = new java.util.Date(117,02, 22, 12, 00);
      System.out.println(utilDate);
      Travel viaje1[] = new Travel[10];
      
      BookedFlight booked = new BookedFlight(1345,utilDate,aeropuerto[0],aeropuerto[1]);
      booked.setArrival(utilDate);
      
      BookedFlight booked1 = new BookedFlight(4389,utilDate,aeropuerto[1],aeropuerto[0]);
      booked1.setArrival(utilDate);  
      viaje1[0] = new Travel(booked,booked1);
      viaje1[0].setStart(utilDate);
      viaje1[0].setDuration(30);
      int naux;
      for(int x=1; x<10; x++){
          viaje1[x] = new Travel();
          System.out.println("Digite la duracion del viaje a ingresar");
          viaje1[x].setDuration(leer.nextInt());
          System.out.println("Digite la fecha  del viaje  a ingresar, \n Primero El año despues Enter(DESDE 1900 es decir 117 Seria 2017)\n Mes despues enter(del 0 al 11)\nDia despues enter(del o al 31) ");
          utilDate = new java.util.Date(leer.nextInt(),leer.nextInt(),leer.nextInt(), 12, 00);
          viaje1[x].setStart(utilDate);
      }

      TravelAgency agencia = new TravelAgency(hotel1,viaje1,aeropuerto);
      agencia.list_travels();
      agencia.menor_mayor();
     
   
}
}
