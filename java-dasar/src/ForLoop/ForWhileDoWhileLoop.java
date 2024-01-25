package ForLoop;

public class ForWhileDoWhileLoop {
    public static void main(String[] args) {

        //perulanganDenganKondisi
        int iniInt = 1;
        for(;iniInt <= 10;){
            System.out.println(iniInt);
        iniInt++;
        }

        //perulanganDenganInitStatement
        for(int iniInt1 = -1;iniInt1 >=-10;){
            System.out.println(iniInt1 );
        iniInt1--;
        }

        //perulanganDenganPostStatement
        for(int iniInt2 =1;iniInt2 <=10;iniInt2++){
            System.out.print(iniInt2 + "\t");
        }
        System.out.println();//untukmengisikekosongan

        //whileLoop
        int iniInt3 =1;

        while(iniInt3 <=20){
            System.out.println(iniInt3);
            iniInt3+=2;
        }
        //doWhileLoop
        int iniInt4 = 1;

        do {
            System.out.println(iniInt4);
            iniInt4+=2;
        }while (iniInt4 <=20);


        
    }
}
