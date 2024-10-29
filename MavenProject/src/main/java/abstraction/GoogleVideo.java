package abstraction;

public class GoogleVideo extends GoogleClass {
	public void search()
	{
		System.out.println("Google videos");
	}

	public static void main(String[] args) {
		GoogleVideo obj=new GoogleVideo();
		obj.search();
		GoogleImage obj1=new GoogleImage();
		obj1.search();

	}

}
