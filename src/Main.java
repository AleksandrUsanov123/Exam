public  class Main {


    public static Employee employees[] = new Employee[5];

    public void setPersons() {
        employees[0] = new Employee("Вирюков", "Евгений", "Евгеньевич", 1, 23234);
        employees[1] = new Employee("Нылдин", "Алексей", "Валерьевич", 1, 46866);
        employees[2] = new Employee("Каров", "Виктор", "Михайлович", 2, 36478);
        employees[3] = new Employee("Карсева", "Полина", "Алексеевна", 2, 25987);
        employees[4] = new Employee("Апопаян", "Давид", "Сасунович", 3, 56987);
        employees[5] = new Employee("Льгонова", "Галина",  "Васильевна", 3, 33852);
    }

    //метод для получения списка всех сотрудников со всеми данными
    public static void printEmployee(Employee[] employee) {
        for (Employee employee1 : employee) {
            if (employee1 != null) {
                System.out.println(employee1.toString());
            }
        }
    }

    //метод для получения списка сотрудников в формате Ф.И.О.
    public static void getAllEmployees() {
        if (employees != null) {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = {4, 9, 3, 22, 5, 18, 25, 7, 21, 14, 18};
        System.out.println(args.toString());
        System.out.println("Минимальное значение - " + getMin(arr));
        System.out.println("Максимальное значение - " + getMAX(arr));
        getMin(arr);
        getMAX(arr);
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    public static int getMAX(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double getAverageSalary() {
        double sum = getAverageSalary();
        int count = countEmployees();
        return sum / count;
    }
    public static int countEmployees() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count;
    }


}

