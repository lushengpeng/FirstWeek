package oop;

public class Base {

	protected int width;
	protected int height;
	
	public static void test(){System.out.println("hah");}
	
	public  Base(){
		width = 1;
		height =1;
		System.out.println("默认构造函数：");
		System.out.println("width:"+width+","+"height:"+height+"\n");
	}
	
	public Base(int width, int height){
		this.width = width;
		this.height = height;
		System.out.println("带参数的构造函数：");
		System.out.println("width:"+width+","+"height:"+height+"\n");
	}
	
	public void setWidth(int x){
		width =  x;
	}
	
	public void setHeight(int x){
		height = x;
	}
	
	public int getWidth(){
		System.out.println("Width:"+width);
		return width;
	}
	
	public int getHeight(){
        System.out.println("Height:"+height);
		return height;
	}
	
	
}

class Desk extends Base{
	public Desk(){
		super(9,9);//直接调用父类的带参构造函数
	}
}

class Desk1 extends Base{
	public  Desk1(){
		//首先会调用父类中的无参构造函数，再调用子类中的
		width = 7 ;
		height = 8;
		System.out.println("width:"+this.width+","+"height:"+height+"\n");
	}
}
