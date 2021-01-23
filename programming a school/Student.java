/*
it contains information of the students such as their first name,
last name, grade, and student number
the construction creates unique student number
You are able to print the students first name, last name, and grade
 */
public class Student {
    private String firstName;//students first name
    private String lastName;//students last name
    private int grade;//grade student is in
    static int idNum = 1;//identification number
    private int studentNum;// student's unique number

    //student constructor, it constructs the student
    Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNum = idNum;
        idNum++;

    }
    //prints the first name, last name, and grade of the student
    public String toString(){
        return ("Name:" + firstName +" "+ lastName + " Grade:" + grade);
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

    public int getGrade() {

        return grade;
    }

    public void setGrade(int grade) {

        this.grade = grade;
    }

    public int getStudentNum() {

        return studentNum;
    }

    public void setStudentNum(int studentNum) {

        this.studentNum = studentNum;
    }
}
