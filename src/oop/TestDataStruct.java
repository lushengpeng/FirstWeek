package oop;

public class TestDataStruct<T> implements TestInterface,TestInterface1<T>{
	
	public int compare(int first,int second){
		if(first == second)  return 0;
		else if (first > second) return 1;
		return -1;
	}
	
	//@override
	//字符就是比较大小
	public <T>T add(T a, T b){
		if(a instanceof Integer&& b instanceof Integer)  
          {
			int x= (Integer) a;
			int y =(Integer) b;
			String tmp = String.valueOf(x+y);
			return (T) tmp;
			}
		else if (a instanceof String && b instanceof String) 
			{
			String x = (String)a;
			String y = (String)b;
			String result = "一样";
			if(x.compareTo(y)== 0)
			{
				//String result = "一样";
			   return (T) result;	
			}else if(x.compareTo(y)>0)
			{
				return (T) a;
			}else
			{
				return (T) b;
			}
				
//			System.out.println("String");
//			return a;
			}
		    else 
			    return a;
		
		
	}
		
}		



