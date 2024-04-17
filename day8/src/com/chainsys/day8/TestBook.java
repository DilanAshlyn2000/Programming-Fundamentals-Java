package com.chainsys.day8;

public class TestBook {

		public static void main(String[] args) {
			BookDetails details=new BookDetails();
			details.setAuthor("Marcusaurelius");
			details.setLanguage("Greek");
			details.setPublishedyear(1556);
			details.setSubject("Philosophy");
			details.setTitle("Meditations");
			System.out.println("BOOK TITLE     :"+details.getTitle());
			System.out.println("AUTHOR         :"+details.getAuthor());
			System.out.println("GENRES         :"+details.getSubject());
			System.out.println("PUBLISHED YEAR :"+details.getPublishedyear());
			System.out.println("LANGUAGE       :"+details.getLanguage());

	}

}
