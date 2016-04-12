Given /^I am on registroComunidad screen$/ do 
	sleep 1
	touch("* id:'button2'")
	sleep 3
end

Given /^I am on Registro screen$/ do 
	sleep 1
	touch("* id:'button2'")
	sleep 3
	touch("* id:'bUnirseC'")
	sleep 3
end

Given /^I am on LoginActivity screen$/ do 
	sleep 1
end

When /^I input "([^\"]*)" in "([^\"]*)" input field$/ do |text, field|
	sleep 1
	clear_text("* id:'#{field}'")
	sleep 3
	enter_text("* id:'#{field}'", text)
	sleep 3
	press_back_button
	sleep 3
end

Then /^I should be in Registro screen$/ do 
	#reset_simulator_content_and_settings
	sleep 1
end

Then /^I should see "([^\"]*)" message$/ do |msg|
	#reset_simulator_content_and_settings
	sleep 1
end

Then /^I should be in LogginActivity screen$/ do
	#reset_simulator_content_and_settings
	sleep 1
end

Then /^I should be in Inicio screen$/ do
	#reset_simulator_content_and_settings
	sleep 1
end

And /^I touch "([^\"]*)" button$/ do |btn|
	sleep 1
	touch("* id:'#{btn}'")
	sleep 3
end

And /^after I input "([^\"]*)" in "([^\"]*)" input field$/ do |text, field|
	sleep 1
	clear_text("* id:'#{field}'")
	sleep 3
	enter_text("* id:'#{field}'", text)
	sleep 3
	press_back_button
	sleep 3
end

