import java.util.Scanner;
public class InverteString {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra para ser invertida:");
        String palavra = input.next();
        String palavraInvertida = "";

        for(int i = palavra.length() - 1; i>=0; i--){
            palavraInvertida = palavraInvertida + Character.toString(palavra.charAt(i));
        }
        System.out.println(palavraInvertida);
    }
}
