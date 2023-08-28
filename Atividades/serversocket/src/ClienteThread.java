import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClienteThread extends Thread {

    private Socket cliente;

    public ClienteThread(Socket cliente) {
        this.cliente = cliente;
    }

    @Override
    public void run() {
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(cliente.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);

            String x;
            do {
                x = reader.readLine();
                System.out.println("Cliente: " + x);
            } while (x != null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
