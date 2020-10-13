package com.mit.model.suggestion;

import com.mit.model.abstraction.ModelAbstraction;

public class Suggestion extends ModelAbstraction {

	private String userId;
	private String suggestion;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}



}
