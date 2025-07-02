public class Student {
    public String firstName;
    public String secondName;
    public int age;

    public Student(String firstname, String secondName, int age) {
        this.firstName = firstname;
        this.secondName = secondName;
        this.age = age;
    }

    public String totalStudent() {
        return firstName + ' ' + secondName + ',' + age + " anni";
    }
}
