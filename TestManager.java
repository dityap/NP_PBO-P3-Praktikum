public class TestManager {
public static void main(String[] args){
    Manager Utama = new Manager("Jhon",5000000,"Financial");
    System.out.println("Name:"+ Utama.GetName());
    System.out.println("Salary:"+ Utama.GetSalary());
    System.out.println("Department:"+ Utama.GetDept());
    
    Utama = new Manager("Michael", "Accounting");
    System.out.println("Name:"+ Utama.GetName());
    System.out.println("Salary:"+ Utama.GetSalary());
    System.out.println(Utama.GetDept()+ "Department:");

}     
}
