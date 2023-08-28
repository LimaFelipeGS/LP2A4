import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class C2ToC1Thread extends Thread {
    private Socket cliente1;
    private Socket cliente2;

    public C2ToC1Thread(Socket cliente1, Socket cliente2) {
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;
    }

    @Override
    public void run() {
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(cliente2.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);
            PrintStream saida = new PrintStream(cliente1.getOutputStream());

            String x;
            do {
                x = reader.readLine();
                saida.println(x);
            } while (x != null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
