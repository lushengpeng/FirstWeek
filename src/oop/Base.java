package oop;

public class Base {

	protected int width;
	protected int height;
	
	public static void test(){System.out.println("hah");}
	
	public  Base(){
		width = 1;
		height =1;
		System.out.println("Ĭ�Ϲ��캯����");
		System.out.println("width:"+width+","+"height:"+height+"\n");
	}
	
	public Base(int width, int height){
		this.width = width;
		this.height = height;
		System.out.println("�������Ĺ��캯����");
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
		super(9,9);//ֱ�ӵ��ø���Ĵ��ι��캯��
	}
}

class Desk1 extends Base{
	public  Desk1(){
		//���Ȼ���ø����е��޲ι��캯�����ٵ��������е�
		width = 7 ;
		height = 8;
		System.out.println("width:"+this.width+","+"height:"+height+"\n");
	}
}
