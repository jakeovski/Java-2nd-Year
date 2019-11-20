package lab2;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        /*
        //Task 1
        Caravan[] caravanArray = new Caravan[5];
        caravanArray[0] = new Caravan("A1", 15, false, 20);
        caravanArray[1] = new Caravan("B4", 10, true, 25);
        caravanArray[2] = new Caravan("A8", 5, false, 10);
        caravanArray[3] = new Caravan("D5",14,true,30);
        caravanArray[4] = new Caravan("F50", 22, false,40);
        
        //Task 2
        //a
        for (int i = 0; i < caravanArray.length; i++) {
            System.out.println(caravanArray[i].toString());
        }
        
        //b
        for (int y = 0; y < caravanArray.length; y++) {
            caravanArray[y].setCostPerNight(15 * caravanArray[y].getCapacity());
            System.out.println("Total caravan cost for Caravan " + y + " : " + caravanArray[y].getCostPerNight());
        }
        
        //c
        for (int j = 0; j < caravanArray.length;j++) {
            if (caravanArray[j].isOccupied() == false) {
                System.out.println(caravanArray[j].toString());
            }
        }
        
        //d
        Caravan temp = caravanArray[caravanArray.length - 1];
        caravanArray[caravanArray.length - 1] = caravanArray[0];
        caravanArray[0] = temp;
        for (int i = 0; i < caravanArray.length; i++) {
            System.out.println(caravanArray[i].toString());
        }
*/
        /*
        ZFactor show1 = new ZFactor();
        
        Scanner in = new Scanner(System.in);
        for (int y = show1.currentlyInComp(); y > 1; y--) {
            show1.details();
            for( int i = 0; i < show1.currentlyInComp(); i++) {
                System.out.print("How many points goes to " + show1.getRoster().get(i).getName() + "?:");
                int vote = in.nextInt();
                show1.getRoster().get(i).setVotes(show1.getRoster().get(i).getVotes() + vote);
            }
            show1.lowestOut();
        }
        */
        
        //Task 3
        
        Playlist rap = new Playlist(5);
        
        rap.addSong("NOVIJ DEN");
        
        System.out.println(rap.toString());
        
        rap.addSong(3, "SHUM V GOLOVE");
        
        System.out.println(rap.toString());
        
        rap.addSong(3, "VOZMI");
        
        System.out.println(rap.toString());
        
        rap.addSong(0,"H000T");
        
        System.out.println(rap.toString());
        
        System.out.println(rap.whatSong(0));
        
        System.out.println(rap.howMany());
        
        rap.deleteSong(3);
        System.out.println(rap.toString());
        
        rap.tracklist();
        
        rap.sortSongs();
        System.out.println(rap.toString());
    }
}