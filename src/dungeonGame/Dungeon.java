package dungeonGame;

public interface Dungeon {
  Dungeon generateDungeon();
  int [] generatePath(); //or String?
  String displayDungeon();
}
