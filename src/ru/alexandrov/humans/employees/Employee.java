package ru.alexandrov.humans.employees;
import ru.alexandrov.humans.Name;

public class Employee {
    Name name;
    Department department;

    public Employee(Name name,Department department){
            this.name = name;
            this.department = department;
            this.department.addEmployee(this);
    }


    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        if(department == null) throw new IllegalArgumentException("Department is not must be null.");
        if(department == this.department)
            return;
        this.dismiss();
        this.department=department;
        department.employees.add(this);
    }



    public void transfer(Department department){
        department.addEmployee(this);
    }

    public void dismiss() {
        if (this == null) throw new IllegalArgumentException("Employees is not must be null.");
        if (this.department.head == this)
            this.department.head = null;
        this.department.employees.remove(this);
        this.department = null;
    }

    public  String  toString(){
        if(this.department == null) return this.name + " был уволен.";
        if(department.getHead() == this)
            return name + " начальник отдела " + department.title;
        return name + " работает в отделе " + department.title ;
    }

}

