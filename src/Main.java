import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println("Введите login: ");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();

        System.out.println("Введите password: ");
        String password = scanner.nextLine();

        System.out.println("Повторите password: ");
        String passwordConfirm = scanner.nextLine();

        Data.checkPassword(login, password, passwordConfirm);


    }
}