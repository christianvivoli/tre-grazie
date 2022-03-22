/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es22;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author utente
 */
public class MyJFrame extends JFrame{
     public MyJFrame(String title){
        super(title);
        setVisible(true);
        setSize(220, 320);
        Container frmContentPane= this.getContentPane();
        this.setLayout(new GridBagLayout());
        GridBagConstraints lim=new GridBagConstraints();
        
        lim.fill=GridBagConstraints.HORIZONTAL;
        
        lim.gridx=0;
        lim.gridy=0;
        lim.gridheight=1;
        lim.gridwidth=4;
        frmContentPane.add(new MyJTextField(),lim);
        //prima riga
        lim.gridx=0;
        lim.gridy=1;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("7"),lim);
        lim.gridx=1;
        lim.gridy=1;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("8"),lim);
        lim.gridx=2;
        lim.gridy=1;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("9"),lim);
        lim.gridx=3;
        lim.gridy=1;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("+"),lim);
        //seconda riga
        lim.gridx=0;
        lim.gridy=2;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("4"),lim);
        lim.gridx=1;
        lim.gridy=2;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("5"),lim);
        lim.gridx=2;
        lim.gridy=2;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("6"),lim);
        lim.gridx=3;
        lim.gridy=2;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("-"),lim);
        //terza riga
        lim.gridx=0;
        lim.gridy=3;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("1"),lim);
        lim.gridx=1;
        lim.gridy=3;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("2"),lim);
        lim.gridx=2;
        lim.gridy=3;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("3"),lim);
        lim.gridx=3;
        lim.gridy=3;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("/"),lim);
        //quarta riga
        lim.gridx=0;
        lim.gridy=4;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("0"),lim);
        lim.gridx=1;
        lim.gridy=4;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("."),lim);
        lim.gridx=2;
        lim.gridy=4;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("*"),lim);
        lim.gridx=3;
        lim.gridy=4;
        lim.gridheight=1;
        lim.gridwidth=1;
        frmContentPane.add(new MyJButton("="),lim);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
