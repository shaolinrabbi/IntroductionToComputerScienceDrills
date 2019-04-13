package unit_8;

public class FootballPlayer {
	int yearOfBirth;
	String name;
	String team;
	int superbowlWins;
	
	void throwBall(){
		System.out.println(name + " is throwing the ball");
	}
	
	void jump(){
		System.out.println(name + " is jumping");
	}
	
	void run(){
		System.out.println(name + " is running");
	}
	
	void printInfo(){
		System.out.println("Name: " + name);
		System.out.println("Team: " + team);
		System.out.println("Year of Birth: " + yearOfBirth);
		System.out.println("Superbowl Wins: " + superbowlWins);
	}
}