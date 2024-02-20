package com.learning.ooad2.jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Test {
	
	public static void main(String[] args) {
		
		UserWithRoot user = new UserWithRoot(1, "John");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
		try {
//			String result = mapper.writeValueAsString(user);
//			System.out.println(result);
			
			
			Student student = mapper.readValue(new File("data/mystudent.json"), Student.class);

			// for getting array of objects we can do like below
			// Student[] studentArr = mapper.readValue(new File("data/mystudent.json"), Student[].class);
			// ANother way is to do using TypeReference ( Abstract class) -> TypeReference<List<Student>>
			System.out.println(student);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
