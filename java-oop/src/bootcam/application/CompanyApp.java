package bootcam.application;

import bootcam.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Ahli BackEnd");

        Company.Employee employee = company.new Employee();
        employee.setName("Dani Imdadur");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company1 = new Company();
        company1.setName("Pengkhianat");

        Company.Employee employee1 = company1.new Employee();
        employee1.setName("Tevez");

        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());
    }
}
