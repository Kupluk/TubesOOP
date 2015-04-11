/* 
MONSTER
a. Nama		: Nama monster
b. ATK		: Damage monster kepada karakter
c. HP		: Health Point, "darahnya"
d. Posisi	: Posisi monster di arena
e. Money	: Nilai uang yang diberikan ketika monster dikalahkan
f. IncLevel	: Peningkatan level yang diperoleh ketika monster dikalahkan

Tambahan :
-Nilai minimal jumlah monster tidak disebutkan, tapi kalau bisa buat banyak aja.
-Pendetilan dari kelas monster digunakan prinsip inheritance, sama contohnya dengan karakter.
*/

public class Monster {
    private String nama;
    private int atk;
    private int hp;
    private int posmonster;
    private int money;
    private int inclevel;
        
    //METHOD
    //========Getter========
    public String getNama() {
        return nama;
    }
    public int getAtk() {
        return atk;
    }
    public int getHP () {
        return hp;
    }
    public int getPosMonster(){
        return posmonster;
    }
    public int getMoney(){
        return money;
    }
    public int getIncLevel(){
        return inclevel;
    }
    
    //======Setter========
    public void setNama(String n) {
        nama = n;
    }
    public void setAtk(int a) {
        atk = a;
    }
    public void setHP (int h) {
        hp = h;
    }
    public void setPosMonster(int pm){
        posmonster = pm;
    }
    public void setMoney(int m){
        money = m;
    }
    public void setIncLevel(int il){
        inclevel = il;
    }
    
    public void MasukArena() {
        System.out.println("");
    }
    
    //KONSTRUKTOR
    public Monster (String n, int a, int h, int pm, int m, int il){
		nama = n;
		atk = a;
		hp = h;
		posmonster = pm;
		money = m;
		inclevel = il;
    }
    
}
