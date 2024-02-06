package kg.geeks.game.players;

public class Hacker {
        private int transferAmount;

        public Hacker(String name, int health, int power, int transferAmount) {
            super(name, health, power);
            this.transferAmount = transferAmount;
        }

        @Override
        public void useAbility(Boss boss, Hero[] heroes) {
            boss.setHealth(boss.getHealth() - transferAmount);
            for (Hero hero : heroes) {
                if (hero.getHealth() > 0) {
                    hero.setHealth(hero.getHealth() + transferAmount);
                    break;
                }
            }
        }
    }
}
