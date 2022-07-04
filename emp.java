import java.sql.Date;
import java.util.Scanner;

class employee
{
    int ssn,sal;
    String name,dob;
    employee(int ssn,String name,int sal,String dob)
    {
        this.ssn=ssn;
        this.name=name;
        this.sal=sal;
        this.dob=dob;

    }
    //void getdata(int sn,int s,String n,Date d)
   // {
       // ssn=sn;
       // sal=s;
        //name=n;
       // dob=d;

    //}
    void display()
    {
        System.out.println("Employee no:"+ssn);
        System.out.println("Employee Name:"+name);
        System.out.println("Salary:"+sal);
        System.out.println("DOB:"+dob);
    }
}




public class emp {
    public static void main(String[] args) {
        int ssn,sal,i;
        String name,dob;
        employee [] e=new employee[5];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("Enter emp no");
            ssn=sc.nextInt();
            System.out.println("Enter name");
            name=sc.next();
            System.out.println("Enter salary");
            sal=sc.nextInt();
            System.out.println("Enter DOB");
            dob=sc.next();
            e[i]=new employee(ssn,name,sal,dob);



        }
        for(i=0;i<5;i++)
        {
            e[i].display();
        }
    }
    
}
