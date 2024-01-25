package bootcam.application;

import bootcam.data.CreateUserRequest;
import bootcam.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Dani");
        request.setPassword("Rahasia");
        request.setName("Imdadur");
        ValidationUtil.validationReflection(request);
    }
}
