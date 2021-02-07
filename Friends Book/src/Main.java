import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declare friends book
        FriendsBook friendsBook = new FriendsBook("Niroshan's Friend Book");
            System.out.println("Which Friend's Information Do You Want To See? Choose 'Jeremy', 'Connor', 'Michael', 'Jim', 'Miller', or 'Philip' to see their properties.");

            //declare friends and add them to FriendsBook
            Friend Jeremy = new Friend("Jeremy", "Tim", 17, "(778)-545-5743");
            friendsBook.addFriend(Jeremy);
            Friend Connor = new Friend("Connor", "Lin", 20, "(604)-930-0493");
            friendsBook.addFriend(Connor);
            Friend Michael = new Friend("Michael", "Parmar", 18, "(778)-503-4827");
            friendsBook.addFriend(Michael);
            Friend Jim = new Friend("Jim", "Linnin", 30, "(778)-550-3954");
            friendsBook.addFriend(Jim);
            Friend Miller = new Friend("Miller", "Ken", 23, "(778)-035-4048");
            friendsBook.addFriend(Miller);
            Friend Philip = new Friend("Philip", "Kimel", 52, "(778)-305-2042");
            friendsBook.addFriend(Philip);

            //prints the properties of the friend that the user selects
            String UserChoice;
            Scanner scan = new Scanner(System.in);
            UserChoice = scan.nextLine();

            //checks if user choice is correct then prints the friend
            if (UserChoice.equals("Jeremy") || UserChoice.equals("Connor") || UserChoice.equals("Michael") || UserChoice.equals("Jim") || UserChoice.equals("Miller") || UserChoice.equals("Philip")) {

                if (UserChoice.equals("Jeremy")) {
                    System.out.println("First Name: " + Jeremy.getFirstName() + "\t\t" + "Last Name: " + Jeremy.getLastName() + "\t\t" + "Age: " + Jeremy.getAge() + "\t\t" + "Phone Number: " + Jeremy.getPhoneNumber());

                }
                if (UserChoice.equals("Connor")) {
                    System.out.println("First Name: " + Connor.getFirstName() + "\t\t" + "Last Name: " + Connor.getLastName() + "\t\t" + "Age: " + Connor.getAge() + "\t\t" + "Phone Number: " + Connor.getPhoneNumber());

                }
                if (UserChoice.equals("Michael")) {
                    System.out.println("First Name: " + Michael.getFirstName() + "\t\t" + "Last Name: " + Michael.getLastName() + "\t\t" + "Age: " + Michael.getAge() + "\t\t" + "Phone Number: " + Michael.getPhoneNumber());

                }
                if (UserChoice.equals("Jim")) {
                    System.out.println("First Name: " + Jim.getFirstName() + "\t\t" + "Last Name: " + Jim.getLastName() + "\t\t" + "Age: " + Jim.getAge() + "\t\t" + "Phone Number: " + Jim.getPhoneNumber());

                }
                if (UserChoice.equals("Miller")) {
                    System.out.println("First Name: " + Miller.getFirstName() + "\t\t" + "Last Name: " + Miller.getLastName() + "\t\t" + "Age: " + Miller.getAge() + "\t\t" + "Phone Number: " + Miller.getPhoneNumber());

                }
                if (UserChoice.equals("Philip")) {
                    System.out.println("First Name: " + Philip.getFirstName() + "\t\t" + "Last Name: " + Philip.getLastName() + "\t\t" + "Age: " + Philip.getAge() + "\t\t" + "Phone Number: " + Philip.getPhoneNumber());
                }
                
            } else {
                System.out.println("Invalid selection, please pick again.");
            }

            //removes one friend (Connor) from the friends book
            friendsBook.removeFriend(Connor);

            System.out.println();
            System.out.println("All The Friends:");
            //prints all friends in the friends book
            friendsBook.showAllFriends();
        }
}
