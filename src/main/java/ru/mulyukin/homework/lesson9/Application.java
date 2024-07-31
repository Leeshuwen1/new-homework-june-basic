package ru.mulyukin.homework.lesson9;


public class Application {
    public static void main(String[] args) {
        User user = new User("Мулюкин", "Алексей", "Владимирович", 1986, "adiott52@gmail.com");
        User[] users = {
                new User("Мулюкин", "Алексей", "Владимирович", 1986, "adiott52@gmail.com"),
                new User("Мулюкина", "Алена", "Валерьевна", 1989, "Hellenocha@yandex.ru"),
                new User("Мулюкина", "Майя", "Алексеевна", 2013, "Maiya@zlaya.ru"),
                new User("Никулина", "Светлана", "Ивановна", 1965, "Sveta@gmail.com"),
                new User("Мулюкин", "Владимир", "Юрьевич", 1960, "Vovan52@gmail.com"),
                new User("Мулюкина", "Ирина", "Александровна", 1961, "irka@gmail.com"),
                new User("Мулюкин", "Матис", "Алесеевич", 2021, "SisterLichinkaMaiskiyBug@gmail.com"),
                new User("Мулюкин", "Рудя", "Алесеевич", 2020, "sikanayMish@gmail.com"),
                new User("Мулюкин", "Рембо", "Алесеевич", 2020, "MishKladovay1@gmail.com"),
                new User("Шевченко", "Александр", "Петрович", 1943, "Deda@gmail.com")
        };
        for (User elem : users) {
            if (elem.getYearOfBirth() < 1984) {
                System.out.println(elem);
            }
        }
        user.info();
        Box box = new Box("White", 5);
        box.info();
        box.isOpen(true);
        box.put("Pen");
        box.put("Car");
        box.output();
        box.put("Car");
        box.put("Труп");
        box.setColor("Green");
        box.info();

    }
}
