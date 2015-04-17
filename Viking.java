//KELAS Viking

public class Viking extends Karakter
{
	//KONSTRUKTOR
	public Viking(String n)
	{
		super(n, "Viking", 6, 10, 6, 5, 1);
		System.out.println(n +" has became a Viking !");
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
				//Accumulator
				//Menambah damage selama 3 turn
				if(mp >= 30)
				{
					System.out.println(nama + " uses Accumulator !");
					System.out.println(nama + "'s damage is increased for 3 turns !");
					addBuff(3);
					dmg += 15;
					mp -= 30;
				}
				else
				{
					System.out.println("Insufficent mana !");
				}
				break;

			case 2 :
				//Take Down
				//Menyerang musuh dengan damage tambahan namun mengurangi HP karakter
				if(mp >= 10 && hp > 10 )
				{
					System.out.println(nama + " uses Take Down !");
					dmg += 15;
					attack(m);
					dmg -= 15;
					mp -= 10;
					randomNum = rand.nextInt(10) + 1;
					hp -= randomNum;
					System.out.println(nama + " took " + randomNum + " damage from the slam.");
				}
				else
				{
					System.out.println("Insufficent mana or health !");
				}
				break;

			case 3 :
				//Axe Dance
				//Menyerang musuh sebanyak 2x dengan damage yang telah dikurangi
				if(mp >= 30)
				{
					System.out.println(nama + " uses Axe Dance !");
					dmg = dmg - 10;
					attack(m);
					attack(m);
					dmg = dmg + 10;
					mp -= 30;
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
		System.out.println("1. Accumulator");
		System.out.println("2. Take Down");
		System.out.println("3. Axe Dance");
	}


}