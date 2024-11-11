package edu.ntnu.idi.idatt;

public class RealEstate {

  private final int municipalityNumber;
  private final String municipalityName;
  private final int lotNumber;
  private int sectionNumber;
  private String name;
  private double area;
  private String nameOfOwner;
  private final String estateID;

  public RealEstate(int municipalityNumber, String municipalityName, int lotNumber,
      int sectionNumber,
      String name, double area, String nameOfOwner) {
    this.municipalityNumber = municipalityNumber;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.name = name;
    this.area = area;
    this.nameOfOwner = nameOfOwner;
    this.estateID = createEstateID();
  }

  public int getMunicipalityNumber() {
    return municipalityNumber;
  }

  public String getMunicipalityName() {
    return municipalityName;
  }

  public int getLotNumber() {
    return lotNumber;
  }

  public int getSectionNumber() {
    return sectionNumber;
  }

  public String getName() {
    return name;
  }

  public double getArea() {
    return area;
  }

  public String getNameOfOwner() {
    return nameOfOwner;
  }

  public String getStateID() {
    return estateID;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public void setNameOfOwner(String nameOfOwner) {
    this.nameOfOwner = nameOfOwner;
  }

  public String createEstateID() {
    return municipalityNumber + "-" + lotNumber + "/" + sectionNumber;
  }

  public String getEstateID() {
    return estateID;
  }

}

