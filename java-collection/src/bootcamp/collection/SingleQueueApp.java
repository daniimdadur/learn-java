package bootcamp.collection;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.size()); //mengecek ada berapa element

        System.out.println(queue.offer("Dani"));
        System.out.println(queue.offer("Imdadur")); //reject, karena disetting hanya bisa menerima satu data di single queuenya.
        System.out.println(queue.offer("Rohman")); //reject, karena disetting hanya bisa menerima satu data.

        System.out.println(queue.size()); //ada satu karena sudah ditambahkan

        System.out.println(queue.peek()); //mengambil tapi tidak menghapus
        System.out.println(queue.poll()); //mengambil sekaligus menghapus.
        System.out.println(queue.poll()); //mengambil sekaligus menghapus.
        System.out.println(queue.poll()); //mengambil sekaligus menghapus.

        System.out.println(queue.size()); //tidak ada, karena sudah dihapus
    }
}
