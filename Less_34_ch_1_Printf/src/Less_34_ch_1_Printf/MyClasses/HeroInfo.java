package Less_34_ch_1_Printf.MyClasses;

public class HeroInfo {
    public void heroInfo(MyHero hero){
        System.out.printf("Герой с id = %3$03d, это - %-9s %-9s - возраст героя - %4$03d, опыт - %5$03.2f \n",
                hero.getHeroName(),
                hero.getHeroSurname(),
                hero.getHeroBaseId(),
                hero.getHeroAge(),
                hero.getHeroExperience());
    }
}
