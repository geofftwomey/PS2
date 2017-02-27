package pkgEmpty;

public class MyInteger {

private int value;
	
	public int iValue() 
	{
		return value;
	}
	private void setValue(int value)
	{
		this.value = value;
	}
	
	public MyInteger(int value)
	{
		setValue(value);
	}
	
	public boolean isEven()
	{
		if (this.iValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isEven(int value)
	{
		if (value % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isEven(MyInteger myInt)
	{
		if (myInt.iValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isOdd()
	{
		if(this.iValue() % 2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isOdd(int value)
	{
		if(value % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isOdd(MyInteger myInt)
	{
		if (myInt.iValue() % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isPrime()
	/* Only up to 100**/
	{
		if (this.iValue() % 2 != 0 &&
			this.iValue() % 3 != 0 && 
			this.iValue() % 5 != 0 &&
			this.iValue() % 7 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isPrime(int value)
	{
		if (value % 2 != 0 &&
			value % 3 != 0 && 
			value % 5 != 0 &&
			value % 7 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isPrime(MyInteger myInt)
	{
		if (myInt.iValue() % 2 != 0 &&
			myInt.iValue() % 3 != 0 && 
			myInt.iValue() % 5 != 0 &&
			myInt.iValue() % 7 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean equals(int q)
	{
		if (this.iValue()==q)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean equals(MyInteger myInt,int q)
	{
		if (myInt.iValue()==q)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int parseInt(char[] list)
	{
		int ans = 0;
		for (int i = 0;i<list.length;i++)
		{
			ans = ans + Character.getNumericValue(list[i]);
		}
		return ans;
	}
	public static int parseInt(String s)
	{
		int stoint = Integer.parseInt(s);
		return stoint;
	}
}
