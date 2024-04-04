package Module4;
/*
 * Задание:
 * Написат программу, которая разбивает текст на отдельные слова
 */
public class News {
    public static void main(String[] args) {
        String s = "People across North America will be treated to the view of a lifetime on Monday when a total solar eclipse is set to span across the continent, from Mexico to the very eastern tip of Canada.\n" +
                "\n" +
                "Hundreds of events are already being planned for 8 April for eclipse watchers to step outside, look into the sky and catch this rare, astronomical phenomenon.\n" +
                "\n" +
                "If you want to be part of the fun, here is our comprehensive guide to where and how to see the eclipse.\n" +
                "\n" +
                "BBC graphic of woman wearing glasses looking at Sun\n" +
                "What is a solar eclipse?\n" +
                "A solar eclipse occurs when the Moon moves between the Earth or the Sun, blocking some or all of the Sun's rays from reaching the Earth.\n" +
                "\n" +
                "The phenomenon is a cosmic event, requiring the Sun, the Moon and the Earth to be in just the right alignment for the Moon to cast a shadow on our planet.\n" +
                "\n" +
                "When this happens, the Moon casts two types of shadows.\n" +
                "\n" +
                "Graphic showing solar eclipse\n" +
                "One results in a partial solar eclipse, which covers only part of the Sun.\n" +
                "\n" +
                "The other - and arguably the most spectacular - is called a total solar eclipse " +
                "where the Sun is entirely covered by the Moon, save for a visible ring of light in the sky.`123143";

        for (String str: s.split("\\W+")) {
            System.out.println(str);
        }
    }

}
