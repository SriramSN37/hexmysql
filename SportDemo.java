public class SportDemo {
    public static void main(String[] args) {
        Sport football = new Sport("Football", "Team Sport", 11);
        Sport tennis = new Sport("Tennis", "Individual Sport", 2);
        Sport basketball = new Sport("Basketball", "Team Sport", 5);
        System.out.println("Football Information:");
        football.displayInfo();
        System.out.println("\nTennis Information:");
        tennis.displayInfo();
        System.out.println("\nBasketball Information:");
        basketball.displayInfo();
        tennis.setPlayers(1);
        System.out.println("\nUpdated Tennis Information:");
        tennis.displayInfo();
    }
}