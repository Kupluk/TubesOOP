public class Potion extends Item{
    //potion tambah HP 50 
    
    //konstruktor
    public Potion(){
        super(10, 1); //harga potion 10
    }
    

    public void efekItem(Karakter k) {
        k.setHP(k.getHP()+50);
    }
   
}
