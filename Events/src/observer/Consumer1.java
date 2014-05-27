package observer;

import javax.enterprise.event.Observes;

import qualifier.Rotten;
import data.Apple;

public class Consumer1 {

	public void receiveApple(@Observes @Rotten Apple apple) {
		System.out.println(Consumer1.class + "receives: " + apple);
	}
}
