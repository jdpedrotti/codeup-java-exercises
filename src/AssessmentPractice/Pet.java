package AssessmentPractice;

public class Pet {

    public String name;

    public String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pet(){}

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
