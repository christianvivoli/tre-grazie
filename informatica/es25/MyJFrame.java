/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es25;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author itismeucci
 */
public class MyJFrame extends JFrame {
    
    MyJButton bt=new MyJButton("annulla");
    MyJButton bt2=new MyJButton("conferma");
    
    MyTextField codiceISBN=new MyTextField();
    MyTextField titolo=new MyTextField();
    MyTextField prezzo=new MyTextField();
    
    JTextField jf=new JTextField();
    JTextField jf1=new JTextField();
    JTextField jf2=new JTextField();
    
    ArrayList<Libreria> catalogo=new ArrayList();
    
    Libreria l;
    
    String conta;
    
    /**
     *
     * @param conta
     * @return
     */
    public int conta(String conta){
        int qta=0;
        for(int i=0;i<catalogo.size();i++){
            if(catalogo.get(i).getCodice().equals(conta)){
                qta++;
            }
        }
        return qta;
    } 
    
    public MyJFrame(){
        super("Catalogo libreria");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setSize(400, 320);
        Container frmContentPane= this.getContentPane();
        setLayout(new GridBagLayout());
        GridBagConstraints lim=new GridBagConstraints();
        
        lim.fill=GridBagConstraints.HORIZONTAL;

        lim.gridx=0;
        lim.gridy=0;
        frmContentPane.add(new Label("Codice ISBN"),lim);
        lim.gridx=1;
        lim.gridy=0;
        frmContentPane.add(codiceISBN,lim);       
        lim.gridx=0;
        lim.gridy=1;
        frmContentPane.add(new Label("Titolo"),lim);
        lim.gridx=1;
        lim.gridy=1;
        frmContentPane.add(titolo,lim);
        lim.gridx=0;
        lim.gridy=2;
        frmContentPane.add(new Label("Prezzo"),lim);
        lim.gridx=1;
        lim.gridy=2;
        frmContentPane.add(prezzo,lim);
        lim.gridx=0;
        lim.gridy=3;
        frmContentPane.add(bt2,lim);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ex) {
                l=new Libreria(codiceISBN.getText(), titolo.getText(), prezzo.getText());
                if(catalogo.add(l)){
                    conta=l.getCodice();
                    jf.setText("Codice libro inserito: "+ l.getCodice());
                    jf1.setText("Copie del libro presenti in libreria: "+conta(l.getCodice()));
                    jf2.setText("Libri totali inseriti: "+catalogo.size());
                }
            }
        });
        lim.gridx=1;
        lim.gridy=3;
        frmContentPane.add(bt,lim);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codiceISBN.setText("");
                titolo.setText("");
                prezzo.setText("");
            }
        });
        
        lim.fill=GridBagConstraints.HORIZONTAL;
        lim.ipady = 20;
        lim.weightx = 0.0;
        lim.gridwidth = 2;
        lim.gridx=0;
        lim.gridy=4;
        frmContentPane.add(jf,lim);
        lim.fill=GridBagConstraints.HORIZONTAL;
        lim.ipady = 20;
        lim.weightx = 0.0;
        lim.gridwidth = 2;
        lim.gridx=0;
        lim.gridy=5;
        frmContentPane.add(jf1,lim);
        lim.fill=GridBagConstraints.HORIZONTAL;
        lim.ipady = 20;
        lim.weightx = 0.0;
        lim.gridwidth = 2;
        lim.gridx=0;
        lim.gridy=6;
        frmContentPane.add(jf2,lim);
    }

   

}
