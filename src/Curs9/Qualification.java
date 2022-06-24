package Curs9;

public class Qualification extends Teacher{

	public Qualification (String course, int Experience, String Schedule) {
		this.Course = course;
		this.ExperienceYears = Experience;
		this.Schedule = Schedule;
	}
	
	
	public void Verify() {
		if(ExperienceYears>3 && Course.equals("Java") && Schedule.equals("Afternoon")) {
			System.out.println("You qualify to teach at this school");
		} else {
			System.out.println("You do not qualify!");
		}
	}
}
