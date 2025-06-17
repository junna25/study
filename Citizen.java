public class Citizen extends Human {
    
    public Citizen() {
        super();
    }
    
    public Citizen(String name) {
        super(name);
    }
    
    @Override
    public void info() {
        System.out.println("名前: " + getName());
    }
    
    @Override
    public void attack() {
        System.out.println(getName() + "は攻撃した！");
    }
}
