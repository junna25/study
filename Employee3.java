public class Employee3 extends Person3 {
    private String department;

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public Employee3(String name, String department){
        super(name);
        this.department = department;
    }

    public void introduce(){
        super.introduce();
        System.out.println("所属は" + department + "です｡");
    }
}
