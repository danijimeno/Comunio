Feature: Initialize comunio
	As an new/old user I want to access to the main menu of comunio app

	Scenario: Join community
		Given I am on registroComunidad screen
		When  I input "" in "eTUnirseC" input field
		And   I touch "bUnirseC" button
		Then  I should be in Registro screen

	Scenario: Create new community
		Given I am on registroComunidad screen
		When  I input "CoTest" in "eTUnirseC" input field
		And   I touch "bUnirseNC" button
		Then  I should be in Registro screen

	Scenario: Validate new account
		Given I am on Registro screen
		When  I input "UsTest" in "eTUsuario" input field
		And   after I input "1234" in "eTPass1" input field
		And   after I input "1234" in "eTPass2" input field
		And   after I input "team" in "eTNombreEquipo" input field
		And   I touch "bValidar" button
		Then  I should see "Usuario válido" message

	Scenario: Create new account
		Given I am on Registro screen
		When  I input "UsTest" in "eTUsuario" input field
		And   after I input "1234" in "eTPass1" input field
		And   after I input "1234" in "eTPass2" input field
		And   after I input "team" in "eTNombreEquipo" input field
		And   I touch "bValidar" button
		And   after I see "Usuario válido" message
		And   I touch "bRegistrar" button
		Then  I should see "REGISTRO COMPLETO" message

	Scenario: Login
		Given I am on LoginActivity screen
		When  I input "Luis" in "editText" input field
		And   after I input "1234" in "editText2" input field
		And   I touch "button" button
		Then  I should see "Autenticando ..." message