//4. ITEM
//	a. Harga	: Biaya yang diperlukan untuk mendapatkan item yang dimaksud
//	b. Kegunaan	: Bervariasi, tergantung item.
//Tambahan :
//	-Minimal ada 3 item.
//	-Buatlah item yang memiliki kegunaan yang unik.

public abstract class Item {
    private int harga;
    
    //konstruktor
    public Item(){
        
    }
    public Item(int h){
        harga=h;
    }
    
    //getter
    public int gerHarga(){
        return harga;
    }
    
    //setter
    public void setHarga(int h){
        harga=h;
    }
    
    //method
    public abstract void efekItem(Karakter k);
    
}
