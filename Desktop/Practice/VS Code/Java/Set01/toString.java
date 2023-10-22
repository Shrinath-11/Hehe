package Set01;

class xyz {
    private int id;
    private String name;

    public xyz(int id, String name) {
        this.id = id;
        this.name = name;

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

    public String toString() {
        return name + " " + id;
    }

}

public class toString {
    public static void main(String[] args) {
        xyz obj = new xyz(10, "shrinath");

        
        System.out.println(obj);
        System.out.println(obj.getName());
    }
}
