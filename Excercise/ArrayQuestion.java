//write a program to print all elements of an array
public class PrintAllElements{
public static void main (String args[]){
int[] arr1={2,3,4,1,8};
for(int i=0;i<arr1.length;i++){
System.out.println(arr1[i]);
}
}
}



//write a program to find sum of all elements in an array
public class SumElements{
public static void main(String args[]){
int sum=0;
int[] arr2={2,1,3,4,7};
for(int i=0;i<arr2.length;i++){
sum=sum+arr2[i];
}
System.outt.println("Sum ="+sum);
}
}


//write a program to find the average of array elements
public class Average{
public static void main (String args[]){
int[]arr3={1,2,3,4,5};
int sum=0;
for(int i=0;i<arr3.length;i++){
sum=sum+arr3[i];
}
//System.out.println(arr3[i]);
int average=sum/arr3.length;
System.out.println("Avereage ="+average);
}
}

//write a program to find the largest elements in an array
public class Largest{
public static void main (String args[]){
int[] arr4={1,2,3,4,5};
int max=arr4[0];
for(int i=0;i<arr4.length;i++){
if(max<arr4[i]){
max=arr4[i];
}
}
System.out.println("largest elements ="+max)
}
}

//write a program to find the smallest elements in an array
public class SmallestElements{
public static void main(String args[] ){
int[] arr5={11,3,4,5};
int min=arr5[0];
for(int i=0;i<arr5.length;i++){
if(min>arr5[i]){
min=arr5[i];
}

}
System.out.println("Smallest elements ="+min)
}
}

//write a program to count even and odd numbers in array

public class CountEvenOdd{
public static void main(String args[]){
int[] arr6={1,2,3,4,5};
int even=0;
int odd =0;
for(int i=0;i<arr6.length;i++){
if(arr6[i]%2==0){
even++;
}else{
odd++
}
}
System.out.println("Even number are ="+even)
System.out.println("odd number are ="+odd)
}

}

}
}

//write a program to search an elements in an array
public class SearchElemnts{
public static void main(String args[]){
int[] arr7={1,2,3,4,5};
for(int i=0;i<arr7.length;i++){
if(arr7[i]==3){
System.out.println("Elements found");
}
}
}
}
//write a program to reverse an array
public class ReverseArray
public static void main (String args[]){
int[] arr={1,2,3,4,5};
for(int i=arr.length-1;i<=0;i++){
System.out.println(arr[i]);
}
}
//write an elements at even index position
  public class EvenIndexPosition{
public static void main (String args[]){
int[] arr={1,2,3,4,5};
for(int i=0;i<arr.length;i++){
if(i%2==0){
System.out.println(arr[i]);
}
}
}
} 
public class OddNumberPostion{
public static void main(String args[]){
int[] arr={1,2,3,4,5};
for(int i=0;i<arr.length;i++){
if(i%2!=0){
System.out.println(arr[i]);
}
}

}
}
//write an program to print all elements in 2d array
public class Matrix {
public static void main(String[] args) {
	int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println(" ");
	}
}
}
public class SumOfAllElements{
public static void main(String[] args) {
	int [][] arr= {{1,2,3},{4,5,6}};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			sum=sum+arr[i][j];
			
		}
		
	}
	System.out.println("Sum of elements are ="+sum);
}
}

