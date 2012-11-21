package com.mkayman.designpatterns.strategy;

import com.mkayman.designpatterns.strategy.behaviors.FlyBehavior;
import com.mkayman.designpatterns.strategy.behaviors.QuackBehavior;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void swim(){
		System.out.println("I am swimming");
	}
	
	public void fly(){
		flyBehavior.fly();
	}
	
	public void quack(){
		quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
