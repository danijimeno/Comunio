# GIVEN STEPS
Given /^I am on registroComunidad screen$/ do 
	tap_when_element_exists("* id:'button2'")
end

Given /^I am on Registro screen$/ do 
	tap_when_element_exists("* id:'button2'")
	tap_when_element_exists("* id:'bUnirseC'")
end

Given /^I am on LoginActivity screen$/ do 
	wait_for_element_exists("* id:'editText2'")
end

# WHEN STEPS
When /^I input "([^\"]*)" in "([^\"]*)" input field$/ do |text, field|
	tap_when_element_exists("* id:'#{field}'")
	clear_text("* id:'#{field}'")
	enter_text("* id:'#{field}'", text)
end

And /^I touch "([^\"]*)" button$/ do |btn|
	tap_when_element_exists("* id:'#{btn}'")
end

And /^after I input "([^\"]*)" in "([^\"]*)" input field$/ do |text, field|
	tap_when_element_exists("* id:'#{field}'")
	clear_text("* id:'#{field}'")
	enter_text("* id:'#{field}'", text)
end

And /^after I see "([^\"]*)" message$/ do |msg|
	wait_for_text(msg, :timeout => 30)
end

# THEN STEPS
Then /^I should be in Registro screen$/ do
	wait_for_element_exists("* id:'bValidar'")
end

Then /^I should see "([^\"]*)" message$/ do |msg|
	wait_for_text(msg, :timeout => 30)
end