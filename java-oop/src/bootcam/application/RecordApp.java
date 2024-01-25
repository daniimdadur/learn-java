package bootcam.application;

import bootcam.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Dani Imdadur","Rahasia");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Dani Imdadur"));
        System.out.println(new LoginRequest("Dani Imdadur","Rahasia"));
    }
}
