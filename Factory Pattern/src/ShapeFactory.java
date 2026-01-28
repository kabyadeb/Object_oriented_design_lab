public class ShapeFactory {
    public static Shape getShape(String st){
        if(st == null)
            return null;
        else if(st.equalsIgnoreCase("circle"))
            return new Circle();
        else if(st.equalsIgnoreCase("rectengular"))
            return new Rectengular();
        else if(st.equalsIgnoreCase("square"))
            return new Square();
        return null;
    }
}
