package com.mkayman.designpatterns.strategy.behaviors;


public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak squeak squeak");
	}

}
