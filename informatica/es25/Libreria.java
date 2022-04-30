/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es25;

/**
 *
 * @author utente
 */
public class Libreria {
    private String codice;
    private String titolo;
    private String prezzo;

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    public Libreria(String codice, String titolo, String prezzo) {
        this.codice = codice;
        this.titolo = titolo;
        this.prezzo = prezzo;
    }
    
    
}
