public class Exam5 {
    public static void main(String[] args) {

        String name = "田中太郎";
        int age = 20;

        Employee employee = new Employee(name, age);   
        employee.setName(name);
        employee.setAge(age);

        employee.introduce();
        
    }
}
