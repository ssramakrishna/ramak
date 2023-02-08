package seleNIum;

class Assessment {
	public static void main(String[] args) 
	{
		int[] a = {10, 20, 80, 35, 50, 60, 70};
		int temp = 0;

		for (int i = 0; i <a.length ; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if (a[i]>a[j]) 
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int k = 0; k < a.length; k++) 
		{
			System.out.print(a[k]+" ");
			
		}
	}
}

// double a = 25.64;
// int b = 25;
// a = a % 10;
// b = b % 10;
// System.out.println(a);
// System.out.println(b);

//123123

//int i = 1, j = 1 ;
//while (i < 3) 
//{
//	do {
//		System.out.print(j + ",");
//		j++ ;
//	} 
//	while (j < 4);
//	i++ ;
//}
//
//String s = new String("5");
//System.out.println(1 + 10 + s + 1 + 10); //115110

//String s = "Ramakrishna";
//System.out.println(s.valueOf("Ram"));

//
//String s1 = "Java";
//String s2 = "Java";
//
//StringBuilder sb1 = new StringBuilder();
//
//sb1.append("Ja").append("va");
//
//System.out.println(s1 == s2);
//
//System.out.println(s1.equals(s2));
//
//System.out.println(sb1.toString() == s1);
//System.out.println(sb1.toString().equals(s1));

//String[] nums = new String[] { "1", "10", "9","2" } ;
//Arrays.sort(nums) ;
//System.out.println(Arrays.toString(nums)) ;

//String[] strings = new String[2];
//System.out.println(strings);

//String[] os = new String[] { "Rinux", "Mac", "Windows" };
//Arrays.sort(os);
//System.out.println(Arrays.binarySearch(os, "Rinux"));

//	
//	
//	int i = 20;
//	test();
//}
//
//private static void test() {
//	System.out.println("ram");
//
//}