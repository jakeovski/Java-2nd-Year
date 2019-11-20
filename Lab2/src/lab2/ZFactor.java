/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;

/**
 *
 * @author Pierre
 */
public class ZFactor {
    
    /**
     * ArrayList of this year's roster for the ZFactor show
     */
    private ArrayList<Contestant> roster;

    private Contestant cont1;
    private Contestant cont2;
    private Contestant cont3;
    private Contestant cont4;
    private Contestant cont5;
    private Contestant cont6;
    private Contestant cont7;
    private Contestant cont8;
    private Contestant cont9;
    private Contestant cont10;
    private Contestant cont11;
    private Contestant cont12;
    
    /**
     * Constructor for the ZFactor class
     */
    public ZFactor() {
         cont1 = new Contestant("Vladimir","Male", 0);
         cont2 = new Contestant("Gordei", "Male", 0);
         cont3 = new Contestant("Rinat","Group",0);
         cont4= new Contestant("Karina","Female",0);
         cont5 = new Contestant("Nastja","Female",0);
         cont6 = new Contestant("Katja","Female",0);
         cont7 = new Contestant("Xenia","Female",0);
         cont8 = new Contestant("Alan","Male",0);
         cont9 = new Contestant("Marko", "Male",0);
         cont10 = new Contestant("Arthur","Male",0);
         cont11 = new Contestant("Elina","Female",0);
         cont12 = new Contestant("Diana","Female",0);
         roster = new ArrayList<>();
         roster.add(cont1);
         roster.add(cont2);
         roster.add(cont3);
         roster.add(cont4);
         roster.add(cont5);
         roster.add(cont6);
         roster.add(cont7);
         roster.add(cont8);
         roster.add(cont9);
         roster.add(cont10);
         roster.add(cont11);
         roster.add(cont12);     
    }
    
    //-------------------Getters-----------------------

    public ArrayList<Contestant> getRoster() {
        return roster;
    }

    public Contestant getCont1() {
        return cont1;
    }

    public Contestant getCont2() {
        return cont2;
    }

    public Contestant getCont3() {
        return cont3;
    }

    public Contestant getCont4() {
        return cont4;
    }

    public Contestant getCont5() {
        return cont5;
    }

    public Contestant getCont6() {
        return cont6;
    }

    public Contestant getCont7() {
        return cont7;
    }

    public Contestant getCont8() {
        return cont8;
    }

    public Contestant getCont9() {
        return cont9;
    }

    public Contestant getCont10() {
        return cont10;
    }

    public Contestant getCont11() {
        return cont11;
    }

    public Contestant getCont12() {
        return cont12;
    }
    
    //-------------------Setters----------------------

    public void setRoster(ArrayList<Contestant> roster) {
        this.roster = roster;
    }

    public void setCont1(Contestant cont1) {
        this.cont1 = cont1;
    }

    public void setCont2(Contestant cont2) {
        this.cont2 = cont2;
    }

    public void setCont3(Contestant cont3) {
        this.cont3 = cont3;
    }

    public void setCont4(Contestant cont4) {
        this.cont4 = cont4;
    }

    public void setCont5(Contestant cont5) {
        this.cont5 = cont5;
    }

    public void setCont6(Contestant cont6) {
        this.cont6 = cont6;
    }

    public void setCont7(Contestant cont7) {
        this.cont7 = cont7;
    }

    public void setCont8(Contestant cont8) {
        this.cont8 = cont8;
    }

    public void setCont9(Contestant cont9) {
        this.cont9 = cont9;
    }

    public void setCont10(Contestant cont10) {
        this.cont10 = cont10;
    }

    public void setCont11(Contestant cont11) {
        this.cont11 = cont11;
    }

    public void setCont12(Contestant cont12) {
        this.cont12 = cont12;
    }
    
    //----------------------Others------------------
    
    //a
    public void addContestant(Contestant cont) {
        roster.add(cont);
    }
    
    //b
    public void removeContestant(int index) {
        roster.remove(index);
    }
    
    //c
    public void details(){
       int y = 0;
       for(int i = 1; i <= roster.size();i++) {
           System.out.println(i + ". " + roster.get(y).getName() + " (" + roster.get(y).getCategory() + ") " + " has " + roster.get(y).getVotes() + " votes");
           y++;
       } 
    }
    
    //d
    public int currentlyInComp() {
        return roster.size();
    }
    
    //e
    
    public Contestant lowestVote() {
        int lowest = roster.get(0).getVotes();
        int index = 0;
        for (int i = 0; i < roster.size(); i++) {
            if(roster.get(i).getVotes() < lowest) {
                lowest = roster.get(i).getVotes();
                index = i;
            }    
        }
        return roster.get(index);
    }
    
    public void lowestOut() {
        roster.remove(lowestVote());
    }
    
    public Object returnObj() {
        return roster;
    }
}
