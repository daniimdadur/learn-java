public class Polymorphism {
    public static void main(String[] args) {

        Employee employee = new Employee("Adit");
        employee.sayHello("Naufal");

        employee = new Manager("Haikal");
        employee.sayHello("Cecep");

        employee = new VicePresident("Said","GULAKU");
        employee.sayHello("Sabil");

        sayHello(new Employee("Ardi"));
        sayHello(new Manager("Dudu"));
        sayHello(new VicePresident("Danis",null));
    }
    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
