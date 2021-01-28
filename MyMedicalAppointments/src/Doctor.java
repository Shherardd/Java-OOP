public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void showName(){
        System.out.println(name);
    }

}
