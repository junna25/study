public class IntroduceMethod {
    public static void main(String[] args) {
        introduce("結城美優",26);
        System.out.println("---");
        introduce("鈴木一郎",30);
    }

    static int introduce(String name, int age){
        System.out.println(name +" " + age + "歳 です｡");
        System.out.println("10年後は " + (age + 10) + "歳 です｡");
        return age + 10;
    }
    
}
