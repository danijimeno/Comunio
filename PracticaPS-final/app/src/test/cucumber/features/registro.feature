Feature: Register

	Scenario: User wants to make a new comunity
		Given The name of the comunity
		When Create new comunity button
		Then A comunity is created

	Scenario: User wants input user name
		Given The name of the user
		When Input user name button is pressed
		Then Username is registered

	Scenario: User wants join an existing comunity
		Given The name of the user and the comunity
		When Join comunity button is pressed
		Then User is joined in the existing comunity

	Scenario: User wants to validate the user name
		Given The name of the user to validate
		When Validate button is pressed
		Then The user name is validate