package np.edu.divyagyan.sqliteexample;

public class StudentModel {

    private String fullName;
    private String address;
    private int id;


    public String getFullName() {
        return fullName;
    }

    public StudentModel setFullName(String fullName) {
        this.fullName = fullName;
        return  this;
    }

    public String getAddress() {
        return address;
    }

    public StudentModel setAddress(String address) {
        this.address = address;
        return this;
    }

    public int getId() {
        return id;
    }

    public StudentModel setId(int id) {
        this.id = id;
        return  this;
    }
}
