public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Naufal");
        manager.sayHello("Adit");

        var vp = new VicePresident("Giant",null);
        vp.sayHello("Archer");
    }
}
