import java.sql.SQLOutput;
import java.util.Scanner;

public class apreendendofor {
    public static void main(String[] args) {
        String[] nomesjogadores = new String[10];

        Scanner sc = new Scanner(System.in);

        //inicialização; condição; incremento
        // ++ -> vai somar + 1 i = i + 1
        for (int i = 0; i < 10; i++) {
            System.out.println("informe o nome do player:" + (i + 1));
            nomesjogadores[i] = sc.next();

            // pedir o nome do time A
            // pedir os nomes do time A (5 nomes)
            // pedir o nome do time B
            // pedir os nomes do time B (5 nomes)


        }

            System.out.println("Informe o time A");

            String timeA = sc.next();

            String[] nomesplayerstimeA = new String[5];

            for (int i = 0; i < 5; i++) {
                System.out.println("informe o nome do player:" + (i + 1));
                nomesplayerstimeA[i] = sc.next();
            }
        System.out.println("Informe o time B");

        String timeB = sc.next();

        String[] nomesplayerstimeB = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("informe o nome do player:" + (i + 1));
            nomesplayerstimeB[i] = sc.next();
        }

    }
}
