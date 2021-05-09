package Entities;

import java.time.LocalDate;

	public class Customer {
		private int id;
		private String firstName;
		private String lastName;
		private LocalDate dateOfBirth;
		private String nationalyId;
		
		public Customer() {
			
		}
		public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalyId) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
			this.nationalyId = nationalyId;
		}
		//Getter 
		public int getId() {
			return id;
		}
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		
		public String getNationalyId() {
			return nationalyId;
		}
		
		
		//Setter
		public void setNationalyId(String nationalyId) {
			this.nationalyId = nationalyId;
		}
		public void setDateOfBirth(LocalDate localDate) {
			this.dateOfBirth = localDate;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public void setId(int id) {
			this.id = id;
		}

	}
