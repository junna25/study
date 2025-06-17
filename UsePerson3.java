public class UsePerson3 {
    public static void main(String[] args) {
        Person3 p1 = new Person3("ジョニー・デップ");
        p1.introduce();
        System.out.println(); 
        Person3 p2 = new Employee3("ジョン・ディーコン",  "経営企画課");
        p2.introduce();
    }
}
