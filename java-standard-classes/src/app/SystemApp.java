package app;

public class SystemApp {
    public static void main(String[] args) {
        //Class System adalah class yg berisikan banyak utility static method di java,
        //contohnya sebelumnya kita sudah sering menggunakan method println milik field out di class System.

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("USER"));
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getenv("APP")); //settingan di system app, dekat tombol run diatas.
        System.out.println(System.getenv("DIR")); //settingan di system app, dekat tombol run diatas.

        System.gc();

        System.exit(13);
        System.out.println("Hi"); //tidak bisa diakses, karena terhalang oleh sistem exit.
    }
}
