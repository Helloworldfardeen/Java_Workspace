

import java.util.ArrayList;

public class PlayerMainTest {
	
	public static void main(String[] args) {
		PlayerManagement pm = new PlayerManagement();
		ArrayList<Player> pl;
		pl=pm.createPlayerObject();
//		pm.displayPlayerObject(pl);
//		pm.updateArraylist(pl);
//		pm.displayPlayerObject(pl);
		pm.deletePlyObj(pl);
		pm.displayPlayerObject(pl);
	}

}
