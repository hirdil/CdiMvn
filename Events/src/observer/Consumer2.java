package observer;

import javax.enterprise.event.Observes;

import qualifier.Rotten;
import data.Apple;

public class Consumer2 {

	public void receiveApple(@Observes @Rotten Apple apple) {
		System.out.println(Consumer2.class + "receives: " + apple);
	}
}
