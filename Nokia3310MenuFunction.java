import java.util.Scanner;
	public class Nokia3310MenuFunction {
   		 public static void main(String[] args) {
			boolean back = false;
			while(back == false) {
			
String MainMenu = """

1. PhoneBook
2. Mesages
3. Chat
4. Call register
5. Tones
6. Settings
7. Call divert
8. Games
9. Calculator
10. Reminders
11. Clock
12. Profiles
13. Sim services


""";
System.out.println(MainMenu);
	Scanner firstInput = new Scanner(System.in);
	System.out.println("Choose an Option: ");
	int numberEntered = firstInput.nextInt();
	switch(numberEntered) {
case 1: System.out.println("PhoneBook"); 

				String phoneBookSubHeading = """
					1. Search
					2. Service Nos
					3. Add name
					4. Erase
					5. Edit
					6. Assign tone
					7. Send b'card
					8. Options
					9. Speed dias
					10. Voice tags
					"""; 
				System.out.println(phoneBookSubHeading);




				Scanner sc = new Scanner(System.in);
				System.out.println("Choose another option:");
				int displayPhoneBookSubHeading;
				displayPhoneBookSubHeading = sc.nextInt();
	
				switch(displayPhoneBookSubHeading) {
			case 1: System.out.println("Search"); break;
			case 2: System.out.println("Service Nos"); break;
			case 3: System.out.println("Add name"); break;
			case 4: System.out.println("Erase"); break;
			case 5: System.out.println("Edit"); break;
			case 6: System.out.println("Assign tone"); break;
			case 7: System.out.println("Send b'card"); break;
			case 8: System.out.println("Options");

					String optionsSubHeading = """
					1. Type of view
					2. Memory status
					""";
				System.out.println(optionsSubHeading);



					Scanner subImput = new Scanner(System.in);
					System.out.println("Choose another option: ");
					int displayOptionSubHeading = subImput.nextInt();

					switch(displayOptionSubHeading) {
					case 1: System.out.println("Type of view"); break;
					case 2: System.out.println("Memory status");
					}


			break;

			case 9: System.out.println("Speed dias"); break;
			case 10: System.out.println("Voice tags");
}

		break;  
case 2: System.out.println("Mesages");
			String MesageSubHeadings = """
			1. Write messages
			2. Inbox
			3. Outbox
			4. Picture messages
			5. Templates
			6. Smileys
			7. Message settings
			8. Info Service
			9. Voice mailbox number
			10. Service command editor
			""";
	System.out.println(MesageSubHeadings);



			Scanner mssg = new Scanner(System.in);
			System.out.println("Choose your preffered option from the list: ");
			int displayMessageSubHeading;
			displayMessageSubHeading = mssg.nextInt();

				switch(displayMessageSubHeading) {
			case 1: System.out.println("Write messages"); break;
			case 2: System.out.println("Inbox"); break;
			case 3: System.out.println("Outbox"); break;
			case 4: System.out.println("Picture messages"); break;
			case 5: System.out.println("Templates"); break;
			case 6: System.out.println("Smileys"); break;
			case 7: System.out.println("Message settings");
			
				String messageSettingsSubHeadings = """
				1. Sets 1
				2. Common
				""";
				System.out.println(messageSettingsSubHeadings);
				
				Scanner set = new Scanner(System.in);
				System.out.println("Choose from the options");
				int set1;
				set1 = set.nextInt();
				
				switch(set1) {
				case 1: System.out.println("Set 1");
					String set1SubHeading = """
					1. Message centre number
					2. Message sent as
					3. Message validity 
				""";
				System.out.println(set1SubHeading);

				Scanner setDisplay = new Scanner(System.in);
				System.out.println("Choose from the options");
				int displaySet1SubHeading;
				displaySet1SubHeading = setDisplay.nextInt();
			switch(displaySet1SubHeading) {
			case 1: System.out.println("Message center number"); break ;
			case 2: System.out.println("Message sent as"); break ;
			case 3: System.out.println("Message validity");

				}
				case 2: System.out.println("Common");
					String commonSubHeading = """
					1. Delivery report
					2. Reply via same centre
					3. Character support	
				""";
			System.out.print(commonSubHeading);

				Scanner common = new Scanner(System.in);
				System.out.print("Choose from the options");
				int displayCommonSubHeading;
				displayCommonSubHeading = common.nextInt();
				
				switch(displayCommonSubHeading) {
					case 1: System.out.print("Delivery report"); break;
					case 2: System.out.print("Reply via same centre"); break;
					case 3: System.out.print("Character support"); break;
					}
			

			

		


		}
		break;
			case 8: System.out.println("Info service"); break;
			case 9: System.out.println("Voice mailbox number"); break;
			case 10: System.out.println("Service command editor"); break;
	}	

	
break;				
case 3: System.out.println("Chat"); break ;
case 4: System.out.println("Call register");
		
		String callRegisterSubHeading = """
			1. Missed calls
			2. Received calls
			3. Dialled numbers
			4. Erase recent call lists
			5. Show call duration
			6. Show call costs
			7. Call cost settings
			8. Prepaid credit	
			""";
		System.out.println(callRegisterSubHeading);

			Scanner callRegis = new Scanner(System.in);
			System.out.println("Choose from the options");
			int displayCallRegisterSubHeading;
			displayCallRegisterSubHeading = callRegis.nextInt();

			switch(displayCallRegisterSubHeading) {
			case 1: System.out.println("Missed calls"); break;
			case 2: System.out.println("Received calls"); break;
			case 3: System.out.println("Dialled numbers"); break;
			case 4: System.out.println("Erase recent call lists"); break;
			case 5: System.out.println("Show call duration");

				String showCallDurationSubHeading = """
				1. Last call duration
				2. All calls' duration
				3. Received calls' duration
				4. Dialled calls' duration
				5. Clear timers
				""";
			System.out.println(showCallDurationSubHeading);
				
				Scanner callDuration = new Scanner(System.in);
				System.out.println("Choose from the options");
				int displayShowCallDurationSubHeading;
				displayShowCallDurationSubHeading = callDuration.nextInt();

				switch(displayShowCallDurationSubHeading) {
			case 1: System.out.println("Last call duration"); break;
			case 2: System.out.println(" All calls' duration"); break;
			case 3: System.out.println("Received calls' duration"); break;
			case 4: System.out.println("Dialled calls' duration"); break;
			case 5: System.out.println("Clear timers"); break;
				}
			break;
			case 6: System.out.println("Show call costs");

				String showCallCostSubHeading = """
				1. Last call cost
				2. All calls' cost
				3. Clear counters
				""";
			System.out.println(showCallCostSubHeading);
				
				Scanner callCost = new Scanner(System.in);
				System.out.println("Choose from the options");
				int displayShowCallCostSubHeading;
				displayShowCallCostSubHeading = callCost.nextInt();

				switch(displayShowCallCostSubHeading) {
			case 1: System.out.println("Last call cost"); break;
			case 2: System.out.println("All calls' cost"); break;
			case 3: System.out.println("Clear counters"); break;
				}
			break;
			case 7: System.out.println("Call cost settings");

				String callCostSettingsSubHeading = """
				1. Call cost limit
				2. Show cost in
				""";
				System.out.println(callCostSettingsSubHeading);
				
				Scanner callSettings = new Scanner(System.in);
				System.out.println("Choose from the options");
				int displayCallCostSettingsSubHeading;
				displayCallCostSettingsSubHeading = callSettings.nextInt();

				switch(displayCallCostSettingsSubHeading) {
			case 1: System.out.println("Call cost limit"); break;
			case 2: System.out.println("Show cost in"); break;
			
				}
			break;
			case 8: System.out.println("Prepaid credit"); break;
			}
break;
case 5: System.out.println("Tones");
	
	String toneSubHeading;
		toneSubHeading = """
		1. Ringing tone
		2. Ringing volume
		3. Incoming call aleart
		4. Composer
		5. message alert tone
		6. Keypad tones
		7. Warning and game tones
		8. Vibrating alert
		9. Screen saver
	""";
	System.out.println(toneSubHeading);

		Scanner tone = new Scanner(System.in);
		System.out.println("Choose an option");
		int displayToneSubHeading;
		displayToneSubHeading = tone.nextInt();

		switch(displayToneSubHeading) {
			case 1: System.out.println("Ringing tone"); break;
			case 2: System.out.println("Ringing volume"); break;
			case 3: System.out.println("Incoming call aleart"); break;
			case 4: System.out.println("Composer"); break;
			case 5: System.out.println("message alert tone"); break;
			case 6: System.out.println("Keypad tones"); break;
			case 7: System.out.println("Warning and game tones");
			case 8: System.out.println("Vibrating alert");
			case 9: System.out.println("Screen saver");


	}

case 6: System.out.println("Settings");

	String settingsSubHeading;
		settingsSubHeading = """
		1. Call settings
		2. Phone settings
		3. Security settings
		4. Restore factory settings
	""";
	System.out.println(settingsSubHeading);

		Scanner settings = new Scanner(System.in);
		System.out.println("Choose an option");
		int displaySettingsSubHeading;
		displaySettingsSubHeading = settings.nextInt();
		
		switch(displaySettingsSubHeading) {
	case 1: System.out.println("Call settings");

				String callSettingsSubHeading;
		callSettingsSubHeading = """
		1. Automatic redial
		2. Speed dialing
		3. Call waiting options
		4. Own number sending
		5. Phone line in use
		6. Automatic answer
	""";
	System.out.println(callSettingsSubHeading);
		Scanner callSng = new Scanner(System.in);
		System.out.println("Choose an option");
		int displayCallSettingsSubHeading;
		displayCallSettingsSubHeading = callSng.nextInt();

		switch(displayCallSettingsSubHeading) {
			case 1: System.out.println("Automatic redial"); break;
			case 2: System.out.println("Speed dialing"); break;
			case 3: System.out.println("Call waiting options"); break;
			case 4: System.out.println("Own number sending"); break;
			case 5: System.out.println("Phone line in use"); break;
			case 6: System.out.println("Automatic answer"); break;
			}
	break;
	case 2: System.out.println("Phone settings");
		
		
				String phoneSettingSubHeading;
		phoneSettingSubHeading = """
		1. Language
		2. Cell info display
		3. Welcome note
		4. Network selection
		5. Light
		6. Confirm SIM service actions
	""";
	System.out.println(phoneSettingSubHeading);
		Scanner phoneSttg = new Scanner(System.in);
		System.out.println("Choose an option");
		int displayPhoneSettingSubHeading;
		displayPhoneSettingSubHeading = phoneSttg.nextInt();

		switch(displayPhoneSettingSubHeading) {
			case 1: System.out.println("Language"); break;
			case 2: System.out.println("Cell info display"); break;
			case 3: System.out.println("Welcome note"); break;
			case 4: System.out.println("Network selection"); break;
			case 5: System.out.println("Light"); break;
			case 6: System.out.println("Confirm SIM service actions"); break;
			}
	break;

	case 3: System.out.println("Security settings");
			
			String securitySettingSubHeading;
		securitySettingSubHeading = """
		1. PIN code request
		2. Call barring service
		3. Fixed dialling
		4. Close user group
		5. Phone securty
		6. Change access codes
	""";
	System.out.println(securitySettingSubHeading);
		Scanner securitySttg = new Scanner(System.in);
		System.out.println("Choose an option");
		int displaySecuritySettingSubHeading;
		displaySecuritySettingSubHeading = securitySttg.nextInt();

		switch(displaySecuritySettingSubHeading) {
			case 1: System.out.println("PIN code request"); break;
			case 2: System.out.println("Call barring service"); break;
			case 3: System.out.println("Fixed dialling"); break;
			case 4: System.out.println("Close user group"); break;
			case 5: System.out.println("Phone securty"); break;
			case 6: System.out.println("Change access codes"); break;
			}

	case 4: System.out.println("Restore factory settings"); break;
			}
break;
case 7: System.out.println("Call divert"); break;
case 8: System.out.println("Games"); break;
case 9: System.out.println("Calculator"); break;
case 10: System.out.println("Remminders"); break;
case 11: System.out.println("Clock");

	String clockSubHeading;
		clockSubHeading = """
		1. Alarm clock
		2. Clock settings
		3. Date setting
		4. Stopwatch
		5. Countdown timer
		6. Auto update of date and time
	""";
	System.out.println(clockSubHeading);
		Scanner clock = new Scanner(System.in);
		System.out.println("Choose an option");
		int displayClockSubHeading;
		displayClockSubHeading = clock.nextInt();

		switch(displayClockSubHeading) {
			case 1: System.out.println("Alarm clock"); break;
			case 2: System.out.println("Clock settings"); break;
			case 3: System.out.println("Date setting"); break;
			case 4: System.out.println("Stopwatch"); break;
			case 5: System.out.println("Countdown timer"); break;
			case 6: System.out.println("Auto update of date and time"); break;
			}
break;
case 12: System.out.println("Profile"); break;
case 13: System.out.println("Sim service");
			
				

					}

				System.out.print("Press 1 to go back: ");
				int number = firstInput.nextInt();
				if(number !=1)
					back = true;

				}
		}
}


