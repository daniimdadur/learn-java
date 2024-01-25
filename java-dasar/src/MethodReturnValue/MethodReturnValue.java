package MethodReturnValue;

public class MethodReturnValue {
    public static void main(String[] args) {
        int result1 = sum (100,200);
        System.out.println(result1);
        System.out.println(sum(200,300));
        System.out.println(hitung(300,"+",400));
        System.out.println(hitung(500,"-",600));
        System.out.println(haloo("Dani Imdadur ","Rohman"));
        System.out.println(tambah(5,2));
        System.out.println(tambah(6,9));
        String name = haloo("Ahmad Jamiil ","Khoeri");
        System.out.println(name);


    }

    static int sum(int value1,int value2){
        int total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2){
        switch ( operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
            }

        }

    static String haloo(String nama1,String nama2) {
        String jumlah = nama1 + nama2;
        return jumlah;
    }
    static int tambah(int satu,int dua){
        int jumlah1 = satu - dua;
        return jumlah1;
    }
    }






