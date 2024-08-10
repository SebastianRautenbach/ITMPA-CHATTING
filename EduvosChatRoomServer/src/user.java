import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class user extends Thread {
    private Socket m_socket = null;
    String m_name;
    private PrintWriter out;
    private BufferedReader in;


    user(Socket socket) {
        this.m_socket = socket;
        try {
            out = new PrintWriter(m_socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(m_socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void send_massage(String message) {
        out.println(message);
        out.println("Type Your Message");
    }


    @Override
    public void run() {
    }
}
