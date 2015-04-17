import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Test1
{
	//Abaikan ini
	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}

	public static int random(int max, int min)
	{
		Random rand = new Random();
    	int randomNum = rand.nextInt((max - min) + 1) + min;

    	return randomNum;
	}

	public static void printStatus(Karakter k, Monster m)
	{
		System.out.println(k.nama + " : \t| " + m.nama +" :");
		System.out.println("HP : " + k.hp + " \t| HP : " + m.hp);
		System.out.println("MP : " + k.mp + " \t|");
	}
	


	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		String nama;
		String temp;
		String job;
		int opt;
		int i;
		//Random rand = new Random(); //Konstruktor objek random
		int randomNum;
		Karakter[] k = new Karakter[4];
		int queue; //Untuk selector karakter pada penambahan turn


		//System.out.print("\033[H\033[2J");
		//System.out.flush();

		System.out.println("");
        System.out.println("");
		System.out.println(" _________________________________________________________________________________________________________");
		System.out.println("|   ___________________________________________________________________________________________________   |");
		System.out.println("|  |                                                                                                   |  |");
		System.out.println("|  | ___________.__              .__    ___________                   ___________                      |  |");
		System.out.println("|  | |_   _____/|__| ____  ____  |  |   |_   _____/_ __  ____         |__    ___/____    _________.__. |  |");                                                                                 
		System.out.println("|  |  |    __)  |  |/    ||__  | |  |    |    __)|  |  |/    |   ______ |    |  |__  |  /  ____|  |  | |  |");                                                                                 
		System.out.println("|  |  |     |   |  |   | | / __ ||  |__  |     | |  |  /   |  | /_____/ |    |   / __ | |___ | |___  | |  |");                                                                                 
		System.out.println("|  |  |_____/   |__|___|_|(_____/|____/  |_____/ |____/|___|__|         |____|  (_____|/_____/ /_____| |  |");                                                                                
		System.out.println("|  |                                                                                                   |  |");                                                                                 
		System.out.println("|  |                                                                                                   |  |");                                                                                 
		System.out.println("|  |___________________________________________________________________________________________________|  |"); 
		System.out.println("|_________________________________________________________________________________________________________|"); 
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.print("\t\t\t\tPlease insert your name : ");
		nama = sc.nextLine();


		//clearConsole();
		System.out.println("\t\t\t\tWelcome to the dungeon, " + nama + " !\n\n\n");

		System.out.println("You have three characters to be played.");
		System.out.println("Current job list :");
		System.out.println("1. Knight - A strong sword wielder who capable last long in arena.");
		System.out.println("2. Thief - An agile dagger wielder who can steal items from enemny.");
		System.out.println("3. Mage - A wise and smart person who can cast powerful spells and magics.");
		System.out.println("4. Viking - A powerful axe wielder who can deal a massive damage at enemy.");
		System.out.println("0. Display heroes' stats.");
		System.out.println("Choose wisely, " + nama + ".");
		for (i = 1; i<=3; i++)
		{
			System.out.print("Insert character number " + i +"'s name : ");
			if(i > 1)
			{
				temp = sc.nextLine();
				//Karena ketika input ke-2 dan ke-3, proses pembacaan nama di-skip. Jadi dibuat dua kali
				//Anehnya ketika input ke-1 proses pembacaan nama ini malah terjadi 2x, jadi dibuat if
			}
			temp = sc.nextLine();
			System.out.print("Please select " + temp + "'s job : ");

			opt = sc.nextInt();

			while(opt >=0 && opt <= 4) 
			{
				
				switch(opt)
				{
					case 0 :
					System.out.println("+=========+=====+=====+=====+=====+");
					System.out.println("| Job     | STR | VIT | INT | AGI |");
					System.out.println("+=========+=====+=====+=====+=====+");
					System.out.println("| Knight  |  6  |  10 |  6  |  5  |");
					System.out.println("| Thief   |  4  |   4 |  6  |  10 |");
					System.out.println("| Mage    |  3  |   5 | 12  |  5  |");
					System.out.println("| Viking  |  12 |   5 |  3  |  5  |");
					System.out.println("+=========+=====+=====+=====+=====+");
					System.out.print("Choose wisely " + nama + " : ");
					opt = sc.nextInt();
					break;

					case 1 :
					k[i] = new Knight(temp);
					opt = 5;
					break;

					case 2 :
					k[i] = new Thief(temp);
					opt = 5;
					break;

					case 3 :
					k[i] = new Mage(temp);
					opt = 5;
					break;

					case 4 :
					k[i] = new Viking(temp);
					opt = 5;
					break;

					default :
					System.out.println("Invalid option !");
					opt = sc.nextInt();
					break;

				}
			}
		}
		System.out.println("All set !");
		System.out.println("LET'S BEGIN OUR JOURNEY !!");

		opt = 1; //Memastikan masuk while

		while(opt !=0) {
		System.out.println("");
		System.out.println("===WORLD MAP===");	
		System.out.println("");
		System.out.println("1. Explore");
		System.out.println("2. Rest");
		System.out.println("3. Use item(s)");
		System.out.println("4. Display status");
		System.out.println("5. Upgrade status");
		System.out.println("6. Save");
		System.out.println("0. Quit game");	
		System.out.println("Please select your action : ");
		opt = sc.nextInt();
		switch(opt)
		{
			
			case 1 :
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("===EXPLORE===");
				System.out.println("");
				System.out.println("Exploring the dungeon...");
				randomNum = random(100,1);
				if(randomNum <= 50)
				{
					//NOTHING
					System.out.println("You found nothing...");
					for (i=1;i<=3;i++)
					{	
						randomNum = random(20,5);
						System.out.println(k[i].nama + " got " + randomNum + " EXP");
						k[i].getEXP(randomNum);
					}
				}
				else if(randomNum >= 51 && randomNum<= 90)
				{
					//BATTLE
					System.out.println("");
					System.out.println("ENCOUNTER ENEMY !");
					System.out.println("");
					Monster m = new Monster("Tubes", 10, 40, 0, 1000, 120);

					opt = 0;


					while (opt <= 5)
					{	
						i = 0;
						while(m.getHP()>0)
						{
							//PLAYER'S TURN
							i++;
							if(i == 4)
							{
								i = 1;
							}
							queue = i;
							int itemp = i;
							System.out.println("Choose "+ k[i].nama + "'s action :");
							System.out.println("1. Attack");
							System.out.println("2. Defend");
							System.out.println("3. Skills");
							System.out.println("4. Item");
							System.out.println("5. Run");
							opt = sc.nextInt();
							switch (opt)
							{
								case 1 :
									k[i].attack(m);
								break;

								case 2 :
									k[i].defend();
									System.out.println(k[i].nama + " is defending.");
								break;

								case 3 :
									k[i].printSkills();
									opt = sc.nextInt();
									k[i].skill(m,opt);
								break;

								case 5 :
									System.out.println("Trying to escape from the fight...");
									randomNum = random(100,1);
									if (randomNum <= 80)
									{
										System.out.println("Successfully escaped !");
										opt = 6;
									}
									else
									{
										System.out.println("Failed to escape !");
										opt = 0;
									}
								break;
								
								default :
									System.out.println("Can't do that !");
								break;
							}

							//ENEMY'S TURN
							if(m.getHP() <= 0)
							{
								System.out.println(m.getNama() + " has fallen !");
								System.out.println("You win !");
								for(i=1; i<=3; i++)
								{
									System.out.println(k[i].nama + " get " + m.inclevel + " EXP !");
									k[i].getEXP(m.inclevel);
									k[i].removeBuff();
								}
								opt = 6;
							}
							else if (opt == 6)
							{
								System.out.println("Your party lost 10 gold !");
								m.hp = 0;
							}
							else
							{
								randomNum = random(3,1);
								m.attack(k[randomNum]);
								System.out.println("===PARTY STATUS===");
								for(i=1; i<=3; i++)
								{
									k[i].printStatus();
								}
								k[queue].countTurn();
								m.printStatus();

								if(k[randomNum].hp <= 0)
								{
									k[randomNum].death();
									System.out.println(k[randomNum].nama + " has fallen !");
								}
							}
							i = itemp;

						}

					}
					//END OF BATTLE
				}
				else
				{
					System.out.println("You got a potion !");
				}
				break;


			case 2 :
				for(i=1; i<=3; i++)
				{
					randomNum = random(20,10);
					if (k[i].hp < k[i].vit*10)
					{
						k[i].hp = k[i].hp + randomNum;
						if (k[i].hp >= k[i].vit*10) 
						{
							System.out.println(k[i].nama + "'s HP has fully recovered");
							k[i].hp = k[i].vit*10;
						}
						else
						{
							System.out.println(k[i].nama + " regained " + randomNum + " HP.");
						}
					}
					else
					{
						System.out.println(k[i].nama + "'s HP is full");
					}
					randomNum = random(20,10);
					if (k[i].mp < k[i].intel*10)
					{
						k[i].mp = k[i].mp + randomNum;
						if (k[i].mp >= k[i].intel*10) 
						{
							System.out.println(k[i].nama + "'s MP has fully recovered");
							k[i].mp = k[i].intel*10;
						}
						else
						{
							System.out.println(k[i].nama + " regained " + randomNum + " MP.");
						}
					}
					else
					{
						System.out.println(k[i].nama + "'s MP is full");
					}
				}
				break;

			case 3 :
				System.out.println("Currently can't use any item...");
				break;

			case 4 :
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("=== PARTY STATUS ===");
				System.out.println("");
				for(i=1; i<=3;i++)
				{
					k[i].printFullStatus();
					System.out.println("");
				}
				break;

			case 5 :
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("=== UPRAGDE ===");
				System.out.print("Select which player (1-3) :");
				i = sc.nextInt();
				if(i > 3 || i < 0)
				{
					System.out.println("Invalid option !");
				}
				else
				{
					k[i].useSP();
				}
			break;

			case 0 :
				System.out.println("");
				System.out.println("Exiting game...");
				System.out.println("");
				opt = 0;
				break;

			default :
				System.out.println("Invalid option !");
			break;

		}
		}
	}


}