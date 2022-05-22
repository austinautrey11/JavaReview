package com.revature.model;

public class ActionFigure extends Doll {
	private String skill;
	
	public String getSkill() {
		return this.skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	public ActionFigure() {
		name = "Austin";
		eyeColor = "Blue";
		skill = "Football";
	}
	public ActionFigure(String name, String eyeColor, String skill) {
		this.name = name;
		this.eyeColor = eyeColor;
		this.skill = skill;
		
	}
	
	public void useSkill() {
		System.out.println("Ka Pow! I'm using my skill. " + this.getSkill());
	}

}

