package com.chainsys.day8;

public class PersonalDetails {

		 String name;
		    String location;
		    int age;
		    String gender;
		    String hobby;

		    public PersonalDetails (){
			}
		
		    public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getLocation() {
				return location;
			}
			public void setLocation(String location) {
				this.location = location;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public String getGender() {
				return gender;
			}
			public void setGender(String gender) {
				this.gender = gender;
			}
			public String getHobby() {
				return hobby;
			}
			public void setHobby(String hobby) {
				this.hobby = hobby;
			}
			
			
			public PersonalDetails(String name, String location, int age, String gender, String hobby) {
				
				this.name = name;
				this.location = location;
				this.age = age;
				this.gender = gender;
				this.hobby = hobby;
			}
			@Override
			public String toString() {
				return "PersonalDetails [name=" + name + ", location=" + location + ", age=" + age + ", gender=" + gender
						+ ", hobby=" + hobby + "]";

	}
	}

