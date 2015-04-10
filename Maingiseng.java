import java.util.Scanner;

public class Maingiseng
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		String name;


		System.out.println("\nInsert your name : ");
		name = sc.nextLine();

		Hero h = new Hero(name);

		h.introduce();
		h.mainmenu();
		

	}
}
