package com.edu.java.cap3;

public class Person {
	private String name;
	private String friends;
	private int nFriends;
	
	public Person(String name) {
		this.name = name;
		friends = "";
		nFriends = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

	public void setFriends(String friends) {
		this.friends += friends + " ";		
	}
	
	public void befriend(Person p) {
		this.setFriends(p.getName());
		nFriends++;
	}

	public void unfriend(Person p) {
		nFriends = 0;
		String str = p.getName();		
		String newFriends = "";
		String[] splitStr = this.friends.split("\\s+");
		
		for(String s : splitStr) {
			if (!s.equals(str)) {
				newFriends += s + " ";
				nFriends++;
			}
		}
		this.friends = newFriends;
	}
	
	public String getFriendNames() {
		return friends;
	}
	
	public int getFriendCount() {
		return nFriends;
	}
	
}
