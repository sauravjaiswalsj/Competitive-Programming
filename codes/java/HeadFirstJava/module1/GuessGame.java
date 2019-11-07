import java.util.*;
class RandomGame{
    Player p1;
    Player p2;
    Player p3;
    public void playgame () {
        int p1Num=0,p2Num=0,p3Num=0;
        boolean p1right=false, p2right=false, p3right=false;
        p1=new Player();
        p2=new Player();
        p3=new Player();
        System.out.println("Please Guess the Number");
        int target=(int) (Math.random() * 10);
        while(true){
            System.out.println("Please, Guess The Number between 0 to 9");
            p1.guessNumber();
            p2.guessNumber();
            p3.guessNumber();
            p1Num=p1.number;
            System.out.println("P1 Guessing the Number: "+p1Num);
            p2Num=p2.number;
            System.out.println("P2 Guessing the Number: "+p2Num);
            p3Num=p3.number;
            System.out.println("P3 Guessing the Number: "+p3Num);
            if(p1Num==target){
                p1right=true;
            }
            if(p2Num==target){
                p2right=true;
            }
            if(p3Num==target){
                p3right=true;
            }
            if (p1right || p2right || p3right){
                System.out.println("We got a Winner: ");
                System.out.println("Correrct guess is: "+target);
                System.out.println("Player one Guessed: "+p1Num);
                System.out.println("Player two Guessed: "+p2Num);
                System.out.println("Player three Guessed: "+p3Num);
                break;
            }
            else{
                System.out.println("You Gotta Guess Again");
            }
        }
    }
}
class Player{
    int number=0;
    public void guessNumber(){
        number=(int) (Math.random()*10);
        System.out.println("I am guessing the number: "+number);
    }
}
class GuessGame{
    public static void main(String[] args){
    RandomGame game=new RandomGame();
    game.playgame();
    }
}