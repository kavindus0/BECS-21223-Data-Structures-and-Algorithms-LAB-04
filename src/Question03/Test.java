package Question03;

public class Test {
    public static void main(String[] args) {
        List electionData = new List(5);

        electionData.insertLast(new Party("A", 12453, 89023, 60250));
        electionData.insertLast(new Party("B", 23457, 41900, 35890));
        electionData.insertLast(new Party("C", 74129, 23000, 56000));
        electionData.insertLast(new Party("D", 202, 57, 354));
        electionData.insertLast(new Party("E", 87, 5, 457));

        Functions analysis = new Functions(electionData);

  
        analysis.findWinningPartiesPerDistrict();

        analysis.findOverallWinner();

        analysis.findMinVotesPerDistrict();

         analysis.findEligibleParties();
        
    }
}