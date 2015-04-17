/* 
MONSTER
a. Nama		: Nilaiama monster
b. ATK		: Damage monster kepada karakter
c. HP		: Health Point, "darahnya"
d. Posisi	: Posisi monster di arena
e. Money	: Nilai uang yang diberikan ketika monster dikalahkan
f. IncLevel	: Peningkatan level yang diperoleh ketika monster dikalahkan

Tambahan :
-Nilai minimal jumlah monster tidak disebutkan, tapi kalau bisa buat banyak aja.
-Pendetilan dari kelas monster digunakan prinsip inheritance, sama contohnya dengan karakter.
*/

import java.util.Random;

public class Monster {
    protected String nama;
    protected int atk;
    protected int hp;
    protected int posmonster;
    protected int money;
    protected int inclevel;
        
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
		System.out.println(nama + " appears !");
    }

    //Mencetak status monster
    public void printStatus()
    {
    	System.out.println("===MONSTER STATUS===");
    	System.out.println("[" + nama + "]");
		System.out.println("HP\t: " + hp);   
		System.out.println(""); 	
    }


    //Menyerang karakter
    public void attack(Karakter k)
    {
    	System.out.println(nama + " attacks !");
    	Random rand = new Random(); //Konstruktor objek random
		int randomNum = rand.nextInt(99) + 1;
		if (randomNum >= (50+(Math.round(k.agi/5))))
		{
			randomNum = rand.nextInt((atk + 5) - (atk-5)) + (atk-5);
			if(k.def == true)
			{
				System.out.println(k.nama + " blocked the attack !");
				randomNum = randomNum - k.str;
			}
			if (randomNum <= 0)
			{
				randomNum = 0;
			}
			k.setHP(k.getHP() - randomNum);
			System.out.println(k.nama + " took " + randomNum + " damage !");
		}
		else
		{
			System.out.println(nama + "'s attack was missed !");
		}
    }
    
}
