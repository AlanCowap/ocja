/**
 * Sample code to demonstrate usage of Constructors
 *	
 * @author Alan Cowap
 * @version 1.0 Basic classes
 * 
 * Default constructor created iff [sic] no other constructor is explicitly defined
 * Implicit call to super() created iff no other call to this(~) or super(~)
 * Explicit call to super(~) or this(~) must be first expression in constructor
 * 
 */

class ShipApp{
	public static void main(String[] args){
		BattleShip bs = new BattleShip("Enterprise", 5);
		Frigate fri = new Frigate();
		Frigate f = new Frigate("Defiant");
	}
}


class Ship{
	String name;
	Ship(){ //contains implicit call to super()
	}
	Ship(String name){ //contains implicit call to super()
		this.name = name;
	}
}

class BattleShip extends Ship{
	private int numGuns;
	BattleShip(int numberOfGuns){ //contains implicit call to super()
		this("Un-named", numberOfGuns);		
	}
	BattleShip(String name, int numberOfGuns){
		super(name);
		this.numGuns = numberOfGuns;
	}
}

class Frigate extends Ship{
	Frigate(){ //contains implicit call to super()
	}

	Frigate(String name){
		super(name);
	}
}

