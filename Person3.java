public class Person3 {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Person3(String name){
        this.name = name;
    }

    public void introduce(){
        System.out.println("私は" + name + "と申します｡");
    }
}
