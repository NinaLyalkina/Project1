public class Employee {
    String name;
    String lastName;
    String secondName;
    int age;
    char sex; // f / m
    double salary;
    LANGUAGES[] languages;
    boolean license;
    Employee manager;
    String position;

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Петр";
        employee.lastName = "Петров";
        employee.age = 30;
        employee.sex = 'm';
        employee.salary = 100000.5;
        employee.languages = new LANGUAGES[2];
        employee.languages[0] = LANGUAGES.ENGLISH;
        employee.languages[1] = LANGUAGES.valueOf("RUSSIAN");
        employee.license = true;
        employee.manager = new Employee();
        employee.position = "QA Engineer";

        System.out.println("ФИО работника\n" + employee.lastName + " " + employee.name + " " + employee.secondName);
        System.out.print(employee.salary);
        System.out.print('\r');
        System.out.print(employee.age);
    }
}




