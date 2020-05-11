/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm2100.part3;

import java.util.Comparator;

/**
 * This class models a delivery driver
 *
 * @author K. Hui // Modified by Vladimir Bardadom 1807132
 */
public class Driver implements Comparable<Driver> {

    //----------------------------Field------------------------------------
    /**
     * Name of the driver
     */
    private String name;
    /**
     * Number of parcels assigned to the driver
     */
    private int numberParcels;

    /**
     * Constructor for the Driver class
     * @param name Name of the driver
     */
    public Driver(String name) {
        this.name = name;
        this.numberParcels = 0;
    }

    //----------------------------Getters----------------------------------
    /**
     * Gets the name of the driver
     * @return Name of the driver
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the number of parcels
     * @return Number of parcels
     */
    public int getNumberParcels() {
        return numberParcels;
    }

    //---------------------------Setters----------------------------------
    /**
     * Sets the name of the driver
     * @param name New name for the driver // String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the number of parcels
     * @param numberParcels New number of parcels
     */
    public void setNumberParcels(int numberParcels) {
        this.numberParcels = numberParcels;
    }

    //---------------------------Other------------------------------------
    /**
     * Increments the number of parcels by one
     */
    public void incrementNumberParcels() {
        this.numberParcels++;
    }

    /**
     * Compares two driver by their names
     * @param another Second driver to compare to
     * @return Negative number if the first driver is before second one in alphabetic order
     *         0 if they start with the same letter
     *         Positive number if first driver is after second one in alphabetic order
     */
    @Override
    public int compareTo(Driver another) {
        char one = this.name.charAt(0);
        char two = another.name.charAt(0);
        char oneNew = Character.toLowerCase(one);
        char twoNew = Character.toLowerCase(two);
        return oneNew - twoNew;
    }

    /**
     * Inner class which compares workloads of two drivers
     * The one with less parcels goes before the ones with more workload
     */
    class CompareDriverLoad implements Comparator<Driver> {

        @Override
        public int compare(Driver a, Driver b) {
            return a.numberParcels - b.numberParcels;
        }
    }

    /**
     * toString method
     * @return Information in the field
     */
    @Override
    public String toString() {
        return "Driver details:\nName: " + this.name
                + "\nNumber of Parcels: " + this.numberParcels;
    }

} //end Driver
