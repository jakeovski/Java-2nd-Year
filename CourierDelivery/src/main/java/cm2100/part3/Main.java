/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm2100.part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Main Class 
 * @author K. Hui // Modified by Vladimir Bardadom 1807132
 */
public class Main {

    public static void main(String[] args) {
        //*************************************************************
//        //------------------------Parcel class test-----------------
        //*********************************************************
//        
//        Parcel first = new Parcel("Vladimir", "Union Street 148", 5.2);
//        //-----------------------Getters----------------------------
////        System.out.println(first.getRecipient());
////        System.out.println(first.getAddress());
////        System.out.println(first.getWeight());
//        //-----------------------Setters----------------------------
////        first.setRecipient("Die Hardman");
////        first.setAddress("Central Knot 12");
////        first.setWeight(23.2);
////        System.out.println(first.getRecipient());
////        System.out.println(first.getAddress());
////        System.out.println(first.getWeight());
//        //-----------------------toString---------------------------
//        System.out.println(first.toString());

        //--------------------------Driver class test----------------
//        Driver porter = new Driver("Sam Bridges");
        //------------------------Getters----------------------------
//        System.out.println(porter.getName());
//        System.out.println(porter.getNumberParcels());
        //------------------------Setters----------------------------
//        porter.setName("Higgs");
//        porter.setNumberParcels(10);
////        System.out.println(porter.getName());
////        System.out.println(porter.getNumberParcels());
//        //------------------------incrementNumberParcels-------------
////        porter.incrementNumberParcels();
////        System.out.println(porter.getNumberParcels());
//        //------------------------compareTo--------------------------
//        Driver porter2 = new Driver("Fragile");
////        System.out.println(porter.compareTo(porter2));
//        //------------------------CompareDriverLoad------------------
//        Driver porter3 = new Driver("Higgs");
//        porter3.incrementNumberParcels();
//        ArrayList<Driver> ar = new ArrayList<>();
//        ar.add(porter);
//        ar.add(porter2);
//        ar.add(porter3);
//        System.out.println("------------Unsorted----------");
//        for (int i = 0; i < ar.size(); i++) {
//            System.out.println(ar.get(i));
//        }
//        Collections.sort(ar, porter.new CompareDriverLoad());
//        System.out.println("------------Sorted----------");
//        for (int i = 0; i < ar.size(); i++) {
//            System.out.println(ar.get(i));
//        }
        //-----------------------ToString method----------------------
//         System.out.println(porter.toString());
        //********************************************************
        //-----------------------Task 6.3-------------------------
        //********************************************************
        //List 1
        //Declaring and initializing ArrayList
        ArrayList<Driver> drivers = new ArrayList<>();
        //--------------------------------------------
        //Drivers
        Driver porter1 = new Driver("Sam Bridges");
        Driver porter2 = new Driver("Fragile");
        Driver porter3 = new Driver("Mads Mikkelsen");
        //--------------------------------------------
        //Adding them to ArrayList
        drivers.add(porter1);
        drivers.add(porter2);
        drivers.add(porter3);
        //-----------------------
        //Printing
        System.out.println("-------Unsorted-----------------");
        for (int i = 0; i < drivers.size(); i++) {
            System.out.println(drivers.get(i));
        }
        //-------------------------------------------------------

        //List 2
        //Declaring and initializing LinkedList
        LinkedList<Driver> drivers2 = new LinkedList<>();
        //-------------------------------------
        //Drivers
        Driver porter4 = new Driver("Heartman");
        Driver porter5 = new Driver("Guillermo del Toro");
        Driver porter6 = new Driver("Higgs");
        //-----------------------------------
        //Adding them to LinkedList
        drivers2.add(porter4);
        drivers2.add(porter5);
        drivers2.add(porter6);
        //-------------------------
        //Printing
        System.out.println("Linked List: \n" + drivers2);
        //-----------------------------------------------
        //Adding elements from list 2 to list 1
        for (Driver d : drivers2) {
            drivers.add(d);
        }
        //---------------------------------------
        //Printing
        System.out.println("-------Unsorted-----------------");
        for (int i = 0; i < drivers.size(); i++) {
            System.out.println(drivers.get(i));
        }
        //---------------------------------------------------
        //Sorting the list in alphabetical order then printing the result
        Collections.sort(drivers);
        System.out.println("-------Sorted-----------------");
        for (int i = 0; i < drivers.size(); i++) {
            System.out.println(drivers.get(i));
        }
        //----------------------------------------------------
        //Sorting the list in reverse order and printing the results
        Collections.sort(drivers, Collections.reverseOrder());
        System.out.println("-------Reverse Sorted-----------------");
        for (int i = 0; i < drivers.size(); i++) {
            System.out.println(drivers.get(i));
        }
        //------------------------------------------------------

        //***************************************************************
        //-------------------------6.4-----------------------------------
        //***************************************************************
    } //end method
} //end class
