public class Armor extends Item {
    
    //konstruktor
    public Armor(){
        super(100); //harga100
    }
    
    //method
    @Override
    public void efekItem(Karakter k) {
        k.setINT(k.getINT()+5);
        k.setSTR(k.getSTR()+5);
        k.setVIT(k.getVIT()+5);
    }
}
