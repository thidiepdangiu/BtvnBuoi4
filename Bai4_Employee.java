import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);
	private String id;
	private String name;
	private int age;
	private int workingDays;
	private double salary;
	private final int PRICE = 50;

	public Employee(String id, String name, int age, int workingDays) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.workingDays = workingDays;
	}

	public Employee() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	public double salary() {
		return workingDays * PRICE;
	}

	public void input() {
		System.out.print("Nhập id: ");
		id = sc.nextLine();
		System.out.print("Nhập tên: ");
		name = sc.nextLine();
		System.out.print("Nhập tuổi: ");
		age = sc.nextInt();
		System.out.print("Nhập số ngày công: ");
		workingDays = sc.nextInt();
	}

	public void output() {
		System.out.println("Thông tin nhân viên:\n" + "Mã nhân viên: " + id + "\nTên: " + name + "\nTuổi: " + age
				+ "\nSố ngày công: " + workingDays + "\nLương: " + salary());
	}

}
