package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Student {

	private Integer stid;
	private String name;
	private Double fees;
	private List<String> coures;
    private Long mobileNo;
    private Map<String,Object> ids;
    private Set<Object> favplaces;		
    
}
