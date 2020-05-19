public class Employee2 {
    String name;
    String lastName;
    String secondName;

    public Employee2(String name, String lastName, String secondName) {
        this.name = name;
        this.lastName = lastName;
        this.secondName = secondName;
    }

    public Employee2(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

        public static void main (String[]args){
        Employee2 manager = new Employee2("Петр", "Петров");
        Employee2 employee = new Employee2("Петр", "Петров");
    }
}
