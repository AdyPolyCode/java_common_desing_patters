package facade;

public class RandomAccessMemory implements IComponent {
    private void storeAtLocation() {
        System.out.println("Storing data at: #a4gdf12sc  location");
    }

    @Override
    public void run() {
        storeAtLocation();
    }
}
