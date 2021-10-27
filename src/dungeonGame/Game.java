package dungeonGame;

public interface Game {
  /**
   * To begin a new game;
   * @return winner.
   */
  int beginGame();

  /**
   * displays current state of game.
   */
  void displayState();
}
