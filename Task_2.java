import java.util.Scanner;
class Task_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        double maths,eng,sci,hin,ss,avg,total;
        String grade;

        System.out.println("Enter marks obtained in Maths:");
        maths=sc.nextDouble();
        System.out.println("Enter marks obtained in English:");
        eng=sc.nextDouble();
        System.out.println("Enter marks obtained in Science:");
        sci=sc.nextDouble();
        System.out.println("Enter marks obtained in Hindi:");
        hin=sc.nextDouble();
        System.out.println("Enter marks obtained in Social Science:");
        ss=sc.nextDouble();
        total=maths+eng+sci+hin+ss;
        avg=total/5;

        if(avg<=100 && avg>=91)
        {
            grade="A*";
             System.out.println("");
        System.out.println("");
        System.out.println("******RESULT******");
        System.out.println("Total Marks:"+ total);
        System.out.println("Percantage:"+ avg + "%");
        System.out.println("Grade:"+ grade);
        }

        else if(avg<=90 && avg>=81)
        {
            grade="A+";
             System.out.println("");
        System.out.println("");
        System.out.println("******RESULT******");
        System.out.println("Total Marks:"+ total);
        System.out.println("Percantage:"+ avg + "%");
        System.out.println("Grade:"+ grade);
        }

        else if(avg<=80 && avg>=71)
        {
            grade="A";
             System.out.println("");
        System.out.println("");
        System.out.println("******RESULT******");
        System.out.println("Total Marks:"+ total);
        System.out.println("Percantage:"+ avg + "%");
        System.out.println("Grade:"+ grade);
        }

        else if(avg<=70 && avg>=61)
        {
            grade="B+";
             System.out.println("");
        System.out.println("");
        System.out.println("******RESULT******");
        System.out.println("Total Marks:"+ total);
        System.out.println("Percantage:"+ avg + "%");
        System.out.println("Grade:"+ grade);
        }

        else if(avg<=60 && avg>=51)
        {
            grade="B";
             System.out.println("");
        System.out.println("");
        System.out.println("******RESULT******");
        System.out.println("Total Marks:"+ total);
        System.out.println("Percantage:"+ avg + "%");
        System.out.println("Grade:"+ grade);
        }

        else if(avg<=50 && avg>=41)
        {
            grade="C";
             System.out.println("");
        System.out.println("");
        System.out.println("******RESULT******");
        System.out.println("Total Marks:"+ total);
        System.out.println("Percantage:"+ avg + "%");
        System.out.println("Grade:"+ grade);
        }

       else  if(avg<=40 && avg>=0)
        {
            grade="Fail";
             System.out.println("");
        System.out.println("");
        System.out.println("******RESULT******");
        System.out.println("Total Marks:"+ total);
        System.out.println("Percantage:"+ avg + "%");
        System.out.println("Grade:"+ grade);
        }

        else if(avg>100)
        {
            System.out.println("");
        System.out.println("");
            System.out.println("Don't Be Oversmart, Enter Correct Marks");
        }
        else
        {
            System.out.println("");
        System.out.println("");
            System.out.println("Enter Valid Marks!!");
        }

       
       

    }
}