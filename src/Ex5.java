import java.util.Calendar;

public class Ex5 {
    public static void main(String[] args) {
        byte age =28;
        short currYear = (short) (Calendar.getInstance().get(Calendar.YEAR));
        short yearOfBirth = (short) (currYear - age);
        System.out.println("Year of birth = " + yearOfBirth);
    }
}
