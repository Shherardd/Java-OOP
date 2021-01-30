import java.util.Hashtable;

public class Patient {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email){
        this.name = name;
        this.email = email;
    }

    public Hashtable<Integer, String> createHashTable(){
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "uno");
        return ht1;
    }
}
