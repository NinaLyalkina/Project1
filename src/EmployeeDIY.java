import java.util.Scanner;

public class EmployeeDIY {
    String name;
    String lastName;
    String secondName;
    int age;
    char sex; // f / m
    double salary;
    String languages;
    boolean license;
    Employee manager;
    String position;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        EmployeeDIY employee = new EmployeeDIY();
        System.out.println("Введите имя работника: ");
        employee.name = in.nextLine();

        System.out.println("Введите фамилию работника: ");
        employee.lastName = in.nextLine();

        System.out.println("Введите отчество работника: ");
        employee.secondName = in.nextLine();

        System.out.println("Введите возраст работника: ");
        employee.age = in.nextInt();

        System.out.println("Введите пол работника (м для Мужского, ж для Женского): ");
        employee.sex = in.next();

        System.out.println("Введите зарплату работника: ");
        employee.salary = in.nextFloat();

        System.out.println("Сколько языков знает работник?");
        int n = in.nextInt();
        LANGUAGES [] languages  = new LANGUAGES[n];

        System.out.println("На каких языках разговаривает работник? (ввести язык в формате \"RUSSIAN\", \"ENGLISH\" и т.д.):");
        for (int i = 0; i< n; i++) {
            employee.languages = in.nextLine();
        }

        System.out.println("Есть ли водительские права? (да или нет): ");
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("да") ){
            employee.license= true;
        }
        else {
            employee.license= false;
        }

        System.out.println("ФИО работника: " + employee.lastName + " " + employee.name + " " + employee.secondName);
        System.out.println("Возраст работника: " + employee.age);
        System.out.println("Зарплата работникаЖ " + employee.salary);
        System.out.println("Пол работника: " + employee.sex);
        System.out.println("Языки: " + employee.languages);
    }
}