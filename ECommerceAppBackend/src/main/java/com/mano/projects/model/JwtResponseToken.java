package com.mano.projects.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class JwtResponseToken implements Serializable {	
	
	@Getter private final String jwttoken;
	@Getter private final Integer userId;
}
