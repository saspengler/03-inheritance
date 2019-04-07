package ohm.softa.a03.states;

import ohm.softa.a03.Cat;
import ohm.softa.a03.State;

public class PlayfulState extends State {

	PlayfulState (int duration){
		super(duration);
	}

	@Override
	public State successor(Cat cat) {
		return new SleepingState(cat.getSleep());
	}
}
