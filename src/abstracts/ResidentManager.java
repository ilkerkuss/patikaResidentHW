package abstracts;

import concretes.House;
import concretes.SummerHouse;
import concretes.Villa;
import enums.ResidentType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ResidentManager {
    private static ResidentManager residentManagerInstance;

    private List<Resident> residentList = new ArrayList<>();

    private ResidentManager() {

    }

    public static synchronized ResidentManager getInstance() {
        if (residentManagerInstance == null) {
            residentManagerInstance = new ResidentManager();
        }
        return residentManagerInstance;
    }

    public Resident getResident(ResidentType residentType, double residentCost, int houseSize, int roomQuantity, int loungeQuantity) {
        Resident resident = null;

        switch (residentType){
            case HOUSE :{
                resident =new House(residentCost,houseSize,roomQuantity,loungeQuantity);
                break;
            }
            case VILLA:{
                resident= new Villa(residentCost,houseSize,roomQuantity,loungeQuantity);
                break;
            }
            case SUMMERHOUSE:{
                resident =new SummerHouse(residentCost,houseSize,roomQuantity,loungeQuantity);
                break;
            }
            default:
                break;
        }
        residentList.add(resident);
        return resident;
    }

    public List<Resident> getHouses(){
        return residentList.stream()
                .filter(resident -> resident instanceof House).collect(Collectors.toList());
    }

    public List<Resident> getVillas(){
        return residentList.stream()
                .filter(resident -> resident instanceof Villa).collect(Collectors.toList());
    }
    public List<Resident> getSummerHouses(){
        return residentList.stream()
                .filter(resident -> resident instanceof SummerHouse).collect(Collectors.toList());
    }

    public double totalHousePrice() {

        return residentList.stream()
                .filter(resident -> resident instanceof House)
                .mapToDouble(Resident::getResidentCost)
                .sum();
    }

    public double totalVillaPrice() {
        return residentList.stream()
                .filter(resident -> resident instanceof Villa)
                .mapToDouble(Resident::getResidentCost)
                .sum();
    }

    public double totalSummerHousePrice() {
        return residentList.stream()
                .filter(resident -> resident instanceof SummerHouse)
                .mapToDouble(Resident::getResidentCost)
                .sum();
    }

    public double totalResidentPrice() {
        return residentList.stream()
                .mapToDouble(Resident::getResidentCost)
                .sum();
    }

    public double averageHouseSize() {
        return residentList.stream()
                .filter(resident -> resident instanceof House)
                .mapToDouble(Resident::getHouseSize)
                .average()
                .orElse(0);
    }

    public double averageVillaSize() {
        return residentList.stream()
                .filter(resident -> resident instanceof Villa)
                .mapToDouble(Resident::getHouseSize)
                .average()
                .orElse(0);
    }

    public double averageSummerHouseSize() {
        return residentList.stream()
                .filter(resident -> resident instanceof SummerHouse)
                .mapToDouble(Resident::getHouseSize)
                .average()
                .orElse(0);
    }

    public double averageResidentHouseSize() {
        return residentList.stream()
                .mapToDouble(Resident::getHouseSize)
                .average()
                .orElse(0);
    }

    public List<Resident> listResidentsWithRoomAndLoungeQuantity(){
        return residentList.stream()
                .sorted(Comparator.comparingInt(Resident::getRoomQuantity).reversed()
                        .thenComparing(Comparator.comparingInt(Resident::getLoungeQuantity).reversed()))
                .collect(Collectors.toList());
    }

    public List<Resident> getResidentList() {
        return residentList;
    }
}
