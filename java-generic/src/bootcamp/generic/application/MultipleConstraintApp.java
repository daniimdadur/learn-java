package bootcamp.generic.application;

public class MultipleConstraintApp {
    //Kita bisa menambahkan beberapa bounded type parameter dgn karakter & setelah bounded type pertama.
    //Jika ingin menambahkan lagi, cukup gunakan karakter '&' diikuti bounded type nya lagi
    public static void main(String[] args) {
//        Data<Manager> managerData = new Data<Manager>(); //ERROR karena class Manager tidak implement interface CanSayHello.
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
    }
    public static interface CanSayHello {
        void sayHello(String name);
    }
    public static abstract class Employee{

    }
    public static class Manager extends Employee{

    }
    public static class VicePresident extends Employee implements CanSayHello{
        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }
    public static class Data<T extends Employee & CanSayHello>{
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
