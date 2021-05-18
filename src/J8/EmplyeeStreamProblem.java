package J8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class EmplyeeStreamProblem {
    String firstname;
    String lastName;
    String department;

    @Override
    public String toString() {
        return "EmplyeeStreamProblem{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public EmplyeeStreamProblem(String firstname, String lastName, String department) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.department = department;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {

        List<EmplyeeStreamProblem> listEmployee = new ArrayList<EmplyeeStreamProblem>();
        listEmployee.add(new EmplyeeStreamProblem("Soumya","Mondal","CSE"));
        listEmployee.add(new EmplyeeStreamProblem("John","Agase","CSE"));
        listEmployee.add(new EmplyeeStreamProblem("Soumya","Das","IT"));
        listEmployee.add(new EmplyeeStreamProblem("John","Roy","CSE"));
        listEmployee.stream().forEach(System.out::println);
        
        /////////////////////
        listEmployee.stream().sorted((o1, o2) -> {
            return o1.getFirstname().concat(o1.lastName).compareTo(o2.getFirstname().concat(o2.lastName));
        }).forEach(System.out::println);
        //////////////////
        Map<String, List<EmplyeeStreamProblem>> collectedMap = listEmployee.stream()
                .collect(groupingBy(EmplyeeStreamProblem::getDepartment));

    }
}
