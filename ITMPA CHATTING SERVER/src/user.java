import java.net.Socket;

public class user extends Thread {

    private Socket m_socket = null;
    String m_name;


    user(Socket socket) {
        m_socket = socket;
    }
    public void run() {}

}
