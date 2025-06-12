package Day05;

import java.util.ArrayList;

public class ArrayList {



	public static void main(String[] args) {

	//int[]arr = new int[5];

		ArrayList<Integer> arr=new ArrayList();

		//accepts all types of values

		ArrayList<Object> arr2=new ArrayList();

		arr.add(10);

		arr.add(20);

		arr.add(30);

		arr.add(40);

		arr.add(50);

		//to iterate the objects

        arr.forEach(num->System.out.println(num*num));

        //vaidate the voting (age)

       

		arr.forEach(age->{

			if(age>=18) {

				System.out.println("eligible");

			}else {

				System.out.println("not eligible");

			}

		});

		

	

		

		arr2.add("java");

		System.out.println(arr);

		System.out.println(arr2);

	}



}

