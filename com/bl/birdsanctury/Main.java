package com.bl.birdsanctury;

		public class Main {
			
		public static void main(String[] args) {
			
		Parrot parrot   = new Parrot();
		Duck duck      = new Duck();
		ostrich ostrich = new ostrich();
		Penguin penguin = new Penguin();
		
		BirdSanctuaryRepository Ab = new BirdSanctuaryRepository();
		Ab.add(duck);
		Ab.add(ostrich);
		Ab.add(penguin);
		Ab.add(parrot);
		
		Ab.print();
		}
		}