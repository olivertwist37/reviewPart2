import java.util.Scanner;
import java.lang.Math;
public class q4{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int compWins=0;
        int humWins=0;
        int ties=0;
        for(int i=0;i<=0;i++){
            System.out.println("What do you throw? [1] Rock, [2] Paper, [3] Scissors?");
            int human = myObj.nextInt();
            int computer = (int) (Math.random() * (3-1+1)+1);
            if(human==computer){
                System.out.println("you rolled "+whatOne(human)+"  I rolled "+whatOne(computer));
                ties++;
                System.out.println("we tied");
            }else if(who(human,computer)){
                System.out.println("you rolled "+whatOne(human)+"  I rolled "+whatOne(computer));
                compWins++;
                System.out.println("haha i win");
            }else if(!who(human,computer)){
                System.out.println("you rolled "+whatOne(human)+"  I rolled "+whatOne(computer));
                humWins++;
                System.out.println("ahhh u win");
            }

            System.out.println("");
            System.out.print("Play again? [Y,N] ");
            String answer= myObj.next();
            if (answer.equals("y"))i--;
            System.out.println(""+answer);
            System.out.println("");
        }
        System.out.println("");
        System.out.println("good game!");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("wins; "+humWins);
        System.out.println("loses; "+compWins);
        System.out.println("ties; "+ties);
    }

    public static boolean who(int a,int b){
        if(a==1&&b==2){
            return true;
        }else if(a==1&&b==3){
            return false;
        }else if(a==2&&b==1){
            return false;
        } else if(a==2&&b==3){
            return true;
        }else if(a==3&&b==1){
            return true;
        }else if(a==3&&b==2){
            return false;
        }else return false;
    }

    public static String whatOne(int a){
        if(a==1){
            return "rock";
        }else if(a==2){
            return "paper";
        }else if(a==3){
            return "scissors";
        }else return "error";
    }
}