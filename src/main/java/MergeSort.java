import java.util.LinkedList;
import java.util.List;

public class MergeSort
{
	List<Comparable> list;

	public MergeSort()
	{}

	public MergeSort(List<Comparable> list)
	{
		this.list = sort(list);
	}

	public void setList(List<Comparable> list)
	{
		this.list = sort(list);
	}

	public List getSortedList()
	{
		return list;
	}

	private List<Comparable> sort(List<Comparable> list)
	{
		int size = list.size();
		if (size > 1)
		{
			int middleElement = size / 2;
			List<Comparable> list1 = sort(list.subList(0, middleElement));
			List<Comparable> list2 = sort(list.subList(middleElement, size));

			list = merge(list1, list2);
		}

		return list;
	}

	private List<Comparable> merge(List<Comparable> list1, List<Comparable> list2)
	{
		List<Comparable> mergedList = new LinkedList<Comparable>();
		int index1 = 0;
		int index2 = 0;
		int size1 = list1.size();
		int size2 = list2.size();

		while (index1 < size1 && index2 < size2)
		{
			Comparable e1 = list1.get(index1);
			Comparable e2 = list2.get(index2);
			int compareVal = e1.compareTo(e2);

			if (compareVal < 0)
			{
				mergedList.add(e1);
				index1++;
			}
			else if (compareVal > 0)
			{
				mergedList.add(e2);
				index2++;
			}
			else
			{
				mergedList.add(e1);
				mergedList.add(e2);
				index1++;
				index2++;
			}
		}

		while (index1 < size1)
		{
			mergedList.add(list1.get(index1));
			index1++;
		}
		while (index2 < size2)
		{
			mergedList.add(list2.get(index2));
			index2++;
		}

		return mergedList;
	}

}
