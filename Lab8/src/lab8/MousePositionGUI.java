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
public class MousePositionGUI extends JFrame{
    
    
    private JPanel top, bottom;
    
    private JLabel label1, label2, label3;
    
    public MousePositionGUI() {
        initComponents();
    }
    
    private void initComponents() {
        
        
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Mouse Position Tracker");
        this.setLayout(new GridLayout(2,1));
        
        
        top = new JPanel();
        top.setBackground(Color.yellow);
        bottom = new JPanel();
        bottom.setLayout(new GridLayout(3,1));
        
        label1 = new JLabel("Click the mouse!");
        label2 = new JLabel("Click the mouse");
        label3 = new JLabel();
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        
        bottom.add(label1);
        bottom.add(label2);
        bottom.add(label3);
        
        CursorListener c1 = new CursorListener();
        
        top.addMouseListener(c1);
        
        this.add(top);
        this.add(bottom);
        
        
    }
    
    
    public class CursorListener implements MouseListener {
        
        
        @Override public void mouseClicked(MouseEvent e) {
            label1.setText("Mouse last Clicked at screen position ( " + e.getX() + " , " + e.getY() + " )");
            label2.setText("Mouse last Clicked at panel position ( " + e.getXOnScreen() + " , " + e.getYOnScreen() + " )");
        }

        @Override
        public void mousePressed(MouseEvent arg0) {
        }

        @Override
        public void mouseReleased(MouseEvent arg0) {
        }

        @Override
        public void mouseEntered(MouseEvent arg0) {
            label3.setText("Mouse is INSIDE the panel");
        }

        @Override
        public void mouseExited(MouseEvent arg0) {
            label3.setText("Mosue is OUTSIDE the panel");
        }
    }
    
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MousePositionGUI gui = new MousePositionGUI();
                gui.setVisible(true);
            }
        });
    }
}
