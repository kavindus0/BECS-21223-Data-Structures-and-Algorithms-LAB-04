package Question02.ArrayBased.Primitive;

public class Test {
    public static void main(String[] args) {
        Functions functions = new Functions(
                new String[] {
                        "Chamari Athapaththu",
                        "Anushka Sanjeewani",
                        "Kavisha Dilhari",
                        "Harshitha Samarawickrama",
                        "Sugandika Kumari",
                        "Hasini Perera"
                },new int[] {48, 22, 18, 13, 9, 3},
                new int[] {63, 24, 17, 12, 10, 3}

        );
// nama, bola, lakunu danna
        System.out.println(functions.HighestScorePlayer());
        System.out.println(functions.LowestNumberOfBalls());
        System.out.println("STRIKE RATES");
        functions.displayBattingStrike();
        System.out.println("MOM "+functions.ManOfTheMatch());




    }
}
