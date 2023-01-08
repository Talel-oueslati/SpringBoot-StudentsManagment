package com.produit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
@Table(	name = "student")
public class Student {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank
		@Size(max = 20)
		private String firstname;

		@NotBlank
		@Size(max = 20)
		private String lastname;
		
		@NotBlank
		@Size(max = 20)
		private String department;
		
		@NotBlank
		@Size(max = 8)
		private long cin;
		
		
		@NotBlank
		@Size(max = 50)
		@Email
		private String email;


		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}


		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}


		/**
		 * @return the firstname
		 */
		public String getFirstname() {
			return firstname;
		}


		/**
		 * @param firstname the firstname to set
		 */
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}


		/**
		 * @return the lastname
		 */
		public String getLastname() {
			return lastname;
		}


		/**
		 * @param lastname the lastname to set
		 */
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}


		/**
		 * @return the department
		 */
		public String getDepartment() {
			return department;
		}


		/**
		 * @param department the department to set
		 */
		public void setDepartment(String department) {
			this.department = department;
		}


		/**
		 * @return the cin
		 */
		public long getCin() {
			return cin;
		}


		/**
		 * @param cin the cin to set
		 */
		public void setCin(long cin) {
			this.cin = cin;
		}


		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}


		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}


		public Student(Long id, @NotBlank @Size(max = 20) String firstname, @NotBlank @Size(max = 20) String lastname,
				@NotBlank @Size(max = 20) String department, @NotBlank @Size(max = 8) long cin,
				@NotBlank @Size(max = 50) @Email String email) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.department = department;
			this.cin = cin;
			this.email = email;
		}


		public Student() {
			
		}



	}


