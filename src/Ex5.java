import java.util.Calendar;

public class Ex5 {
    public static void main(String[] args) {
        byte age =28;
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearOfBirth = currYear - age;
        System.out.println("Year of birth = " + yearOfBirth);
    }
}
