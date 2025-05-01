package Question02.ArrayBased.Primitive;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {

    List ballList = new List(6);
    List scoreList = new List(6);

    ArrayList<String> nameList = new ArrayList<String>();

    public Functions(String[] NameList,int[] BallList,int[] ScoreList) {
        for (int i: BallList) {
            ballList.insertLast(i);
        }
        for (int i: ScoreList) {
            scoreList.insertLast(i);
        }

        for (String j : NameList
             ) {
this.nameList.add(j);
        }
    }

    public String HighestScorePlayer(){
        int pointer = 0;
        int maxScore = Integer.MIN_VALUE;
        for (int i = 0; i < scoreList.listSize(); i++) {
            if (maxScore<=scoreList.retrieveList(i)){
                maxScore = scoreList.retrieveList(i);
                pointer = i;
            }
        }
        return nameList.get(pointer);
    }
    public String LowestNumberOfBalls(){
        int pointer = 0;
        int lowBalls = Integer.MAX_VALUE;
        for (int i = 0; i < ballList.listSize(); i++) {
            if (lowBalls>=scoreList.retrieveList(i)){
                lowBalls = scoreList.retrieveList(i);
                pointer = i;
            }
        }
        return nameList.get(pointer);
    }
    int BattingPointer ;
    public void displayBattingStrike(){
        double HighbattingStrikeRate = 0;
        double Pointer = 0;

        for (int i = 0; i < ballList.listSize(); i++) {
            double currentStrikerate = calculateStrikeRate(scoreList.retrieveList(i), ballList.retrieveList(i));
            System.out.printf("Player "+nameList.get(i)+ " : %.2f\n", currentStrikerate);
            if (HighbattingStrikeRate <= currentStrikerate){
                HighbattingStrikeRate = currentStrikerate;
                Pointer = i;
            }
        this.BattingPointer = (int) Pointer;
        }
    }

    public String ManOfTheMatch(){
        return nameList.get(BattingPointer);
    }
    public static double calculateStrikeRate(int battingScore, int ballsFaced) {
        if (ballsFaced == 0) {
            System.out.println("Error: Balls faced cannot be zero.");
            return 0.0;
        }
        return (double) battingScore * 100 / ballsFaced;
    }











}
