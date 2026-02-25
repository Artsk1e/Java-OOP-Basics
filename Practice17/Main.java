
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        employees[0] = new FullTimeEmployee("Art");
        employees[1] = new Contractor("Shang");

        for (Employee a : employees){
            a.calculatePay();
        }
    }
}
