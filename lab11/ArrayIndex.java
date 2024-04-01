package lab11;

public class ArrayIndex {
	public static void main(String args[])
	{
		int arr[] = new int[100];
		try {
			System.out.println(arr[100]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
}
