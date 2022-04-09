package info.pkg5100.finalproject.models;

public class User {
    int id;
    String username;
    String password;
    String name;
    String age;
    String phone;
    String role;
    int orgid;
    String email;

    public User() {
        this.id = -1;
        this.username = "";
        this.password = "";
        this.name = "";
        this.age = "";
        this.phone = "";
        this.role = "";
        this.orgid = -1;
    }

    public User(int id, String username, String password, String name, String age, String phone, String role, int orgid) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.role = role;
        this.orgid = orgid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getOrgid() {
        return orgid;
    }

    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }

    @Override
    public String toString() {
        return Integer.toString(this.id);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
