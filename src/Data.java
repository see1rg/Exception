import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Data {
    public static Boolean checkPassword(String login, String password, String passwordConfirm) throws WrongPasswordException, WrongLoginException {
       if (!check(login) ){
           throw new WrongLoginException("Некорректный login!");
       }
        if ( !check(password) || !check(passwordConfirm)) {throw new WrongPasswordException("Некорректный пароль.");
        }
        if (!(password.equals(passwordConfirm))) {
            throw new WrongPasswordException("Пароли должны быть одинаковыми.");
        }
        return true;
    }

    public static Boolean check(String string) {
        final String regex = "\\b\\w+";
        final String check = string;

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(check);

        if (matcher.matches() && check.length() < 19) {
            return true;
        }
        return false;
    }
}


