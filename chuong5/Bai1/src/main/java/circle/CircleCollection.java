package circle;

import java.util.ArrayList;

public class CircleCollection {
    protected ArrayList<Circle> al;

    public CircleCollection(ArrayList<Circle> al) {
        this.al = al;
    }

    public CircleCollection() {
        this.al = new ArrayList<Circle>();
    }
    public void addCircle(Circle c){
        this.al.add(c);
    }
    public Circle getCircle(int pos){
        return al.get(pos);
    }    
    public void setCircle(int pos, Circle c){
        al.add(pos, c);
    }

    @Override
    public String toString() {
        return "CircleCollection{" + "al=" + al + '}' + "\n";
    }

    
    
    public double calcSumArea(){
        double sum = 0;
        for(Circle x : al){
            sum += x.getArea();
        }
        return sum;
    }
    public double findMaxArea(){
        double max = 0;
        for(Circle x : al){
            max = Math.max(max, x.getArea());
        }
        return max;
    }
    public double findMinArea(){
        double min = getCircle(0).getArea();
        for(Circle x : al){
            min = Math.min(min, x.getArea());
        }
        return min;
    }
}
