package com.o2o.sekill_part.cache;

public interface KeyPrefix {
		
	public int expireSeconds();
	
	public String getPrefix();
	
}
