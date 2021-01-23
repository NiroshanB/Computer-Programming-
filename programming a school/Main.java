public class Main {
    public static void main(String[] args) {
        //declare school
        School school= new School("General Brock", "British Columbia", "Vancouver");

            //declare students and add to school
            Student John = new Student("John", "Tyson", 10);
            school.addStudent(John);
            Student Alex = new Student("Alex", "Henry", 8);
            school.addStudent(Alex);
            Student Jayden = new Student("Jayden", "Lin", 11);
            school.addStudent(Jayden);
            Student Max = new Student("Max", "Ben", 12);
            school.addStudent(Max);
            Student Jeremy = new Student("Jeremy", "Tan", 10);
            school.addStudent(Jeremy);
            Student Josh = new Student("Josh", "Toor", 9);
            school.addStudent(Josh);
            Student James = new Student("James", "Nile", 12);
            school.addStudent(James);
            Student Michael = new Student("Michael", "Brian", 8);
            school.addStudent(Michael);
            Student Connor = new Student("Connor", "Eng", 12);
            school.addStudent(Connor);
            Student Sam = new Student("Sam", "Macleod", 9);
            school.addStudent(Sam);


            //declare teachers and add to school
            Teacher Erin = new Teacher("Erin", "Rieder", "English");
            school.addTeacher(Erin);
            Teacher Terry = new Teacher("Terry", "Jane", "Math");
            school.addTeacher(Terry);
            Teacher Gabe = new Teacher("Gabe", "Donald", "Physics");
            school.addTeacher(Gabe);

            //print all teachers and students
        System.out.println("Student List:");
            school.showAllStudents();
        System.out.println("Teacher List:");
            school.showAllTeachers();

            //removes two students
            school.removeStudent(James);
            school.removeStudent(Max);

            //removes one teacher
            school.removeTeacher(Gabe);

            //print all teachers and students
        System.out.println("New Student List:");
            school.showAllStudents();
        System.out.println("New Teacher List:");
            school.showAllTeachers();



    }
}
