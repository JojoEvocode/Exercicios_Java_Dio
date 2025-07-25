import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira o seu nome:");
        String name = scanner.next();

        System.out.println("Agora insira seu ano de nascimento:");
        int yearBirth = scanner.nextInt();
        int yearNow = OffsetDateTime.now().getYear();

        System.out.printf("Olá %s, você tem %d anos.\n\n", name, yearNow - yearBirth);

        System.out.println("Por favor, diga o lado do quadrado que deseja calcular a área:");
        int side = scanner.nextInt();
        int area = (int) Math.pow(side, 2);
        System.out.printf("A área do quadrado é %d.\n\n", area);
        // o retorno da classe Math.pow é double, para trabalhar com inteiro é preciso
        // relizar um cast (conversão de tipo) de double para integer.

        System.out.println("Por favor, informe a base do retângulo:");
        int base = scanner.nextInt();
        System.out.println("Agora, informe a altura do retângulo:");
        int high = scanner.nextInt();
        System.out.printf("A área do retângulo é %d\n\n", base * high);

        System.out.println("Por favor, insira o nome da primera pessoa:");
        String name01 = scanner.next();
        System.out.println("Agora, insira a idade dela:");
        int age01 = scanner.nextInt();
        System.out.println("Em seguida, insira o nome da segunda pessoa:");
        String name02 = scanner.next();
        System.out.println("E agora, a idade dela:");
        int age02 = scanner.nextInt();
        System.out.printf("A diferença de idades de %s e %s, é %d.", name01, name02, age01 - age02);
    }
}
