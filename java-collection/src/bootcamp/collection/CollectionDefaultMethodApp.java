package bootcamp.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionDefaultMethodApp {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        //replaceAll = mengubah seluruh data di collection.
        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 10; //value arraynya dikali sepuluh.
            }
        });
        System.out.println(numbers);

        //forEach = melakukan iterasi seluruh data collection.
        numbers.forEach(new Consumer<Integer>() { //kinerjanya sama seperti for each.
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        //removeIf = menghapus data di collection menggunakan predicate.
        numbers.removeIf(new Predicate<Integer>() { //menghapus value
            @Override
            public boolean test(Integer integer) {
                return integer > 500; //jika valuenya lebih dari 500, maka akan dihapus.
            }
        });
        System.out.println(numbers);
    }
}
