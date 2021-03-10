import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What's your question?");
        String question = scan.nextLine();

        randomNumber();
    }

    public static void randomNumber() {
        Scanner scan = new Scanner(System.in);
        String[] possibleOutcomes = {"It is certain.",
                "It is decidedly so.",
                "Without a doubt.",
                "Yes definitely.",
                "You may rely on it.",
                "As I see it, yes.",
                "Most likely.",
                "Outlook good.",
                "Yes.",
                "Signs point to yes.",
                "Reply hazy, try again.",
                "Ask again later.",
                "Better not tell you now.",
                "Cannot predict now.",
                "Concentrate and ask again.",
                "Don't count on it.",
                "My reply is no.",
                "My sources say no.",
                "Outlook not so good.",
                "Very doubtful"};
        Random rand = new Random();
        int randomNumber = rand.nextInt(20);
        String option = possibleOutcomes[randomNumber];
        System.out.println(option);

        System.out.println("Wanna ask another question?");
        String yesOrNo = scan.nextLine();
        if (yesOrNo.equalsIgnoreCase("no")){
           no();
        }else{
            main();
        }




    }

    public static void no() {
        System.out.println("Thanks for playing!");

    }
    public static void main(){
        Scanner scan = new Scanner(System.in);

        System.out.println("What's your question?");
        String question = scan.nextLine();
        randomNumber();
    }
}



