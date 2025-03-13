import java.util.Random;
import java.util.Scanner;


class SimpleStartupGame {

    public static void main(String[] args)
    {
        SimpleStartup startup = new SimpleStartup();

        Random rand = new Random();
        
        int num = rand.nextInt(5);

        int[] locations = {num,num+1,num+2};
        
        startup.setLocationCells(locations);
        int guesses = 0;

        while(true)
        {
            guesses++;
             System.out.println("Guess a number: ");

            Scanner s = new Scanner(System.in);
            // Read the next integer from the screen
            num = s.nextInt();

            String result = startup.checkYourself(num);

            if(result.equals("kill"))
            {
                
              System.out.println("Startup is destroyed!!");
              System.out.println("Number of guesses: "+ guesses);
              break;
            }
          
        }
       
    }
}