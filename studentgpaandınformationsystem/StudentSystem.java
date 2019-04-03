package studentgpaandınformationsystem;


public class StudentSystem {

    public static void setID(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setname(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setSurname(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setgrade(double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String id;
    private String Name;
    private String Surname;

    public StudentSystem()
    {
        String idno;
        String FName;
        String SName;   
    }
    public StudentSystem (String idno, String FName,  String SName)
    {
        this.id=idno;
        this.Name=FName;
        this.Surname=SName;
    }
    public void setidno(String idno)
    {
        this.id = id;
    }
    public String getidno()
    {
        return id;
    }

    public void setFName(String FName)
    {
        this.Name=Name;
    }
    public String getFName()
    {
        return Name;
    }

    public void setSName(String SName)
    {
        this.Surname=Surname;
    }
    public String getSurname()
    {
        return Surname;
    }

    public String getSName() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setGrades(double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getgrade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
