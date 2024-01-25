package bootcam.application;

import bootcam.annotation.Fancy;
import bootcam.data.LoginRequest;
import bootcam.error.ValidationException;
import bootcam.util.ValidationUtil;

public class ValidationApp {
    @Fancy(name = "Validation", tags = {"Application", "Java"})
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("" ,"Rahasia");
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        }finally {
            System.out.println("Selalu di eksekusi");
        }

        LoginRequest loginRequest1 = new LoginRequest("Dani Imdadur","Kepo Bangsat");
        ValidationUtil.validateRuntime(loginRequest1);
        System.out.println("Sukses");
    }
}
