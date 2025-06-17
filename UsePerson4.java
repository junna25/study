public class UsePerson4 {
    public static void main(String[] args) {
        Person3[] persons = { new Person3("ダニエル・キイス"),
                              new Employee3("マイケル・ベイ", "開発部"),
                              new Person3("エディー・ジョーンズ")};
            
    for (Person3 p : persons){
        p.introduce();
        System.out.println();
        }
    }
}
