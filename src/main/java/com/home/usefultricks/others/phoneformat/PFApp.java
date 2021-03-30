package com.home.usefultricks.others.phoneformat;

/**
 * Класс определяет формат для переданного номера телефона.
 * Если телефон передан в формате (+)###########, то формат
 * будет изменен на (+)# ### ### ## ##.
 * В противном случае - формат останется прежним.
 */
public class PFApp {
    public static void main(String[] args) {
        String phoneNumber = "+88003500123";
        String result = "формат телефона не корректен";

        if (phoneNumber.matches("(\\+)?[0-9]{11}")) {
            result = phoneNumber.replaceFirst("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d+)", "$1 $2 $3-$4-$5");
        }

        System.out.println(phoneNumber); // 88003500123
        System.out.println(result); // 8 800 350-01-23
    }
}
