package main;

public class Controller {

    ModelList modelList;

    public Controller(){
        this.modelList = new ModelList();
    }

    public int[] createArray(){
        return modelList.createOurArray();
    }

    public void compareArray(double firstAverage, double secondAverage){
        modelList.compareArray(firstAverage, secondAverage);
    }

    public double averageArray(int[] array) {
        return modelList.getArrayAverage(array);
    }
}
