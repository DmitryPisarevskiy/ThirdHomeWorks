import java.util.Random;
import java.util.Scanner;


public class ThirdHomeWork {
    static Scanner sc;
    static Random random;
    //2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    //    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    //    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
    //            apple – загаданное
    //    apricot - ответ игрока
    //    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    //    Для сравнения двух слов посимвольно, можно пользоваться:
    //    String str = "apple";
    //str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    //    Играем до тех пор, пока игрок не отгадает слово
    //    Используем только маленькие буквы
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        random=new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String word = words[random.nextInt(words.length)];
        System.out.println("Загадано слово на английском языке. Попробуйте его угадать!");
        String answer;
        do {
            System.out.print("Введите слово -> ");
            answer=sc.nextLine();
            if (answer.equals(word)){
                System.out.println("Верно!!! Игра окончена!");
            } else {
                System.out.println("Неверно! Вы открыли следующие буквы:");
                for (int i = 0; i < 15; i++) {
                    if (i<=answer.length()-1 && i<=word.length()-1) {
                        System.out.print(answer.charAt(i)==word.charAt(i)? word.charAt(i):"#");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println();
                System.out.println("Попробуйте еще раз!");
            }
        } while (!answer.equals(word));
        System.out.println("Загаданное слово: "+ word);
    }
}