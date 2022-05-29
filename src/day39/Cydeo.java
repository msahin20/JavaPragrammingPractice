package day39;

public class Cydeo {
    public static void main(String[] args) {
        Tester tester = new Tester("Nevin", 40, 'F', 10002, "QA Tester", 105000);
        Developer developer = new Developer("Murat", 42, 'M', 10001, "Java Developer", 120000);
        Teacher teacher = new Teacher("David", 32, 'M', 10003, "Java Teacher", 80000);
        Student student = new Student ("Serhat", 10, 'M', 1000083,"Grade 4");






        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(student);

        teacher.work();
        teacher.drink();

        developer.setAge(43);
        System.out.println(developer.getAge());


        developer.fixingBugs();

        developer.work();
        tester.work();

        developer.eat();

        tester.eat();
        tester.drink();
        tester.createTicket();

        teacher.work();

        student.study();

    }
}
