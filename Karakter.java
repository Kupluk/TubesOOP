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
	private String nama;
	private String job;
	private int str;
	private int vit;
	private int intel;
	private int lvl;
	private int hp;
	private int mp;
	private int dmg;

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
}