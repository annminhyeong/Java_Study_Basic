package ch11;

public class Ex1 {
	//�÷���: ���� ��ü(������)�� ��� ���� ��
	//�����ӿ�ũ: ǥ��ȭ ����ȭ�� ü������ ���α׷��� ���
	//
	//�÷��� �����ӿ�ũ : �÷���(�ټ��� ��ü)�� �ٷ�� ���� ǥ��ȭ�� ���α׷��� ���
	//
	//
	//�÷��� �����ӿ�ũ�� �ٽ� �������̽�
	//List : ������ �ְ� �ߺ��� ����ϴ� ����������
	//Set : ������ ���� �ߺ��� �����ϴ� ����������
	//Map : Ű�� ���� ������ �̷���� ���������� Ű�� �ߺ��� ������� �ʰ� ���� �ߺ��� �����
	//
	//Collection �������̽�: List + set
	//boolean add(Object o)
	//boolean add(Collection c) : ������ ��ü �Ǵ� Collection(c)�� ��ü���� Collection�� �߰��Ѵ�.
	//
	//void clear() : Collection�� ��� ��ü�� �����Ѵ�.
	//
	//boolean contains(Object o)
	//boolean contains(Collection c) : �����Ȱ�ü(o) �Ǵ� Collection(c)�� ��ü���� Collection�� ���ԵǾ��ִ��� Ȯ���Ѵ�.
	//
	//boolean equals(Object o) : ������ Collection���� ���Ѵ�.
	//
	//int hashCode() : Collection�� hash code�� ��ȯ�Ѵ�.
	//
	//boolean isEmpty() : Collection�� ����ִ��� Ȯ���Ѵ�.
	//
	//Iterator iterator() : Collection�� Iterator�� �� ��ȯ�Ѵ�.
	//
	//boolean remove(Object o) : ������ ��ü�� �����Ѵ�.
	//boolean removeAll(Collection c) : ������ Collection�� ���Ե� ��ü���� �����Ѵ�.
	//
	//boolean retainAll(Collection) : ������ Collection�� ���ѵ� ��ü�� ����� �ٸ� ��ü���� Collection���� �����Ѵ�. ���۾����� ���� Collection�� ��ȭ�� ������ ture, ������ false�� ��ȯ�Ѵ�.
	//
	//int size() : Collection�� ������ ��ü�� ������ ��ȯ�Ѵ�.
	//
	//Object[] toArray() : Collection�� ����� ��ü�� ��ü�迭(Object [])�� ��ȯ�Ѵ�.
	//
	//Object[] toArray(Object[] a) : ������ �迭�� Collection�� ��ü�� �����ؼ� ��ȯ�Ѵ�.
	
	
	
	
	
	

	//List �������̽�
	//void add(int index, Object element) : ������ ��ġ(index)�� ��ü(element) �Ǵ� �÷��ǿ� ���Ե� ��ü���� �߰��Ѵ�.
	//
	//Object get(int index) : ������ ��ġ(index)�� �ִ� ��ü�� ��ȯ�Ѵ�.
	//
	//int indexOf(Object o) : ������ ��ü�� ��ġ(index)�� �տ��� ���� ã�Ƽ� ��ȯ�Ѵ�.
	//
	//int lastIndexOf(Object o) : ������ ��ü�� ��ġ(index)�� �ڿ��� ���� ã�Ƽ� ��ȯ�Ѵ�.
	//
	//ListIterator()
	//ListIterator(int index) : List�� ��ü�� ������ �� �ִ� ListIterator�� ��ȯ�Ѵ�.
	//
	//Object remove(int index) : ������ ��ġ(index)�� �ִ� ��ü�� �����ϰ� ������ ��ü�� ��ȯ�Ѵ�.
	//
	//Object set(int index, Object element) : ������ ��ġ(index)�� ��ü (element)�� �����Ѵ�.
	//
	//void sort(Comparator c) ������ ����(comparator)�� List�� �����Ѵ�.
	//List subList(int fromIndex, int toIndex) : ������ ����(fromIndex ���� toIndex)�� �ִ� ��ü�� ��ȯ�Ѵ�.
	
	
	
	
	

	//set �������̽�
	//Set �������̽��� �޼���� Collection �������̽��� ����
	//boolean addAll(Collection c) : ������ Collection(c)�� ��ü���� �߰��Ѵ�. (������)
	//
	//boolean containsAll(Collection c) : ������ Collection(c)�� ��ü���� Collection�� ���ԵǾ� �ִ��� Ȯ���Ѵ� (�κ�����)
	//
	//boolean removeAll(Collection c) : ������ Collection�� ���Ե� ��ü���� �����Ѵ� (������)
	//
	//boolean retainAll(Collection c) : ������ Collection�� ���Ե� ��ü�� ����� �������� Collection���� �����Ѵ� (������)
	
	
	
	
	
	

	//Map �������̽�
	//void clear() : Map�� ��簴ü�� �����Ѵ�.
	//
	//boolean containsKey(Object key) : ������ key��ü�� ��ġ�ϴ� Map�� key��ü�� �ִ��� Ȯ���Ѵ�.
	//
	//boolean containsValue(Object value) : ������ value��ü�� ��ġ�ϴ� Map�� Value ��ü�� �ִ��� Ȯ���Ѵ�.
	//
	//Set entrySet() : Map�� ����Ǿ� �ִ� key-value���� Map.Entry Ÿ���� ��ü�� ������ Set���� ��ȯ�Ѵ�.
	//
	//boolean equals(Object o) : ������ Map���� ���Ѵ�.
	//
	//Object get(Object key) : ������ key��ü�� �����ϴ� value�� ã�Ƽ� ��ȯ�Ѵ�.
	//
	//int hashCode() : �ؽ��ڵ带 ��ȯ�Ѵ�
	//
	//boolean isEmpty() : Map�� ����ִ��� Ȯ���Ѵ�.
	//
	//Set keySet() : Map�� ����Ǿ��ִ� key��ü�� ��ȯ�Ѵ�.
	//
	//Object put(Object key , Object value) : Map�� value��ü�� key��ü�� �����Ͽ� �����Ѵ�.
	//
	//void putAll(Map t) : ������ Map�� ��� key-value���� �߰��Ѵ�.
	//
	//Object remove(Object key) : ������ key ��ü�� ��ġ�ϴ� key-value��ü�� �����Ѵ�.
	//
	//int size() : Map�� ����� key-value���� ������ ��ȯ�Ѵ�.
	//
	//Collection values() : Map�� ����� ��� value��ü�� ��ȯ�Ѵ�.


}
