package OperasiBoolean;

public class OperasiBooleanElseIf {
    public static void main(String[] args) {

        //ifStatement
        int nilai = 70;
        int value = 80;

        if(nilai >=75 || value >=80){
            System.out.println("Anda Hebat");
        }

        //elseStatement
        int nilai1 = 70;
        int value1 = 75;

        if(nilai1 >=75 && value1 >= 75){
            System.out.println("Anda Hebat");
        }else{
            System.out.println("Anda Bodoh");
        }

        //elseIfStatement
        int nilai2 = 80;
        int value2 = 70;

        if(nilai2 >=80 && value2 >=80){
            System.out.println("Anda Cerdas");
        }else if(nilai2 >=75 && value2 >=75){
            System.out.println("Anda Pintar");
        }else if(nilai2 >=70 && value2 >=70){
            System.out.println("Anda Lumayan");
        }else{
            System.out.println("Anda Bodoh");
        }

        int nilai3 = 90;
        int value3 = 79;
        String ucapan;

        //tidakMenggunakanTernaryOperator
        if(nilai3 >=90 && value3 >=90){
            ucapan = "Selamat Anda Lulus";
        }else if (nilai3 >= 80 && value3 >= 80){
            ucapan = "Maaf Anda Tidak Lulus";
        }else{
            ucapan = "Maaf Anda Kami DO";
        }
        System.out.println("The Monk " + ucapan);

        //menggunakanTernaryOperator
        int nilai4 = 90;
        int value4 = 70;

        String ucapan1 = nilai4 >=80 || value4 >=70 ? "Selamat Anda Lulus":"Maaf Anda Tidak Lulus";

        System.out.println("Djancook " + ucapan1);
    }
}
