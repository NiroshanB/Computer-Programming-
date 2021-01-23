/*
it contains information of the teachers like their first name,
last name, and subject
You are able to print the teachers first name, last name, and subject
 */
public class Teacher {
    private String firstName;//teachers first name
    private String lastName;//teachers last name
    private String subject;//subject the teacher teaches

    //teacher constructor, it constructs the teacher
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }
    //prints the first name, last name, and subject of the teacher
    public String toString(){
        return ("Name:" + firstName +" "+ lastName + " Subject:" + subject);
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

    public String getSubject() {

        return subject;
    }

    public void setSubject(String subject) {

        this.subject = subject;
    }
}
