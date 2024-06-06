public class Employee {



        private final int id; //id останется неизменным

        private String firstName;

        private String surName;

        private String middleName;

        private int department;

        private double salary;

        private static int counter;

        public Employee( String firstName, String surName, String middleName, int department, double salary) {
                if (department < 0 || department > 5) {
                        throw new IllegalArgumentException("Введено невалидное значение");}
                this.id = getCounter();
                this.firstName = firstName;
                this.surName = surName;
                this.middleName = middleName;
                this.department = department;
                this.salary = salary;
                counter++;
        }

        public int getId() {
                return id;
        }

        public String getFirstName() {
                return firstName;
        }

        public String getSurName() {
                return surName;
        }

        public String getMiddleName() {
                return middleName;
        }

        public int getDepartment() {
                return department;
        }

        public double getSalary() {
                return salary;
        }

        public static int getCounter() {
                return counter;
        }

        public void setSalary(double salary) {
                this.salary = salary;
        }

        public void setDepartment(int department) {
                if (department < 0 || department > 5) {
                        throw new IllegalArgumentException("Введено невалидное значение");
                }
                this.department = department;
        }
        public String getFullName() {
                return "Фамилия: " + firstName + " " + "Имя: " + surName + " " +  "Отчество: " + middleName + " "  + "Отдел:" + department + " " +  "Зарплата: " + salary;
        }

}

