public class Warrior extends Human {

    private String type;

    public Warrior() {
        super();
        this.type = "";
    }

    public Warrior(String name, String type) {
        super(name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void info() {
        System.out.println("名前: " + getName());
        System.out.println("種別: " + type);
    }

    @Override
    public void attack() {
        System.out.println(getName() + "（" + type + "）は力強く攻撃した！");
    }
}