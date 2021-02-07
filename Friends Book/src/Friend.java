/*
it contains information of the friends such as their first name,
last name, age, and phone number
You are able to print the friends first name, last name, age, and phone number
 */
public class Friend {
    private String firstName;// friends first name
    private String lastName;//friends last name
    private int age;// friends age
    private String phoneNumber;//friends phone number

    //friend constructor, it constructs the friend
    Friend(String firstName, String lastName, int age, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber= phoneNumber;
    }

    //prints the first name, last name, age, and phone number of the friend
    public String toString(){
        return ("First Name: " + firstName + "\t\t" + "Last Name: " + lastName + "\t\t" + "Age: " + age + "\t\t" + "Phone Number: " + phoneNumber);
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
