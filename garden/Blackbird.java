package garden;
public class Blackbird {
  private String[] diet = {"earthworm", "blackberry", "seeds"};
  private String[] plumage = {"black", "brown"};
  public Blackbird() {
    System.out.println("Blackbird created");
  }

  public void perch() {
    System.out.println("The blackbird is perching");
  }

  public void fly() {
    System.out.println("The blackbird is flying");
  }

  public void forage() {
    System.out.println("The blackbird is foraging");
  }

  public void getDiet() { // print the diet to the screen
    System.out.println("The blackbird has the following diet:");
    for (String i : diet) {
  // code block to be executed
      System.out.println(i);
}
  }

  public String getPlumage() {
    return this.plumage.toString();
  }
}