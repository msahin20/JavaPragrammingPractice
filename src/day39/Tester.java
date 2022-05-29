package day39;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID,jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is doing Testing");
    }

    public void createTicket () {
        System.out.println(getName() + " is creating Ticket");
    }

}
