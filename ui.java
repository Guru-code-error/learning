import java.awt.*;

class ui extends Frame{
    ui(){
        Button btn= new Button("click mee");
        add(btn);
        setLayout( new FlowLayout());
        setVisible(true);
        setSize(100,100);
    }
    public static void main(String[] arg){
        new ui();

    }
}
