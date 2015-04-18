public class Slot {
    private Item barang;
    private int kuantitas;
    
    //konstruktor
    public Slot(){
    }
    public Slot(Item b, int k){
        barang=b;
        kuantitas=k;
    }
    public Slot(Item b){
        barang=b;
        kuantitas=1;
    }
    
    //getter
    public Item getBarang(){
        return barang;
    }
    public int getKuantitas(){
        return kuantitas;
    }
    
    //setter
    public void setBarang(Item b){
        barang=b;
    }
    public void setKuantitas(int k){
        kuantitas=k;
    }
    
    //menambahkan barang ke sebuah slot
    public void addBarang(){
        kuantitas++;
    }
    
    //ngurangin barang ke sebuah slot
    public void kurangBarang(){
        kuantitas--;
    }
    
    //method
    //menset satu slot oleh sebuah item dengan kuantitas tertentu
    public void setSlot(Item b, int k){
        barang=b;
        kuantitas=k;
    }
}
