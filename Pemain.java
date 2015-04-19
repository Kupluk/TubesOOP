//1. PEMAIN
//Kontrol utama player, attributnya :
//	a. Money 		: Jumlah uang, untuk beli item
//	b. Item 		: Daftar item, untuk digunakan dalam battle
//	c. Posisi 		: Posisi pemain di arena
//	d. Characters 	: Daftar karakter / tokoh

public class Pemain {
    private int money;
    private Tas tas;
    private Point posisi; //posisinya dia
    private Karakter[] characters= new Karakter[3]; //ada 3 karakter yang bisa dimainkan
    
    //konstruktor
    public Pemain(){
    }
    public Pemain(int m, Tas t, Point p, Karakter[] c){
        money=m;
        tas=t;
        posisi=p;
        characters=c;
    }
    
    //getter
    public int getMoney(){
        return money;
    }
    public Tas getTas(){
        return tas;
    }
    public Point getPosisi(){
        return posisi;
    }
    public Karakter[] getCharacters(){
        return characters;
    }
    public int getX(){
        return posisi.getX();
    }
    public int getY(){
        return posisi.getY();
    }
    
    //setter
    public void setMoney(int m){
        money=m;
    }
    public void setTas(Tas t){
        tas=t;
    }
    public void setPosisi(Point p){
        posisi=p;
    }
    public void setCharacters(Karakter[] c){
        characters=c;
    }
    public void setX(int x){
        posisi.setX(x);
    }
    public void setY(int y){
        posisi.setY(y);
    }
    
    //method
    
    //menggerakan pemain maju kanan kiri mundur
    public void maju(char c, TileMap tm){
        int x=getX();
        int y=getY();
        try{
            tm.setTile(posisi, ' ');
            switch (c){
                case 'w' :
                    setY(getY()-1);
                    break;
                case 's' :
                    setY(getY()+1);
                    break;
                case 'd' :
                    setX(getX()+1);
                    break;
                case 'a' :
                    setX(getX()-1);
                    break;
                default :
                    System.out.println("tombol salah");
                    break;
            }
            if (tm.isIsi(posisi)){
                aksi();//belum
            }
            tm.setMap(this);
            tm.setBoard();
        }catch(Exception e1){ //kalo keluar dari matriks
            System.out.println("keluar");
            setX(x);
            setY(y);
        }
    }
    
    //aksi pemain saat memasuki suatu tile
    public void aksi(){
        
    }

    //membeli sebuah item
    public void buy(Item item){
        try{
            if((getMoney()-item.gerHarga())>=0){
                this.setMoney(this.getMoney()-item.gerHarga());
                tas.addBarang(item);
                System.out.println("Barang berhasil dibeli");
            }else{
                throw new Exception("Duit ga cukup cuk!");
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    //menggunakan sebuah item untuk sebuah karakter
    public void useItem(Item item, Karakter karakter){
        tas.kurangBarang(item);
        item.efekItem(karakter);
    }
    
    //mencetak kelayar item apa saja yang dimiliki
    public void printItemDimiliki(){
        int i;
        System.out.println("====Barang dimiliki====");
        for(i=1;i<=tas.getNeff();i++){
            System.out.println("Id barang : "+ tas.getIsiTas()[i].getBarang().getIdItem());
            System.out.println("Jumlah barang : "+ tas.getIsiTas()[i].getKuantitas());
        }
    }
    
    //mencetak ke layar semua atribut pemain
    public void printPemain(){
        System.out.println("\n====PEMAIN====");
        System.out.println("Money : "+getMoney());
        System.out.println("Posisi : "+getPosisi().getX()+","+getPosisi().getY());
        printItemDimiliki();
    }
    
}
