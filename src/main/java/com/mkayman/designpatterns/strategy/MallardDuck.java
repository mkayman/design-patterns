package com.mkayman.designpatterns.strategy;

import com.mkayman.designpatterns.strategy.behaviors.FlyWithWings;
import com.mkayman.designpatterns.strategy.behaviors.Quack;

public class MallardDuck extends Duck {

	public MallardDuck(){
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I am a mallard duck");
	}
}
