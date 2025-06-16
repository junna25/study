public class Person2 {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        if (a >= 0 && a <=120){
            age = a;
        }
    }
}
