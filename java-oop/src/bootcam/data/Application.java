package bootcam.data;

public class Application {

    public static final int processors;

    static{
        System.out.println("ACCESS CLASS APPLICATION");
        processors = Runtime.getRuntime().availableProcessors();
    }
}
