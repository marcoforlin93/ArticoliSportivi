/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author matteo
 */
public class eliminare {
    int a;

    public eliminare(int a) {
    this.a = a;
    }
    
    public int f1() {
        return ++a;
    }
    
    public boolean f2(int p1) {
        return p1==1;
    }
    
    public boolean f3(int p1) {
    return p1==0;
    }
    
    public static void main(String[] args) {
        eliminare e = new eliminare(0);
        System.out.println(e.f2(e.f1()));
        System.out.println(e.f3(e.f1()));
    }
}
