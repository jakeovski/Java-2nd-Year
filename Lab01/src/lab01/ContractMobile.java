package lab01;


/**
 * A class that represents a contract mobile phone
 * @author Pierre
 */
public class ContractMobile {
    
    /**
     * Phone number
     */
    private String phoneNumber;
    
    /**
     * Phone model
     */
    private String model;
    
    /**
     * Has the monthly charge been paid or not
     */
    private boolean charge;
    
    /**
     * Number of texts remaining
     */
    private int numText;
    
    /**
     * Number of call minutes remaining
     */
    private double numMin;

    /**
     * Default contructor
     * @param phoneNumber Phone number
     * @param model Phone model
     */
    public ContractMobile(String phoneNumber, String model) {
        this.phoneNumber = phoneNumber;
        this.model = model;
    }
    
    //----------------------------Getters---------------------------

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public boolean isCharge() {
        return charge;
    }

    public int getNumText() {
        return numText;
    }

    public double getNumMin() {
        return numMin;
    }
    
    
    
    
    
    
}