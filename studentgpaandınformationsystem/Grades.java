package  StudentGPAandInformationSystem;

public class Grades {
        private String id;
        private String course;
        private double grade;
        private double average;

        public Grades()
        {
            String id;
            String course;
            double grade;
            double average;

        }

        public Grades(String id,String course,double grade,double average)
        {
            this.id=id;
            this.course=course;
            this.grade=grade;
            this.average=average;

        }

        public void setcourse(String subject)
        {
            this.course=course;
        }
        public String getcourse()
        {
            return course;
        }

        public void setGrade(double grade)
        {
            this.grade=grade;
        }
        public double getGrade()
        {
            return grade;
        }

        public String getid()
        {
            return id;
        }

    }
