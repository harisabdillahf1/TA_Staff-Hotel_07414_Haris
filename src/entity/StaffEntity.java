package entity;

public class StaffEntity {
    private String namaStaff, password;
    private int id;

    public StaffEntity(String namaStaff, int id, String password) {
        this.namaStaff = namaStaff;
        this.id = id;
        this.password = password;
    }

    public String getNamaStaff() {
        return namaStaff;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
}
