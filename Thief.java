//KELAS THIEF

public class Thief extends Karakter
{
	//KONSTRUKTOR
	public Thief(String n)
	{
		super(n, "Thief", 4, 4, 6, 10, 1);
		System.out.println(n +" has became a Thief !");
		//Untuk keperluan buff
		bstr = str;
		bvit = vit;
		bintel = intel;
		bagi = agi;
		bdmg = dmg;
	}

	//SKILLS
	public void skill(Monster m, int i)
	{
		switch(i)
		{
			case 1 :				
				//Steal Gold
				//Mencuri gold dari musuh
				if(mp >= 10)
				{
					System.out.println(nama + " uses Steal Gold !");
					randomNum = rand.nextInt(10) + 10;;
					System.out.println(nama + " stole " + temp + " gold !");
					mp -= 10;
				}
				else
				{
					System.out.println("Insufficent mana !");
				}
				break;

			case 2 :
				//Quickster
				//Meningkatkan agility karakter selama 3 turn
				if(mp >= 25)
				{
					System.out.println(nama + " uses Quickster !");
					addBuff(3);
					agi += 10;
					System.out.println(nama + " has became more agile for 3 turns !");
					mp -= 25;
				}
				else
				{
					System.out.println("Insufficent mana !");
				}
				break;

			case 3 :
				//Fury Slash
				//Menyerang sebanyak 3 - 5 kali secara random dengan damage yang telah dikurangi
				if(mp >= 30)
				{
					System.out.println(nama + " uses Fury Slash !");
					randomNum = rand.nextInt(3) + 3;
					for(temp = 1; temp <= randomNum; temp++)
					{
						dmg -= 10;
						attack(m);
					}
					System.out.println(nama + " slashes " + randomNum + " times !");
					dmg += 10;
				}
				else
				{
					System.out.println("Insufficent mana !");
				}
				mp -= 30;
				break;

			default :
				System.out.println("Invalid option !");
				break;
		}
	}

	public void printSkills()
	{
		System.out.println("Choose skill : ");
		System.out.println("1. Steal Gold");
		System.out.println("2. Quickster");
		System.out.println("3. Fury Slash");
	}


}