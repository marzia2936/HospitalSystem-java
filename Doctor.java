
package hospitalmanagementsystem;


public class Doctor {
    double salary;
    String performance;
  
    void checking_report(Report r1){
     
        if(r1.category=="Noraml" && r1.location=="Green"){
            System.out.println("Forwarded to Hospital");
        }   
        else if(r1.category=="Advanced" && r1.location=="Better"){
            System.out.println("Stay Here");
            
        }
        else{
            System.out.println("You are Good");
        }
                
       }
    Doctor(String performance1){
        performance=performance1;
    }
}
