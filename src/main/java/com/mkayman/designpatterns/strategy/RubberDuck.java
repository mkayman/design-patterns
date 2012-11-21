package com.mkayman.designpatterns.strategy;

import com.mkayman.designpatterns.strategy.behaviors.FlyNoWay;
import com.mkayman.designpatterns.strategy.behaviors.MuteQuack;

public class RubberDuck extends Duck {

	public RubberDuck(){
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new MuteQuack();
	}
	
	@Override
	public void display() {
		System.out.println("I am a rubber duck");
	}
}
