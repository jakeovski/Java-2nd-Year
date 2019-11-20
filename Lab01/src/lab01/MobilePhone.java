package lab01;


/**
 * A class to store information about a payg mobile phone
 * @author Pierre 
 * @version 1.0
 */
public class MobilePhone {
    
    //----------------------------Field----------------------------------
    
    /**
     * Phone number
     */
    private String number;
    
    /**
     * Balance on the phone
     */
    private double balance;
    
    /**
     * Model of the phone
     */
    private final String MODEL;

    /**
     * Default constructor
     * @param number Phone number 
     * @param balance Balance on the phone
     * @param MODEL Model of the phone
     */
    public MobilePhone(String number, double balance, String MODEL) {
        this.number = number;
        this.balance = balance;
        this.MODEL = MODEL;
    }
    
    /**
     * Second constructor
     * @param number Phone number
     * @param balance Balance on the phone
     */
    public MobilePhone(String number, double balance) {
        this.number = number;
        this.balance = balance;
        MODEL = "iPhone";
    }
    
    //---------------------Getters------------------------------------

    /**
     * Gets phone number
     * @return Phone number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Gets balance on the phone
     * @return Balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets model of the phone
     * @return Phone model
     */
    public String getMODEL() {
        return MODEL;
    }
    
    
    //---------------------------Setters-------------------------------

    /**
     * Sets phone number
     * @param number 
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Sets balance on the phone
     * @param balance 
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    //-------------------------Other-----------------------------------
    
    /**
     * toString method
     * @return Information in the field
     */
    public String toString() {
        return "Phone number: " + getNumber() + "\nBalance: " + getBalance() + "\nPhone model: " + getMODEL();
    }
    
    /**
     * Deducts 0.1p for the text meassage if the balance is enough
     */
    public void sendText() {
        if (getBalance() >= 0.1) {
            setBalance(getBalance() - 0.1);
        }
        else {
            System.out.println("Insufficient fund");
        }
    }
    
    /**
     * Calculates the cost for the call then deducts from the balance if it is sufficient
     * @param length 
     */
    public void makeCall(double length) {
        double cost = length * 0.2;
        if (getBalance() >= cost) {
            setBalance(getBalance() - cost);
        }
        else {
            System.out.println("Insufficient fund");
        }
    }
}