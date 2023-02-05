public class Employee {
    //     //Create a class called Employee that includes three pieces of information as instance variables
    //        //A first name
    //        //A last name
    //        //A monthly salary
    //        //Your class should have a constructor that initializes the three instance variables.
    //        //If the monthly salary is not positive, set it to 0.0.
    //        //Create two Employee objects and display each object’s yearly salary.
    //        //Then give each Employee a 10% raise and display each Employee’s yearly salary again.

    String firstName;
    String lastName;
    Double monthlySalary;

    public Employee(String firstname, String lastName, Double monthlySalary) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;

    }


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}
