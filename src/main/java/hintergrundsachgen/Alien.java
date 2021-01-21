package hintergrundsachgen;

public class Alien {

    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    private Gender gender = Gender.OTHER;

    public void printGender() {
        System.out.println(gender);
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void printGender(Gender gender) {
        switch (gender) {
            case MALE:
                System.out.println("My Gender is male");
                break;
            case FEMALE:
                System.out.println("My Gender is femalde");
                break;
            case OTHER:
                System.out.println("My Gender is other");
                break;
        }
    }
}