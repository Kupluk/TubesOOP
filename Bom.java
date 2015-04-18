
public class Bom extends Item {
    
    public Bom(){
        super(10, 3); //harga 10
    }

    public void efekItem(Karakter k) {
    }
    public void efekItem(Monster m){
        m.setHP(m.getHP()-50);
    }
}
