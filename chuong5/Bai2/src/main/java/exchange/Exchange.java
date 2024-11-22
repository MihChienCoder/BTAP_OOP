package exchange;

import java.util.ArrayList;

public class Exchange {
    
    ArrayList<Rate> Arr = new ArrayList<>();

    String[] MonArr = new String[5];

    public Exchange() {
        MonArr[0] = "USD;VND;1700";
        MonArr[1] = "EUR;USD;1700";
        MonArr[2] = "USD;IDN;15789";
        MonArr[3] = "USD;EUR;0.83";
        MonArr[4] = "CAD;IDN;16869";
        for (String x : MonArr) {
            String[] parts = x.split(";");
            String code1 = parts[0];
            String code2 = parts[1];
            Double rate = Double.parseDouble(parts[2]);
            Arr.add(new Rate(code1, code2, rate));
        }
    }

    public Rate findRate(String code1, String code2) {
        for (Rate r : Arr) {
            if (r.getCode1().equals(code1) && r.getCode2().equals(code2)) {
                return r;
            }
        }
        return null;
    }

    public double convert(String code1, String code2, double amount) {
        Rate rate = findRate(code1, code2);
        double money = amount*rate.getRate();
        return money;
    }
}
