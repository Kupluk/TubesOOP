/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfans
 */
public class Ether extends Item{
    public Ether(){
        super(40); //HARGA 40
    }
       
    @Override
    public void efekItem(Karakter k) {
        k.setMP(k.getMP()+40);
    }
    
    
}