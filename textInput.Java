//Imports scanner library
import java.util.Scanner;

public class textInput {
     
    //string declaration
    static String toTranslate;
    static boolean on = true; 
    
    public static String text_for_translate(String to_translate) // time in milliseconds
    {
       System.out.println(to_translate);
       //^^ test code 
       return to_translate;

    }
    
     
    public static void main(String args[]){
    	

        //scanner initialization
        Scanner input = new Scanner(System.in);
         
        //prompts user text to translate
        while (on == true){
        //System.out.println("What would you like to translate to ASL?.");
        toTranslate = input.nextLine();
           
        text_for_translate(toTranslate);
        		} 
    		}

    	}
    
