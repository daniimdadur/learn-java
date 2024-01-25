public class PersonAPP {
    public static void main(String[] args) {
        var person1 = new Person("Haikal","Jambi","Indonesia");
        System.out.println(person1.name);
        System.out.println(person1.addreas);
        System.out.println(person1.country);
        person1.sayHello("Cecep");

        Person person2 = new Person("Naufal","Sukajadi","Spain");
        System.out.println(person2.name);
        System.out.println(person2.addreas);
        System.out.println(person2.country);
        person2.sayHello("Adit");

        Person person3 = new Person("Dudu",null,"Australia");
        System.out.println(person3.name);
        System.out.println(person3.country);
        person3.sayHello("Ardi");

        Person person4 = new Person("Irsyad",null,"Singapore");
        System.out.println(person4.name);
        System.out.println(person4.country);
        person4.sayHello("Eri","Riau Island");
    }
}
