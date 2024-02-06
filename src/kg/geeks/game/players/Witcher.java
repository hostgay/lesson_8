package kg.geeks.game.players;

class Witcher extends Hero {
    private boolean usedAbility;

    public Witcher(String name, int health, int power) {
        super(name, health, power);
        usedAbility = false;
    }

    @Override
    public void useAbility(Boss boss, Hero[] heroes) {
        if (!usedAbility) {
            for (Hero hero : heroes) {
                if (hero.getHealth() <= 0) {
                    hero.setHealth(this.health);
                    this.health = 0;
                    usedAbility = true;
                    break;
                }
            }
        }
    }
}
