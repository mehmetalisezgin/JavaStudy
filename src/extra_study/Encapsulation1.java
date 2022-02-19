package extra_study;

class DataFlair {
  private String course;
  DataFlair() {
    course = "Java";
  }
  public String getCourse()
    {
        return course;
    }
  public void setCourse(String course) {
    this.course = course;
  }
  
}
public class Encapsulation1 {
  public static void main(String[] args) {
    DataFlair df = new DataFlair();
    df.setCourse("java");
    
    System.out.println(df.getCourse());
    //System.out.println(df.getCourse());
    System.out.println();
    
  }
}