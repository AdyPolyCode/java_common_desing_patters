package facade;

public class GraphicalProcessingUnit implements IComponent {
    private void renderImage() {
        System.out.println("Rendering image");
    }

    @Override
    public void run() {
        renderImage();
    }
}
