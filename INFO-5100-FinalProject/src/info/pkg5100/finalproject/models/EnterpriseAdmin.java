package info.pkg5100.finalproject.models;

public class EnterpriseAdmin {
    int id;
    String username;
    String password;
    int enterpriseId;

    public EnterpriseAdmin() {
        this.id = -1;
        this.username = "";
        this.password = "";
        this.enterpriseId = -1;
    }

    public EnterpriseAdmin(int id, String username, String password, int enterpriseId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enterpriseId = enterpriseId;
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

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
}
