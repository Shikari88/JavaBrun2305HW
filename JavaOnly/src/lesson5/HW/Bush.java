package lesson5.HW;

public class Bush extends Plant {
    public Bush() {

    }

    public Bush(double height, double width){
        super(height, width);
    }

    @Override
    public void grow() {
        System.out.println("Высота куста: " + height +
                "; Ширина куста: " + (width + (width * 0.05)));
    }
}
