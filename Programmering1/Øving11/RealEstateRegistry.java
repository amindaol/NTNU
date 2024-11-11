package edu.ntnu.idi.idatt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RealEstateRegistry {

  private final List<RealEstate> realEstatesList;
  private final Map<String, RealEstate> realEstateMap;

  public RealEstateRegistry() {
    realEstatesList = new ArrayList<>();
    realEstateMap = new HashMap<>();
  }

  public void addRealEstate(RealEstate realEstate) {
    realEstatesList.add(realEstate);
    realEstateMap.put(realEstate.getEstateID(), realEstate);
  }

  public void removeRealEstate(RealEstate realEstate) {
    realEstatesList.remove(realEstate);
    realEstateMap.remove(realEstate.getEstateID());
  }

  public int getNumberOfEstates() {
    return realEstatesList.size();
  }

  public RealEstate getRealEstate(String estateID) {
    return realEstateMap.get(estateID);
  }

  public double averageArea() {
    if (realEstatesList.isEmpty()) {
      return 0.0;
    }
    double totalArea = 0.0;
    for (RealEstate realEstate : realEstatesList) {
      totalArea += realEstate.getArea();
    }
    return totalArea / realEstatesList.size();
  }

  public List<RealEstate> findEstateByLotNumber(int lotNumber) {
    List<RealEstate> matchingEstates = new ArrayList<>();

    for (RealEstate realEstate : realEstatesList) {
      if (realEstate.getLotNumber() == lotNumber) {
        matchingEstates.add(realEstate);
      }
    }
    return matchingEstates;
  }
}

