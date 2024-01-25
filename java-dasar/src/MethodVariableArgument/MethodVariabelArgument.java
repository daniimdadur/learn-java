package MethodVariableArgument;

public class MethodVariabelArgument {
    public static void main(String[] args) {
        int[] values = {80,80,80,60,90};
        sayCongrats("Garnacho" ,  values);
        alwaysCongrats("Rashford", 90,90,70,80,80);
        
    }


    static void sayCongrats(String name, int[]values){
        int total = 0;
        for (int value : values){
            total += value;
        }
        int finalvalue = total / values.length;

        if (finalvalue >= 75 ){
            System.out.println("Selamat " + name + ", Anda Lulus");
        }else {System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

    static void alwaysCongrats(String nama, int...values1){
        int total1 = 0;
        for (int value : values1){
            total1 = total1 + value;
        }
        int finalvalue1 = total1 / values1.length;

        if (finalvalue1 >= 80){
            System.out.println("Selamat " + nama + ", Anda Lulus");
        }else{
            System.out.println("Maaf " + nama + ", Anda Tidak Lulus");
        }
    }
}
