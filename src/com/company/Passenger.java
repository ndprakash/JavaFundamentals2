package com.company;

public class Passenger {

    private int freeBags;
    private int checkedBags;
    private double perBagFee=25.0d;

    public int getFreeBags() {
        return freeBags;
    }

    public void setFreeBags(int freeBags) {
        this.freeBags = freeBags;
    }

    public int getCheckedBags() {
        return checkedBags;
    }

    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }

    public double getPerBagFee() {
        return perBagFee;
    }

    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }

    public Passenger(){}

    public Passenger(int freeBags){
        this.freeBags=freeBags;
    }

    public Passenger(int freeBags,int checkedBags){
        this(freeBags);
        this.checkedBags=checkedBags;
    }

    public double getBagFee(){
        return perBagFee*(checkedBags>0?checkedBags-freeBags:0);
    }

}

