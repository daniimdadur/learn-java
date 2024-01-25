class Person {
    String name;
    String addreas;
    String country;

    Person(String name,String addreas,String country){
        this.name = name;
        this.addreas = addreas;
        this.country = country;
    }
    Person(String name,String addreas){
        this(name,addreas,null);
    }
    Person(String name){
        this(name,null);
    }
    Person(){
        this(null);
    }
    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
    void sayHello(String name,String addreas){
        System.out.println("Hello " + name + ", My Name is " + this.name + " and I live in " + addreas + ", " + this.country);
    }
}
