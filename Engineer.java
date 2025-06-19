public class Engineer extends Employee {

    private String skill;

    public Engineer(String name, int age, String skill) {
        super(name, age);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void introduce() {
        System.out.println(getName() + "さんは" + getAge() + "歳です");
        System.out.println(skill + "エンジニアです");
    }
    
}
