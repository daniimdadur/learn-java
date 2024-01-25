class VicePresident extends Manager{

    VicePresident(String name,String company){
        super(name,company);
    }

    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name is President " + this.name + ", and I have a Company " + this.company);
    }
}
