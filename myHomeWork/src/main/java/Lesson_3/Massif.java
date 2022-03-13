package Lesson_3;

public class Massif {
    public static void main(String[] arg){
        Employees[] Employee = new Employees[5];
        Employee[0] = new Employees("Ivanov","Sergey","Ivanovoch","Director","ivanov@gmail.com","+375291111111",800,67);
        Employee[1] = new Employees("Tymkin", "Ivan", "Albertovich","Engineer", "ivan@mail.ru","+375292222222", 700, 65);
        Employee[2] = new Employees("Leonov", "Stanislav", "Petrovich", "Manager", "leon@rambler.ru","+375293333333", 600, 40);
        Employee[3] = new Employees("Stepuk", "Sergey", "Alecseevich", "Driver", "stepan@gmail.com", "+375294444444", 500, 36);
        Employee[4] = new Employees("Dubrovina", "Elena", "Ivanovna", "Secretary","dybrovina@mail.ru", "+375295555555", 350, 32);
        // вывод информации о сотрудниках старше 40 лет
        for (int i = 0; i<Employee.length; i++) {
            if (Employee[i].getAge() > 40) {
                System.out.println("Старше 40 лет " + Employee[i].display());
            }
        }
            System.out.println();
        // вывод информации об объектах
        for (int i = 0; i<Employee.length; i++) {
        Employee[i].printInfo();}
    }}