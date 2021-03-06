package com.giffing.bucket4j.spring.boot.starter.context;

import java.time.temporal.ChronoUnit;

/**
 * Configures the rate of data which should be transfered 
 *
 */
public class BandWidthConfig {
	
	private long capacity;
	private long time;
	private ChronoUnit unit;
	
	
	public long getCapacity() {
		return capacity;
	}
	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public ChronoUnit getUnit() {
		return unit;
	}
	public void setUnit(ChronoUnit unit) {
		this.unit = unit;
	}
	
	

	
}
