package com.st.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.st.beans.Person;
import com.st.repo.EmployeeRepository;
import com.st.repo.PersonRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private PersonRepository prepo;

	@Autowired
	private EmployeeRepository erepo;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * System.out.println(this.getClass().getClassLoader().getClass().getName());
		 * System.out.println(UUID.randomUUID().toString().replace("-", "").substring(0,
		 * 10).toUpperCase()); Person p=new Person(101, "Sumit", 40000.00, "India");
		 * repo.deleteAll(); System.out.println("all deleted"); repo.save(p);
		 * System.out.println("one inserted"); repo.saveAll(Arrays.asList( new
		 * Person(102, "Adam", 30000.00, "USA"), new Person(103, "Miller", 45000.00,
		 * "Aus"), new Person(104, "Scott", 33000.00, "Ger"), new Person(105, "Allen",
		 * 28000.00, "Fra"), new Person(106, "Jones", 47000.00, "RSA") ));
		 * System.err.println("employee list is sotred");
		 * repo.findAll().forEach(System.out::println);
		 */
		/*
		 * 
		 * Map<String, String> map=new HashMap<>(); map.put("Hyd", "01-jan-17");
		 * map.put("Mum", "02-mar-17"); map.put("Blr", "03-jun-17"); map.put("Che",
		 * "03-sep-17"); String [] strings=new
		 * String[]{"Hyd","Che","Pun","Blr","Del","Mum"}; List<String> list
		 * =Arrays.asList("p1","p2","p3","p4"); Address addr=new Address("2-3A",
		 * "Ameerpet", "Hyd", 500016, "TS", "IND"); Employee emp=new Employee(7744,
		 * "Rituraj", 40000.90, strings, list, map, addr); erepo.save(emp);
		 * 
		 * String [] locs=new String[]{"Hyd","Che","Pun","Blr","Del","Mum"}; Properties
		 * p=new Properties(); p.put("Del", "03-mar-18"); p.put("Mum", "04-jun-18");
		 * p.put("Hyd", "05-sep-18"); Address addr=new Address("3-7A", "begumpet",
		 * "Hyd", 500024, "TS", "IND"); Set<String> s=new HashSet<>();
		 * s.add("j1");s.add("j2");s.add("j3");s.add("j4"); Employee emp=new
		 * Employee(7369, "Shivam", 50000.00, locs, s, p, addr); erepo.save(emp);
		 * System.out.println("Employee Data inserted");
		 * System.out.println("erepo: "+erepo.getClass().getName());
		 * System.out.println("prepo: "+prepo.getClass().getName());
		 */
		/*
		 * Optional<Person>op=prepo.findById("5d10df257db4ce084cff62a0");
		 * if(op.isPresent())System.out.println(op.get()); else
		 * System.out.println("record not found");
		 */
		/* prepo.findAll().forEach(System.out::println); */
		
		/*
		 * prepo.findAll(Sort.by(Direction.DESC,"pname")).forEach(System.out::println);
		 */
		
		//prepo.findAll(Sort.by("pname")).forEach(System.out::println);
		
		/* prepo.findAll(PageRequest.of(0, 4)).forEach(System.out::println); */
		
		//prepo.save(new Person("123abc",11, "BB", 4.4, "ritura"));
		prepo.insert(new Person("123abcf",111, "Ritu", 55.3, "india"));
		System.out.println("done ");
	}
}