import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro nome:");
        String primeiroNone = sc.next();
        System.out.print("Digite o Segundo nome: ");
        String segundoNome = sc.next();

        String nomeCompleto = nomeCompleto(primeiroNone, segundoNome);

        System.out.println(nomeCompleto);

        sc.close();
    }

    public static String nomeCompleto(String primeiroNome, String SegundoNome){
        return primeiroNome.concat(" ").concat(SegundoNome);
    }
}
