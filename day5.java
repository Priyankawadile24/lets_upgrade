import java.util.*;

class Question
{

 

    Scanner s=new Scanner(System.in);

    String question, option1,option2, option3, option4;

    int correctAnswer, userAnswer;

    

    public boolean askQuestion()
    {

        System.out.println("\n"+question);
        
        System.out.println("\n1. "+option1);
        
        System.out.println("2. "+option2);
        
        System.out.println("3. "+option3);
        
        System.out.println("4. "+option4);
        
        System.out.print("\nPlease choose an option : ");
        
        userAnswer=s.nextInt();
        
        if(userAnswer==correctAnswer)
        
        {
        
            return true;
        
        }
       
        return false;
   
    }

}

class Player 

{
 
    Scanner sc=new Scanner(System.in);
 
    String Name;
 
    int score=0,Answered=0,wronglyAnswered=0;

   
    public void getDetails(){

        System.out.print("\nEnter Player Name : ");
        Name=sc.next();

    }

}

class Game {


    Question[] questions=new Question[5];
    

    Player player=new Player();

    String[] questionsdata={"Which of these are selection statements in Java?","Which of the following loops will execute the body of loop even when condition controlling the loop is initially false?","Which of these jump statements can skip processing the remainder of the code in its body for a particular iteration?","Which of the following is used with the switch statement?","Which of the following is not a valid jump statement?"};
    String[] options1={"if()","do-while","break","continue","break"};
    String[] options2={"for()","while","return","exit","goto"};
    String[] options3={"continue","for","exit","break","continue"};
    String[] options4={"break","None of the above","continue","do","return"};
    int[] answers={1,1,4,3,2};

    public void initGame()
    {

        for(int i=0;i<5;i++)
        {
        
            questions[i]=new Question();
            questions[i].question=questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAnswer=answers[i];
    
        }
    
    }
    
   
    public void play()

    {

        player.getDetails();
        
        for(int i=0;i<5;i++)
        {
            boolean status=questions[i].askQuestion();
            
            if(status==true)
            {
        
                System.out.println("\nAwesome dude, Correct answer!!!");
                player.score=player.score+10;
                player.Answered++;
            
            }
            
            else
            {
        
                System.out.println("\nSorry the answer is not correct...");
                player.score=player.score-5;
                player.wronglyAnswered++;
        
            }
        
        }


        System.out.println("\n\nSCORE BOARD...");
        System.out.println("\nPlayer Name = "+player.Name);
        System.out.println("\nPlayer Score = "+player.score);
        System.out.println("\nNo. of questions Player correctly Answered = "+player.Answered);
        System.out.println("\nNo. of questions Player wrongly Answered = "+player.wronglyAnswered);
    
    }

}


public class QuizApp  
{
    public static void main(String[] args)
    
    {

       
        Game game=new Game();
        game.initGame();
        game.play();

    }

}