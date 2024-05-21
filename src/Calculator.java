import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        String[] arifmetic = {"+","-","/","*"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine();


        //работа с исключениями

        int lll = input.length();
        int count = 0;
         for (int i = 0; i < lll; i++) {
            if (input.charAt(i) == '+'||input.charAt(i) == '-'||input.charAt(i) == '*'||input.charAt(i) == '/') {
                count++;
            }
        }
        if (count >1) {
            System.out.println("Output:");
            throw new Exception ("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор(+,-,/,*");
        }else;

        if (count ==0) {
            System.out.println("Output:");
            throw new Exception("//т.к. строка не является математической операцией");
        }


        //определяем знак и выполняем подходящий кейс - выводим результат

        int signs1 = -1;
        for (int i = 0; i < arifmetic.length; i++) {
            if(input.contains(arifmetic[i])) {
                signs1 = i;                         // запоминаю арифм знак
                if(signs1 == 0) {
                    String[] words = input.split("\\+");



                    String[] roman1 = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
                            "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII",
                            "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII",
                            "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI",
                            "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII",
                            "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX",
                            "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};



                    if(roman1[10].equals(words[0])||roman1[1].equals(words[0])||roman1[2].equals(words[0])
                            ||roman1[3].equals(words[0])||roman1[4].equals(words[0])||roman1[5].equals(words[0])
                    ||roman1[6].equals(words[0])||roman1[7].equals(words[0])||roman1[8].equals(words[0])
                    ||roman1[9].equals(words[0])){
                        if(!(roman1[10].equals(words[1])||roman1[1].equals(words[1])
                                ||roman1[2].equals(words[1])||roman1[3].equals(words[1])||roman1[4].equals(words[1])
                                ||roman1[5].equals(words[1])||roman1[6].equals(words[1])||roman1[7].equals(words[1])
                                ||roman1[8].equals(words[1])||roman1[9].equals(words[1]))) {
                            System.out.println("Output:");
                            throw new Exception("//т.к. числа должны быть в одинаковом формате");

                        }    // вычисления с римскими переменными
                        int nam1 = -1;
                            for (int t = 0; t < roman1.length; t++) {
                                if (words[0].equals(roman1[t])) {
                                    nam1 = t;
                                }
                            }
                            int nam2=-1;
                            for(int t=0; t<roman1.length;t++){
                                if(words[1].equals(roman1[t])){
                                    nam2 = t;
                                }
                            }
                            int c;
                            c=nam1+nam2;
                            String f = roman1[c];
                            System.out.println("Output:");
                            System.out.println(f);
                            break;
                    }
                    if(roman1[0].equals(words[1])||roman1[1].equals(words[1])
                            ||roman1[2].equals(words[1])||roman1[3].equals(words[1])||roman1[4].equals(words[1])
                            ||roman1[5].equals(words[1])||roman1[6].equals(words[1])||roman1[7].equals(words[1])
                            ||roman1[8].equals(words[1])||roman1[9].equals(words[1])) {
                        System.out.println("Output:");
                        throw new Exception("//т.к. числа должны быть в одинаковом формате");
                    }

                    String[] arabic1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

                    if (!(arabic1[0].equals(words[0])||arabic1[1].equals(words[0])||arabic1[2].equals(words[0])
                    ||arabic1[3].equals(words[0])||arabic1[4].equals(words[0])||arabic1[5].equals(words[0])
                            ||arabic1[6].equals(words[0])||arabic1[7].equals(words[0])||arabic1[8].equals(words[0])
                    ||arabic1[9].equals(words[0])||arabic1[0].equals(words[1])||arabic1[1].equals(words[1])||arabic1[2].equals(words[1])
                            ||arabic1[3].equals(words[1])||arabic1[4].equals(words[1])||arabic1[5].equals(words[1])
                            ||arabic1[6].equals(words[1])||arabic1[7].equals(words[1])||arabic1[8].equals(words[1])
                            ||arabic1[9].equals(words[1]))) {
                        System.out.println("Output:");
                        throw new Exception("//т.к.оперенды не удовлятворяют условию");
                    }
                    int a = Integer.parseInt(words[0]);
                    int b = Integer.parseInt(words[1]);


                    //включаю дополнительный контроль за диапазоном переменных от 1 до 10ти включительно

                    if(a>10||b>10){
                        System.out.println("Output:");
                        throw new Exception ("//т.к. формат математической операции не удовлетворяет заданию: принятия на вход числа от 1 до 10 включительно");
                    }
                    if(a<1||b<1) {
                        System.out.println("Output:");
                        throw new Exception ("//т.к. формат математической операции не удовлетворяет заданию: принятия на вход числа от 1 до 10 включительно");
                    }
                    int c = a+b;
                    System.out.println("Output:");
                    System.out.println(c);
                    break;

                }
                if(signs1 == 1) {
                    String[] words = input.split("-");

                    String[] roman1 = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
                            "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII",
                            "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII",
                            "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI",
                            "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII",
                            "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX",
                            "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};



                    if(roman1[10].equals(words[0])||roman1[1].equals(words[0])||roman1[2].equals(words[0])
                            ||roman1[3].equals(words[0])||roman1[4].equals(words[0])||roman1[5].equals(words[0])
                            ||roman1[6].equals(words[0])||roman1[7].equals(words[0])||roman1[8].equals(words[0])
                            ||roman1[9].equals(words[0])){
                        if(!(roman1[10].equals(words[1])||roman1[1].equals(words[1])
                                ||roman1[2].equals(words[1])||roman1[3].equals(words[1])||roman1[4].equals(words[1])
                                ||roman1[5].equals(words[1])||roman1[6].equals(words[1])||roman1[7].equals(words[1])
                                ||roman1[8].equals(words[1])||roman1[9].equals(words[1]))) {
                            System.out.println("Output:");
                            throw new Exception("//т.к. числа должны быть в одинаковом формате");
                        }

                            // вычисления с римскими переменными


                        int nam1 = -1;
                        for (int t = 0; t < roman1.length; t++) {
                            if (words[0].equals(roman1[t])) {
                                nam1 = t;
                            }
                        }
                        int nam2=-1;
                            for(int t=0; t<roman1.length;t++){
                                if(words[1].equals(roman1[t])){
                                    nam2 = t;
                                }
                            }
                            int c;
                            c=nam1-nam2;
                            if (c<0){
                                System.out.println("Output:");
                                throw new Exception("//т.к. в риской системе нет отрицательных чисел");
                            }
                            String f = roman1[c];
                            System.out.println("Output:");
                            System.out.println(f);
                            break;

                    }
                    if(roman1[0].equals(words[1])||roman1[1].equals(words[1])
                            ||roman1[2].equals(words[1])||roman1[3].equals(words[1])||roman1[4].equals(words[1])
                            ||roman1[5].equals(words[1])||roman1[6].equals(words[1])||roman1[7].equals(words[1])
                            ||roman1[8].equals(words[1])||roman1[9].equals(words[1])) {
                        System.out.println("Output:");
                        throw new Exception("//т.к. числа должны быть в одинаковом формате");
                    }
                    String[] arabic1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

                    if (!(arabic1[0].equals(words[0])||arabic1[1].equals(words[0])||arabic1[2].equals(words[0])
                            ||arabic1[3].equals(words[0])||arabic1[4].equals(words[0])||arabic1[5].equals(words[0])
                            ||arabic1[6].equals(words[0])||arabic1[7].equals(words[0])||arabic1[8].equals(words[0])
                            ||arabic1[9].equals(words[0])||arabic1[0].equals(words[1])||arabic1[1].equals(words[1])||arabic1[2].equals(words[1])
                            ||arabic1[3].equals(words[1])||arabic1[4].equals(words[1])||arabic1[5].equals(words[1])
                            ||arabic1[6].equals(words[1])||arabic1[7].equals(words[1])||arabic1[8].equals(words[1])
                            ||arabic1[9].equals(words[1]))){
                        System.out.println("Output");
                        throw new Exception("//т.к.оперенды не удовлятворяют условию");
                    }

                    int a = Integer.parseInt(words[0]);
                    int b = Integer.parseInt(words[1]);

                    //включаю дополнительный контроль за диапазоном переменных от 1 до 10ти включительно

                    if(a>10||b>10){
                        System.out.println("Output:");
                        throw new Exception("//т.к. формат математической операции не удовлетворяет заданию: принятия на вход числа от 1 до 10 включительно");
                    }
                    if(a<1||b<1) {
                        System.out.println("Output:");
                        throw new Exception("//т.к. формат математической операции не удовлетворяет заданию: принятия на вход числа от 1 до 10 включительно");
                    }

                    int c = a - b;
                    System.out.println("Output:");
                    System.out.println(c);
                    break;
                }
                if(signs1 == 2) {
                    String[] words = input.split("/");

                    String[] roman1 = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
                            "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII",
                            "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII",
                            "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI",
                            "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII",
                            "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX",
                            "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

                    if(roman1[10].equals(words[0])||roman1[1].equals(words[0])||roman1[2].equals(words[0])
                            ||roman1[3].equals(words[0])||roman1[4].equals(words[0])||roman1[5].equals(words[0])
                            ||roman1[6].equals(words[0])||roman1[7].equals(words[0])||roman1[8].equals(words[0])
                            ||roman1[9].equals(words[0])){
                        if(!(roman1[10].equals(words[1])||roman1[1].equals(words[1])
                                ||roman1[2].equals(words[1])||roman1[3].equals(words[1])||roman1[4].equals(words[1])
                                ||roman1[5].equals(words[1])||roman1[6].equals(words[1])||roman1[7].equals(words[1])
                                ||roman1[8].equals(words[1])||roman1[9].equals(words[1]))) {
                            System.out.println("Output:");
                            throw new Exception("//т.к. числа должны быть в одинаковом формате");
                        }

                            // вычисления с римскими переменными


                            int nam1 = -1;
                            for (int t = 0; t < roman1.length; t++) {
                                if (words[0].equals(roman1[t])) {
                                    nam1 = t;
                                }
                            }
                            int nam2=-1;
                            for(int t=0; t<roman1.length;t++){
                                if(words[1].equals(roman1[t])){
                                    nam2 = t;
                                }
                            }
                            int c;
                            c=nam1/nam2;

                            String f = roman1[c];
                            System.out.println("Output:");
                            System.out.println(f);

                            break;
                    }
                    if(roman1[0].equals(words[1])||roman1[1].equals(words[1])
                            ||roman1[2].equals(words[1])||roman1[3].equals(words[1])||roman1[4].equals(words[1])
                            ||roman1[5].equals(words[1])||roman1[6].equals(words[1])||roman1[7].equals(words[1])
                            ||roman1[8].equals(words[1])||roman1[9].equals(words[1])) {
                        System.out.println("Output:");
                        throw new Exception("//т.к. числа должны быть в одинаковом формате");
                    }
                    String[] arabic1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

                    if (!(arabic1[0].equals(words[0])||arabic1[1].equals(words[0])||arabic1[2].equals(words[0])
                            ||arabic1[3].equals(words[0])||arabic1[4].equals(words[0])||arabic1[5].equals(words[0])
                            ||arabic1[6].equals(words[0])||arabic1[7].equals(words[0])||arabic1[8].equals(words[0])
                            ||arabic1[9].equals(words[0])||arabic1[0].equals(words[1])||arabic1[1].equals(words[1])||arabic1[2].equals(words[1])
                            ||arabic1[3].equals(words[1])||arabic1[4].equals(words[1])||arabic1[5].equals(words[1])
                            ||arabic1[6].equals(words[1])||arabic1[7].equals(words[1])||arabic1[8].equals(words[1])
                            ||arabic1[9].equals(words[1]))){
                        System.out.println("Output");
                        throw new Exception("//т.к.оперенды не удовлятворяют условию");
                    }

                    int a = Integer.parseInt(words[0]);
                    int b = Integer.parseInt(words[1]);

                    //включаю дополнительный контроль за диапазоном переменных от 1 до 10ти включительно

                    if(a>10||b>10){
                        System.out.println("Output:");
                        throw new Exception("//т.к. формат математической операции не удовлетворяет заданию: принятия на вход числа от 1 до 10 включительно");
                    }
                    if(a<1||b<1) {
                        System.out.println("Output:");
                        throw new Exception("//т.к. формат математической операции не удовлетворяет заданию: принятия на вход числа от 1 до 10 включительно");
                    }

                    int c = a / b;
                    System.out.println("Output:");
                    System.out.println(c);
                    break;
                }
                if(signs1 == 3) {
                    String[] words = input.split("\\*");

                    String[] roman1 = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
                            "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII",
                            "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII",
                            "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI",
                            "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII",
                            "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX",
                            "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};



                    if(roman1[10].equals(words[0])||roman1[1].equals(words[0])||roman1[2].equals(words[0])
                            ||roman1[3].equals(words[0])||roman1[4].equals(words[0])||roman1[5].equals(words[0])
                            ||roman1[6].equals(words[0])||roman1[7].equals(words[0])||roman1[8].equals(words[0])
                            ||roman1[9].equals(words[0])){
                        if(!(roman1[10].equals(words[1])||roman1[1].equals(words[1])
                                ||roman1[2].equals(words[1])||roman1[3].equals(words[1])||roman1[4].equals(words[1])
                                ||roman1[5].equals(words[1])||roman1[6].equals(words[1])||roman1[7].equals(words[1])
                                ||roman1[8].equals(words[1])||roman1[9].equals(words[1]))) {
                            System.out.println("Output:");
                            throw new Exception("//т.к. числа должны быть в одинаковом формате");
                        }

                            // вычисления с римскими переменными

                            int nam1 = -1;
                            for (int t = 0; t < roman1.length; t++) {
                                if (words[0].equals(roman1[t])) {
                                    nam1 = t;
                                }
                            }
                            int nam2=-1;
                            for(int t=0; t<roman1.length;t++){
                                if(words[1].equals(roman1[t])){
                                    nam2 = t;
                                }
                            }
                            int c;
                            c=nam1*nam2;

                            String f = roman1[c];
                            System.out.println("Output:");
                            System.out.println(f);

                            break;
                    }
                    if(roman1[0].equals(words[1])||roman1[1].equals(words[1])
                            ||roman1[2].equals(words[1])||roman1[3].equals(words[1])||roman1[4].equals(words[1])
                            ||roman1[5].equals(words[1])||roman1[6].equals(words[1])||roman1[7].equals(words[1])
                            ||roman1[8].equals(words[1])||roman1[9].equals(words[1])) {
                        System.out.println("Output:");
                        throw new Exception("//т.к. числа должны быть в одинаковом формате");
                    }
                    String[] arabic1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

                    if (!(arabic1[0].equals(words[0])||arabic1[1].equals(words[0])||arabic1[2].equals(words[0])
                            ||arabic1[3].equals(words[0])||arabic1[4].equals(words[0])||arabic1[5].equals(words[0])
                            ||arabic1[6].equals(words[0])||arabic1[7].equals(words[0])||arabic1[8].equals(words[0])
                            ||arabic1[9].equals(words[0])||arabic1[0].equals(words[1])||arabic1[1].equals(words[1])||arabic1[2].equals(words[1])
                            ||arabic1[3].equals(words[1])||arabic1[4].equals(words[1])||arabic1[5].equals(words[1])
                            ||arabic1[6].equals(words[1])||arabic1[7].equals(words[1])||arabic1[8].equals(words[1])
                            ||arabic1[9].equals(words[1]))){
                        System.out.println("Output:");
                        throw new Exception("//т.к.оперенды не удовлятворяют условию");
                    }

                    int a = Integer.parseInt(words[0]);
                    int b = Integer.parseInt(words[1]);

                    //включаю дополнительный контроль за диапазоном переменных от 1 до 10ти включительно

                    if(a>10||b>10){
                        System.out.println("Output:");
                        throw new Exception("//т.к. формат математической операции не удовлетворяет заданию: принятия на вход числа от 1 до 10 включительно");
                    }
                    if(a<1||b<1) {
                        System.out.println("Output:");
                        throw new Exception("//т.к. формат математической операции не удовлетворяет заданию: принятия на вход числа от 1 до 10 включительно");
                    }

                    int c = a * b;
                    System.out.println("Output:");
                    System.out.println(c);
                    break;
                }
            }


        }


    }
}
