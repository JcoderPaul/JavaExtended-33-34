package Less_34_ch_1_Printf.MyClasses;

import java.util.Objects;

public class MyHero {
    private int heroBaseId;
    private String heroName;
    private String heroSurname;
    private int heroAge;
    private double heroExperience;

    public MyHero(int heroBaseId, String heroName, String heroSurname, int heroAge, double heroExperience) {
        this.heroBaseId = heroBaseId;
        this.heroName = heroName;
        this.heroSurname = heroSurname;
        this.heroAge = heroAge;
        this.heroExperience = heroExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyHero myHero = (MyHero) o;
        return heroBaseId == myHero.heroBaseId &&
                heroAge == myHero.heroAge &&
                Double.compare(myHero.heroExperience, heroExperience) == 0 &&
                Objects.equals(heroName, myHero.heroName) &&
                Objects.equals(heroSurname, myHero.heroSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heroBaseId, heroName, heroSurname, heroAge, heroExperience);
    }

    @Override
    public String toString() {
        return "MyHero: {" +
                "heroBaseId=" + heroBaseId +
                ", heroName='" + heroName + '\'' +
                ", heroSurname='" + heroSurname + '\'' +
                ", heroAge=" + heroAge +
                ", heroExperience=" + heroExperience +
                '}';
    }

    public int getHeroBaseId() {
        return heroBaseId;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getHeroSurname() {
        return heroSurname;
    }

    public int getHeroAge() {
        return heroAge;
    }

    public double getHeroExperience() {
        return heroExperience;
    }
}
