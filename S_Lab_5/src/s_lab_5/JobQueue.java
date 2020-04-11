/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s_lab_5;

import java.util.LinkedList;

/**
 *
 * @author Pierre
 */
public class JobQueue {
    
    //------------------------Field------------------
    private LinkedList<Job> standardJobs;
    
    private LinkedList<Job> urgentJobs;
    
    //----------------------------Constructor---------
    public JobQueue(){
        this.standardJobs = new LinkedList();
        this.urgentJobs = new LinkedList();
    }
    
    //------------------Methods----------------------
    /**
     * Adds a job to either urgent or standard order queue
     * @param d
     * @param type 
     */
    public void addJob(String d, boolean type) {
        if (type) {
            urgentJobs.add(new Job(d));
        }
        else {
            standardJobs.add(new Job(d));
        }
    }
    
    /**
     * Returns and removes first job in the queue
     * @return 
     */
    public Job nextJob() {
        if (urgentJobs.isEmpty()) {
            return standardJobs.remove();
        }
        else {
           return urgentJobs.remove();
        }
    }
    
    /**
     * Deletes the Job specified in the parameter
     * @param n Job you want to be deleted
     */
    public void deleteJob(Job n) {
        if (urgentJobs.contains(n)){
            urgentJobs.remove(n);
        }
        else if (standardJobs.contains(n)) {
            standardJobs.remove(n);
        }
        else {
            System.out.println("No such Job in the queue");
        }
    }
      
    /**
     * Prioritises the job specified in the parameter
     * @param n Job you want to prioritise
     */
    public void prioritise(Job n ) {
        if (standardJobs.contains(n)) {
            standardJobs.remove(n);
            urgentJobs.addLast(n);
        }
        else {
            System.out.println("No such Job found");
        }
    }
    
    /**
     * Takes the string job description and forces it in the urgent queue
     * @param desc Job description
     */
    public void jobForBoss(String desc) {
        urgentJobs.addFirst(new Job(desc));
    }
    
    /**
     * toString method
     * @return info of the fields
     */
    public String toString() {
        return "Urgent orders: " + this.urgentJobs.toString() +
                "\nStandard orders: " + this.standardJobs.toString();
    }
}
