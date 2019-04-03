import java.io.BufferedReader;
import java.io.File;
import static java.io.FileDescriptor.in;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import studentgpaandınformationsystem.StudentSystem;

    public class StudentGPAandInformationSystem {
    static ArrayList<StudentSystem> studentList = new ArrayList<StudentSystem>();
    static ArrayList<Grades> studentLists = new ArrayList<Grades>();

    public static void main(String[] args) 
            
    {
        ArrayList<StudentSystem> studentsList = new ArrayList<>(); 
      try{


           ArrayList<StudentSystem> students = new ArrayList<StudentSystem>();
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter filename: "); 
           String fileName = scanner.next();
           File file = new File(fileName);

            if (!file.exists()) {
                throw new FileNotFoundException("file not exits");
            }

            BufferedReader reader = new BufferedReader(new FileReader(file)); 
            String currentline = "";
            while ((currentline = reader.readLine()) != null) {

                String[] linearray = currentline.split(",");
                for (int i=0;i<linearray.length;i++) {
                        String record = linearray[i];
                        String[] r1 = record.split(" ");
                        StudentSystem student = new StudentSystem();
                        StudentSystem.setID(r1[1]);
                        StudentSystem.setname(r1[0]);
                        StudentSystem.setSurname(r1[0]);
                        StudentSystem.setgrade(Double.parseDouble(r1[2]));
                        
                }

            }       

            System.out.println(students);



        }catch(Exception e){
            e.printStackTrace();
        
        menu();
    }
    }
    public static StudentSystem[] selectionSort(StudentSystem[] studentList)
{

    for(int i = 0; i <studentList.length-1; i++)
    {
        int minIndex = studentList[i].getgrade();
        int pos = i;

        for(int j = i + 1; j < studentList.length-2; j++)
        {

            if(studentList[j].getgrade() > studentList[minIndex].getgrade())
            {

                minIndex = studentList[j].getgrade();
                pos = j;

            }

        }

        int temp = studentList[pos].getgrade();
        studentList[pos] = studentList[i];
        int k = studentList[i].getgrade();
        k = temp;

    }
    return studentList;
}
    public static void bubbleSort(StudentSystem [] arrStudents) {
int t, swap = 0;

do {
    swap = 0;
    for (int i=0; i<arrStudents.length-1; i++){
    int grade = arrStudents[i].getgrade();
    int gradePlus = arrStudents[i+1].getgrade();
       if (grade>grade+1) {
           t=grade;
           grade=gradePlus;
           gradePlus=t;
           swap++;              
       }
    }
} while (swap>0); 
}
    
    
    public static void menu() 
    {
        Scanner in = new Scanner(System.in);

        int choice = 0;

        System.out.print("****STUDENT SYSTEM****\n\n");
        System.out.println("\t MENU ");
        System.out.println("[1]ADD STUDENT");
        System.out.println("[2]VIEW STUDENTS");
        System.out.println("[3]SEARCH INFORMATION");
        System.out.println("[4]UPDATE");
        System.out.println("[5]DELETE");
        System.out.println("[6]GPA(AVERAGE)");
        System.out.println("[7]EXIT");
        System.out.println("?");

        choice = in.nextInt();
        if (choice == 1) 
        {
            add();
        }

        else if (choice == 2) 
        {
            viewstudents();
        }

        else if (choice == 3) 
        {
            studentinformation();
        }

        else if (choice == 4) 
        {
            update();
        }
        else if (choice == 5) 
        {
            delete();
        }

        else if (choice == 6)
        {
            average();
        }


        else if( choice == 7)
        {
        System.exit(0);
        }

        else
            menu();

    }

    public static void add() 
    {
        Scanner in = new Scanner(System.in);
        char ans;
        String temp;

        int total;

        do {

            System.out.println("NUMBER OF STUDENTS YOU WANT TO INPUT: ");
            total = in.nextInt();

            StudentSystem[] student = new StudentSystem[total];

            for (int index = 0; index < student.length; index++) {
                student[index] = new StudentSystem();

                System.out.print("****STUDENT INFORMATION****\n\n");
                System.out.println("ENTER FOR INFORMATION");
                in.nextLine();
                
                System.out.print("ID NO: ");
                student[index].setidno(in.nextLine());

                System.out.print("NAME: ");
                student[index].setFName(in.nextLine());

                System.out.print("SURNAME: ");
                student[index].setSName(in.nextLine());

                studentList.add(student[index]);
            }

            System.out.print("Would you like to enter in a new student (y/n)? ");
            String answer = in.next();
            ans = answer.charAt(0);

        } while (ans == 'y');

        
        String id = new String();
        in.nextLine();
        System.out.print("Enter ID NO: ");
        id = in.nextLine();

        for (int j = 0; j < studentList.size(); j++) {
            if (id.equals(studentList.get(j).getidno())) {
                System.out.printf("STUDENT SEARCHED");
                System.out.print("\nID NO:" + studentList.get(j).getidno());
                System.out.print("\nNAME: "+ studentList.get(j).getFName() + " "+ studentList.get(j).getSName());
                System.out.println();
            }
        }
       
        for (int i = 0; i < studentList.size(); i++) {
            System.out.printf("STUDENT[%d]", i + 1);
            System.out.print("\nID NO: " + studentList.get(i).getidno());
            System.out.print("\n NAME: " + studentList.get(i).getFName() + " "+ studentList.get(i).getSName());
            System.out.println();
        } 

        menu(); 

    }

    public static void  viewstudents() {
        Scanner in = new Scanner(System.in);
        if(studentList.size() == 0)
        {
            System.out.print("Wrong Input!!\n");
            in.nextLine();
        }
        else
        {
            if(studentLists.size() == 0){
                System.out.print("****STUDENT INFORMATION****");

                for (int i = 0; i < studentList.size(); i++) {
                  System.out.printf("\nSTUDENT[%d]", i + 1);
                  System.out.print("\nID NO: " +   studentList.get(i).getidno());
                  System.out.print("\nNAME: "+ studentList.get(i).getFName()+" "+ studentList.get(i).getSName() );
                 


                }
                in.nextLine();
            }

            else{
                System.out.print("****STUDENT INFORMATION****");

                for (int i = 0; i < studentList.size(); i++) 
                {
                 System.out.printf("\nSTUDENT[%d]", i + 1);
                 System.out.print("\nID NO: " + studentList.get(i).getidno());
                 System.out.print("\nNAME: "+ studentList.get(i).getFName()+" "+ studentList.get(i).getSName() );
                }

                for(int t = 0 ; t < studentLists.size(); t++ )
                {
             System.out.printf("\nCourse: "+   studentLists.get(t).getcourse()+" "+ "Grade: "  +studentLists.get(t).getgrade());
                }
                in.nextLine();
            }
        }
    menu();
    }

    public static void studentinformation() {
        Scanner in = new Scanner(System.in);
        if(studentList.size() == 0)
        {
            System.out.print("Wrong Input!\n");
            in.nextLine();
        }
        else
        {
            String id = new String();
            
            System.out.print("Enter ID NUMBER: ");
            id = in.nextLine();
            if(studentLists.size()==0)
            { 
                int i = 0;
                for (int j = 0; j < studentList.size(); j++) 
                {
                    if (id.equals(studentList.get(j).getidno())) 
                    {
                     System.out.printf("\n****STUDENT    SEARCHED****");
                     System.out.print("\nID NUMBER: "+ studentList.get(j).getidno());
                     System.out.print("\nNAME: "+ studentList.get(i).getFName()+" "+ studentList.get(i).getSName() );
                        System.out.println();
                        in.nextLine();
                    }
                }
            }

            else
            { 
                int i = 0;
                for (int j = 0; j < studentList.size(); j++) 
                {
                        if  (id.equals(studentList.get(j).getidno())) 
                        {
                   System.out.printf("\n****STUDENT SEARCHED****");
                   System.out.print("\nID NUMBER: "+ studentList.get(j).getidno());
                   System.out.print("\nNAME: "+ studentList.get(i).getFName()+" "+ studentList.get(i).getSName() );
                  
                            System.out.println();
                        }
                }
                for(int xxx = 0 ; xxx < studentLists.size(); xxx++ )
                {
                 System.out.printf("\nSUBJECT: "+ studentLists.get(xxx).getcourse()+" Grade: "+  studentLists.get(xxx).getgrade());
                }
                in.nextLine();
            }
        }
        menu();
    }

    public static void update()
    {
        Scanner in = new Scanner(System.in);
        String idno = new String();    
        char answer;
        in.nextLine();
        System.out.print("Enter ID NO: ");
        idno = in.nextLine();
        int total;

        for(int x=0;x<studentList.size();x++)
        {
            if(idno.equals(studentList.get(x).getidno()))
            {
                    System.out.println("NUMBER OF COURSE YOU WANT TO  INPUT: ");
                    total = in.nextInt();
                do
                {
                        Grades[] update = new Grades[total];

                        for(int y = 0;y<update.length;y++)
                        {
                            update[y] = new Grades();

                            in.nextLine();
                            System.out.print("ENTER COURSE:  ");
                            update[y].setcourse(in.nextLine());

                            System.out.print("ENTER GRADE: ");
                            update[y].setgrade(in.nextDouble());

                            studentLists.add(update[y]);
                        }

                        System.out.print("Are you sure to update the student’s information ? [y/n]");
                        String ans = in.next();
                        answer = ans.charAt(0);

                }while(answer == 'y');

            }

        menu();
        }
    }
   
    private static void delete()
{
   int initialSize = studentList.size(); 
   String idno = new String(); 
   for (int i=0;i<studentList.size();i++){          

      if(idno.equals(studentList.get(i).getidno())){studentList.remove(i);
      }

   } 
   
   if(initialSize == studentList.size()){      
       System.out.println("Student with ID "+idno+" was not found");       
   }     

     }

    public static void average()
    {
            Scanner in = new Scanner(System.in);

            double sum = 0;
            double average=0;
            String ID = new String();

            System.out.print("ENTER ID NO: ");
            ID = in.nextLine();

            for(int x=0;x<studentList.size();x++)
            {
                if(ID.equals(studentList.get(x).getidno()))
                {
                    for(int ind=0;ind<studentLists.size();ind++)
                    {
                            
                            average=sum/studentLists.size();

                    }
    System.out.print("ID NO:"+studentList.get(x).getidno()+"\nNAME: "+studentList.get(x).getFName()+" "+studentList.get(x).getSName());
    System.out.print("\nAVERAGE: "+average+"\n");
    in.nextLine();
                }
            }
    menu();
    }
    }
    

