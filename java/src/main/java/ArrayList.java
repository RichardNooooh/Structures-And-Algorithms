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
		if (size == con.length)
			growCapacity();

		con[size] = e;
		size++;
	}

	public E get(int index)
	{
		return con[index];
	}

	private void growCapacity()
	{
		E[] newCon = (E[]) new Object[con.length * 2];
		for (int i = 0; i < con.length; i++)
			newCon[i] = con[i];

		con = newCon;
	}

	public E remove(int i)
	{
		if (i < 0 || i >= size)
			throw new ArrayIndexOutOfBoundsException();
		E e = con[i];
		con[i] = null;
		int j = i + 1;
		while (j < size)
		{
			con[j] = con[j - 1];
			j++;
		}

		return e;
	}

	public boolean remove(E o)
	{
		return false;
	}

}
