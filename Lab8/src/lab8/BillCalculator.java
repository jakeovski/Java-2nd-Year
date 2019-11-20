/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 *
 * @author Pierre
 */
public class BillCalculator extends JFrame {
    
    //Fields
    
    private JPanel canvas;
    
    private JLabel[] labels;
    
    private JComboBox adults, children;
    
    private JRadioButton yes, no;
    
    private ButtonGroup bg;
    
    private JButton calculate;
    
    private JTextField textField;
    
    private DecimalFormat to2dp = new DecimalFormat("0.00");
    
    //Constructor
    
    public BillCalculator() {
        initComponents();
    }
    
    //Initialization
    
    public void initComponents() {
        this.setSize(400,200);
        this.setTitle("Bill Calculator");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        labels = new JLabel[5];
        canvas = new JPanel(new GridLayout(5,2));
        
        labels[0] = new JLabel("Adults");
        canvas.add(labels[0]);
        
        adults = new JComboBox(new Integer[] {0,1,2,3,4});
        canvas.add(adults);
        
        labels[1] = new JLabel("Children");
        canvas.add(labels[1]);
        
        children = new JComboBox(new Integer[] {0,1,2,3,4});
        canvas.add(children);
        
        labels[2] = new JLabel("Tip?");
        canvas.add(labels[2]);
        
        yes = new JRadioButton("Yes");
        yes.setSelected(true);
        no = new JRadioButton("No");
        bg = new ButtonGroup();
        bg.add(yes);
        bg.add(no);
        canvas.add(yes);
        canvas.add(new JLabel(""));
        canvas.add(no);
        
        calculate = new JButton("Calculate");
        canvas.add(calculate);
        ButtonListener bt1 = new ButtonListener();
        calculate.addActionListener(bt1);
        
        textField = new JTextField();
        textField.setEditable(false);
        canvas.add(textField);
        this.getContentPane().add(canvas);
        
        
        
    }
    
    public class ButtonListener implements ActionListener {
        @Override public void actionPerformed(ActionEvent e) {
            double bill = 0.0;
            bill += adults.getSelectedIndex() * 10.0;
            bill += children.getSelectedIndex() * 6.0;
            
            if (yes.isSelected()) {
                bill *= 1.1;
            }
            textField.setText(to2dp.format(bill));
        }
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BillCalculator gui = new BillCalculator();
                gui.setVisible(true);
            }
        });
    }
}
