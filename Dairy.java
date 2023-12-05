package Farm;

public class Dairy {
	
	private int cownum;
    public Cow[] cows;
    private int count;
	
    public Dairy(int cownum) 
    {
        this.cownum = cownum;
        cows = new Cow[cownum];
        count = 0;
    }
	
    public void addCow(int id) 
    {
        if (count < cownum) 
        {
            cows[count] = new Cow(id);
            count++;
            System.out.println("Cow added successfully.");
        }
        else
        {
            System.out.println("dairy is full. Cannot add more cows.");
        }
    }
    
    //average yield per cow in a week
    public double averageYield()
    {
        double total = 0.0;
        for (int i = 0; i < count; i++) 
        {
            for (int j = 0; j < 7; j++) 
            {
                total += cows[i].getTotalYield(j);
            }
        }        
        return Math.round(total / count);
    }
    
    // total weekly volume of milk
    public double totalWeeklyVolume()
    {
        double total = 0.0;
        for (int i = 0; i < count; i++) 
        {
            for (int j = 0; j < 7; j++) 
            {
                total += cows[i].getTotalYield(j);
            }
        }
        return Math.round(total);
    }
	
    
    public void identifyMostProductiveCow()
    {
        double maxTotal = 0.0;
        int mostProductiveCow = -1;

        for (int i = 0; i < count; i++) 
        {
            double cowTotal = 0.0;
            for (int j = 0; j < 7; j++) 
            {
                cowTotal += cows[i].getTotalYield(j);
            }

            if (cowTotal > maxTotal) 
            {
                maxTotal = cowTotal;
                mostProductiveCow = i;
            }
        }

        if (mostProductiveCow != -1) 
        {
            System.out.println("Most productive cow: " + cows[mostProductiveCow].getId() + ", Weekly yield: " + maxTotal);
        } 
        else 
        {
            System.out.println("No cows in the dairy.");
        }
    }

    public void identifyLowYieldCows() 
    {
        for (int i = 0; i < count; i++) 
        {
            int lowYieldCount = 0;
            for (int j = 0; j < 7; j++) 
            {
                if (cows[i].getTotalYield(j) < 12.0)
                {
                    lowYieldCount++;
                }
            }

            if (lowYieldCount >= 4) 
            {
                System.out.println("Low yield cow: " + cows[i].getId());
            }
        }
    }

	
}
