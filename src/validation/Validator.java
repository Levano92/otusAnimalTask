package validation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validator
{
    public static boolean isContainsDigits(String word) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(word);
        return matcher.find();
    }

    public static boolean isNumber(String numb) {
        Pattern pattern = Pattern.compile("[а-яА-Яa-zA-Z ]");
        Matcher matcher = pattern.matcher(numb);
        return matcher.find();
    }

    public static boolean isBordersNumberCorrect(int low, int high, float number){
        boolean bordercheck = false;
        if ((number < low || number > high)){
            bordercheck = true;
        }

        return bordercheck;
    }
    public static String numberValidation (String numbStr, int high) {
        numbStr = numbStr.trim();
        String massage = "Значение корректно";
        boolean check = Validator.isNumber(numbStr);
        if (check){
            massage = "В введенном значении не может быть букв, попробуйте еще раз";
            return  massage;
        }
        int numbInt = Integer.parseInt(numbStr);
        boolean bordercheck = Validator.isBordersNumberCorrect(0, 20, numbInt);
        if (bordercheck){
            massage = "Введенное число находится вне допустимых границ 0 и " + high;
            return  massage;
        }
        return massage;

    }
}


