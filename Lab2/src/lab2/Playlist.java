/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Pierre
 */
public class Playlist {
    
    
    private String[] songlist;
    
    public Playlist(int numOfSongs) {
        songlist = new String[numOfSongs];
    }
    //-------------Getters-----------------

    public String[] getSonglist() {
        return songlist;
    }

    //--------------Setters---------------

    public void setSonglist(String[] songlist) {
        this.songlist = songlist;
    }

    
    //--------------Others----------------

    @Override
    public String toString() {
        return Arrays.toString(songlist);
    }
    
    public void addSong(String song) {
        if (songlist[songlist.length -1] == null) {
            songlist[songlist.length -1] = song;
        }
    }
    
    public void addSong(int index, String song) {
        int space = 0;
        int nullIn = 0;
        for (int i = 0; i < songlist.length;i++) {
            if (songlist[i] == null) {
                space++;
                nullIn = i;
            }
        }
        if (space > 0) {
            if (songlist[index] != null) {
                if(index < nullIn) {
                    for(int y = nullIn; y >= index;y--) {
                        if (y == index) {
                            songlist[y] = song;
                        }
                        else {
                            songlist[y] = songlist[y-1];
                        }
                    }
                }
                else if (index > nullIn) {
                    for(int j = nullIn;j <= index; j++) {
                        if (j == index) {
                            songlist[j] = song;
                        }
                        else {
                            songlist[j] = songlist[j+1];
                        }
                    }
                }
            }
            else {
                songlist[index] = song;
            }
        }
        else {
            System.out.println("No space");
        }
    }
    
    public String whatSong(int index) {
        return songlist[index];
    }
    
    public int howMany() {
        int count = 0;
        for (String i : songlist) {
            if (i != null) {
                count++;
            }
        }
        return count;
    }
    
    public void deleteSong(int index) {
        if (songlist[index] != null) {
            songlist[index] = null;
        }
    }
    
    public void tracklist() {
        int count = 1;
        for (String i : songlist) {
            if (i != null) {
                System.out.println(count + ": " + i + "\n");
                count++;
            }
        }
    }
    
    public void sortSongs() {
        Arrays.sort(songlist, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            if (o1 == null && o2 == null) {
                return 0;
            }
            if (o1 == null) {
                return 1;
            }
            if (o2 == null) {
                return -1;
            }
            return o1.compareTo(o2);
        }});
    }
    
    
}
