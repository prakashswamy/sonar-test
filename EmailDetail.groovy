package com.aujas.platform.email.command

class EmailDetail {

	String recipient
	List<String> ccEmails
	List<String> bccEmails

	String subject
	String body

    static constraints = {

		ccEmails nullable: true 
		bccEmails nullable: true
    }
	
	static mapping = {
	}

}