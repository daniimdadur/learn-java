package TipeDataNumber;

public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        //Widening casting (otomatis)
        byte iniByte = 25;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        //Narrowing casting (manual)
        float iniFloat1 = (float) iniDouble;
        long iniLong1 = (long) iniFloat1;
        int iniInt1 = (int) iniLong1;
        short iniShort1 =(short) iniInt1;
        byte iniByte1 = (byte) iniShort1;

    }
}
