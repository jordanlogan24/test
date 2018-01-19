
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;




public class app 
{
    public static void main(String[] args) 
    {
        Boolean endGame = true;
        String var, input=" ";
        PrintWriter out = null;
        File file = new File("src\\predictions.txt");
        
        while (endGame)                                                  // This while loop runs while variable endGame equals true. 
        {
        System.out.println("Ask away! Or type 'quit' to exit the game"); // prompts the user for input
        Scanner scanner = new Scanner(System.in);                        // declares a scanner to accept input from user
        input = scanner.nextLine();                                      // accepts user input and stores it in varible input
         
       
        
       

        
        
        var = getPrediction(input);                                     // Sets a string variable var to call and store the returned string variable from getPrediction
              
                                                                        // Prints the prediction
        //out = new PrintWriter("src/predictions.txt");
        try
        {                                                               // This code is supposed to log everything to a file
            out.println(file);
            System.out.println(var); 
            out.printf(input + "\n" + var);
            out.println("test");
            
        }
        catch(Exception e)
        {
            System.out.println("Error ocurred:");
            System.out.println(e.getMessage());
        }
        out.println("test");
        out.close();
        if(input.equalsIgnoreCase("quit"))                              // This if statement sets endGame to false and breaks the loop to quit the game
            {
            //endGame = false;
            System.out.println("See you later!");
            break;
            }
        
//        finally
//        {
//        if(out != null)
//                {
//                    out.close();
//                }
//        }
       
        }
        
        
    }
    
    public static String getPrediction(String input)                    // This method uses a random number generator to generate a random number. Each possible option is assigned to a possible game answer.
    {
       double rNum = (Math.random() * 8);
        
       String sPrediction = " ";                                        // Initializes the string variable sPrediction
       
        if(rNum <= 1)
        {
            sPrediction = "It is certain\n";
        }
        else if(rNum <= 2)
        {
            sPrediction = "As I see it, yes\n";
        }
        else if(rNum <= 3)
        {
            sPrediction = "Reply hazy try again\n";           
        }
        else if(rNum <= 4)
        {
            sPrediction = "Don't count on it\n";           
        }
         else if(rNum <= 5)
        {
            sPrediction = "It is decidedly so\n";           
        }
         else if(rNum <= 6)
        {
            sPrediction = "Most Likely\n";            
        }
         else if(rNum <= 7)
        {
            sPrediction = "Ask again later\n";           
        }
         else if(rNum > 7)
        {
            sPrediction = "My reply is no\n";           
        }
        return sPrediction;                                             // returns string variable to main function
    }   
    
       
      
    
}


/*
try
    {                                                               //read from file
    File file = new File ("src/test.txt");       
    Scanner scan = new Scanner(file);

    while(scan.hasNextLine())
        {
            System.out.println(scan.nextLine());
        }
    }
catch(Exception e)
    {
    System.out.println("Error ocurred:");
    System.out.println(e.getMessage());
    }





*/