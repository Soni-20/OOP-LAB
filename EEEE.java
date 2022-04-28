package co3;

class EEEE
{
	public int id;
	public String name;
	public void setData(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println("student id is: "+id+"student name is:"+name);
		System.out.println();
	}


	public static void main(String[] args) {
		int a,c;
		String b,d;
		a=11;
		b="ss";
		c=12;
		d="tt";
		student[] arr;
		arr=new student[2];
		arr[0]=new student();
		arr[1]=new student();
		arr[0].setData(a,b);
		arr[1].setData(c,d);
		System.out.println("first student");
		arr[0].display();
		System.out.println("second student");
		arr[1].display();
	
		

	}

}
