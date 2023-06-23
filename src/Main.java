public class Main {
    public static void main(String[] args) {
       System.out.println("What is the home maintenance cost for the spring season?");
       double springCost = 0;
       System.out.println("What is the home maintenance cost for the summer season?");
       double summerCost = 0;
       System.out.println("What is the home maintenance cost for the fall season?");
       double fallCost = 0;
       System.out.println("What is the home maintenance cost for the winter season?");
       double winterCost = 0;
       double yearCost = springCost + summerCost + fallCost + winterCost;
       System.out.println("The total yearly maintenance costs is ($): " + yearCost);

    }
}