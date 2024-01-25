package ForEach;

public class ForEach {
    public static void main(String[] args) {

        //tanpaforeach
        String[] myName ={
                "Dani","Imdadur","Rohman",
                "Programmer","Zaman","Now"
        };
        for(int a = 0;a < myName.length;a++){
            System.out.println(myName[a]);
        }
        System.out.println("FOREACH");

        //denganforeach
        for(String myNames : myName){
            System.out.println(myNames);
        }
    }
}
