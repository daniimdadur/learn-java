package SwitchStatement;

public class SwitchStatement {
    public static void main(String[] args) {

        //switchStatement
        char nilai = 'Z';

        switch (nilai) {
            case 'A':
                System.out.println("Nilai Anda Sangat Bagus");
                break;
            case 'B':
            case 'C':
                System.out.println("Nilai Anda Cukup Bagus");
                break;
            case 'D':
                System.out.println("Nilai Anda Cukup");
                break;
            default:
                System.out.println("Nilai Anda Buruk");
        }

        //switchLambda
        byte nilai1 = 0;

        switch (nilai1) {
            case 1 -> System.out.println("Anda Sangat Hebat");
            case 2, 3 -> System.out.println("Anda Cukup Hebat");
            case 4 -> System.out.println("Anda Cukup");
            default -> System.out.println("Anda Bodoh");
        }

        //switchTanpaYield
        char nilai2 = 'F';
        String ucapan;

        switch (nilai2) {
            case 'A' -> ucapan = "Nilai Anda Sangat Bagus";
            case 'B', 'C' -> ucapan = "Nilai Anda Bagus";
            case 'E' -> ucapan = "Nilai Anda Cukup";
            default -> ucapan = "Nilai Anda Buruk";
        }
        System.out.println(ucapan);


        //switchDenganYield
        char nilai3 = 'R';
        String ucapan1 = switch (nilai3) {
            case 'A':
                yield "Nilai Anda Sangat Bagus";
            case 'B', 'C':
                yield "Nilai Anda Bagus";
            case 'D':
                yield "Nilai Anda Cukup";
            default:
                yield "Nilai Anda Buruk";
        };
        System.out.println(ucapan1);
    }

}
