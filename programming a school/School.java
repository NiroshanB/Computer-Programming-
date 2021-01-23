import java.util.ArrayList;
/*
It contains the information of teachers, students, and courses
along with the school name, province, and city it is in.
You are able to add and remove teachers and students
you are able to print all students and teachers
 */
public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();//the teachers at the school
    ArrayList<Student> students = new ArrayList<>();//the students that attend the school
    ArrayList<String> courses = new ArrayList<>();//the courses that are offered at the school
    String schoolName;// the name of the school
    String province;//the province of the school
    String city;//the city of the school

    //school constructor, it constructs the school
    School(String schoolName, String province, String city){
        this.schoolName = schoolName;
        this.province = province;
        this.city = city;
    }
    //method adds teacher
    void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    //method adds student
    void addStudent(Student student){
        students.add(student);
    }
    //method removes teacher
    void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }
    //method removes student
    void removeStudent(Student student){
        students.remove(student);
    }
    //method shows list of teachers
    void showAllTeachers(){
        for (Teacher teacher: teachers){
            System.out.println(teacher);
        }
    }
    //method shows list of students
    void showAllStudents(){
        for (Student student: students){
            System.out.println(student);
        }
    }

    //getters and setters
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
