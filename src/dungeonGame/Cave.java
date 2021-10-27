package dungeonGame;

import java.util.ArrayList;
import java.util.List;

public class Cave {
  private boolean north;
  private boolean south;
  private boolean east;
  private boolean west;
  private List<Treasure> treasure;

  /**
   * default constructor of a cave.
   */
  public Cave() {
    north = south = east = west = false;
    treasure= new ArrayList<>();
  }

  public Cave(boolean north, boolean south, boolean east, boolean west) {
    this.north = north;
    this.south = south;
    this.east = east;
    this.west = west;
    treasure = new ArrayList<>();
  }

  public String state() {
    String st = treasure.toString()
        + "\nNorth: " + north
        + "\nSouth: " + south
        + "\nEast: " + east
        + "\nWest: " + west;
    return st;
  }

  boolean isValidMove(Directions d) {
    switch(d) {
      case North:
        return north;
      case South:
        return south;
      case East:
        return east;
      case West:
        return west;
      default:
        return false;
    }
  }
}
