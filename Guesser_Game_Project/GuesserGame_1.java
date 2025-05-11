/* 
 * This Java console project is a simple guessing game between a Guesser and three Players, managed by an Umpire.

The Guesser chooses (inputs) a secret number.

The Players (Player 1, Player 2, and Player 3) then try to guess that number.

The Umpire collects all the guesses and compares them with the Guesser's number to determine:

If a player wins individually

If multiple players win together

Or if no one wins

At the end of the game, it also displays the actual number guessed by the Guesser.
 */
import java.util.*;
class Guesser{
    int GuesserNum;
    public int GuesserNumb(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Guesser, kindly guess a number: ");
        GuesserNum=sc.nextInt();
        return GuesserNum;
    }
}
class Player{
    int PlayerNum;
    public int PlayerNumb(){
        Scanner sc=new Scanner(System.in);
        PlayerNum=sc.nextInt();
        return PlayerNum;
    }
}
class  Umpire{
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;
    public void CollectNumFormGuesser(){
        Guesser G = new Guesser();
        Guessernum =G.GuesserNumb();
    }
    public void CollectNumFormPlayers(){
       System.out.println("Player 1, kindly guess a number: ");
       Player P1 = new Player();// player1
       Playernum1 =P1.PlayerNumb();

       System.out.println("Player 2, kindly guess a number: ");
       Player P2 = new Player();
       Playernum2 =P2.PlayerNumb();


       System.out.println("Player 3, kindly guess a number: ");
       Player P3 = new Player();
       Playernum3 =P3.PlayerNumb();
    }

    public void Compare(){
        if(Guessernum==Playernum1){
            if(Guessernum ==Playernum2 && Guessernum==Playernum3 ){
                System.out.println("All players wons the game");
            }
            else if(Guessernum==Playernum2){
                System.out.println("Player 1 and Player 2 won the game");
            }
            else if(Guessernum==Playernum3){
                System.out.println("Player 1 and Player 3 won the game");
            }
            else{
                System.out.println("Player 1 won the game");
            }
        }
        else if(Guessernum==Playernum2){
            if(Guessernum==Playernum3){
                System.out.println("Player 2 and Player 3 won the game");
            }
            else{
                System.out.println("Player 2 won the game");
            }
        }
        else if(Guessernum==Playernum3){
            System.out.println("Player 3 won the game");
        }
        else{
            System.out.println("No player won the game, try again!");
        }

    }
} 

public class GuesserGame_1{
    public static void main(String[] args) {
        System.out.println("-------Game Started-------");
        Umpire UM = new Umpire();
        UM.CollectNumFormGuesser();
        UM.CollectNumFormPlayers();
        UM.Compare();
        System.out.println("-------Game Over-------");
      
        System.out.println("Thank you for playing the game!");
    }
}
