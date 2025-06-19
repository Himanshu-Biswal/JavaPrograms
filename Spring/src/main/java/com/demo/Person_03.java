package com.demo;

//Dependency Injection Using setter Injection
public class Person_03 {
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
		engine.run();
	}
}
