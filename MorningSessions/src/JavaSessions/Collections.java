package JavaSessions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections {
	public static void main(String[] args) {
		
	//Array list can contain duplicate elements
	// Array list maintains insertion order
	
	ArrayList<String> list = new ArrayList<String>();
	list.add("test1");
	list.add("test3");
	list.add("test4");
	list.add(1, "test2");
	list.addAll(list);
	list.addAll(3, list);
	
	Iterator it = list.iterator();
	while(it.hasNext()){
		System.out.println("*****************ArrayList********************" + " " + it.next());
	}
	
	LinkedList<Object> linkedList = new LinkedList<Object>();
	linkedList.add("Praveen");
	linkedList.add("Chaitra");
	linkedList.add("Dad");
	linkedList.addFirst("Virat");
	linkedList.addLast("Mom");
	for(Object l:linkedList){
	 System.out.println("********************LinkedList********************" + " " + l);
	}
	
	ArrayList<Object> list2 = new ArrayList<Object>();
	list2.add("Praveen");
	list2.add("Chaitra");
	list2.add("Dad");
	ListIterator<Object> li = list2.listIterator();
	while(li.hasNext()){
		System.out.println("********************ArrayList+listIterator********************" + " " + li.next());
	}
	
	while(li.hasPrevious()){
		System.out.println(li.previous());
	}
	
	HashSet<Object> hash = new HashSet<Object>();
	hash.add("hash1");
	hash.add("hash2");
	hash.add("hash3");
	Iterator it3 = hash.iterator();
	while(it3.hasNext()){
		System.out.println("********************hashSet********************" + " " + it3.next());
	}
	
	LinkedHashSet<Object> linkHashSet = new LinkedHashSet<Object>();
	linkHashSet.add("test1");
	linkHashSet.add("test2");
	linkHashSet.add("test2");
	Iterator it4 = linkHashSet.iterator();
	while(it4.hasNext()){
		System.out.println("********************linkHashSet********************" + " " + it4.next());
	}
	
	TreeSet<Object> tree = new TreeSet<Object>();
	tree.add("praveen");
	tree.add("virat");
	tree.add("chaitra");
	tree.add("chaitra");
	Iterator it5 = tree.iterator();
	
	while(it5.hasNext()){
		System.out.println("********************tree********************" + " " + it5.next());
	}
	
	// Map
	Map<Integer,String> map = new HashMap<Integer,String>();
	map.put(100, "Praveen");
	map.put(101, "chaitra");
	map.put(102, "chaitra");
	
	for(Map.Entry m:map.entrySet()){
		System.out.println(m.getKey() + " " + m.getValue());
	}
	
	// HashSet
	HashMap<Integer,String> hashMap = new HashMap<>();
	hashMap.put(101, "Test1");
	hashMap.put(102, "Test2");
	hashMap.put(103, "Test3");
	for(Map.Entry m: hashMap.entrySet()){
		
		System.out.println("******************hashMap******************" + " " + m.getKey() + " " + m.getValue() );
	}
	
	
	
	// LinkedHashSet
		LinkedHashMap<Integer,String> linkedhashMap = new LinkedHashMap<>();
		linkedhashMap.put(101, "Test1");
		linkedhashMap.put(102, "Test2");
		linkedhashMap.put(103, "Test3");
		for(Map.Entry m: linkedhashMap.entrySet()){
			
			System.out.println("******************LinkedhashMap******************" + " " + m.getKey() + " " + m.getValue() );
		}
	
	// TreeMap
		// HashSet
		TreeMap<Integer,String> TreeMap = new TreeMap<>();
		TreeMap.put(101, null);
		TreeMap.put(102, "Test2");
		TreeMap.put(103, "Test3");
		System.out.println("***********FirstKey*********" + " " + TreeMap.firstKey());
		System.out.println("***********LastKey*********" + " " +TreeMap.lastKey());
		System.out.println("***********ContainsKey*********" + " " +TreeMap.containsKey(103));
		System.out.println("***********ContainsValue*********" + " " + TreeMap.containsValue("Test4"));
		
		for(Map.Entry<Integer,String> m: TreeMap.entrySet()){
			
			System.out.println("******************TreeMap******************" + " " + m.getKey() + " " + m.getValue() );
		}
	
		
		//HashTable
		
		Hashtable<Integer,String> hashTable = new Hashtable<>();
		hashTable.put(101, "test1");
		hashTable.put(102, "Test2");
		hashTable.put(103, "Test3");
		hashTable.remove(103);
			System.out.println("***********IsEmpty*********" + " " + hashTable.isEmpty());
			System.out.println("***********ContainsKey*********" + " " +hashTable.containsKey(103));
		System.out.println("***********ContainsValue*********" + " " + hashTable.containsValue("Test4"));
		
		for(Map.Entry<Integer,String> m: hashTable.entrySet()){
			
			System.out.println("******************hashTable******************" + " " + m.getKey() + " " + m.getValue() );
		}
	
		
		//Collections sort
	ArrayList<String> list7 = new ArrayList<String>();
	list7.add("test1");
	list7.add("test2");
	list7.add("test3");
	
	System.out.println("***********Collections.sort(list7)***********");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}}
