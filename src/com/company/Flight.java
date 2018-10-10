package com.company;

public class Flight {

    private int passengers,flightNumber,seats=150;
    private char flightClass;
    private boolean[] isSeatAvailble;
    int totalCheckedBags;
    int maxCarryOns=seats*2,totalCarryOns;

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public char getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(char flightClass) {
        this.flightClass = flightClass;
    }

    {
        isSeatAvailble= new boolean[seats];
        for (int i=0;i<isSeatAvailble.length;i++)
        {
            isSeatAvailble[i]=true;
        }
    }

    public Flight(){ }

    public Flight(int flightNumber){
        this.flightNumber=flightNumber;
    }

    public  Flight(char flightClass){
        this.flightClass=flightClass;
    }

    public void addOnePassenger(){
        if(hasSeating()){
            passengers+=1;
        }
    }

    public void addOnePassenger(int bags){
        if(hasSeating()) {
            addOnePassenger();
            totalCheckedBags+=bags;
        }
    }

    public void addOnePassenger(int bags,int carryOns)
    {
        if(hasSeating() && hasCarryOnSpace(carryOns))
        {
            addOnePassenger(bags);
            totalCarryOns+=carryOns;
        }
    }

    public void addOnePassenger(Passenger p){
        addOnePassenger(p.getCheckedBags());
    }

    public void addOnePassenger(Passenger p,int carryOns){
        addOnePassenger(p.getCheckedBags(),carryOns);
    }

    public void addPassengers(Passenger[] passList)
    {
        if(hasSeating(passList.length))
        {
            passengers+=passList.length;
            for(Passenger passenger:passList)
            {
                totalCheckedBags+=passenger.getCheckedBags();
            }
        }
    }

    private boolean hasSeating(){
        return passengers<=seats;
    }

    private boolean hasSeating(int count)
    {
        return passengers+count<=seats;
    }
    private boolean hasCarryOnSpace(int carryOns){
        return (maxCarryOns-totalCarryOns) >= carryOns;
    }

}

