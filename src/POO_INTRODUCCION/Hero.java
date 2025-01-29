package POO_INTRODUCCION;

public class Hero {
    //cons evita los magic numbers
     private static final int POTION_HEAL=10;//puntos minimo de saluig
     private static final int REST_HEAL=50;//puntos max de salud
     private static final int MIN_DAMAGE=10;//ataque minimo
     private static final int ATAQUE_EXPERIENCIA=10;//experiencia min por ataque
     private static final int LEVELUP_EXPERIENCIA =50;//experiencia max al nivel

    //atributos heroe
    private String name;
    private int levelUp;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    public Hero() {
        this.name = " ";
        this.levelUp = 1;
        this.health = 0;
        this.maxHealth = 0;
        this.experience=0;
        this.attack = 0;
        this.defense = 0;
    }

    public Hero(String name, int levelUp, int health, int maxHealth, int experience, int attack, int defense) {
        this.name = name;
        this.levelUp = levelUp;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }
    //getters

    public int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getExperience() {
        return experience;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public int getLevelUp() {
        return levelUp;
    }

    public String getName() {
        return name;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setLevelUp(int levelUp) {
        this.levelUp = levelUp;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    //metodos
    public void drinkPotion(){
       this.health=Math.min(health+POTION_HEAL,maxHealth);
        System.out.println(name+" te has tomado una pocion,te has curado un: "+ health +"/"+maxHealth);
           }

    public void rest(){
        this.health=Math.min(health+50,maxHealth);
        System.out.println(name + " ha descansado. Salud: " + this.health + "/" + this.maxHealth);
    }

    public String toString(){
        String heroe="Nombre: "+name+"\n"+"Level: "+ levelUp +"\n"+"❤️ Salud: "+health+"\n"+
                "♨️ Experiencia: "+experience+"\n"+"⚔️ Ataque: "+attack+"\n"+"🛡️ Defensa: "+defense;
        return heroe;
    }

    public void attack(){
        int daño=Math.max(attack-defense,MIN_DAMAGE);
      this.health -= daño;

      this.experience+=ATAQUE_EXPERIENCIA;
        System.out.println(name + " ha atacado a " + name + " causando " + daño + " de daño.");

        if (experience >= LEVELUP_EXPERIENCIA){
            levelUp++;
        }
    }
    public void levelUp(){
        this.defense += 1;
        this.attack +=1;
        this.experience +=0;
        this.health +=5;
        this.levelUp++ ;
        this.experience-=LEVELUP_EXPERIENCIA;
        System.out.println(name + " ha subido de nivel! Ahora está en el nivel " + this.levelUp);
        System.out.println("Nuevas estadísticas: Salud: " + this.health + "/" + this.maxHealth + ", Ataque: " + this.attack + ", Defensa: " + this.defense);
    }
}
