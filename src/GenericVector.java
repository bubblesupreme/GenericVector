
public class GenericVector {
		
	public GenericVector()
	{
		vector=new GenericType[0];
	}
	
	public void push_back(GenericType<?> value)
	{
		GenericType<?> [] newVector=new GenericType[vector.length+1];
		for (int i=0;i<vector.length;i++)
		{
			newVector[i]=vector[i];
		}
		newVector[vector.length]=new GenericType(value);
		vector=newVector;
	}

	public GenericType<?> pop_back()
	{
		if (vector.length>0)
		{
		GenericType<?> [] newVector=new GenericType[vector.length-1];
		for (int i=0;i<vector.length-1;i++)
		{
			newVector[i]=vector[i];
		}
		GenericType<?> valuePop=vector[vector.length-1];
		vector=newVector;
		return valuePop;
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException(); 
		}
	}
	
	public int size()
	{
		return vector.length;
	}
	
	public GenericType<?> at(int index)
	{
		if (vector.length>=index && index>=0)
		{
		
		return vector[index];
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException(); 
		}
	}

	public GenericType<?> back()
	{
		if (vector.length>0)
		{
			return vector[vector.length-1];
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException(); 
		}
	}
	
	public void clear()
	{
		vector=new GenericType[0];
	}
	
	private GenericType<?> [] vector;
}
