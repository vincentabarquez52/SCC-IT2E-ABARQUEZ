package abarquezproj;

import java.util.Scanner;

public class NewGrades {
    
    public void getGrades(){
        
        Scanner sc = new Scanner(System.in);
        Grades [] gr = new Grades[100];
        
        System.out.println("Enter no. of students: ");
        int snum = sc.nextInt ();
        
        for(int i = 0; i < snum; i++){
            System.out.println("Enter detail of student: " + (i + 1));
            
            System.out.println("ID: ");
            int id = sc.nextInt();
            
            System.out.println("Name: ");
            String name = sc.nextLine();
            
            System.out.println("P: ");
            double spre = sc.nextDouble();
            
            System.out.println("M: ");
            double smid = sc.nextDouble();
            
            System.out.println("PF: ");
            double sprefi = sc.nextDouble();
            
            System.out.println("F: ");
            double sfin = sc.nextDouble();
            
            gr[i] = new Grades();
            gr[i].addGrades(id, name, spre, smid, sprefi, sfin);
                
    }
    double TCA = 0;
    int passed = 0;
    int failed = 0;
    

}
}