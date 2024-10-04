import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите email: ");
        String email = scanner.next();

            if (isValidEmail(email)) {
                System.out.println(email + " - valid");
            } else {
                System.out.println(email + " - invalid");
            }
        }


    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
