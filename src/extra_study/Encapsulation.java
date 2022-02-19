package extra_study;

class DataFlair {
	  private String course;
	  DataFlair() {
	    course = "Java";
	  }
	  public String getCourse() {
	    return course;
	  }
	  
	    public String setCourse(String CourseString)
	    {
	        this.course=CourseString;
	    }
	    
	
	public class Encapsulation {
	  public static void main(String[] args) {
	    DataFlair df = new DataFlair();
	    System.out.println(df.getCourse());
	    //System.out.println(DataFlair.course);
	  }
	}
}