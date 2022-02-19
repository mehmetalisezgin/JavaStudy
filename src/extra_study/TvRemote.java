package extra_study;

class Remote {
	
	  private boolean OnValue;
	  
	  Remote() {
	    OnValue = false;
	  }
	  public void changeOnValue() {
	    System.out.println("The OnValue of the remote has toggled. Check TV ");
	    OnValue = !OnValue;
	  }
	}
	public class TvRemote {
	  public static void main(String[] args) {
	    Remote remote = new Remote();
	    remote.changeOnValue();; //Equivalent to pressing the "Switch On" button on the remote once;
	    remote.changeOnValue();// OnValue variable ismi changeOnValue method ismi
	    remote.changeOnValue();
	  }
	}