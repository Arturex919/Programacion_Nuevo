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
        int salud=this.health;//guardas tu salud para mostrar
       this.health=Math.min(health+POTION_HEAL,this.maxHealth);
       int curacion=this.health-salud; //calculas cuanto te curaste
        System.out.println(name+" te has tomado una pocion,te has curado un: "+ curacion +"/"+maxHealth);
           }

    public void rest(){
        this.health=Math.min(this.health+REST_HEAL,this.maxHealth);
        System.out.println(name + " ha descansado y ha recuperado salud. Nueva salud: " + this.health +
                "/" + this.maxHealth);
    }

    public String toString(){
        String heroe="Nombre: "+name+"\n"+
                "Level: "+ levelUp +"\n"+
                "❤️ Salud: "+health+"\n"+
                "♨️ Experiencia: "+experience+"\n"+
                "⚔️ Ataque: "+attack+"\n"+
                "🛡️ Defensa: "+defense;
        return heroe;
    }

    //defines el el parametro hero para que ataque
    public void attack(Hero personaje){
        int daño=Math.max(this.attack-personaje.getDefense(),MIN_DAMAGE);
        //llamas a la variable para que el daño se va aplicar al enemigo
        personaje.setHealth(getHealth()-daño);

      this.experience+=ATAQUE_EXPERIENCIA;
        System.out.println(name + " ha atacado a " +personaje.getName() + " causando " + daño + " de daño.");

        if (experience >= LEVELUP_EXPERIENCIA){
            this.levelUpHero();
        }
    }
    public void levelUpHero(){
        this.defense += 1;
        this.attack +=1;
        this.experience -=LEVELUP_EXPERIENCIA;
        this.health +=5;
        this.levelUp++ ;
        System.out.println(name + " ha subido de nivel! Ahora está en el nivel " + this.levelUp);
        System.out.println("Nuevas estadísticas: Salud: " + this.health + "/" + this.maxHealth + ", Ataque: " + this.attack + ", Defensa: " + this.defense);
    }
}
