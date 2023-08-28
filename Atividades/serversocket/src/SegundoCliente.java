import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SegundoCliente {
    public static void main(String[] args) {
        try {
            Socket cliente = new Socket("localhost", 12345);
            Scanner scan = new Scanner(System.in);

            ClienteThread clienteThread = new ClienteThread(cliente);
            clienteThread.start();

            PrintStream saida = new PrintStream(cliente.getOutputStream());
            while (true) {
                String console = scan.nextLine();
                saida.println(console);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
