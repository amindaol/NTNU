public class valuta {
    
    private String name;
    private double exchangeRate;
    private String code;

    public valuta (String name, double exchangeRate, String code) {
        this.name = name;
        this.exchangeRate = exchangeRate;
        this.code = code;

    }

    public String getName() {
        return name;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public String getCode() {
        return code;
    }

}