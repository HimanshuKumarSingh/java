package com.marlabs.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonSelection {
	public static void main(String[] args) {
         
		List<Person> persons =
			    Arrays.asList(
			        new Person("subho", 18),
			        new Person("tomo", 23),
			        new Person("hemu", 23),
			        new Person("jaya", 12));
		List<Person> filtered =
			    persons
			        .stream()
			        .filter(p -> p.name.startsWith("h"))
			        .collect(Collectors.toList());

			System.out.println(filtered); 
			
			Person result =
				    persons
				        .stream()
				        .reduce(new Person("", 0), (p1, p2) -> {
				            p1.age += p2.age;
				            p1.name += p2.name;
				            return p1;
				        });

				System.out.format("name=%s; age=%s", result.name, result.age);
	}
}
