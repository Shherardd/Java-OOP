import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Luis Gerardo", "Immunology");
        myDoctor.name = "Luis Gerardo";
        myDoctor.showName();
        showMenu();
        Patient patient = new Patient("Luis Gerardo", "g@g.com");

    }
}
