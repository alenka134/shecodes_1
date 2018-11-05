package com.company;

public class Passenger {

       private int checkedBags;
       private  int freeBags;
       // accessors & mutators elided for clarity
        private double perBagFee;

        public Passenger(){}

        public Passenger(int freeBags){
            this.freeBags = freeBags;
        }

        public Passenger(int freeBags, int checkedBags){

           this(freeBags > 1 ? 25.0d : 50.0d);
           this.checkedBags = checkedBags;
        }

        public void setCheckedBags(int checkedBags) {
            this.checkedBags = checkedBags;
        }
public  Passenger(double perBagFee){
        this.perBagFee = perBagFee;

}


}
