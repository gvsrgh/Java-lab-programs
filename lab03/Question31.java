package lab03;

import java.util.Scanner;

public class Question31 {
	public static void linearSearch(int arr[],int target)
	{
		for(int i =0;i<arr.length;i++)
			if(arr[i]==target)
			{
				System.out.println("Element "+target+" found at index: "+i);
				return;
			}
		System.out.println("Element "+target+" not found");
	}
	public static void binarySearch(int arr[],int target)
	{
		int low = 0, high = arr.length-1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(arr[mid]==target)
			{
				System.out.println("Element "+target+" found at index: "+mid);
				return;
			}
			else if(target<arr[mid])
				high = mid-1;
			else
				low = mid+1;
		}
		System.out.println("Element "+target+" not found");		
	}
	public static void bubbleSort(int arr[])
	{
		for(int i = 1;i<arr.length;i++)
			for(int j = 0;j<arr.length-i;j++)
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = temp;
				}
	}
	public static void insertionSort(int arr[])
	{
		int i,j;
		for(i = 1;i<arr.length;i++)
		{
			int min = arr[i];
			for(j = i-1;j>=0 && min<arr[j];j--)
					arr[j+1] = arr[j];
			arr[j+1] = min;
		}
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = in.nextInt();
		int target;
		char choice;
		int arr[] = new int[n];
		System.out.println("Enter "+n+" elements for array: ");
		for(int i=0;i<n;i++)
				arr[i] = in.nextInt();
		System.out.println("------------------Menu----------------");
		System.out.println("a. Linear Search");
		System.out.println("b. Binary Search");
		System.out.println("c. Bubble Sort");
		System.out.println("d. Insertion Sort");
		System.out.println("e. Display");
		System.out.println("f. Exit");
		System.out.println("--------------------------------------");
		do
		{
			System.out.println("Enter your choice: ");
			choice = in.next().charAt(0);
			switch(choice)
			{
			case 'a':
				System.out.println("Enter the element to be searched: ");
				target = in.nextInt();
				linearSearch(arr,target);
				break;
			case 'b':
				System.out.println("Enter the element to be searched: ");
				target = in.nextInt();
				binarySearch(arr,target);
				break;
			case 'c':
				bubbleSort(arr);
				System.out.println("Bubble sort successfull!!");
				break;
			case 'd':
				System.out.println("Insertion sort successfull!!");
				insertionSort(arr);
				break;
			case 'e':
				System.out.println("The Elements in array are: ");
				for(int i = 0;i<n;i++)
					System.out.print(arr[i]+" ");
				System.out.println();
				break;
			case 'f':
				break;
			default:
				System.out.println("Please enter a valid choice!!!");
			}
		}while(choice!='f');
		System.out.println("Program terminated.......");
		
	}
}
