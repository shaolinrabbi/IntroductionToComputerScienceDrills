package unit_08_objects_and_classes;

public class CreatingFootballPlayerWithAccessRights {

	public static void main(String[] args) {
		FootballPlayerWithAcceessRights footballPlayer = new FootballPlayerWithAcceessRights();
		
		// If you remove the comment the code won't compile because "name" is private
		//footballPlayer.name = "Jared Goff";
	}
}