package Farm;

public class Cow {
	
	public int id;
	
	double[][] weekRecord = new double[7][2];

	public Cow(int id) {
		setID(id);
	}
	
	public void setID(int id)
	{
		this.id = id;
	}
	
	public void setMilk(int day, int session, double vol) 
	{
		weekRecord[day - 1][session - 1] = vol;
	}
	
	int getId()
	{
		return id;
	}
	
	
	double getYield(int day, int session) 
	{
		return weekRecord[day - 1 ][session - 1];
	}
	
	double getTotalYield(int day)
	{
		return weekRecord[day][0]+ weekRecord[day][1];
	}
	

}
