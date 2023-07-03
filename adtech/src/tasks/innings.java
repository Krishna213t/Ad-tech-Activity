package tasks;
import java.util.*;
public class innings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     InningsData d= new InningsData();
     
     Scanner s = new Scanner(System.in);
     System.out.println("Enter Team:");
     String team = s.next();
     System.out.println("Enter Innings:");
     String ing=s.next();
     System.out.println("Enter Score:");
     int score = s.nextInt();
     d.setTeam(team);
     d.setInnnings(ing);
     d.setScore(score);
     d.display();
     System.out.println("Team Name: "+d.getTeam());
     System.out.println("Innings NAme: "+d.getInnnings());
     String ing2=d.getInnnings();
     int scr=d.getScore();
     if(ing2.equals("First"))
     {
    	 scr+=1;
    	 System.out.println("Nedd"+" "+scr+" "+" runs to win");
     }else
     {
     System.out.println("Math Ended");
     }
	}

}
class InningsData
{
	private String team;
	private String innnings;
	private int score;
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getInnnings() {
		return innnings;
	}
	public void setInnnings(String innnings) {
		this.innnings = innnings;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void display()
	{
		System.out.println(getScore());
	}
}

