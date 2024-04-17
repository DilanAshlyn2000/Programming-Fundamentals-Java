package com.chainsys.day8;

public class BookDetails {

		String title;
		String author;
		String language;
		String subject;
		int publishedyear;
		
		public BookDetails() {
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			
			if(title.matches("[a-zA-Z0-9]+")) {
				this.title = title;
			}else {
				System.out.println("INVALID!,GIVE PROPER INPUT");
			}
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			if(author.matches("[a-zA-Z]+")) {
				this.author = author;
			}else {
				System.out.println("INVALID!,GIVE PROPER INPUT");
			}
			
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			if(language.matches("[a-zA-Z]+")) {
				this.language = language;
			}else {
				System.out.println("INVALID!,GIVE PROPER INPUT");
			}
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			if(subject.matches("[a-zA-Z]+")) {
				this.subject = subject;
			}else {
				System.out.println("INVALID!,GIVE PROPER INPUT");
			}
		}

		public int getPublishedyear() {
			return publishedyear;
		}

		public void setPublishedyear(int publishedyear) {
			if(publishedyear>0&&publishedyear<2024) {
				this.publishedyear = publishedyear;
			}else {
				System.out.println("INVALID!,GIVE PROPER PUBLICATION YEAR");
			}
			
		}

		@Override
		public String toString() {
			return "BookDetails [title=" + title + ", author=" + author + ", language=" + language + ", subject="
					+ subject + ", publishedyear=" + publishedyear + "]";
		}

		public BookDetails(String title, String author, String language, String subject, int publishedyear) {
			super();
			this.title = title;
			this.author = author;
			this.language = language;
			this.subject = subject;
			this.publishedyear = publishedyear;
		}
		
	}
