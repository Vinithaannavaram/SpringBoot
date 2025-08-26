
package com.example.springbootstarter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

//rest controller is to add all the restfull features
@Data
@AllArgsConstructor
public class Customer {
	private int id;
	private String name;

}