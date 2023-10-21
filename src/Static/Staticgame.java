package Static;
import java.util.*;
class Stgame{
    static int inp1,inp2;

    int u1;

    static {
        inp1 = 10;
        inp2 = 70;
    }

    void user() {
        System.out.println("Rules of the game is -> If You Play again Then You Can't choose Same Number ");
        System.out.println("If Two times Try Again Result Given Then You Out This Game ");
        System.out.println("----Play game with me Below Choose Any Number---");
        System.out.println("#choose-- 20");
        System.out.println("#choose-- 10");
        System.out.println("#choose-- 40");
        System.out.println("#choose-- 50");
        System.out.println("#choose-- 80");
        System.out.println("#choose-- 60");
        System.out.println("#choose-- 30");
        System.out.println("#choose-- 70");
        System.out.println("#choose-- 90");
        System.out.println("#choose-- 100");

        System.out.println("Enter that number: ");
        Scanner u = new Scanner(System.in);
        u1 = u.nextInt();
    }
     void cong(){
        System.out.println("Congratulation.");
        System.out.println("You are The winner.");
    }
    void loose(){
        System.out.println("looser.");
        System.out.println("Sorry Your Number Doesn't Match.");
        System.out.println("---Now You Do This Work Mention In Below---");
    }
    void match() {
        if (inp1 == u1) {
            cong();
            System.out.println("Your number match " + u1 + " with " + inp1);
        }
        else if (inp2 == u1) {
            cong();
            System.out.println("Your number match " + u1 + " with " + inp2);
        }
        else if (20 == u1){
            loose();
            System.out.println("The looser go on street & seeking hand with unknown person");
        }
        else if (60 == u1){
            loose();
            System.out.println("The loser has to dress up in an embarrassing outfit and take a funny photo with the winner");
        }
        else if (100 == u1){
            loose();
            System.out.println("Walk in a circle for five minutes while humming the song");
        }
        else if (50 == u1){
            loose();
            System.out.println("Wear a Sign on Your Back that Says “I am looser, I lost The game” & walk in your street");
        }
        else{
            System.out.println("Try Again");
        }

    }


}
public class Staticgame {
    public static void main(String[] args){
        Stgame game1 = new Stgame();
        game1.user();
        game1.match();
    }
}
