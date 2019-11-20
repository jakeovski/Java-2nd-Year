/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Pierre
 */
public class LibraryGUI extends JFrame{
    
    private JPanel mainPanel;
    
    private JLabel titleLabel, artistLabel, ratingLabel, tracksLabel;
    
    private JTextField titleField, artistField, tracksField;
    
    private JRadioButton CDButton, DVDButton;
    
    private ButtonGroup bg;
    
    private JButton clear, display;
    
    private JComboBox rating;
    
    
    public LibraryGUI() {
        initComponents();
    }
    
    private void initComponents() {
        
        //Standart
        this.setSize(500,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("CD/DVD Library");
        
        //Panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6,2));
        
        titleLabel = new JLabel("Title: ");
        artistLabel = new JLabel("Artist/Director: ");
        
        titleField = new JTextField();
        artistField = new JTextField();
        
        CDButton = new JRadioButton("CD");
        DVDButton = new JRadioButton("DVD");
        bg = new ButtonGroup();
        bg.add(CDButton);
        bg.add(DVDButton);
        
        ratingLabel = new JLabel("Rating");
        ratingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        String[] choices = {"***","**","*","no stars"};
        rating = new JComboBox(choices);
        
        tracksLabel = new JLabel("Number of Tracks");
        tracksField = new JTextField();
        
        clear = new JButton("Clear");
        display = new JButton("Display");
        
        EventListener e1 = new EventListener();
        CDButton.addActionListener(e1);
        DVDButton.addActionListener(e1);
        clear.addActionListener(e1);
        display.addActionListener(e1);
        
        mainPanel.add(titleLabel);
        mainPanel.add(titleField);
        mainPanel.add(artistLabel);
        mainPanel.add(artistField);
        mainPanel.add(CDButton);
        mainPanel.add(ratingLabel);
        mainPanel.add(DVDButton);
        mainPanel.add(rating);
        mainPanel.add(tracksLabel);
        mainPanel.add(tracksField);
        mainPanel.add(clear);
        mainPanel.add(display);
        
        this.add(mainPanel);
          
    }
    
    private class EventListener implements ActionListener {
        
        @Override public void actionPerformed(ActionEvent e) {
            
            if(e.getSource() == DVDButton) {
                tracksField.setText("");
                tracksField.setEditable(false);
            }
            if(e.getSource() == CDButton) {
                tracksField.setEditable(true);
            }
            if (e.getSource() == clear) {
                titleField.setText("");
                artistField.setText("");
                tracksField.setText("");
            }
            if (e.getSource() == display) {
                String output = "";
                if (CDButton.isSelected()) {
                    output += "CD ( " + tracksField.getText() + " ): " + titleField.getText() + " by " + artistField.getText() + " Rating - " + rating.getSelectedItem() +"\n";
                }
                else {
                    output += "DVD: " +titleField.getText() + " by " + artistField.getText() + " Rating " + rating.getSelectedItem() + "\n";
                }
                System.out.println(output);
            }
        }
}
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LibraryGUI gui = new LibraryGUI();
                gui.setVisible(true);
            }
        });
    }
    
}
