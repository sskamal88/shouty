Feature: Hear Shout
	Scenario: Listener is within range
		Given Lucy is located 15 mts from Sean
		When Sean shouts "Free Bagel's at Sean's"
		Then Lucy hears Sean's message