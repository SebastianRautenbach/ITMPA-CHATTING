//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    server_connection sc = null;


    public void main(String[] args) {
        sc = new server_connection();
    }

    /*
    *   All app updates relating to see if there are new people that joined.
    *   or any messages sent etc..
    * */
    public void app_onupdate() {

        if(sc != null) {
            sc.connection_onupdate();
        }

    }

}