public class OOPS {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setcolor("Blue");
        p.settip(5);
        System.out.println("The Color of the pen is:" + p.getcolor());
        System.out.println("The tip value is:" + p.gettip());
    }
}

class Pen {
    String color;
    int tip;

    public void setcolor(String col) {
        this.color = col;
    }

    public void settip(int tip) {
        this.tip = tip;
    }

    public String getcolor() {
        return color;
    }

    public int gettip() {
        return tip;
    }
}