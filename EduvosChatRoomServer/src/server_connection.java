import java.io.IOException;
import java.net.*;
import java.util.Vector;

public class server_connection {
    int port;
    static Vector<user> m_users = new Vector<>();

    server_connection() {}


    public void connection_onupdate() {

        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            System.out.println("New user connected");
            user newUser = new user(socket);
            m_users.add(newUser);
            newUser.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void broadcast(String message, user sender) {
        for (user _user : m_users) {
            if (_user != sender) {
                _user.send_massage(message);
            }
        }
    }




}
