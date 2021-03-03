import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        //  String[] possibleAnswers = {"As I see it yes.", "Ask again later.", "Better not tell you now.",
        //       "Cannot predict now.", "Concentrate and ask again.", "Don’t count on it.", "It is certain.",
        //        "It is decidedly so.", "Most likely.", "My reply is no.", "My sources say no.", "Outlook not so good.",
        //       "Outlook good.", "Reply hazy, try again.", "Signs point to yes.", "Very doubtful.", "Without a doubt.",
        //       "Yes.", "Yes – definitely.", "You may rely on it."};
//
        //       while(true){
        //       System.out.println("Ask me a question mortal.");

        //       Random randNum = new Random(possibleAnswers.length);

        //        System.out.println(randNum);
        //   }
        // }
        boolean ploggers = true;
        int randomNumber;
        String[] posibleOutcomes = {"It is certain.",
                "It is decidedly so.",
                "Without a doubt.",
                "Yes – definitely.",
                "You may rely on it.",
                "As I see it, yes.",
                "Most likely.",
                " Outlook good.",
                " Yes.",
                "Signs point to yes.",
                " Reply hazy, try again.",
                "Ask again later.",
                " Better not tell you now.",
                "Cannot predict now.",
                " Concentrate and ask again.",
                "Don't count on it.",
                " My reply is no.",
                " My sources say no.",
                " Outlook not so good.",
                "Very doubtful"};

        while (ploggers) {
            System.out.println("Ask me a question mortal.");
            String question = reader.nextLine();


            Random rand = new Random();
            randomNumber = rand.nextInt(20);
            String option = posibleOutcomes[randomNumber];
            System.out.println(option);

            System.out.print("Do you have another question?");
            String yesOrNo = reader.nextLine();
            if (yesOrNo=="no"){
                ploggers=false;
            }





        }
    }
}


