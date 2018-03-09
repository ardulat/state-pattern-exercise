package com.example.examplestatemachine;

public class AcceptState extends State {
	
	StateContext theContext;
	
	public AcceptState(StateContext theContext) {
		this.theContext = theContext;
	}
	
	@Override
	public void actionA() {
		// no need to check for acceptStateA -- it will stay the same
		if (theContext.getState() == theContext.getAcceptStateB()) {
			State rejectStateB = theContext.getRejectStateB();
			theContext.setState(rejectStateB);
			theContext.getState().accept = false;
			System.out.println("acceptState -> rejectState");
		}
	}
	
	@Override
	public void actionB() {
		// no need to check for acceptStateB -- it will stay the same
		if (theContext.getState() == theContext.getAcceptStateA()) {
			State rejectStateA = theContext.getRejectStateA();
			theContext.setState(rejectStateA);
			theContext.getState().accept = false;
			System.out.println("acceptState -> rejectState");
		}
	}
}
