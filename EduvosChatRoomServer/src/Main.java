//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static server_connection sc = null;

    public static void main(String[] args) {
        sc = new server_connection();

        app_onupdate();
    }

    /*
    *   When new member join it will then create a new thread for the user
    * */
    public static void app_onupdate() {
        while(true) {
            if(sc != null) {
                sc.connection_onupdate();
            }
        }

    }
}