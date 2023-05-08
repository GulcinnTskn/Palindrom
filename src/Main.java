// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        static boolean isPalindrom(int number){
            int temp = number,reverseNumber=0,lastNumber;

            while (temp !=0){
                lastNumber = temp %10; // son basamağı buluyoruz
                reverseNumber = (reverseNumber*10) + lastNumber;  // sayının basamağını arttırmak için (örn:6 ise 60 olması için)
                temp /= 10;
            }
            if (number==reverseNumber)
                return true;
            else
                return false;

        }

    public static void main(String[] args) {
        System.out.println(isPalindrom(101));
    }
}