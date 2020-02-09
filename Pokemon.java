import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Pokemon{
    Scanner sc = new Scanner(System.in  );
    int hp  ;
    int evolve  ;
    String name ;
    int damage ;
   
    public Pokemon(){
        hp = 100 ;
        evolve = 0 ;
        damage = 1000 ;
    }
    
    //Set name charecter
    public String setName(){
        System.out.print("Enter your Pokemon name : ");
        name = sc.nextLine();
        return "" ;
    }    

    //Show status charecter
    public String showStatus(){
        System.out.println("MY STATUS POINT");
        System.out.println("My name is : "+ name );
        System.out.println("My Health point : " + hp + "  Point");
        System.out.println("My Experience ( evolve ) : " + evolve + "  Point");
        System.out.println("My damage : " + damage );
        System.out.println("\n------ STATE 1 ------");
        System.out.println("------ Have 2 monters ------\n");
        return "";
    }

    public String startGame(){
        for(int i=0 ; i<15 ; i++ ){
          if(i == 2){
            System.out.println("attack to monter 1");
            evolve = (int)(Math.random()*1000);
            System.out.println("evolve : " + evolve);

          }
          else if(evolve >= 18){
            hp -= 20;
            evolve = 0;
            damage -= 150;
            System.out.println("attack to monter 2");
            System.out.println("evolve : " + evolve);
            System.out.println("damage balance : " + damage);
            System.out.println("hp balance : " + hp + "\n");
          }
          else if(i == 14){
            i = 0;
          }
          else if(hp == 0){
            System.out.println("monter 1 ---DEAD--- \nmonter 2 ---escape---");
            System.out.println("<<< DEAD >>>");
            System.out.println("------ END GAME ------");
            System.out.println("------ SEE YOU NEXT TIME ------");
            break;    
          }
        }
          return "";
   }
}