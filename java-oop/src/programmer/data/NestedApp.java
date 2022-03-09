package programmer.data;

public class NestedApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Programmer zaman now");
        System.out.println(company.getName());

        Company.Employee employee = company.new Employee();
        employee.setName("Fajar ");
        System.out.print(employee.getName());
        System.out.println(employee.getCompany());

        Company company1 = new Company();
        company1.setName("belum ada");

        Company.Employee employee1 = company1.new Employee();
        employee1.setName("Budi");

        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());
    }
}
