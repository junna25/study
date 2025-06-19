import java.util.*;

public class Exam7 {
    public static void main(String[] args) {

        Employee employee1 = new Employee("田中太郎", 20);
        Engineer engineer1 = new Engineer("鈴木一郎", 25, "Java");
        Employee employee2 = new Employee("佐藤花子", 30);


        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(engineer1);
        employees.add(employee2);

        for (Employee employee : employees) {
            employee.introduce();
        }
    }
}

