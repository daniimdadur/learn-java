package bootcamp.generic.application;

public class ConstraintApp {
    //Kadang kita ingin membatasi data yg boleh digunakan digeneric paremeter type.
    //Kita bisa menambahkan constraint di generic paremeter type dgn menyebutkan type yg diperbolehkan.
    //Secara otomatis, type data yg bisa digunakan adalah type data yg sudah kita sebutkan, atau class-class turunannya.
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(1000);
        NumberData<Long> longNumberData = new NumberData<>(10000L);

//        NumberData<String> stringNumberData = new NumberData<String>("Dani"); ERROR

    }
    public static class NumberData<T extends Number>{
        private T data;

        public NumberData(T data) {
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
