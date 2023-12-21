import java.util.Arrays;
import java.util.Scanner;
public class Palindrome2 {
    public static void main(String[] args) {
        String [] myStringArray;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir kelime giriniz:  ");
        String str = input.nextLine();

        myStringArray = str.split("");
        System.out.println(" Kullanıcıdan aldığımız kelimenin harfleri:");
        System.out.println(Arrays.toString(myStringArray));

        // array e çevirdiğimiz kelimeyi ters çeviriyoruz ve reversed array değişkeni içinde saklıyoruz
            String [] reversedArray = new String[myStringArray.length];
        for(int i = 0,j= myStringArray.length-1 ; i < myStringArray.length;i++,j--){
            reversedArray[j] = myStringArray[i];
        }
        // parçalayıp kelimeyi ters çevirip  reversedArray içine koyduğum  String.join() methoduyla birleştirip
        // kullanıcıdan aldığım kelimeyi equals metoduyla karşılaştırıp true false döndürüyoruz
        System.out.println("Bu kelime palindrome mu?");
        System.out.println(String.join("",reversedArray).equals(str));

    }
}
