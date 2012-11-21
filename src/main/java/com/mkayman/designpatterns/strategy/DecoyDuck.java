package com.mkayman.designpatterns.strategy;

import com.mkayman.designpatterns.strategy.behaviors.FlyWithWings;
import com.mkayman.designpatterns.strategy.behaviors.Squeak;

public class DecoyDuck extends Duck {
	
	public DecoyDuck(){
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("I am a decoy duck");
	}
}
