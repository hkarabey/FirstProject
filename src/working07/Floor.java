package working07;

public class Floor {
    public static void main(String[] args) {
        int floorNumber=4;
if (floorNumber==1||floorNumber==2||floorNumber==3){
    switch (floorNumber){
        case 1:
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            break;
        case 2:
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
            break;
        case 3:
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            break;
    }

}
else{
    System.out.println("invalid floor");
}

    }

}
