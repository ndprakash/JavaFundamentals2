package com.company;

public class Main {

    public static void main(String[] args) {
	    // Calculator
        MathEquation[] mathEquations= new MathEquation[4];
        mathEquations[0]=  new MathEquation(100.0d,50.0d,'d');
        mathEquations[1]= new MathEquation(25d,92d,'a');
        mathEquations[2]= new MathEquation(225.0d,17.0d,'m');
        mathEquations[3]= new MathEquation(11.0d,3.0d,'s');
        for (var mathEquation : mathEquations) {
            mathEquation.execute();
            System.out.print("result=");
            System.out.println(mathEquation.getResult());
        }
        MathEquation divEquation= new MathEquation('d');
        divEquation.execute(9,2);
        System.out.println("result="+divEquation.getResult());

        //Flights
        Flight flt1= new Flight();
        flt1.setSeats(150);
        flt1.addOnePassenger();
        Passenger bob= new Passenger(1,2);
        Passenger jane = new Passenger(1,3);
        flt1.addPassengers(new Passenger[]{bob,jane});
	// Going to add enhancement

    }

}
