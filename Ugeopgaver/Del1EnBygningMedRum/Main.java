public class Main {

    public static void main(String[] args) {

        Building building = new Building("Kontorbygningen");

        // Mødelokale
        Room meetingRoom = new Room("Mødelokale");
        meetingRoom.addLamp(new Lamp(60));
        meetingRoom.addLamp(new Lamp(60));
        meetingRoom.addLamp(new Lamp(100));
        meetingRoom.addWindow(new Window(120, 90));
        meetingRoom.addWindow(new Window(120, 90));

        // Køkken
        Room kitchen = new Room("Køkken");
        kitchen.addLamp(new Lamp(40));
        kitchen.addLamp(new Lamp(40));
        kitchen.addWindow(new Window(60, 60));

        // Kontor
        Room office = new Room("Kontor");
        office.addLamp(new Lamp(80));
        office.addLamp(new Lamp(100));
        office.addWindow(new Window(100, 100));

        // Tilføj rum til bygningen
        building.addRoom(meetingRoom);
        building.addRoom(kitchen);
        building.addRoom(office);

        // Print bygningen
        building.printBuilding();

        // Svar på spørgsmålene
        System.out.println();
        System.out.println("Antal lamper i hele bygningen: "
                + building.getTotalLampCount());

        System.out.println("Samlet wattal: "
                + building.getTotalWatt() + "W");
    }
}