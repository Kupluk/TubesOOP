//KELAS KNIGHT

public class Knight extends Karakter
{

	//KONSTRUKTOR
	public Knight(String n)
	{
		super(n, "Knight", 6, 10, 6, 5, 1);
		System.out.println(n +" has became a Knight !");
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
				//Tri-Slash
				//Serang 3x dengan damage lebih kecil dari biasanya pada tiap serangan
				//Cost MP : 15
				if(mp >= 15)
				{
					System.out.println(nama + " uses Tri-Slah !");
					temp = dmg;
					dmg = Math.round(dmg/3);
					for(i = 1; i<=3;i++)
					{
						attack(m);
					}
					dmg = temp;
					mp -= 15;
				}
				else
				{
					System.out.println("Insufficent mana !");
				}
				break;

			case 2 :
				//Power Slash
				//Serang dengan damage tambahan namun akurasi berkurang
				if(mp >= 20)
				{
					System.out.println(nama + " uses Power Slash !");
					temp = agi;
					agi = Math.round(agi/2);
					dmg += 30;
					attack(m);
					dmg -= 30;
					agi = temp;
					mp -= 20;
				}
				else
				{
					System.out.println("Insufficent mana !");
				}
				break;

			case 3 :
				//Stagger Aura
				//Meningkatkan vitality karakter selama 3 turn
				if(mp >= 30)
				{
					System.out.println(nama + " uses Stagger Aura !");
					System.out.println(nama + "'s vitality increased for 3 turns !");
					addBuff(3);
					vit += 10;
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
		System.out.println("1. Tri-Stab");
		System.out.println("2. Power Slash");
		System.out.println("3. Stagger Aura");
	}

}