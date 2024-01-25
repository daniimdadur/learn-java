package TernaryOperator;

public class TernaryOperator {
    public static void main(String[] args) {
        //tanpaTernaryOperator
        byte nilai = 75;
        String ucapan;

        if(nilai >75){
            ucapan = "Selamat Anda Lulus";
        }else{
            ucapan = "Maaf Anda Tidak Lulus";
        }
        System.out.println(ucapan);

        //denganTernaryOperator
        byte nilai1 = 75;
        String ucapan1 = nilai1 >75 ? "Selamat Anda Lulus" : "Maaf Anda Tidak Lulus";

        System.out.println(ucapan1);
    }
}
