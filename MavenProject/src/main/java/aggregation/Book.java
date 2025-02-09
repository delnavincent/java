package aggregation;

public class Book {
	String bookName;
	int pageNo;
	Author au;
	
	public Book(String bookName,int pageNo,Author au)
	{
		this.bookName=bookName;
		this.pageNo=pageNo;
		this.au=au;
	}
	
	public void print()
	{
		System.out.println("Book name is"+bookName);
		System.out.println("Page no is"+pageNo);
		System.out.println("Author name is"+au.name);
		System.out.println("Year is"+au.year);
		System.out.println("Language is"+au.lang);
	}

	public static void main(String[] args) {
		Author obj=new Author("kalam",2002,"malayalam");
		Book obj1=new Book("Agnichirakukal",234,obj);
		obj1.print();
	}

}
