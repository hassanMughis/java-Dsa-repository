public class car_at {
    private String Model;
    private String color;
    private int year;
    private double mileage;
    static int status1 = 1;
    static int Status2 = 1;

    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
        Model = model;
    }
    public String getcolor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if (year >= 1885){
            this.year = year;
        }
        else {
            System.out.println("error");
            status1 = 0;
        }
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {

        if (mileage >= 0){
            this.mileage = mileage;
        }
        else {
            System.out.println("error");
            Status2 = 0;
        }

    }
    public static void main(String[] argu){

    }
}
