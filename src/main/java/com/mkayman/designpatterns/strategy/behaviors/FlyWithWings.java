package com.mkayman.designpatterns.strategy.behaviors;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I am flying with my wings");
	}

}
