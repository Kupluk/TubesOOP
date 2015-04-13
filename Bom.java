/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfans
 */
public class Bom extends Item {
    
    public Bom(){
        super(10); //harga 10
    }

    @Override
    public void efekItem(Karakter k) {
    }
    public void efekItem(Monster m){
        m.setHP(m.getHP()-50);
    }
}
