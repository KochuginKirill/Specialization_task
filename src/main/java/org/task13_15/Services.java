package org.task13_15;

import java.util.*;

public class Services {
    private static ArrayList<Animals> animals = new ArrayList();
    private AnimalEnum animalEnum;
    private static int index = 0;

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        String temp;
        String userTemp;
        try (Counter counter = new Counter()) {
            animals.add(new Cats(counter.getAddedCounter(), "Tyra", new ArrayList<String>(Arrays.asList("Say meow"))));
            animals.add(new Dogs(counter.getAddedCounter(), "Chewe", new ArrayList<String>(Arrays.asList("Lay down", "Sit"))));
            animals.add(new Hamsters(counter.getAddedCounter(), "BigBoi", new ArrayList<String>(Arrays.asList("Die"))));
            animals.add(new Camels(counter.getAddedCounter(), "Iosif", new ArrayList<String>(Arrays.asList("Sit"))));
            animals.add(new Donkeys(counter.getAddedCounter(), "Dinki", new ArrayList<String>(Arrays.asList("Salto"))));
            animals.add(new Horses(counter.getAddedCounter(), "Invincible", new ArrayList<String>(Arrays.asList("Fly"))));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        while (true){
            System.out.println("_____________________________________");
            System.out.println("Введите нужную цифру запроса");
            System.out.println("1 - напечатать всех животных с их командами");
            System.out.println("2 - добавить животное");
            System.out.println("3 - добавить животному команду");
            System.out.println("0 - выйти");
            System.out.print("Поле ввода => ");
            userTemp = scanner.nextLine();
            System.out.println();
            switch (userTemp) {
                case ("1"):
                    for(Animals animal : animals){
                        System.out.println("id: " + animal.getId() + " " +
                            "Имя: " + animal.getName() + " " +
                                "Команды: " + animal.getComands().toString() + " " +
                                    "Вид: " + animal.getClass().getSimpleName());

                    }
                    continue;
                case ("2"):
                    System.out.println("Введите тип животного (Кошка, Собака, Хомяк, Верблюд, Осел, Лошадь)");
                    System.out.print("=>");
                    temp = scanner.nextLine().toLowerCase();
                    System.out.println();
                    animals.add(addAnimal(temp));
                    continue;
                case ("3"):
                    System.out.println("id животного => ");
                    userTemp = scanner.nextLine();
                    animalAddComand(animals, Integer.parseInt(userTemp));
                    System.out.println();
                    continue;
                case ("0"):
                    System.exit(0);
            }
        }
    }

    public static Animals addAnimal(String s){
        String animalName;
        ArrayList <String> animalComands = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        String temp;
        int userChoice;
        switch (s) {
            case ("кошка"):
                System.out.print("Введите имя кошки =>");
                animalName = scanner.nextLine();
                System.out.println();
                temp = "";
                userChoice = 1;
                System.out.println();
                while (userChoice != 2 && userChoice == 1) {
                    System.out.print("Введите доступную кошке команду => ");
                    temp = scanner.nextLine();
                    animalComands.add(temp);
                    temp = "";
                    System.out.print("Нужна ли кошке дополнительная команда? (1 - да, 2 - нет) =>");
                    userChoice = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                }
                try (Counter counter = new Counter()) {
                    return new Cats(counter.getAddedCounter(), animalName, animalComands);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            case("собака"):
                System.out.print("Введите имя собаки =>");
                animalName = scanner.nextLine();
                System.out.println();
                userChoice = 1;
                System.out.println();
                while (userChoice != 2 && userChoice == 1) {
                    System.out.print("Введите доступную собаке команду => ");
                    temp = scanner.nextLine();
                    animalComands.add(temp);
                    temp = "";
                    System.out.print("Нужна ли собаке дополнительная команда? (1 - да, 2 - нет) =>");
                    userChoice = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                }
                try (Counter counter = new Counter()) {
                    return new Dogs(counter.getAddedCounter(), animalName, animalComands);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            case("хомяк"):
                System.out.print("Введите имя хомяка =>");
                animalName = scanner.nextLine();
                System.out.println();
                userChoice = 1;
                System.out.println();
                while (userChoice != 2 && userChoice == 1) {
                    System.out.print("Введите доступную хомяку команду => ");
                    temp = scanner.nextLine();
                    animalComands.add(temp);
                    temp = "";
                    System.out.print("Нужна ли хомяку дополнительная команда? (1 - да, 2 - нет) =>");
                    userChoice = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                }
                try (Counter counter = new Counter()) {
                    return new Hamsters(counter.getAddedCounter(), animalName, animalComands);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            case("верблюд"):
                System.out.print("Введите имя верблюда =>");
                animalName = scanner.nextLine();
                System.out.println();
                userChoice = 1;
                System.out.println();
                while (userChoice != 2 && userChoice == 1) {
                    System.out.print("Введите доступную верблюду команду => ");
                    temp = scanner.nextLine();
                    animalComands.add(temp);
                    temp = "";
                    System.out.print("Нужна ли верблюду дополнительная команда? (1 - да, 2 - нет) =>");
                    userChoice = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                }
                try (Counter counter = new Counter()) {
                    return new Camels(counter.getAddedCounter(), animalName, animalComands);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            case("осел"):
                System.out.print("Введите имя осла =>");
                animalName = scanner.nextLine();
                System.out.println();
                userChoice = 1;
                System.out.println();
                while (userChoice != 2 && userChoice == 1) {
                    System.out.print("Введите доступную ослу команду => ");
                    temp = scanner.nextLine();
                    animalComands.add(temp);
                    temp = "";
                    System.out.print("Нужна ли ослу дополнительная команда? (1 - да, 2 - нет) =>");
                    userChoice = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                }
                try (Counter counter = new Counter()) {
                    return new Donkeys(counter.getAddedCounter(), animalName, animalComands);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            case("лошадь"):
                System.out.print("Введите имя лошади =>");
                animalName = scanner.nextLine();
                System.out.println();
                userChoice = 1;
                System.out.println();
                while (userChoice != 2 && userChoice == 1) {
                    System.out.print("Введите доступную лошади команду => ");
                    temp = scanner.nextLine();
                    animalComands.add(temp);
                    temp = "";
                    System.out.print("Нужна ли лошади дополнительная команда? (1 - да, 2 - нет) =>");
                    userChoice = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                }
                try (Counter counter = new Counter()) {
                    return new Horses(counter.getAddedCounter(), animalName, animalComands);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            default:
                throw new IllegalStateException("Неправильное значение " + s);
        }

    }

    public static void animalAddComand(ArrayList<Animals> animals, int searchId){
        Scanner scanner = new Scanner(System.in);
        String temp;
        for (Animals animal:
             animals) {
            if(animal.getId() == searchId){
                System.out.print("Введите новую команду =>");
                temp = scanner.nextLine();
                animal.addComand(temp);
                System.out.println();
            }
        }
    }

    public AnimalEnum getAnimalEnum(){
        return animalEnum;
    }

}

