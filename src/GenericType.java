

public class GenericType<T> {

		public GenericType(T value) {
			this.value = value;
		}

		public String toString() {
			return ((GenericType<?> ) value).out();
			
		}
		
		private String out() 
		{
			return new String("Class=" + value.getClass() + ", value=" 
					+ value.toString());
			
		}

		private T value;
		
		public static void main(String[] args) {
			
			
				GenericVector vect=new GenericVector();
				
					vect.push_back(new GenericType<Integer>(10));
					vect.push_back(new GenericType<Boolean>(false));
					vect.push_back(new GenericType<String>("hhhj"));
					vect.push_back(new GenericType<Double>(3.56));
					vect.push_back(new GenericType<Integer>(10));
					vect.push_back(new GenericType<Boolean>(true));
				
					try {
						System.out.println(vect.back());
						System.out.println(vect.at(0));
						System.out.println(vect.size());
						System.out.println(vect.pop_back());
						System.out.println(vect.pop_back());
						System.out.println(vect.pop_back());
						System.out.println(vect.pop_back());
						System.out.println(vect.pop_back());
						System.out.println(vect.pop_back());
						System.out.println(vect.pop_back());
						System.out.println(vect.pop_back());
					}
					catch(ArrayIndexOutOfBoundsException ex)
					{
						System.out.println("\nArray Index Out Of Bounds\n");
					}
					vect.push_back(new GenericType<Integer>(22));
					vect.push_back(new GenericType<Boolean>(false));
					vect.push_back(new GenericType<String>("ssss"));
					System.out.println(vect.size());
					vect.clear();
					System.out.println(vect.size());
				
			
			System.out.println("Successful");
		}
	}