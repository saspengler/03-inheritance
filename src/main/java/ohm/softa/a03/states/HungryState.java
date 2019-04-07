package ohm.softa.a03.states;

import ohm.softa.a03.Cat;
import ohm.softa.a03.State;

public class HungryState extends State {

	HungryState (int duration){
		super(duration);
	}

	public State feed(Cat cat){
		return new DigestingState(cat.getDigest(), duration - time);
	}

	@Override
	public State successor(Cat cat) {
		return new DeathState();
	}
}
