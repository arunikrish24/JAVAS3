
class Person {
    String name;
    String gender;
    String address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}


class Employee extends Person {
    String empId;
    String companyName;
    String qualification;
    double salary;

    
    Employee(String name, String gender, String address, int age, String empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age); 
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}


class Teacher extends Employee {
    String subject;
    String department;
    String teacherId;

    
    Teacher(String name, String gender, String address, int age, String empId, String companyName, String qualification, double salary, String subject, String department, String teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary); 
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    
    void display() {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class main {
    public static void main(String[] args) {
       
        Teacher[] teachers = new Teacher[3]; 

        
        teachers[0] = new Teacher("John Doe", "Male", "1234 Elm St", 30, "EMP001", "XYZ Ltd.", "MSc", 50000, "Math", "Science", "T001");
        teachers[1] = new Teacher("Jane Smith", "Female", "5678 Oak St", 35, "EMP002", "XYZ Ltd.", "MA", 55000, "English", "Arts", "T002");
        teachers[2] = new Teacher("Alice Johnson", "Female", "9101 Pine St", 28, "EMP003", "XYZ Ltd.", "BEd", 48000, "History", "Humanities", "T003");

        
        for (int i = 0; i < teachers.length; i++) {
            teachers[i].display();
        }
    }
}


