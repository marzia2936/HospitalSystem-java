
package hospitalmanagementsystem;

public class Main {

    public static void main(String[] args) {
        Doctor d1 = new Doctor("Good");
        
        Report r1 = new Report("Noraml","Green");
        
        d1.checking_report(r1);
        
        Admin a1= new Admin();
        
        a1.giving_salary(d1);
    }
    
}
