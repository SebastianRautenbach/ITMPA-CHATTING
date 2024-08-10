//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    server_connection sc = null;

    public void main(String[] args) {
        sc = new server_connection();
    }


    public void app_onupdate() {

        if(sc != null) {
            sc.connection_onupdate();
        }

    }
}