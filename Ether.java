
public class Ether extends Item{
    
//konstruktor
    public Ether(){
        super(40, 2); //HARGA ETHER 40, dan id ether 2
    }
    
    //method
    public void efekItem(Karakter k) {
        k.setMP(k.getMP()+40); //menambahkan MP sebanyak 40
    }
    
    
}
