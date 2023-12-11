package practice;

class Employee{
    String name;
    int age;
    String address;
    int phno;
    float salary;

    void salary(){
        System.out.println("salary : " + salary);
    }


}

class Manager extends Employee{
    String department;
}

class Officer extends Employee{
    String specialization;

}

public class Company{
    public static void main(String[] args) {
        Officer of = new Officer();
        of.name = "Dilli";
        of.age = 26;
        of.address = "Tamilnadu, Madurai";
        of.phno = 987598809;
        of.salary = 30000;
        of.specialization = "Deputy";

        Manager man = new Manager();
        man.name = "Rolex";
        man.age = 30;
        man.address = "Chennai Street";
        man.phno = 949567980;
        man.salary = 50000;
        man.department = "Sales";

        System.out.println("Details of officer: ");
        System.out.println("Name "+ of.name);
        System.out.println("age "+ of.age);
        System.out.println("Details of Manager: ");
        System.out.println("Name: "+man.name);
        
    }

}