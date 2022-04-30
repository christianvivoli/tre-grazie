/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es25;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author itismeucci
 */
public class MyJButton extends JButton implements ActionListener{
    
    public MyJButton(String s){
        super(s);
        setSize(new Dimension(120, 25));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
     
    }
}
