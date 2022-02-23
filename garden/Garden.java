package garden;
public class Garden {
  private final String[] trees = {"pine", "almond"};
  private final String[] shrubs = {"budleia", "elder"};;
  private final String[] flowers = {"rose", "daisy", "livingstone daisy", "lavender"};
  
  public Garden() {
    System.out.println("Garden created");
  }

  public void getTrees() { // print the trees to the screen
    System.out.println("The garden contains the following trees:");
    for (String i : trees) {
  // code block to be executed
      System.out.println(i);
}
  }  
}