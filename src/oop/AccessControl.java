package oop;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.crypto.Data;

public class AccessControl {
	public static void main(String[] args){
		System.out.println("Hello world\n");
		
	    testBoolean();
	    testString();
	    testDate();
		testDataStructure();
	    testConstructor();
	    testDataStructure();
	    testLink();
	    testSet();
	    testMap();
	    
	}
	
	
	public static void testLink(){
		{//迭代器 
		ArrayList<String> l = new ArrayList<String>();
		l.add("lu");
		l.add("shengpeng");
		l.add("peng");
		Iterator<String> iter =l.iterator();
		iter.next();
		iter.remove();
		for (;iter.hasNext();){
			String str = (String)iter.next();
			System.out.println(str);
		}
		
		List<String> testLinkList = new ArrayList<>();
		testLinkList.add("lu");
		testLinkList.add("sheng");
		testLinkList.add("peng");
		ListIterator iter1 = testLinkList.listIterator();
		for(;iter1.hasNext();)
		{
			System.out.println(iter1.next());
		}
		
		for(;iter1.hasPrevious();)
		{
			System.out.println(iter1.previous());//需要指向最后一个
		}
		
		}

		
		{//LinkedList  &  ArrayList 
			//List<String> testLinkList = new LinkedList<>();
			List<String> testLinkList = new ArrayList<>();
			testLinkList.add("lu");
			testLinkList.add("sheng");
			testLinkList.add("peng");
			String password ="sheng";
			Boolean result = true;
			for(String tmp:testLinkList){
				if(password.equals(tmp)) 
					{
					result = false;   break;
					}
			}
			if(!result.booleanValue())
			{
				System.out.println("与上三次密码相同");
			}
			else
			{
				System.out.println("Right");
			}
			//printLink(testLinkList);
			testLinkList.remove("sheng");
			testLinkList.remove(1);
			//printLink(testLinkList);
			testLinkList.add(1, "abc");//序号需要自己判断；
			//printLink(testLinkList);
			testLinkList.add("123");//该方法默认在最后添加
			//printLink(testLinkList);
		    //System.out.println(testLinkList.size());
		    //System.out.println(testLinkList.contains("123"));
		    //System.out.println(testLinkList.isEmpty());
		    
		    //组操作
		    testLinkList.clear();
		    System.out.println(testLinkList.isEmpty());
			testLinkList.add("a");
			testLinkList.add("b");
			testLinkList.add("c");
			testLinkList.add("d");
			//printLink(testLinkList);
			
			List testLinkList1 = new LinkedList();
			testLinkList1.add("a");
			testLinkList1.add(1, "b");
			//testLinkList1.add(1, "c");//自动后移
			testLinkList1.add(2, "c");
			//printLink(testLinkList1);
			
			testLinkList.containsAll(testLinkList1); //并集
			//printLink(testLinkList);
			//testLinkList.removeAll(testLinkList1);//除去A中，并且在B中出现的元素
			testLinkList.retainAll(testLinkList1);//交集
			//printLink(testLinkList);
			
			testLinkList.addAll(testLinkList1);
			//printLink(testLinkList);
			System.out.println(testLinkList.get(3));
			System.out.println(testLinkList.indexOf("g"));//返回第一次出现的位置；不存在时 返回负数
			System.out.println(testLinkList.indexOf("c"));
			System.out.println(testLinkList.lastIndexOf("g"));
			System.out.println(testLinkList.lastIndexOf("b"));
			testLinkList.remove(1);
			System.out.println("\n\n");
			printLink(testLinkList);
			System.out.println(testLinkList.set(1, "replace"));
			printLink(testLinkList);
			
			//
		}
	}
	
	
	public static void testSet(){
		System.out.println("Begain testSet==========");
		HashSet  testHashSet = new HashSet();
		HashSet  testHashSet1 = new HashSet();
//		TreeSet  testHashSet = new TreeSet();
//		TreeSet  testHashSet1 = new TreeSet();
		
		System.out.println(testHashSet.size());
	
		testHashSet.add(null);
		testHashSet.add(null);  //成功插入一个
		System.out.println(testHashSet.size());
		testHashSet.clear();
		
		
		for(int i=0; i<10 ;i ++)
		{
			testHashSet.add(i);
		}
//		printSet(testHashSet);
		testHashSet.remove(2);
//		printSet(testHashSet);
//		System.out.println("size:"+testHashSet.size()+";isEmpty:"+testHashSet.isEmpty()+";contain 8?:"+testHashSet.contains(8));
		testHashSet.clear();
//		printSet(testHashSet);
//		System.out.println("size:"+testHashSet.size()+";isEmpty:"+testHashSet.isEmpty()+";contain 8?:"+testHashSet.contains(8));
		for(int i=0; i<5 ;i ++)
		{
			testHashSet.add(i);
		}
		//printSet(testHashSet);
		for(int i=3; i<8 ;i ++)
		{
			testHashSet1.add(i);
		}
		//printSet(testHashSet1);
		//testHashSet.containsAll(testHashSet1);//。。
		//testHashSet.addAll(testHashSet1);// 取并集
		//testHashSet.removeAll(testHashSet1);
		testHashSet.retainAll(testHashSet1);
		Integer tmp[] =new Integer[10];
		testHashSet.toArray(tmp);
		System.out.println(tmp.length);
		printSet(testHashSet);
		for(int i=0; i< tmp.length; i++)
			{
			System.out.println(tmp[i]);
			}
		testHashSet.clear();
		testHashSet1.clear();
		
		for(int i=10; i>5 ;i --)
		{
			testHashSet.add(i);  //测试内部进行排序，
		}
		
		for(int i=15; i>2 ;i --)
		{
			testHashSet.add(i);  //内部进行排序，
		}
		//testHashSet.add(null);
		//testHashSet.add(null);   
		printSet(testHashSet);
		
	}
	
	public static void testMap(){
		
	}
	
	protected static void printSet(Set set) {
		Iterator iter = set.iterator();
		for(;iter.hasNext();)
		{
			System.out.println(iter.next());
		}
	}
	
	protected static void printLink(List list) {
		Iterator iter = list.iterator();
		for(;iter.hasNext();)
		{
			System.out.println(iter.next());
		}
	}
	
	public static void testDate(){
		Date data1 = new Date();
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(data1);
		cal1.set(2015, 7, 8);
		System.out.println(cal1.getFirstDayOfWeek());
		cal1.setFirstDayOfWeek(0);
		System.out.println(cal1.getFirstDayOfWeek());
		cal1.add(Calendar.DAY_OF_MONTH, 3);;
		data1 = cal1.getTime();
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		System.out.println("data1:"+data1);
		System.out.println(dataFormat.format(data1));
	}
	
	public static void testDataStructure(){
		//实现接口      泛型接口
		TestDataStruct testDS = new TestDataStruct();
		int result = testDS.compare(5, 10);
		System.out.println(result);
		System.out.println(testDS.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "bbbbbbbbbbbbbbbbbbbbbbbbbbb"));
	}
	
	public static void testConstructor(){
		Base  withNoParameter = new Base();
		Base  withParameter = new Base(10,20);
		withNoParameter.setHeight(20);
		withNoParameter.setWidth(40);
		int height = withNoParameter.getHeight();
		int width = withNoParameter.getWidth();
		
		Desk A = new Desk();//默认构造函数被继承
		Desk1 B = new Desk1();
	}
	
	public static void testBoolean(){
		System.out.println("Boolean===========================================================");
		boolean bool1 = true ;
		boolean bool2 = false;
		Boolean Bool1 = new Boolean(true); //没有默认构造函数
		Boolean Bool2 = new Boolean(false);
		//Bool ===> bool
		System.out.println(Bool1.booleanValue()); //true
		System.out.println(Bool1.toString()); //true
		int temp = Boolean.compare(Bool1, Bool2);
		System.out.println(temp);//1
		System.out.println(Bool1.hashCode());//1231
		System.out.println(Bool1.compareTo(bool2));//1
		System.out.println(Bool1.equals(Bool2));//false
	
	}
	
	public static void testString() {
		System.out.println("\nString===========================================================");
		double double1 = 2.9888;
		String string1 = String.valueOf(double1);
		System.out.println(string1);
		char[] char1 = new char[10];
		string1 = "lushengpeng111111111111111111111111111111111111111121";
		char1 = string1.toCharArray();
		String string3 = new String(char1);
		
		System.out.println(string3.trim().length());
		System.out.println(String.copyValueOf(char1));
		System.out.println(String.copyValueOf(char1, 2, 5));
		String string2 = new String(char1, 3, 5);
		System.out.println(string2);
		System.out.println(string1.length());

	}
}
