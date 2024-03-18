import abstracts.Resident;
import abstracts.ResidentManager;

import enums.ResidentType;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        // House,Villa,SummerHouse object creation via ResidentManager.
        ResidentManager.getInstance().getResident(ResidentType.HOUSE, 500000.0, 140, 4, 1);
        ResidentManager.getInstance().getResident(ResidentType.HOUSE, 750000.0, 120, 3, 1);
        ResidentManager.getInstance().getResident(ResidentType.HOUSE, 800000.0, 150, 4, 2);

        ResidentManager.getInstance().getResident(ResidentType.VILLA, 1500000, 200, 5, 1);
        ResidentManager.getInstance().getResident(ResidentType.VILLA, 2500000, 180, 4, 1);
        ResidentManager.getInstance().getResident(ResidentType.VILLA, 3500000, 250, 5, 2);

        ResidentManager.getInstance().getResident(ResidentType.SUMMERHOUSE, 5000000, 200, 5, 1);
        ResidentManager.getInstance().getResident(ResidentType.SUMMERHOUSE, 8000000, 300, 6, 2);
        ResidentManager.getInstance().getResident(ResidentType.SUMMERHOUSE, 10000000, 400, 8, 2);

        // Getters of House,Villa,SummerHouse and all residents
        System.out.println("\n" + "Sistemdeki Evler: ---------------" + "\n");
        System.out.println(ResidentManager.getInstance().getHouses());

        System.out.println("\n" + "Sistemdeki Villa: ---------------" + "\n");
        System.out.println(ResidentManager.getInstance().getVillas());

        System.out.println("\n" + "Sistemdeki Yazlıklar: ---------------" + "\n");
        System.out.println(ResidentManager.getInstance().getSummerHouses());

        System.out.println("\n" + "Sistemdeki Tüm Konutlar: ---------------" + "\n");
        System.out.println(ResidentManager.getInstance().getResidentList());


        //QUESTIONS
        System.out.println("\n" + "------------------------------" + "\n");


        System.out.println("\n" + "1.Soru Evlerin toplam fiyatlarını dönen bir metot :------------" + "\n");
        System.out.println(NumberFormat.getInstance().format(ResidentManager.getInstance().totalHousePrice()) + " TL ");

        System.out.println("\n" + "2.Soru Villaların toplam fiyatlarını dönen bir metot  :------------" + "\n");
        System.out.println(NumberFormat.getInstance().format(ResidentManager.getInstance().totalVillaPrice()) + " TL ");

        System.out.println("\n" + "3.Yazlıkların toplam fiyatlarını dönen metot  :------------" + "\n");
        System.out.println(NumberFormat.getInstance().format(ResidentManager.getInstance().totalSummerHousePrice()) + " TL ");

        System.out.println("\n" + "4.Soru Tüm tipteki evlerin toplam fiyatını dönen metot :------------" + "\n");
        System.out.println(NumberFormat.getInstance().format(ResidentManager.getInstance().totalResidentPrice()) + " TL ");

        System.out.println("\n" + "5.Soru Evlerin ortalama metrekaresini dönen bir metot  :------------" + "\n");
        System.out.println(ResidentManager.getInstance().averageHouseSize() + " M2 ");

        System.out.println("\n" + "6.Soru Villaların ortalama metrekaresini dönen bir metot :------------" + "\n");
        System.out.println(ResidentManager.getInstance().averageVillaSize() + " M2 ");

        System.out.println("\n" + "7.Soru Yazlıkların ortalama metrekaresini dönen metot  :------------" + "\n");
        System.out.println(ResidentManager.getInstance().averageSummerHouseSize() + " M2 ");

        System.out.println("\n" + "8.Soru Tüm tipteki evlerin ortalama metrekaresini dönen metot  :------------" + "\n");
        System.out.println(ResidentManager.getInstance().averageResidentHouseSize() + " M2 ");

        System.out.println("\n" + "9.Soru Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot  :------------" + "\n");
        System.out.println(ResidentManager.getInstance().listResidentsWithRoomAndLoungeQuantity());


    }
}