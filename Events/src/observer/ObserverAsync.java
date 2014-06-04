package observer;

import java.util.logging.Logger;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import qualifier.Idared;
import data.Apple;

@Stateless
@Asynchronous
public class ObserverAsync {

	@Inject
	private Logger _logger;

	public void receiveApple(@Observes @Idared final Apple apple) {
		_logger.info(ObserverAsync.class + " receives: " + apple);
	}
}
