package com.example.examplestatemachine;

public class StateContext {
	
	State initialState;
	State acceptStateA;
	State rejectStateA;
	State acceptStateB;
	State rejectStateB;
	State s;
	
	public StateContext() {
		this.initialState = new RejectState(this);
		this.acceptStateA = new AcceptState(this);
		this.rejectStateA = new RejectState(this);
		this.acceptStateB = new AcceptState(this);
		this.rejectStateB = new RejectState(this);
		this.s = initialState;
	}
	
	public void actionA() {
		s.actionA();
	}
	
	public void actionB() {
		s.actionB();
	}
	
	public State getState() {
		return this.s;
	}

	public void setState(State newState) {
		this.s = newState;
	}
	
	public State getInitialState() {
		return this.initialState;
	}
	
	public State getAcceptStateA() {
		return this.acceptStateA;
	}
	
	public State getRejectStateA() {
		return this.rejectStateA;
	}
	
	public State getAcceptStateB() {
		return this.acceptStateB;
	}
	
	public State getRejectStateB() {
		return this.rejectStateB;
	}
	
	public Boolean isAccept() {
		return s.isAccept();
	}
}
