package com.mkayman.designpatterns.strategy;

import com.mkayman.designpatterns.strategy.behaviors.FlyNoWay;
import com.mkayman.designpatterns.strategy.behaviors.FlyWithWings;

public class Main {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.fly();
		mallard.quack();
		
		Duck rubber = new RubberDuck();
		rubber.fly();
		rubber.quack();
		
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.fly();
		
		rubber.setFlyBehavior(new FlyWithWings());
		rubber.fly();
	}
}
