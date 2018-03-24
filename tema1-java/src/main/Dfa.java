/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Student
 */
public class Dfa {
    
    private int [] stari;
    private char[] alfabet;
    private int [][] tranzitii;
    private int stareInit;
    private int [] stariFinale;
    private int nrStari;
    private int nrCuvAlfabet;
    private int nrStariFinale;
    
    
    public Dfa(int[] stari, int [][] tranzitii, int[] stariFinale, int nrStari, int nrCuvAlfabet, int nrStariFinale){
        this.stari = stari;
        this.tranzitii = tranzitii;
        this.stariFinale = stariFinale;
        this.nrStari = nrStari;
        this.nrCuvAlfabet = nrCuvAlfabet;
        this.nrStariFinale = nrStariFinale;
    }

    public int[] getStari() {
        return stari;
    }

    public void setStari(int[] stari) {
        this.stari = stari;
    }

    public char[] getAlfabet() {
        return alfabet;
    }

    public void setAlfabet(char[] alfabet) {
        this.alfabet = alfabet;
    }


    public int [][] getTranzitii() {
        return tranzitii;
    }

    public void setTranzitii(int [][] tranzitii) {
        this.tranzitii = tranzitii;
    }

    public int getStareInit() {
        return stareInit;
    }

    public void setStareInit(int stareInit) {
        this.stareInit = stareInit;
    }

    public int[] getStariFinale() {
        return stariFinale;
    }

    public void setStariFinale(int[] stariFinale) {
        this.stariFinale = stariFinale;
    }


    public int getNrStari() {
        return nrStari;
    }

    public void setNrStari(int nrStari) {
        this.nrStari = nrStari;
    }

    public int getNrCuvAlfabet() {
        return nrCuvAlfabet;
    }

    public void setNrCuvAlfabet(int nrCuvAlfabet) {
        this.nrCuvAlfabet = nrCuvAlfabet;
    }

    public int getNrStariFinale() {
        return nrStariFinale;
    }

    public void setNrStariFinale(int nrStariFinale) {
        this.nrStariFinale = nrStariFinale;
    }
    
    public int pozCuvAlfabet(char c){
        for (int i=0;i<nrCuvAlfabet;i++){
            if(c == alfabet[i]) return i;
        }
    return -1;
    }
    
    public boolean stareFinala(int stare){
        for (int i=0;i<nrStariFinale;i++){
            if (stare == stariFinale[i]) return true;
        }
        return false;
    }
}
