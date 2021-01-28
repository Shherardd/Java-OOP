import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Luis Gerardo", "Immunology");
        myDoctor.name = "Luis Gerardo";
        myDoctor.showName();
        System.out.println(myDoctor.getId());
        Doctor myDoctor2 = new Doctor("Luis Gerardo2", "Immunology2");
        System.out.println(myDoctor2.getId());
        showMenu();
    }
}
