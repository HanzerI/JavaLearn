package ru.alexandrov.humans.employees;

import java.util.*;

public class Department {
    String title;
    Employee head;
    Set<Employee> employees;

    public Department(String title) {
        if(title == null || title.length()== 0 ) throw new IllegalArgumentException("Пустая строка");
        this.title = title;
    }

    public Department(String title, Employee head, Employee employees) {
        this(title,head);
        this.employees = new HashSet<>();
        this.employees.add(employees);
    }
    public Department(String title, Employee head, List<Employee>  employees) {
        this(title,head);
        this.employees = new HashSet<>(employees);
    }

    public Department(String title, Employee head) {
        this(title);
        this.head = head;
    }


    public void setEmployees(Employee  employees) {
        this.employees = new HashSet<>();
        this.employees.add(employees);
    }

    public void setEmployees(HashSet<Employee> employees) {
        this.employees = employees;
    }

    public void setHead(Employee head) {
        if(head == null) throw new IllegalArgumentException("Head is not must be null.");
        if(this.head == head)
            return;
        if(this.head != null)
            this.head.dismiss();
        head.dismiss();
        head.department = this;
        this.head = head;
        this.addEmployee(head);
    }

    public Employee getHead() {
        return head;
    }



    public Set<Employee> getEmployees() {
        return this.employees;
    }

    public void addEmployees(HashSet<Employee> employees) {
        if(employees == null) throw new IllegalArgumentException("Employees is not must be null.");
        if(this == null)
            this.setEmployees(employees);
        this.employees.addAll(employees);
    }

    public void addEmployee(Employee  employee) {
        if(this.employees == null)
            this.setEmployees(employee);
        else if( employee.department != this && employee.department != null )
            employee.dismiss();
        this.employees.add(employee);
        employee.department = this;
    }

    public void deleteEmployee(Employee employee){
        employee.dismiss();
    }

    public void deleteHead(Employee head){
        head.dismiss();
    }

    public  String toString(){
        return "Отдел: " +  title +  "\nСотрудники: " + employees;
    }
}
