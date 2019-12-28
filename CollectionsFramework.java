import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsFramework {
	public static void main(String args[]) {
		
		//HashSet with String object
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Welcome");
		hs1.add("Hello");
		hs1.add("Bye bye");
		hs1.add("Farewel");
//
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("Apple");
		hs2.add("Bye bye");
		hs2.addAll(hs1);
		hs2.retainAll(hs1);
		
		HashSet<Integer> hs3 = new HashSet<>();
		
		hs3.add(new Integer(69));
		hs3.add(420);
		
//		for (Integer str : hs3) {
//			System.out.println(str);
//		}
		
		//LinkedHashSet with User-defined object 
		LinkedHashSet<Employee> hs4 = new LinkedHashSet<>();
		Employee e1 = new Employee("Bhanu",   22, 1234345, 101, 20000);
		Employee e2 = new Employee("Ajay",    23, 1234345, 105, 18000);
		Employee e3 = new Employee("Babu",	  18, 1234345, 102, 21000);
		Employee e4 = new Employee("Flemine", 19, 1234345, 103, 19000);
		Employee e5 = new Employee("Kritika", 21, 1234345, 104, 21000);
		
		hs4.add(e1);
		hs4.add(e2);
		hs4.add(e3);
		
//		for(Employee e: hs4) {
//			System.out.println(e);
//		}
		
//		hs.clear();
//		Iterator<String> itr = hs.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//TreeSet with String Object
		TreeSet<String> tset = new TreeSet<>();
		tset.add("Welcome");
		tset.add("Farewell");
		tset.add("Java");
		tset.add("Zebra");
		tset.add("Lorum Ipsum");
		
		//TreeSet with User-Defined  Object
		TreeSet<Employee> eTree = new TreeSet<>();
		eTree.add(e1);
		eTree.add(e2);
		eTree.add(e3);
		eTree.add(e4);
		eTree.add(e5);
		
//		for(Employee s : eTree) 
//			System.out.println(s);
		
		//List with String object 
		List<String> list = new ArrayList<>();
		list.add("welcome");
		list.add("hello");
		list.add("bye bye");
		list.add("apple");
		list.add("lorum");
		list.add("apple");
		list.add("lorum");
		
		//sorting while ignoring case
		Collections.sort(list, (v1,v2)-> v1.compareToIgnoreCase(v2));
		
//		for(String s : list) {
//			System.out.println(s);
//		}
		
		
		//List with user-defined object 
		List<Employee> eList = new ArrayList<>();
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		eList.add(e4);
		eList.add(e5);
		
		//sorting with default comparator overridden in class
		Collections.sort(eList);
		
//		for(Employee s : eList) {
//			System.out.println(s);
//		}
		
		//List with user-defined Object
		List<Employee> eList2 = new LinkedList<>();
		eList2.add(e1);
		eList2.add(e2);
		eList2.add(e3);
		eList2.add(e4);
		eList2.add(e5);
		
		//sorting with custom comparator using lambda
		Collections.sort(eList2, (v1,v2) -> v1.getEmpid() - v2.getEmpid());
		
		//list iterator
		ListIterator<Employee> itr = eList2.listIterator();
		
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
		//HashMaps
		HashMap<String, Object> map = new HashMap<>();
		map.put("boolean",true);
		map.put("integer", 23);
		map.put("double",20.0);
		
		//accessing all keys
		for(String s : map.keySet()) {
//			System.out.println(s);
		}
		
		//accessing all values
		for(Object o : map.values()) {
//			System.out.println(o);
		}
		
		//accessing key-value pairs
		for (Entry<String, Object> entry  : map.entrySet()) 
//		    System.out.println(entry.getKey() + " = " + entry.getValue());
		
		map.forEach((k,v)->{
//			System.out.println(k +  " " +  v);
		});
		
		//Linked HashMap order of insertion is maintained
		Map<String,Object> map2 = new LinkedHashMap<>();
		map2.put("boolean",true);
		map2.put("integer", 23);
		map2.put("double",20.0);
		
		map2.forEach((k,v)->{
//			System.out.println(k +  " " +  v);
		});
		
		//TreeMap
		//null values are not allowed in TreeMap (throws exception)
		TreeMap<String,Object> map3 = new TreeMap<>();
		map3.put("boolean",true);
		map3.put("integer", 23);
		map3.put("double",20.0);
		
		map3.forEach((k,v)->{
//			System.out.println(k +  " " +  v);
		});
		
	}
}
