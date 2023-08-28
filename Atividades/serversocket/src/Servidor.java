import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            ServerSocket socket = new ServerSocket(12345);
            System.out.println("Servidor Ativo ouvindo a porta 12345.");

            Socket cliente1 = socket.accept();
            System.out.println("Primeiro Cliente conectado.");
            Socket cliente2 = socket.accept();
            System.out.println("Segundo Cliente conectado.");

            InputStreamReader inputStreamReader = new InputStreamReader(cliente1.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);

            C1ToC2Thread c1ToC2Thread = new C1ToC2Thread(cliente1, cliente2);
            c1ToC2Thread.start();
            C2ToC1Thread c2ToC1Thread = new C2ToC1Thread(cliente1, cliente2);
            c2ToC1Thread.start();

//            PrintStream saida = new PrintStream(cliente1.getOutputStream());
//            while (true) {
//                String console = scan.nextLine();
//                saida.println(console);
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}