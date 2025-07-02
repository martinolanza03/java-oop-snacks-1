import com.bank.AccountBank;
import com.register.StudentRegister;
import com.student.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Piero", "Casillo", 22);
        Student student2 = new Student("Mattia", "Casadei", 27);
        Student student3 = new Student("Daniele", "Rugani", 33);

        StudentRegister student = new StudentRegister();

        student.addStudents(student1);
        student.addStudents(student2);
        student.addStudents(student3);

        student.printStudents();

    }
}
