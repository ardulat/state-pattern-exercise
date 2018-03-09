package com.example.examplestatemachine;

public class RejectState extends State {

	StateContext theContext;
	
	public RejectState(StateContext theContext) {
		this.theContext = theContext;
	}
	
	public void actionA() {
		if (theContext.getState() == theContext.getInitialState() ||
				theContext.getState() == theContext.getRejectStateA()) {
			State acceptStateA = theContext.getAcceptStateA();
			theContext.setState(acceptStateA);
			theContext.getState().accept = true;
			System.out.println("rejectState -> acceptState");
		}
	}
	
	public void actionB() {
		if (theContext.getState() == theContext.getInitialState() ||
				theContext.getState() == theContext.getRejectStateB()) {
			State acceptStateB = theContext.getAcceptStateB();
			theContext.setState(acceptStateB);
			theContext.getState().accept = true;
			System.out.println("rejectState -> acceptState");
		}
	}
}
