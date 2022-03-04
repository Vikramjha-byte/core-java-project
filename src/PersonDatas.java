import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class PersonInfo implements Comparable<PersonInfo> {
	int id;
	String name;
	int age;

	public PersonInfo(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonInfo [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(PersonInfo o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

}

class EmployeeName {

	public static int compareByName(PersonInfo o1, PersonInfo o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}

class EmployeeData implements Comparator<PersonInfo>{

	@Override
	public int compare(PersonInfo o1, PersonInfo o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

	
	
}
public class PersonDatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<PersonInfo> personInfo = new ArrayList<>();
		personInfo.add(new PersonInfo(101, "Vikram", 23));
		personInfo.add(new PersonInfo(102, "Anuradha", 24));
		personInfo.add(new PersonInfo(103, "Vinod", 50));
		personInfo.add(new PersonInfo(104, "Ranjana", 45));
		personInfo.add(new PersonInfo(105, "Raghav", 25));

		System.out.println("==============================Person Details============================================");

		for (PersonInfo personinfo : personInfo) {
			System.out.println(personinfo);
		}

		System.out.println(
				"==============================Person Details By Name============================================");

		Collections.sort(personInfo, (P1, P2) -> P1.name.compareTo(P2.name));
		for (PersonInfo personinfo : personInfo) {
			System.out.println(personinfo);
		}
		System.out.println(
				"==============================Person Details By Name using Method References============================================");

		Collections.sort(personInfo, PersonInfo::compareTo);
		personInfo.forEach(System.out::println);

		System.out.println(
				"==============================Person Details By Name using Method References: Comparator using comparing============================================");

		Collections.sort(personInfo, Comparator.comparing(PersonInfo::getName));
		personInfo.forEach(System.out::println);

		System.out.println(
				"==============================Person Details By Name using Method References: Comparator using class============================================");

		Collections.sort(personInfo, EmployeeName::compareByName);
		personInfo.forEach(System.out::println);
		
		System.out.println(
				"==============================Person Details By age>30 using Method References and Stream============================================");
		
		personInfo.stream().filter((e)->e.getAge()>30).map(PersonInfo::getId).distinct().forEach(System.out::println);
		
		System.out.println(
				"==============================Sum of Person Age============================================");
		
		Integer totalage=personInfo.stream().reduce(0, (x,person)->x+person.getAge(), Integer::sum);
		System.out.println(totalage);
		
		System.out.println(
				"==============================Person Details By Name using Method References: Comparator using object call============================================");

		EmployeeData emdata= new EmployeeData();
		Collections.sort(personInfo, emdata::compare);
		personInfo.forEach(System.out::println);
		
	
	}

}
