class StudentInfo {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        StudentInfo s = new StudentInfo();

        s.setName("Ramsha");

        System.out.println(s.getName());

    }
}