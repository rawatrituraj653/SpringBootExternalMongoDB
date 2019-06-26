package com.st.beans;

import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document(value="officedb")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
	@Id
	private String id;
	@NonNull private Integer empId;
	@NonNull private String empName;
	@NonNull private Double empSal;
	@NonNull private String[] empLocs;
	//@NonNull private List<String> empProject;
	@NonNull private Set<String> empProject;
	@NonNull private Properties empWorking;
//@NonNull private Map<String,String> empWorking;
	@NonNull private Address address;
}
