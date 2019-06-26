package com.st.beans;

import lombok.Data;
import lombok.NonNull;

@Data
public class Address {
	@NonNull private String Hno;
	@NonNull private String street;
	@NonNull private String city;
	@NonNull private Integer zip;
	@NonNull private String state;
	@NonNull private String country;
}
