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

		con[size] = e;
		size++;
	}

	public E get(int index)
	{
		return con[index];
	}

}
