package com.spring.jpa;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Reservation entity class - Model class
@Entity
@Table(name = "flight")
public class Reservation {
  @Id
  @Column(name = "flightcode")
  private int flightcode;
  @Column(name = "airlinename")
  private String airlinename;
  @Column(name = "fare")
  private String fare;
  @Column(name = "departuredate")
  private Date departuredate;
  @Column(name = "departurecity")
  private String departurecity;
  @Column(name = "arrivaldate")
  private Date arrivaldate;
  @Column(name = "destination")
  private String destination;
  @Column(name = "numadult")
  private int numadult;
  @Column(name = "numchild")
  private int numchild;
  
  public Reservation() {}

  public Reservation(int flightcode, String airlinename, String fare, Date departuredate, String departurecity, Date arrivaldate, String destination,int numadult, int numchild) {
    super();
    this.flightcode = flightcode;
    this.airlinename = airlinename;
    this.fare = fare;
    this.departuredate = departuredate;
    this.departurecity = departurecity;
    this.arrivaldate = arrivaldate;
    this.destination = destination;
    this.numadult = numadult;
    this.numchild = numchild;
  }
  public int getFlightCode() {
    return flightcode;
  }
  public void setFlightCode(int flightcode) {
    this.flightcode = flightcode;
  }
  public String getAirlineName() {
    return airlinename;
  }
  public void setAirlineName(String airlinename) {
    this.airlinename = airlinename;
  }
  public String getFare() {
	    return fare;
  }
  public void setFare(String fare) {
	    this.fare = fare;
  }
  
  public Date getDepartureDate() {
	    return departuredate;
}
public void setDepartureDate(Date departuredate) {
	    this.departuredate = departuredate;
}
public String getDepartureCity() {
    return departurecity;
}
public void setDepartureCity(String departurecity) {
    this.departurecity = departurecity;
}

public Date getArrivalDate() {
	    return arrivaldate;
}
public void setArrivalDate(Date arrivaldate) {
	    this.arrivaldate = arrivaldate;
}
public String getDestination() {
  return destination;
}
public void setDestination(String destination) {
  this.destination = destination;
}
public int getNumAdult() {
    return numadult;
}
public void setNumAdult(int numadult) {
    this.numadult = numadult;
}
public int getNumChild() {
    return numchild;
}
public void setNumChild(int numchild) {
    this.numchild = numchild;
}

}