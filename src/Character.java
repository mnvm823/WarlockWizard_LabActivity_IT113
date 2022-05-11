public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(String name){
        this.characterName = name;

    }
    Character(String name, int level, int HP, int manaP){
        this.characterName = name;
        this.level = level;
        this.healthPoints = HP;
        this.manaPoints = manaP;

    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */

    public void displayCharName(){
        System.out.println("Character Initialized : " + this.characterName);
    }

    public void addHealth_Mana(){
        this.healthPoints += 20;
        this.manaPoints += 20;
    }


    public void displayStatus(){

        System.out.println("\nCharacter Name: " + this.characterName);
        System.out.println("Level: " + this.level);
        System.out.println("Health Points: " + this.healthPoints);
        System.out.println("Mana Points: " + this.manaPoints);

        System.out.println("\n----------------------------");
    
    }

    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter,int damagePoints, int ManaPoints){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);
        this.manaPoints -= ManaPoints;

        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */
        
         if (enemyCharacter.healthPoints <= 0){
            System.out.println("\n----------------------------");
            System.out.println("Opponent Character has been defeated!!");
            System.out.println("Battle is ENDED.\n");
            System.out.println(this.characterName + " leveled up!");
            this.level += 10;
            

        }
    
    }


    
    

}