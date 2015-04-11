//1. PEMAIN
//Kontrol utama player, attributnya :
//	a. Money 		: Jumlah uang, untuk beli item
//	b. Item 		: Daftar item, untuk digunakan dalam battle
//	c. Posisi 		: Posisi pemain di arena
//	d. Characters 	: Daftar karakter / tokoh

public class Pemain {
    private int money;
    private Slot[] tas= new Slot[100]; //asumsi ada sebuah tas yang dapat menyimpan 100 slot item
    private Point posisi;
    private Karakter[] characters= new Karakter[3]; //ada 3 karakter yang bisa dimainkan
    
    //konstruktor
    public Pemain(){
    }
    public Pemain(int m, Slot[] t, Point p, Karakter[] c){
        money=m;
        tas=t;
        posisi=p;
        characters=c;
    }
    
    //getter
    public int getMoney(){
        return money;
    }
    public Slot[] getTas(){
        return tas;
    }
    public Point getPosisi(){
        return posisi;
    }
    public Karakter[] getCharacters(){
        return characters;
    }
    
    //setter
    public void setMoney(int m){
        money=m;
    }
    public void setTas(Slot[] t){
        tas=t;
    }
    public void setPosisi(Point p){
        posisi=p;
    }
    public void setCharacters(Karakter[] c){
        characters=c;
    }
    
}
