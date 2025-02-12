package info.pkg5100.finalproject.models;

public class Enterprise {
    int id;
    String enterpriseName;
    String location;
    String type;

    public Enterprise(int id, String enterpriseName, String location, String type) {
        this.id = id;
        this.enterpriseName = enterpriseName;
        this.location = location;
        this.type = type;
    }

    public Enterprise() {
        this.id = -1;
        this.enterpriseName = "";
        this.location = "";
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return Integer.toString(this.id);
    }
}
