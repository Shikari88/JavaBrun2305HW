package lesson5.HW;

public class Tree extends Plant {

    public Tree(){

    }
    public Tree(double height, double width){
        super(height, width);
    }
    @Override
    public void grow(){
        System.out.println("Высота дерева: " + (height + (height * 0.9)) + "; Ширина дерева: " + width);
    }
}
