package Farm;

public class main {
    public static void main(String[] args) {
        Dairy dairy = new Dairy(5); // Create a dairy with a capacity of 5 cows

        // Add cows to the dairy
        dairy.addCow(101);
        dairy.addCow(102);
        dairy.addCow(103);

        // Record milk yields for cows
        dairy.cows[0].setMilk(1, 1, 8.0);
        dairy.cows[0].setMilk(1, 2, 7.0);
        dairy.cows[0].setMilk(2, 1, 2.0);
        dairy.cows[0].setMilk(2, 2, 9.0);
        dairy.cows[0].setMilk(3, 1, 6.0);
        dairy.cows[0].setMilk(3, 2, 9.0);
        dairy.cows[0].setMilk(4, 1, 6.0);
        dairy.cows[0].setMilk(4, 2, 1.0);
        dairy.cows[0].setMilk(5, 1, 6.0);
        dairy.cows[0].setMilk(5, 2, 3.0);
        dairy.cows[0].setMilk(6, 1, 1.0);
        dairy.cows[0].setMilk(6, 2, 1.0);
        dairy.cows[0].setMilk(7, 1, 6.0);
        dairy.cows[0].setMilk(7, 2, 9.0);
        
        dairy.cows[1].setMilk(1, 1, 18.0);
        dairy.cows[1].setMilk(1, 2, 7.0);
        dairy.cows[1].setMilk(2, 1, 6.0);
        dairy.cows[1].setMilk(2, 2, 9.0);
        dairy.cows[1].setMilk(3, 1, 6.0);
        dairy.cows[1].setMilk(3, 2, 9.0);
        dairy.cows[1].setMilk(4, 1, 1.0);
        dairy.cows[1].setMilk(4, 2, 1.0);
        dairy.cows[1].setMilk(5, 1, 1.0);
        dairy.cows[1].setMilk(5, 2, 3.0);
        dairy.cows[1].setMilk(6, 1, 1.0);
        dairy.cows[1].setMilk(6, 2, 9.0);
        dairy.cows[1].setMilk(7, 1, 16.0);
        dairy.cows[1].setMilk(7, 2, 9.0);
        
        dairy.cows[2].setMilk(1, 1, 8.0);
        dairy.cows[2].setMilk(1, 2, 7.0);
        dairy.cows[2].setMilk(2, 1, 6.0);
        dairy.cows[2].setMilk(2, 2, 11.0);
        dairy.cows[2].setMilk(3, 1, 1.0);
        dairy.cows[2].setMilk(3, 2, 9.0);
        dairy.cows[2].setMilk(4, 1, 9.0);
        dairy.cows[2].setMilk(4, 2, 10.0);
        dairy.cows[2].setMilk(5, 1, 6.0);
        dairy.cows[2].setMilk(5, 2, 3.0);
        dairy.cows[2].setMilk(6, 1, 11.0);
        dairy.cows[2].setMilk(6, 2, 12.0);
        dairy.cows[2].setMilk(7, 1, 6.0);
        dairy.cows[2].setMilk(7, 2, 1.0);
        
        // Calculate and display average yield per cow
        double averageYield = dairy.averageYield();
        System.out.println("Average yield per cow: " + averageYield);

        // Calculate and display total weekly volume
        double totalWeeklyVolume = dairy.totalWeeklyVolume();
        System.out.println("Total weekly volume: " + totalWeeklyVolume);


        // Identify the most productive cow
        dairy.identifyMostProductiveCow();

        // Identify cows with low yields
        dairy.identifyLowYieldCows();
    }
}