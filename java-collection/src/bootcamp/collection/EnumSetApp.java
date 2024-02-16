package bootcamp.collection;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {

    public static enum Gender{
        MALE, FEMALE, NOT_MENTION
    }

    public static void main(String[] args) {
        Set<Gender> genders = EnumSet.allOf(Gender.class); //mengakses semua enum
        Set<Gender> genders1 = EnumSet.of(Gender.FEMALE, Gender.MALE, Gender.NOT_MENTION); //mengakses satu enum atau lebih

        for (var gender : genders) {
            System.out.println(gender);
        }
        for (var gender : genders1) {
            System.out.println(gender);
        }
    }
}
