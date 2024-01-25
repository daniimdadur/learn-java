package BreakContinue;

public class BreakAndContinue {
    public static void main(String[] args) {
        //break
        int iniInt = 1;

        while(true){
            System.out.println(iniInt);
            iniInt++;

        if (iniInt >20){
            break;
        }
        }

        //continue
        for(int iniInt1 =1;iniInt1 <=50;iniInt1++){
            if(iniInt1 % 2 == 0){
                continue;
            }
            System.out.println(iniInt1);
        }


    }
}
