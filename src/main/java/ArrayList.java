public class ArrayList<E>
{
	private E[] con;
	private final int INITIAL_CAP = 8;

	private int size;

	public ArrayList()
	{
		con = (E[]) new Object[INITIAL_CAP];
	}

	public void add(E e)
	{
		//check capacity
		checkCapacity();
		con[size] = e;
		size++;
	}

	public E get(int index)
	{
		return con[index];
	}

	private void checkCapacity()
	{
		if (size == con.length)
		{
			E[] newCon = (E[]) new Object[con.length * 2];
			for (int i = 0; i < con.length; i++)
				newCon[i] = con[i];

			con = newCon;
		}
	}

}
