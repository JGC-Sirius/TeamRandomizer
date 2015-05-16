import java.util.Random;

public class TeamRandomizer {
  private Random r = new Random();
  
  public TeamRandomizer() {}
  
  public String[] randomizeOrder(String[] pPlayers) {
    String[] players = pPlayers;
    String dummy;
    
    for (int i = 0; i < 1000000; i++) {
      int j = r.nextInt(players.length);
      int k = r.nextInt(players.length);
      
      dummy = players[j];
      players[j] = players[k];
      players[k] = dummy;
    }
    
    return players;
  }
}