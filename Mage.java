//KELAS Mage

public class Mage extends Karakter
{
	//KONSTRUKTOR
	public Mage(String n)
	{
		super(n, "Mage", 3, 5, 12, 5, 1);
		System.out.println(n +" has became a Mage !");
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
				//Fire
				//Menyerang dengan menggunakan api pada musuh
				if(mp >= 20)
				{
					System.out.println(nama + " uses Fire !");
					dmg = dmg + intel;
					attack(m);
					dmg = dmg - intel;
					mp -= 20;
				}
				else
				{
					System.out.println("Insufficent mana !");
				}
				break;

			case 2 :
				//Blizzard
				//Menyerang musuh dengan menggunakan batu es
				if(mp >= 20)
				{
					System.out.println(nama + " uses Blizzard !");
					dmg = dmg + intel;
					attack(m);
					dmg = dmg - intel;
					mp -= 20;
				}
				else
				{
					System.out.println("Insufficent mana !");
				}
				break;

			case 3 :
				//Thunder
				//Menyerang musuh dengan petir
				if(mp >= 20)
				{
					System.out.println(nama + " uses Thunder !");
					dmg = dmg + intel;
					attack(m);
					dmg = dmg - intel;
					mp -= 20;
				}
				else
				{
					System.out.println("Insufficent mana !");
				}
				break;

			default :
				System.out.println("Invalid option !");
				break;
		}
	}

	public void printSkills()
	{
		System.out.println("Choose skill : ");
		System.out.println("1. Fire");
		System.out.println("2. Blizzard");
		System.out.println("3. Thunder");
	}


}