import java.util.Scanner; 
import java.util.ArrayList;
public class story {
	
	private static Scanner input;
	//private static Object userInput;
	
	public static void main(String[]args) {
		
		startgame();
	}
	
	public static void startgame () {

		input = new Scanner(System.in);	
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println(name + " ,you are a private detective. Your new case inloves the murder of an unknown man. You must find the killer in the most efficient way possible. Good Luck, " + name + "!");
		System.out.println();
		
		how(input);
		where(input);
		who(input);
		
	}
	
	
		public static void how(Scanner input) {
			
			for(int i = 1; i<= 20; i++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			System.out.println("How was the man killed?" + "\n" + "1. shot" + "\n"+ "2. stabbed" + "\n" + "3. poisoned");
			String choice = input.next(); 
			
				if(choice.equals("1")) {
					System.out.println("The man was shot with a handgun.");
				}
				else if(choice.equals("2")) {
					System.out.println("The man was stabbed.");
					}
				else {
					System.out.println("The man's dinner was poisoned.");
				}
				
				System.out.println();
				
		}
		
		public static void where(Scanner input) {
			
			for(int i = 1; i<= 20; i++) {
				System.out.print("*");
			}
			System.out.println();
			
			System.out.println("\n" + "Where was the body found?" + "\n" + "1. parking garage" + "\n"+ "2. field" + "\n" + "3. shore");
			String choice = input.next(); 
			
			if(choice.equals("1")) {
				System.out.println("The man was found in a parking garage.");
				}
			else if(choice.equals("2")) {
				System.out.println("The man was found in a field.");
				}
			else {
				System.out.println("The man was found on the shore.");
				}
			
			System.out.println();
			
		}
		
		public static void who(Scanner input) {
			
			for(int i = 1; i<= 20; i++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			System.out.println("\n" + "What was the man's job?" + "\n" + "1. stock trader" + "\n" + "2. doctor" + "\n" + "3. lawyer");
			String choice = input.next(); 
			
				if(choice.equals("1")) {
					stockTrader();
					}
				else if(choice.equals("2")) {
					doctor();
					}
				else {
					lawyer();
					}
				
				System.out.println();
				
		}
		
				public static void stockTrader() {
					
					for(int i = 1; i<= 20; i++) {
						System.out.print("*");
					}
					
					System.out.println();
					
					input = new Scanner(System.in);
					System.out.println("The man was a stock trader named Jerry. The current suspects are currently:" + "\n" + "1. his boss" + "\n" + "2. his neighbor" + "\n" + "3. his collegue" + "\n" + "Who are you going to question first?");
					String ans = input.next(); 
					
						if(ans.equals("1")) {
							System.out.println("Unfortunately, the boss was the actual killer. Since you approached him directly, you were killed as well. Game Over!");
							}
						else if(ans.equals("2")) {
							neighborStockTrader();
							}
						else {
							colleagueStockTrader();
							}
						
						System.out.println();
						
				}
				
				public static void doctor() {
					
					for(int i = 1; i<= 20; i++) {
						System.out.print("*");
					}
					
					System.out.println();
					
					input = new Scanner(System.in);
					System.out.println("The man was a doctor named Jerry. The current suspects are currently:" + "\n" + "1. his boss" + "\n" + "2. his neighbor" + "\n" + "3. his collegue"+ "\n" + "Who are you going to question first?");
					String answer = input.next(); 
					
						if(answer.equals("1")) {
								bossDoctor();
								}
						else if(answer.equals("2")) {
								System.out.println("Unfortunately, the neighbor was the actual killer. Since you approached her directly, you were killed as well. Game Over!");
								}
						else {
								colleagueDoctor();
								}
						
						System.out.println();
				}
				
				public static void lawyer() {
					
					for(int i = 1; i<= 20; i++) {
						System.out.print("*");
					}
					
					System.out.println();

					input = new Scanner(System.in);
					System.out.println("The man was a lawyer named Jerry. The current suspects are currently:" + "\n" + "1. his boss" + "\n" + "2. his neighbor" + "\n" + "3. his collegue" + "\n" + "Who do you want to question first?");
					String answr = input.next(); 
					
						if(answr.equals("1")) {
								bossLawyer();
								}
						else if(answr.equals("2")) {
								neighborLawyer();
								}
						else {
								System.out.println("Unfortunately, the colleague was the actual killer. Since you approached him directly, you were killed as well. Game Over!");
								}
						
						System.out.println();
						
					}
					
						public static void neighborStockTrader() {
							
							for(int i = 1; i<= 20; i++) {
								System.out.print("*");
							}
							
							System.out.println();
							
							input = new Scanner(System.in);
							System.out.println("You ask Jerry's neighbor if she has seen anything suspicious. She tells you that she has seen a man, that matches the description of the boss, arguing with Jerry outside his house. What do you do next?" + "\n" + "1. You set up protection for the neighbor." + "\n" + "2. You pay her for the information." );
							String chc = input.next();
							
							if(chc.equals("1")) {
								hangmanStockTrader();	
								}
							else {
								System.out.println("Unfortunately, the killer found out that someone was snooping around about Jerry's murder and threatened the neighbor to reveal your identity. The killer then killed you as well. Game Over!");
							}
							
							System.out.println();
							
						}
						
						public static void colleagueStockTrader() {
							
							for(int i = 1; i<= 20; i++) {
								System.out.print("*");
							}
							
							System.out.println();
	
							input = new Scanner(System.in);
							System.out.println("You ask Jeremy's colleague if he has seen anything suspicious. He tells you that Jerry and their boss have had some issues lately and have been arguing at work. What do you do next?" + "\n" + "1. You set up protection for the colleague." + "\n" + "2. You pay him for the information." );
							String chcs = input.next();
							
							if(chcs.equals("1")) {
								hangmanStockTrader();	
								}
							else {
								System.out.println("Unfortunately, the killer found out that someone was snooping around about Jerry's murder and threatened the colleague to reveal your identity. The killer then killed you as well. Game Over!");
							}
							
							System.out.println();
						}
						
						public static void bossDoctor() {
							
							for(int i = 1; i<= 20; i++) {
								System.out.print("*");
							}
							
							System.out.println();
	
							input = new Scanner(System.in);
							System.out.println("You ask Jeremy's boss if he has seen anything suspicious. He tells you that a woman that matches the description of Jerry's neighbor has come to the hospital and argued with him. What do you do next?" + "\n" + "1. You set up protection for the boss." + "\n" + "2. You pay him for the information." );
							String chcs = input.next();
							
							if(chcs.equals("1")) {
								hangmanDoctor();	
								}
							else {
								System.out.println("Unfortunately, the killer found out that someone was snooping around about Jerry's murder and threatened the boss to reveal your identity. The killer then killed you as well. Game Over!");
							}
							
							System.out.println();
						}
						
						public static void colleagueDoctor() {
							
							for(int i = 1; i<= 20; i++) {
								System.out.print("*");
							}
							
							System.out.println();
	
							input = new Scanner(System.in);
							System.out.println("You ask Jeremy's colleague if he has seen anything suspicious. He tells you that a woman that matches the description of Jerry's neighbor has come to the hospital and argued with him. What do you do next?" + "\n" + "1. You set up protection for the colleague." + "\n" + "2. You pay him for the information." );
							String chcs = input.next();
							
							if(chcs.equals("1")) {
								hangmanDoctor();	
								}
							else {
								System.out.println("Unfortunately, the killer found out that someone was snooping around about Jerry's murder and threatened the colleague to reveal your identity. The killer then killed you as well. Game Over!");
							}
							
							System.out.println();
							
						}
						
						public static void bossLawyer() {
							
							for(int i = 1; i<= 20; i++) {
								System.out.print("*");
							}
							
							System.out.println();
	
							input = new Scanner(System.in);
							System.out.println("You ask Jeremy's boss if he has seen anything suspicious. He tells you that Jeremy and his colleague have had issues recently. What do you do next?" + "\n" + "1. You set up protection for the boss." + "\n" + "2. You pay him for the information." );
							String chcs = input.next();
							
							if(chcs.equals("1")) {
								hangmanLawyer();	
								}
							else {
								System.out.println("Unfortunately, the killer found out that someone was snooping around about Jerry's murder and threatened the boss to reveal your identity. The killer then killed you as well. Game Over!");
							}
							
							System.out.println();
							
						}
						
						public static void neighborLawyer() {
							
							for(int i = 1; i<= 20; i++) {
								System.out.print("*");
							}
							
							System.out.println();
	
							input = new Scanner(System.in);
							System.out.println("You ask Jeremy's neighbor if he has seen anything suspicious. She tells you that she has seen a man, who matches the description of Jeremy's colleague, outside his house arguing. What do you do next?" + "\n" + "1. You set up protection for the neighbor." + "\n" + "2. You pay her for the information." );
							String chcs = input.next();
							
							if(chcs.equals("1")) {
								hangmanLawyer();	
								}
							else {
								System.out.println("Unfortunately, the killer found out that someone was snooping around about Jerry's murder and threatened the neighbor to reveal your identity. The killer then killed you as well. Game Over!");
							}
							
							System.out.println();
						}
								
								static public void hangmanStockTrader() {
									
									for(int i = 1; i<= 20; i++) {
										System.out.print("*");
										}
									
									System.out.println();
									
									System.out.println("You receive an anonymous tip. A muffled voice calls you and tells you that there is important evidence about the murder in a location. However, you were not able to hear the location properly. Now, you have to decode the location.");
									System.out.println("\n" + "You have can only guess wrong 5 times. You many only guess one letter at a time." + "\n");
									
									String secretWord = "clock"; 		//word to guess
									int attempts = 5;
									
									char[] guesses = new char[secretWord.length()];        // new character array called guess, number of characters = to length of secretWord
									int x =0;
										while(x<secretWord.length()) {
											guesses[x] = '_';
												if(secretWord.charAt(x) == ' ') {
													guesses[x] = ' ';
												}
												x++;
										}
											System.out.println(guesses);
											System.out.println("           Lives left: " + attempts);
											
											input = new Scanner(System.in);
											
											ArrayList<Character> list = new ArrayList<Character>();
											
											while(attempts>0) {
												char g= input.next().charAt(0);
												
													if(list.contains(g)) {
														System.out.println("You have already tried this letter. Careful!");
														continue;
													}
												
												list.add(g);
												
												if(secretWord.contains(g + "")) {
													
													for(int i= 0; i< secretWord.length(); i++) {
														if(secretWord.charAt(i)==g) {
															guesses[i] = g;
														}
													}
												}
												
												else {
													attempts --;      //decreases number of lives
												}
												
													if(secretWord.equals(String.valueOf(guesses))) {
														System.out.println(guesses);
														System.out.println("Good Job!!");
														killerStockTrader();
														break;
														
													}
		
												System.out.println(guesses);
												System.out.println("           Lives left: " + attempts);
											}
												if(attempts==0) {
													System.out.println("You were killed before you could decode the location. Game Over!");
												}
												
												System.out.println();
								}
								
								static public void hangmanDoctor() {
									
									for(int i = 1; i<= 20; i++) {
										System.out.print("*");
										}
									
									System.out.println();
									
									System.out.println("You receive an anonymous tip. A muffled voice calls you and tells you that there is important evidence about the murder in a location. However, you were not able to hear the location properly. Now, you have to decode the location.");
									System.out.println("\n" + "You have can only guess wrong 5 times. You many only guess one letter at a time." + "\n");
									
									String secretWord = "drawer"; 		//word to guess
									int attempts = 5;
									
									char[] guesses = new char[secretWord.length()];        // new character array called guess, number of characters = to length of secretWord
									int x =0;
										while(x<secretWord.length()) {
											guesses[x] = '_';
												if(secretWord.charAt(x) == ' ') {
													guesses[x] = ' ';
												}
												x++;
										}
											System.out.println(guesses);
											System.out.println("           Lives left: " + attempts);
											
											input = new Scanner(System.in);
											
											ArrayList<Character> list = new ArrayList<Character>();
											
											while(attempts>0) {
												char g= input.next().charAt(0);
												
													if(list.contains(g)) {
														System.out.println("You have already tried this letter. Careful!");
														continue;
													}
												
												list.add(g);
												
												if(secretWord.contains(g + "")) {
													
													for(int i= 0; i< secretWord.length(); i++) {
														if(secretWord.charAt(i)==g) {
															guesses[i] = g;
														}
													}
												}
												
												else {
													attempts --;      //decreases number of lives
												}
												
													if(secretWord.equals(String.valueOf(guesses))) {
														System.out.println(guesses);
														System.out.println("Good Job!!");
														killerDoctor();
														break;
													}
		
												System.out.println(guesses);
												System.out.println("           Lives left: " + attempts);
											}
												if(attempts==0) {
													System.out.println("You were killed before you could decode the location. Game Over!");
												}
												
												System.out.println();
									}
								
								static public void hangmanLawyer() {
									
									for(int i = 1; i<= 20; i++) {
										System.out.print("*");
										}
									
									System.out.println();
									
									System.out.println("You receive an anonymous tip. A muffled voice calls you and tells you that there is important evidence about the murder in a location. However, you were not able to hear the location properly. Now, you have to decode the location.");
									System.out.println("\n" + "You have can only guess wrong 5 times. You many only guess one letter at a time." + "\n");
									
									String secretWord = "vase"; 		//word to guess
									int attempts = 5;
									
									char[] guesses = new char[secretWord.length()];        // new character array called guess, number of characters = to length of secretWord
									int x =0;
										while(x<secretWord.length()) {
											guesses[x] = '_';
												if(secretWord.charAt(x) == ' ') {
													guesses[x] = ' ';
												}
												x++;
										}
											System.out.println(guesses);
											System.out.println("           Lives left: " + attempts);
											
											input = new Scanner(System.in);
											
											ArrayList<Character> list = new ArrayList<Character>();
											
											while(attempts>0) {
												char g= input.next().charAt(0);
												
													if(list.contains(g)) {
														System.out.println("You have already tried this letter. Careful!");
														continue;
													}
												
												list.add(g);
												
												if(secretWord.contains(g + "")) {
													
													for(int i= 0; i< secretWord.length(); i++) {
														if(secretWord.charAt(i)==g) {
															guesses[i] = g;
														}
													}
												}
												
												else {
													attempts --;      //decreases number of lives
												}
												
													if(secretWord.equals(String.valueOf(guesses))) {
														System.out.println(guesses);
														System.out.println("Good Job!!");
														killerLawyer();
														break;
													}
		
												System.out.println(guesses);
												System.out.println("           Lives left: " + attempts);
											}
												if(attempts==0) {
													System.out.println("You were killed before you could decode the location. Game Over!");
												}
												
												System.out.println();
								}
													public static void killerStockTrader() {
														
														for(int i = 1; i<= 20; i++) {
															System.out.print("*");
															}
														
														System.out.println();
														
														input = new Scanner(System.in);
														System.out.println("By decoding the location, you have figured out that there is evidence behind the clock in Jerry's house. You find a file that has the finances of other companies.");
														System.out.println("What do you think Jerry was killed for?" + "\n" + "1. Black Money" + "\n" + "2. Insider Trading" + "\n" + "3. Insurance Fraud");
														String gx = input.nextLine();
														
															if(gx.equals("1")) {
																System.out.println("Jerry was not killed for black money. Since you were not able to identify the right crime, the killer found you and killed you. Game Over!");
															}
															else if(gx.equals("2")) {
																finalStockTrader();
															}
															else if(gx.equals("3")) {
																System.out.println("Jerry was not killed for insurance fraud. Since you were not able to identify the right crime, the killer found you and killed you. Game Over!");
															}
															else {
																System.out.println("Invalid Input.");
															}
														
														System.out.println();
														
													}
														
													public static void killerDoctor() {
														
														for(int i = 1; i<= 20; i++) {
															System.out.print("*");
															}
														
														System.out.println();
														
														input = new Scanner(System.in);
														System.out.println("By decoding the location, you have figured out that there is evidence in the drawer in Jerry's house. You find a file that has a patient's medical file.");
														System.out.println("What do you think Jerry was killed for?" + "\n" + "1. Prescription Drugs" + "\n" + "2. Incorrect Diagnosis" + "\n" + "3. Failed Surgery");
														String gx = input.nextLine();
															
															if(gx.equals("1")) {
																System.out.println("Jerry was not killed for prescription drugs. Since you were not able to identify the right crime, the killer found you and killed you. Game Over!");
															}
															else if(gx.equals("2")) {
																finalDoctor();
															}
															else if(gx.equals("3")) {
																System.out.println("Jerry was not killed for a failed surgerys. Since you were not able to identify the right crime, the killer found you and killed you. Game Over!");
															}
															else {
																System.out.println("Invalid Input.");
															}
														
														System.out.println();
													}
													
													public static void killerLawyer() {
														
														for(int i = 1; i<= 20; i++) {
															System.out.print("*");
															}
														
														System.out.println();
														
														input = new Scanner(System.in);
														System.out.println("By decoding the location, you have figured out that there is evidence in a vase in Jerry's house. You find a file that has a personal bank statement.");
														System.out.println("What do you think Jerry was killed for?" + "\n" + "1. Losing a Case" + "\n" + "2. Bribery" + "\n" + "3. Unfavorable Verdict");
														String gx = input.nextLine();
														
															if(gx.equals("1")) {
																System.out.println("Jerry was not killed for losing a case. Since you were not able to identify the right crime, the killer found you and killed you. Game Over!");
															}
															else if(gx.equals("2")) {
																finalLawyer();
															}
															else if(gx.equals("3")) {
																System.out.println("Jerry was not killed for an unfavorable verdict. Since you were not able to identify the right crime, the killer found you and killed you. Game Over!");
															}
															else {
																System.out.println("Invalid Input.");
															}
														
														System.out.println();
													}
															
															public static void finalStockTrader() {
																 
																for(int i = 1; i<= 20; i++) {
																	System.out.print("*");
																	}
																
																System.out.println();
																
																input = new Scanner(System.in);
																System.out.println("Based on all the evidence, you have concluded that Jerry had evidence of his boss's involvement with insider trading. Therefore, his boss murdered him.");
																System.out.println("Where do you think the boss is hiding out?" + "\n" + "1. the basement of his company" + "\n" + "2. an empty warehouse");
																String gg = input.nextLine();
																
																if(gg.equals("1")) {
																	System.out.println("You successfully found the boss and was able to turn him. Congratulations, you got Jerry the justice he deserves.");
																}
																else if(gg.equals("2")) {
																	System.out.println("The boss was not at the warehouse. Unfortunately, he found out that you were onto him and had you killed. Game Over!");
																}
																else {
																	System.out.println("Invalid Input.");
																}
																
																System.out.println();
																
															}
															
															public static void finalDoctor() {
																 
																for(int i = 1; i<= 20; i++) {
																	System.out.print("*");
																	}
																
																System.out.println();
																
																input = new Scanner(System.in);
																System.out.println("Based on all the evidence, you have concluded that Jerry had evidence of his neighbor's involvement with a wrongful diagnosis of a patient for money. Therefore, his neighbor murdered him.");
																System.out.println("Where do you think the neigbor is hiding out?" + "\n" + "1. a secret room in his house" + "\n" + "2. an empty warehouse");
																String gg = input.nextLine();
																
																if(gg.equals("1")) {
																	System.out.println("You successfully found the neighbor and was able to turn him. Congratulations, you got Jerry the justice he deserves.");
																}
																else if(gg.equals("2")) {
																	System.out.println("The neighbor was not at the warehouse. Unfortunately, she found out that you were onto her and had you killed. Game Over!");
																}
																else {
																	System.out.println("Invalid Input.");
																}
																
																System.out.println();
																
															}
															
															public static void finalLawyer() {
																 
																for(int i = 1; i<= 20; i++) {
																	System.out.print("*");
																	}
																
																System.out.println();
																
																input = new Scanner(System.in);
																System.out.println("Based on all the evidence, you have concluded that Jerry had evidence of his colleague's involvement with bribery from a client. Therefore, his colleague murdered him.");
																System.out.println("Where do you think the colleague is hiding out?" + "\n" + "1. a secret room in his firm" + "\n" + "2. an empty warehouse");
																String gg = input.nextLine();
																
																if(gg.equals("1")) {
																	System.out.println("You successfully found the colleague and was able to turn him. Congratulations, you got Jerry the justice he deserves.");
																}
																else if(gg.equals("2")) {
																	System.out.println("The colleague was not at the warehouse. Unfortunately, she found out that you were onto her and had you killed. Game Over!");
																}
																else {
																	System.out.println("Invalid Input.");
																}
																
																System.out.println();
																
															}
								
									
										
										
									
}
					
			
	
	
