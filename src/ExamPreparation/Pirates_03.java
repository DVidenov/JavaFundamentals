package ExamPreparation;

import java.util.*;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        Map<String, List<Integer>> cities = new LinkedHashMap<>();

        while (!userInput.equals("Sail")) {
            String[] cityData = userInput.split("\\|\\|");
            String cityName = cityData[0];
            int population = Integer.parseInt(cityData[1]);
            int gold = Integer.parseInt(cityData[2]);
            if (cities.containsKey(cityName)){
                List<Integer> currentCityData = cities.get(cityName);
                int currentCityPopulation = currentCityData.get(0);
                int currentCityGold = currentCityData.get(1);
                currentCityData.set(0, currentCityPopulation + population);
                currentCityData.set(1, currentCityGold + gold);
                cities.put(cityName, currentCityData);
            }else {
                cities.put(cityName, Arrays.asList(population, gold));
            }
            userInput = scanner.nextLine();
        }

        userInput = scanner.nextLine();

        while (!userInput.equals("End")){
            String[] commandParts = userInput.split("=>");
            String commandName = commandParts[0];
            String cityName = commandParts[1];
            switch (commandName){
                case "Plunder":
                    int peopleKilled = Integer.parseInt(commandParts[2]);
                    int goldStolen = Integer.parseInt(commandParts[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed", cityName, goldStolen, peopleKilled);

                    int peopleBeforePlunder = cities.get(cityName).get(0);
                    int goldBeforePlunder = cities.get(cityName).get(1);

                    int remainingPeople = peopleBeforePlunder - peopleKilled;
                    int remainingGold = goldBeforePlunder - goldStolen;

                    

                    if (remainingPeople <= 0 || remainingGold <= 0){
                        System.out.printf("%s has wiped off the map!", cityName);
                        cities.remove(cityName);
                        break;
                    }
                    cities.put(cityName, Arrays.asList(remainingPeople, remainingGold));
                    break;
                case "Prosper":
                    break;
            }
            userInput = scanner.nextLine();
        }

        cities.entrySet().stream().forEach(entry -> System.out.println( entry.getKey() + " " + entry.getValue().get(0) + " " + entry.getValue().get(1)));
    }
}
