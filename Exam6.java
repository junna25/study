public class Exam6 {
    public static void main(String[] args) {

        String name = "鈴木一郎";
        int age = 25;
        String skill = "Java";

        Engineer engineer = new Engineer(name, age, skill);

        engineer.setName(name);
        engineer.setAge(age);
        engineer.setSkill(skill);

        engineer.introduce();
    }
}
