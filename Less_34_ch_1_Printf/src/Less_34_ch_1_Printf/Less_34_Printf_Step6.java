package Less_34_ch_1_Printf;
/*
Пример форматирования и вывода персонажей на экран.
*/
import Less_34_ch_1_Printf.MyClasses.HeroInfo;
import Less_34_ch_1_Printf.MyClasses.MyHero;

public class Less_34_Printf_Step6 {
    public static void main(String[] args) {
        MyHero sanara =
                new MyHero(212, "Санара","Куэста", 18, 4.3);
        MyHero duglas =
                new MyHero(122, "Дуглас","Линд", 19, 3.8);
        MyHero mel =
                new MyHero(34, "Малкольм","Стоун", 18, 6.2);

        HeroInfo info = new HeroInfo();
        info.heroInfo(sanara);
        info.heroInfo(duglas);
        info.heroInfo(mel);
    }
}
