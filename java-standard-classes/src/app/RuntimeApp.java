package app;

public class RuntimeApp {
    //Class runtime digunakan untuk melihat informasi environment tempat aplikasi java berjalan.
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors()); //untuk mengetahui jumlah processor.
        System.out.println(runtime.freeMemory()); //memory yg bebas.
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());
    }
}
