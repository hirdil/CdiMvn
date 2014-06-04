package observer;

import java.util.logging.Logger;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import qualifier.Idared;
import data.Apple;

//@ApplicationScoped
public class ObserverSync {

	@Inject
	private Logger _logger;

	public void receiveApple(@Observes @Idared final Apple apple) {
		_logger.info("" + this + " " + ObserverSync.class + " receives: " + apple);
	}
}
