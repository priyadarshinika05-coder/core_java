class CalculatorRunner{
	
	public static void main(String []args){
		
		Calculator addition=new Calculator();
		
		int sum=addition.add(2,4);
		System.out.println(sum);
		sum=addition.add(6,8);
		System.out.println(sum);
		
		sum=addition.add(2,4,5);
		System.out.println(sum);
		sum=addition.add(2,5,7);
		System.out.println(sum);
		
		sum=addition.add(1,3,5,6);
		System.out.println(sum);
		sum=addition.add(2,5,7,9);
		System.out.println(sum);
		
		sum=addition.add(1,3,5,5,8);
		System.out.println(sum);
		sum=addition.add(2,5,7,5,7);
		System.out.println(sum);
		
		sum=addition.add(1,3,5,2,4,6);
		System.out.println(sum);
		sum=addition.add(2,5,7,7,9,3);
		System.out.println(sum);
		
		sum=addition.add(1,3,5,1,3,5,8);
		System.out.println(sum);
		sum=addition.add(2,5,7,5,1,8,6);
		System.out.println(sum);
		
		sum=addition.add(1,3,5,6,4,5,1,3);
		System.out.println(sum);
		sum=addition.add(2,5,7,6,2,7,2,7);
		System.out.println(sum);
		
		sum=addition.add(1,3,5,5,3,9,4,6,7);
		System.out.println(sum);
		sum=addition.add(2,5,7,2,8,7,9,3,1);
		System.out.println(sum);
		
		sum=addition.add(1,3,5,8,9,1,9,2,7,8);
		System.out.println(sum);
		sum=addition.add(2,5,7,5,7,9,6,1,4,5);
		System.out.println(sum);
		
		sum=addition.add(1,3,5,5,7,8,9,4,7,9,1);
		System.out.println(sum);
		sum=addition.add(2,5,7,5,6,8,9,0,8,0,1);
		System.out.println(sum);
		
		System.out.println("---------------------");
		
		Calculator subtraction=new Calculator();
		
		int result=subtraction.sub(8,5);
		System.out.println(result);
	    result=subtraction.sub(10,1);
	    System.out.println(result);
		
	    result=subtraction.sub(10,4,3);
		System.out.println(result);
	    result=subtraction.sub(10,1,5);
	    System.out.println(result);
		
		result=subtraction.sub(10,9,2,7);
		System.out.println(result);
	    result=subtraction.sub(8,9,4,8);
	    System.out.println(result);
		
		result=subtraction.sub(10,5,8,5,1);
		System.out.println(result);
	    result=subtraction.sub(15,9,4,8,2);
	    System.out.println(result);
		
		result=subtraction.sub(14,5,4,9,2,3);
		System.out.println(result);
	    result=subtraction.sub(10,5,2,9,7,1);
	    System.out.println(result);
		
		result=subtraction.sub(10,5,3,2,3,9,8);
		System.out.println(result);
	    result=subtraction.sub(10,1,5,1,4,5,7);
	    System.out.println(result);
		
		result=subtraction.sub(10,4,3,3,6,2,1,8);
		System.out.println(result);
	    result=subtraction.sub(10,1,3,5,6,7,9,0);
	    System.out.println(result);
		
		result=subtraction.sub(15,3,7,9,2,1,0,2,4);
		System.out.println(result);
	    result=subtraction.sub(20,10,3,7,8,0,3,7,3);
	    System.out.println(result);
		
		result=subtraction.sub(30,3,1,8,5,8,4,3,9,2,8);
		System.out.println(result);
	    result=subtraction.sub(15,5,8,9,4,9,5,3,2,4,8);
	    System.out.println(result);
		
		  result=subtraction.sub(20,3,8,8,4,6,8,2,6,3,7);
		System.out.println(result);
	    result=subtraction.sub(10,2,6,7,9,4,7,8,9,2,1);
	    System.out.println(result);
		
		System.out.println("---------------------");
		
		Calculator multiplication=new Calculator();
		
		int product=multiplication.mul(2,5);
		System.out.println(product);
		product=multiplication.mul(3,5);
		System.out.println(product);
		
		product=multiplication.mul(2,5,4);
		System.out.println(product);
		product=multiplication.mul(3,5,6);
		System.out.println(product);
		
		product=multiplication.mul(6,8,9,8);
		System.out.println(product);
		product=multiplication.mul(3,5,7,8);
		System.out.println(product);
		
		product=multiplication.mul(8,9,4,3,3);
		System.out.println(product);
		product=multiplication.mul(3,5,2,5,6);
		System.out.println(product);
		
		product=multiplication.mul(5,8,6,7,2,3);
		System.out.println(product);
		product=multiplication.mul(5,3,7,2,1,9);
		System.out.println(product);
		
		product=multiplication.mul(5,7,5,3,2,1,2);
		System.out.println(product);
		product=multiplication.mul(3,5,3,7,8,5,3);
		System.out.println(product);
		
		product=multiplication.mul(2,5,3,7,9,1,8,3);
		System.out.println(product);
		product=multiplication.mul(3,5,9,6,4,8,2,1);
		System.out.println(product);
		
		product=multiplication.mul(2,5,2,9,6,3,8,0,2);
		System.out.println(product);
		product=multiplication.mul(3,5,4,7,9,4,7,6,1);
		System.out.println(product);
		
		product=multiplication.mul(2,5,8,2,3,5,6,7,2,3);
		System.out.println(product);
		product=multiplication.mul(3,5,4,1,4,6,8,9,5,8);
		System.out.println(product);
		
		product=multiplication.mul(2,5,9,4,8,3,8,2,9,1,9);
		System.out.println(product);
		product=multiplication.mul(3,5,7,9,0,4,2,8,1,8,9);
		System.out.println(product);
				
	}
}