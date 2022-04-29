package info.pkg5100.finalproject.models;

public class Organization {
    int id;
    String name;
    String location;
    String type;
    String enterpriseType;

    public Organization() {
        id = -1;
        name = "";
        location = "";
        type = "";
        enterpriseType = "";
    }

    public Organization(int id, String name, String location, String type, String enterpriseType) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.type = type;
        this.enterpriseType = enterpriseType;
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

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

   

    @Override
    public String toString() {
        return Integer.toString(this.id);
    }
}
