package com.chainsys.day8;

public abstract class BookDetailsRating {
	public void BookDetail() {
		
		
		BookDetails details=new BookDetails();
		System.out.println("        BOOK REVIEW");
		details.setAuthor("Marcusaurelius");
		details.setLanguage("Greek");
		details.setPublishedyear(1556);
		details.setSubject("Philosophy");
		details.setTitle("Meditations");
		System.out.println("\nBOOK TITLE     :"+details.getTitle());
		System.out.println("AUTHOR         :"+details.getAuthor());
		System.out.println("GENRES         :"+details.getSubject());
		System.out.println("PUBLISHED YEAR :"+details.getPublishedyear());
		System.out.println("LANGUAGE       :"+details.getLanguage());

	}

	public abstract void Ratings();
}
