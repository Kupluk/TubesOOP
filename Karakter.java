// 2. KARAKTER
// Harus ada 3 biji, masing-masing punya attribut :
// 	a. Nama 	: Nama karakter
// 	b. Status 	:
// 		- STR : Strength, menentukan damage karakter (Damage = 2*STR)
// 		- VIT : Vitality, menentukan kapasitas HP (10*VIT)
// 		- INT : Intelligence, menentukan kapasitas MP (10*INT)
// 	c. Level 	: Menentukan peningkatan status karakter
// 	d. HP		: Health Point, "darahnya"
// 	e. MP		: Magic Point, tenaga untuk melakukan magic
// Tambahan :
// 	-Ketiga karakter memiliki magic tertentu, tergantung job-nya.
// 	-Nilai status tiap karakter berbeda-beda.
// 	-Pendetilan dari kelas karakter digunakan prinsip inheritance, 
// 	Contoh job Swordsman jadi -> public class Swordsman extends Karakter.

public class Karakter
{
	protected String nama;
	protected String job;
	protected int str;
	protected int vit;
	protected int intel;
	protected int lvl;
	protected int hp;
	protected int mp;
	protected int dmg;
	protected int exp;


	//===GETTER DAN SETTER===
	public String getNama()
	{
		return nama;
	}

	public String getJob()
	{
		return job;
	}

	public int getSTR()
	{
		return str;
	}

	public int getVIT()
	{
		return vit;
	}

	public int getINT()
	{
		return intel;
	}

	public int getLVL()
	{
		return lvl;
	}

	public int getHP()
	{
		return hp;
	}

	public int getMP()
	{
		return mp;
	}

	public int getDMG()
	{
		return dmg;
	}

	public void setNama(String n)
	{
		nama = n;
	}

	public void setJob(String j)
	{
		job = j;
	}

	public void setSTR(int s)
	{
		str = s;
	}

	public void setVIT(int s)
	{
		vit = s;
	}

	public void setINT(int s)
	{
		intel = s;
	}

	public void setLVL(int s)
	{
		lvl = s;
	}

	public void setHP(int s)
	{
		hp = s;
	}

	public void setMP(int s)
	{
		mp = s;
	}

	public void setDMG(int s)
	{
		dmg = s;
	}


	//===KONSTRUKTOR===
	public Karakter(String n, String j, int s, int v, int i, int l)
	{
		nama = n;
		job = j;
		str = s;
		vit = v;
		intel = i;
		lvl = l;
		hp = 10*vit;
		mp = 10*intel;
		dmg = 2*str;
	}

	//Menyerang monster
	public void attack(Monster m)
	{
		Random rand = new Random(); //Konstruktor objek random
		int randomNum = rand.nextInt((dmg +20) - (dmg-10)) + (dmg-10); //41 = max, 1 = min
		if (randomNum <= 0)
		{
			randomNum = 0;
		}
		m.setHP(m.getHP() - randomNum);
		System.out.println(m.getNama() + " took " + randomNum + " damage !");
	}

	//Cetak status karakter
	public void printStatus()
	{
		System.out.println(nama + "'s status : ");
		System.out.println("HP 		: " + hp);
		System.out.println("MP 		: " + mp);
		System.out.println("Level	: " + lvl);

	}

	//Karakter mati, kehabisan HP
	public void death()
	{
		hp = 0;
		System.out.println(nama + " has fallen !");
	}
}
