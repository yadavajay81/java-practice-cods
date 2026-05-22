package java8certification;

import java.util.*;
import java.util.stream.Collectors;

class Employeetc {
    private int id;
    private String name;
    private double salary;

    public Employeetc(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

     public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name:" + name + " Price:" + salary;
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employeetc> employees = Arrays.asList(
                new Employeetc(1, "Jeff", 100.0),
                new Employeetc(2, "Bill", 200.0),
                new Employeetc(3, "Mark", 400.0),
                new Employeetc(4, "Elon", 300.0)
        );

        double salaryThreshold = 200000.0;
        
        
       List<Employeetc> em = employees.stream().filter(e -> e.getSalary()>1000)
    		   .collect(Collectors.toList());
       
       em.forEach(System.out::println);
       
       System.out.println("==========Sorting=========");
       List<Employeetc> emSort = employees.stream().sorted((e1,e2) ->Double.valueOf(e1.getSalary())
    		   .compareTo(Double.valueOf(e2.getSalary()))).collect(Collectors.toList());
       
       System.out.println(emSort);
       
       List<Employeetc> emSortC = employees.stream().sorted(Comparator.comparing(Employeetc::getSalary))
    		   .collect(Collectors.toList());
       System.out.println(emSortC);
       
       List<Employeetc> empSortR = employees.stream().sorted(Comparator.comparing(Employeetc::getSalary).reversed())
    		   .collect(Collectors.toList());
       System.out.println(empSortR);
       
       
       
       System.out.println("END==========Sorting=========");
        
        
        
        
        
        
        
        
        
        

        List<Employeetc> filteredEmployees = employees.stream()
                .filter(e -> e.getSalary() >= salaryThreshold)
                .collect(Collectors.toList());

        filteredEmployees.forEach(System.out::println);
    }
}

