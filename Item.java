//4. ITEM
//	a. Harga	: Biaya yang diperlukan untuk mendapatkan item yang dimaksud
//	b. Kegunaan	: Bervariasi, tergantung item.
//Tambahan :
//	-Minimal ada 3 item.
//	-Buatlah item yang memiliki kegunaan yang unik.

public class Item {
    private int harga; 
    private int idItem; 
    
    //konstruktor
    public Item(){
        harga=0; //harga urang default 0
        idItem=0;//buat bedain tiap item, kalo item aja bukan subclass nya urang defaultin 0
    }
    public Item(int h, int id){
        harga=h;
        idItem=id;
    }
    
    //getter
    public int gerHarga(){
        return harga;
    }
    public int getIdItem(){
        return idItem;
    }
    
    //setter
    public void setHarga(int h){
        harga=h;
    }
    public void setIdItem(int id){
        idItem=id;
    }
    
    //method
    //memberikan efek dari item ke karakter yang dipilih
    public void efekItem(Karakter k){   
    }
}
