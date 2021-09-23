/**
 * @author Becca Deuser - rddeuser
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
package model;

/**
 * @author bdeus
 *
 */
public class Madlib {
	//declare fields
	private String noun;
	private String properNoun;
	private String adjective;
	private String verb;
	private String place;

	public Madlib(String noun, String properNoun, String adjective, String verb, String place) {
		setNoun(noun);
		setProperNoun(properNoun);
		setAdjective(adjective);
		setVerb(verb);
		setPlace(place);
	}//end constructor

	public String getProperNoun() {
		return properNoun;
	}//end getProperNoun

	public void setProperNoun(String properNoun) {
		//capitalize first letter of each word, lowercase rest
		//declare variables
		String[] splitProperNoun;
		String temp;
		
		//split string at spaces, clear properNoun
		splitProperNoun = properNoun.split(" ");
		properNoun = "";
		
		//uppercase first letter, lowercase rest, put back into propernoun
		for (int i = 0; i < splitProperNoun.length; i++) {
			temp = splitProperNoun[i];
			temp = temp.substring(0,1).toUpperCase() + temp.substring(1).toLowerCase();
			properNoun += temp + " ";
		}//end for
		
		this.properNoun = properNoun;
	}//end setProperNoun

	public String getPlace() {
		return place;
	}// end getPlace

	public void setPlace(String place) {
		//capitalize first letter of each word, lowercase rest
		//declare variables
		String[] splitPlace;
		String temp;
						
		//split string at spaces, clear properNoun
		splitPlace = place.split(" ");
		place = "";
						
		//uppercase first letter, lowercase rest, put back into place
		for (int i = 0; i < splitPlace.length; i++) {
			temp = splitPlace[i];
			temp = temp.substring(0,1).toUpperCase() + temp.substring(1).toLowerCase();
			place += temp + " ";
		}//end for
						
		this.place = place;
	}//end setPlace

	public String getNoun() {
		return noun;
	}//end getNoun
	
	public void setNoun(String noun) {
		this.noun = noun.toLowerCase();
	}//end setNoun
	
	public String getAdjective() {
		return adjective;
	}//end getAdjective
	
	public void setAdjective(String adjective) {
		this.adjective = adjective.toLowerCase();
	}//end setAdjective
	
	public String getVerb() {
		return verb;
	}//end getVerb
	
	public void setVerb(String verb) {
		this.verb = verb.toLowerCase();
	}//end setVerb

	@Override
	public String toString() {
		return "Once upon a time a " + adjective + " " + noun + " named " + properNoun + " was " + verb + " in " + place;
	}//end toString
	
	public String toString2() {
		return "The " + adjective + " " + noun + " named " + properNoun + " will never make the mistake of " + verb + " in the " + place + " a second time!"; 
	}//end toString2

}//end Madlib
