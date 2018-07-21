package com.company;
public class Main {

    public static void main(String[] args) {
	// write your code here
       //* nipaImpl nipa = new nipaImpl();
        //trisha trisha = new trisha();
        //Fahmida fahmida = new Fahmida();

        //nipa.sleep();
        //nipa.works();

        //trisha.sleep();
        //trisha.works();

        //fahmida.sleep();
       // fahmida.works();
        human nipa = new nipaImpl();
        human banu = new human() {
            @Override
            void works() {
                System.out.println("Clean ");
            }
        };

        nipa.sleep();
        nipa.works();


        banu.sleep();
        banu.works();
    }
}
