public class Tas {
    private Slot[] isiTas = new Slot[6];
    private int neff;
    
    //konstruktor
    public Tas(){
        neff=0;
    }
    public Tas(Slot[] it, int n){
        isiTas=it;
        neff=n;
    }
    
    //getter
    public Slot[] getIsiTas(){
        return isiTas;
    }
    public int getNeff(){
        return neff;
    }
    
    //setter
    public void setIsiTas(Slot[] s){
        isiTas=s;
    }
    public void setNeff(int n){
        neff=n;
    }
    
    //method
    //menset sebuah index pada tas dengan sebuah slot
    public void setIsiTas(Slot s, int index){
        isiTas[index]=s;
    }
    
    //set barang pada slot tertentu
    public void setBarang(Item item, int index, int kuantitas){
        isiTas[index].setBarang(item);
        isiTas[index].setKuantitas(kuantitas);
    }
    
    //menambahkan sebuah item pada tas
    public void addBarang(Item item){
        boolean nambah=false;
        int i=1;
        while((i<=getNeff())&&(!nambah)){
            if(getIsiTas()[i].getBarang().getIdItem()==item.getIdItem()){
                isiTas[i].addBarang();
                nambah=true;
            }
            i++;
        }
        if(!nambah){
            neff++;
            Slot slot = new Slot(item , 1);
            isiTas[getNeff()]= slot;
        }
    }
    
    //Mengurangi sebuah item pada tas
    public void kurangBarang(Item item){
        int i=1;
        while(i<=getNeff()){
            if(getIsiTas()[i].getBarang().getIdItem()==item.getIdItem()){
                if(getIsiTas()[i].getKuantitas()>1){
                    isiTas[i].kurangBarang();
                }else{
                    if(i!=getNeff()){
                        isiTas[i]=isiTas[getNeff()];
                    }
                    neff--;
                }
            }
            i++;
        }
    }
}
