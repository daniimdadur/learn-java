package TipeDataArray;

public class TipeDataArray {
    public static void main(String[] args) {

        String[] arrayString = new String[3];
        arrayString[0] = "Dani";
        arrayString[1] = "Imdadur";
        arrayString[2] = "Rohman";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        //arrayIntializer
        int[] arrayInt ={
                10,20,30,40,50
        };
        arrayInt[1] = 0;
        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[4]);

        //arrayDidalamArray
        String[][] name ={
                {"Dani","Imdadur","Rohman"},
                {"Naufal","Ali","Firdaus"},
                {"Ahmad","Jamiil","Khoeri"}

        };
        name [2][0] = "Bumi";
        System.out.println(name[0][0]);
        System.out.println(name[2][0]);
        System.out.println(name.length);
        System.out.println(name[2][2] = "Djancook");
        System.out.println(name[2][0]);



    }
}
