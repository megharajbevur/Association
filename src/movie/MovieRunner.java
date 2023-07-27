package movie;

public class MovieRunner {

	public static void main(String[] args) {

Auditor d = new Auditor();
System.out.println(d.adharNo);
System.out.println("************************");

Company e =d.a;
System.out.println(e.name);
System.out.println(e.location);
System.out.println("--------------------------");

Producer f = e.b;
System.out.println(f.budget);
System.out.println(f.mobilNo);


	}

}
