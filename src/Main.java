public class Main {
    public static void main(String[] args) {
        Student piero = new Student("Piero", "Casadei", 21);

        System.out.println(piero.firstName);
        System.out.println(piero.secondName);
        System.out.println(piero.age);
        System.out.println(piero.totalStudent());
    }
}
