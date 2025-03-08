public class Transcript {
    public static void main(String[] args) {
        // declaring variable
        int pf = 98 ;
        int pflab = 93;
        int ap = 84;
        int english = 93;
        int calculus = 87;

        // Header
        System.out.println("\t\t\t\t\t\t--------------------");
        System.out.println("\t\t\t\t\t\tDHA SUFFA UNIVERSITY");
        System.out.println("\t\t\t\t\t\t--------------------");

        // Transcript details
        System.out.println(" \t\t\t\t\t\t\t Transcript");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Name = Your Name \t\t\t\t\t\t\t Roll no. = Your Roll Number");
        System.out.println("---------------------------------------------------------------------------");

        // Subject marks
        System.out.println("Subject\t\t\t\t\t\t\t\t\t\t\t\t\tMarks");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Programming Fundamentals  \t\t\t\t\t\t\t\t  "+ pf);
        System.out.println("Programming Fundamentals Lab  \t\t\t\t\t\t\t  "+ pflab);
        System.out.println("Applied Physics   \t\t\t\t\t\t\t\t\t\t  " + ap);
        System.out.println("English\t\t\t\t\t\t\t\t\t\t\t\t\t  " + english);
        System.out.println("Calculus  \t\t\t\t\t\t\t\t\t\t\t\t  "+ calculus );
        System.out.println("---------------------------------------------------------------------------");

        // Percentage and CGPA
        double totalMarks = pf + pflab + ap + english + calculus;
        double percentage = (totalMarks / 500) * 100;
        double cgpa = 4.0;

        System.out.println("Percentage =  \t\t\t\t\t\t\t\t\t\t   " + percentage + "%");
        System.out.println("CGPA = \t\t\t\t\t\t\t\t\t\t\t\t\t " + cgpa);
    }
}
