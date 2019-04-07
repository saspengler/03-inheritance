package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
	private static final Logger logger = LogManager.getLogger();

	protected int time = 0;
	protected final int duration;

	protected State (int duration) {
		this.duration = duration;
	}

	final State tick(Cat cat){
		if(duration < 0){
			return this;
		}

		time++;

		if (time < duration){
			logger.info("Still in {}", getClass().getSimpleName());
			return this;
		} else {
			return successor(cat);
		}
	}

	public abstract State successor(Cat cat);
}
