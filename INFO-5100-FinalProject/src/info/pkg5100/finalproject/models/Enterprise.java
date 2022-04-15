package info.pkg5100.finalproject.models;

public class Enterprise {
    int id;
    String enterpriseName;
    String location;

    public Enterprise(int id, String enterpriseName, String location) {
        this.id = id;
        this.enterpriseName = enterpriseName;
        this.location = location;
    }

    public Enterprise() {
        this.id=-1;
        this.enterpriseName = null;
        this.location = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
