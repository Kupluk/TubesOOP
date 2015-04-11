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
}
