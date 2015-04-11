public class Toko {
    private Item[] lapak= new Item[100]; //asumsi toko menjual 100 barang
    
    //konstruktor 
    public Toko(Item[] l){
        lapak=l;
    }
    
    //getter
    public Item[] getLapak(){
        return lapak;
    }
    
    //setter
    public void setLapak(Item[] l){
        lapak=l;
    }
}
