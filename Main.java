import garden.Garden;
import garden.Blackbird;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
  private final String status;
  private final String response;
  // Create a class constructor for the Main class
  public Main() {
    status = "running"; // Set the initial value for the class attribute status
    response = "ready"; // Set the initial value for the class attribute response
  }
  
  public static void main(String[] args) {
    Main main1 = new Main();
    System.out.println(main1.getStatus());
    System.out.println(main1.getResponse());
    Garden garden1 = new Garden();
    garden1.getTrees();
    Blackbird b1 = new Blackbird();
    b1.getDiet();
    Scanner s1 = new Scanner(System.in); // Create a scanner object
    System.out.println("Choose a tree from the garden.");
    String treeReply = s1.nextLine(); // Read user input
    Pattern pattern = Pattern.compile("pine|almond", Pattern.CASE_INSENSITIVE);
    Pattern vowels = Pattern.compile("^[aeiou]+", Pattern.CASE_INSENSITIVE);
    Matcher startCheck = vowels.matcher(treeReply);
    Matcher ansCheck = pattern.matcher(treeReply);
    boolean matchFound = ansCheck.find();
    if(matchFound) {
      System.out.println("You chose: " + treeReply); // Output user input
    } else {
      System.out.println(startCheck.find() ? "An " + treeReply + " was not found in the garden." : "A " + treeReply + " was not found in the garden.");
  }
    }

  public String getStatus() {
    return status;
  }
  public String getResponse() {
    return response;
  }
}