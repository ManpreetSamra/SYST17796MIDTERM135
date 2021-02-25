/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.util.Scanner;
/**
 *
 * @author samra
 */

public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    Seasons season;
    private boolean abc=true;
    public enum Seasons{
        FALL,
        WINTER,
        SPRING,
        SUMMER
    }
    //a constructor
    public JavaApplication11(Seasons season)
    {
        this.season = season;
    }
   
    public void seasonDescription()
    {
       switch (season){
            case FALL:
                System.out.println("my fav. season!");
                break;
            case WINTER:
                System.out.println("it is too cold!");
                break;
            case SPRING:
                System.out.println("my allerg!");
                break;
            case SUMMER:
                System.out.println("it is hot!");
                break;
     }
    }
    public boolean isSeason(){
        
        boolean status=false;
        for (Seasons s : Seasons.values()) {
            if (s.equals(this.season)) {
                status= true;
               
            }
        }
        
        return status;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        // try to get the input (myStr) from the user
        String myStr;
        System.out.print("Enter the value");
        Scanner input=new Scanner(System.in);
        myStr=input.nextLine();
        System.out.println();
        JavaApplication11 test1= new JavaApplication11(Seasons.valueOf(myStr));
        test1.seasonDescription();
        boolean b=test1.isSeason();
        int ord = Seasons.valueOf(myStr).ordinal();
        System.out.println(Seasons.valueOf(myStr).ordinal());
        System.out.println("Season is "+b);
        //a for loop that iterated thru the Seasons Enum using values() method
        for (Seasons mySeason: Seasons.values())
        {
            
            System.out.println(mySeason);
        }
       
        }
    
    
    }
    

