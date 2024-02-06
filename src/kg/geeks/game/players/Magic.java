package kg.geeks.game.players;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }
    private int increaseAmount;
        private int increaseAmount;



        @Override
        public void useSuperAbility.BOOST(Boss boss, Hero[] heroes) {
            for (Hero hero : heroes) {
                hero.setSuperAbility.BOOST(hero.getPower() + increaseAmount);
            }
        }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        // logic of boosting
    }
    public Magic(String name, int health, int power, int increaseAmount) {
        super(name, health, power);
        this.increaseAmount = increaseAmount;
    }

    @Override



}
