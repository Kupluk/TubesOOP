public class Potion extends Item{
    //potion tambah HP 50 
    
    //konstruktor
    public Potion(){
        super(10); //harga potion 10
    }

    @Override
    public void efekItem(Karakter k) {
        k.setHP(k.getHP()+50);
    }
   
}
