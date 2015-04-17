import java.util.Random; //Harus ada ini

public class Randomizer
{
	public static void main(String[] args)
	{
		Random rand = new Random(); //Konstruktor objek random
	int i;
	for(i=0;i<=10;i++){
		int randomNum = rand.nextInt(10) + 1; //rand.nextInt((max - min) +1) + min)
		System.out.println(randomNum);
		}
	}

}