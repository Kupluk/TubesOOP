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

import java.util.Scanner;
import java.util.Random;

public class Karakter
{
	protected String nama;
	protected String job;
	protected int str;
	protected int vit;
	protected int intel;
	protected int agi;
	protected int lvl;
	protected int hp;
	protected int mp;
	protected int dmg;
	protected int exp;
	protected int sp;
	protected boolean def;
	protected int temp;
	protected boolean buff;
	//Untuk keperluan buff
	protected int bstr;
	protected int bvit;
	protected int bintel;
	protected int bagi;
	protected int bdmg;
	protected int turn = 0;
	
	Random rand = new Random();
	protected int randomNum;
	Scanner sc = new Scanner(System.in);


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

	public int getAGI()
	{
		return agi;
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

	public int getEXP()
	{
		return exp;
	}

	public int getSP()
	{
		return sp;
	}

	public boolean getDef()
	{
		return def;
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

	public void setAGI(int a)
	{
		agi = a;
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
	public void setEXP(int e)
	{
		exp = e;
	}
	public void setSP(int s)
	{
		sp = s;
	}
	public void setDef(boolean d)
	{
		def = d;
	}


	//===KONSTRUKTOR===
	public Karakter(String n, String j, int s, int v, int i, int a, int l)
	{
		nama = n;
		job = j;
		str = s;
		vit = v;
		agi = a;
		intel = i;
		lvl = l;
		hp = 10*vit;
		mp = 10*intel;
		dmg = 2*str;
		def = false;
		buff = false;
	}

	//Menyerang monster
	public void attack(Monster m)
	{
		Random rand = new Random(); //Konstruktor objek random
		int randomNum;
		randomNum = rand.nextInt(99) + 1; 
		if (randomNum >=(50-(Math.round(agi/4))))
		{
			randomNum = rand.nextInt((dmg +15) - (dmg-10)) + (dmg-10); //Max = DMG + 15, minimal = DMG-10
			if (randomNum <= 0)
			{
				randomNum = 0;
			}
			m.setHP(m.getHP() - randomNum);
			System.out.println(m.getNama() + " took " + randomNum + " damage !");
		}
		else
		{
			System.out.println(nama + "'s attack was missed !");
		}
	}

	public void defend()
	{
		def = true;
	}

	//Cetak status karakter
	public void printStatus()
	{
		System.out.println("[" + nama + "]");
		System.out.println("HP\t: " + hp);
		System.out.println("MP\t: " + mp);
		System.out.println("");
	}

	public void printFullStatus()
	{
		System.out.println(nama + "'s status : ");
		System.out.println("HP 	: " + hp);
		System.out.println("MP 	: " + mp);
		System.out.println("Level	: " + lvl);
		System.out.println("SP 	: " + sp);
		System.out.println("EXP 	: " + exp + "/" + lvl*100);
		System.out.println("STR 	: " + str);
		System.out.println("VIT 	: " + vit);
		System.out.println("INT 	: " + intel);
		System.out.println("AGI 	: " + agi);
	}

	//Karakter mati, kehabisan HP
	public void death()
	{
		hp = 0;
		System.out.println(nama + " has fallen !");
	}

	public void lvlup()
	{
		lvl++;
		exp = 0;
		System.out.println(nama + " level up !");
		sp += 5;
		System.out.println(nama + " gained 5 skill points.");
	}

	public void getEXP(int n)
	{
		exp = exp + n;
		if (exp >= 100*lvl)
		{
			lvlup();
		}
	}

	public void useSP()
	{
		if (sp == 0)
		{
			System.out.println("Insufficent Stat Points. Upgrade stat failed.");
		}
		else
		{
			int opt = 0;
			while (opt != 5)
			{
				System.out.println(nama + "'s SP : " + sp);
				System.out.println("Choose your stats to be upgraded :");
				System.out.println("1. Strength");
				System.out.println("2. Vitality");
				System.out.println("3. Intelligence");
				System.out.println("4. Agility");
				System.out.println("5. Cancel");
				opt = sc.nextInt();
				switch(opt)
				{
					case 1 :
						str++;
						sp--;
						opt = 5;
						break;
					case 2 :
						vit++;
						sp--;
						opt = 5;
						break;
					case 3 :
						intel++;
						sp--;
						opt = 5;
						break;
					case 4 :
						agi++;
						sp--;
						opt = 5;
						break;
					case 5 :
						System.out.println("Upgrade canceled.");
						break;
					default :
						System.out.println("Invalid option !");
						opt = sc.nextInt();
				}
				if (sp == 0)
				{
					System.out.println(nama + "'s SP is up. Exiting stat upgrade.");
				}
				else
				{
					System.out.println("Upgrade again ?");
					System.out.println("1. Yes");
					System.out.println("2. No");
					System.out.print("Your action : ");
					opt = sc.nextInt();
					if (opt == 1) 
					{
						System.out.println("Repeating upgrade...");
					}
					else if (opt == 2)
					{
						System.out.println("Exiting upgrade...");
						opt = 5;
					}
					else
					{
						System.out.print("Invalid option ! Please retry :");
						opt = sc.nextInt();
					}
				}
			}
		}
	}

	public void addBuff(int i)
	{
		turn = i;
		buff = true;
		bstr = str;
		bvit = vit;
		bintel = intel;
		bagi = agi;
		bdmg = dmg;
	}

	public void removeBuff()
	{
		str = bstr;
		vit = bvit;
		intel = bintel;
		agi = bagi;
		dmg = bdmg;
		if(buff == true)
		{
			System.out.println(nama + "'s buff has gone...");
			buff = false;
		}
	}

	public void countTurn()
	{
		if (turn > 0 && buff == true)
		{
			turn--;
		}
		else if (turn == 0 && buff == true)
		{
			removeBuff();
		}
	}

	public void printSkills()
	{
		System.out.println("Character's skill list here");
	}

	public void skill(Monster m, int i)
	{

	}
}