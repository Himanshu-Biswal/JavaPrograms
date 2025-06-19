package Aa_Interview_Question;
import java.util.*;

class Emp {
    String name;
    int sal;

    Emp(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    int getsal() {
        return sal;
    }

    public String toString() {
        return "Employee{name='" + name + "', sal=" + sal + "}";
    }
   
}

public class Q_01_Sort_EmployeeAge_Using_Stream {
    public static void main(String[] args) {
        List<Emp> empl = Arrays.asList(
            new Emp("A", 30000),
            new Emp("B", 25000),
            new Emp("C", 35000),
            new Emp("D", 28000)
        );

        empl.stream()
            .sorted(Comparator.comparing(Emp::getsal))
            .forEach(e -> System.out.println(e));
    }
}
