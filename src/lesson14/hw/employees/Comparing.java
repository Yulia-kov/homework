package lesson14.hw.employees;

import lesson14.Student;

import java.util.Comparator;

public class Comparing implements Comparable<Employee> {
    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());

    }
}

class NameSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return ( o1.getName().compareTo(o2.getName()) & Integer.compare(o1.getSalary(), o2.getSalary()));

    }
}
//
//class AllComparator implements Comparator<Employee> {
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return ;
//    }
//}
