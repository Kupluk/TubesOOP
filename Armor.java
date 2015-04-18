public class Armor extends Item {
    //urang jadi bingung armor mau digimanain kalo sekali pake, efek dari item nya mau berapa lama?
    
    //konstruktor
    public Armor(){
        super(100, 4); //harga100
    }
    
    //method
    public void efekItem(Karakter k) {
        k.setINT(k.getINT()+5);
        k.setSTR(k.getSTR()+5);
        k.setVIT(k.getVIT()+5);
    }
}
