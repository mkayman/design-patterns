package com.mkayman.designpatterns.strategy;

import com.mkayman.designpatterns.strategy.behaviors.FlyWithWings;
import com.mkayman.designpatterns.strategy.behaviors.Quack;

public class RedheadDuck extends Duck {
	
	public RedheadDuck(){
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I am a redhead duck");
	}
}
