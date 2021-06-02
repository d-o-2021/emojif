import java.awt.*;//OR
//import java.awt.Frame;
//import java.awt.Graphics;
class FDemo extends Frame
{
    Color cs=new Color(255,255,147);
    Color cw=new Color(255,255,255);
    FDemo()
    {
        setVisible(true);
        setLocation(300,200);
        setSize(300,300);
        setBackground(Color.pink);
        setForeground(cs);
        setTitle("MyFace Emoji");
        
    }
    public void paint(Graphics g) 
    {
        g.fillRoundRect(100,120,100,80,14,14);
        g.fillArc(100,170,100,50,180,180);//lower
        Color cb=new Color(0,0,0);
        g.setColor(cb);
        g.fillArc(100,99,100,60,0,180);//hair
        g.setColor(cs);
        g.fillArc(88,140,30,30,90,180);//Lear
        g.setColor(cb);
        g.fillArc(97,120,20,40,90,180);//Lhalfhair
        g.setColor(cs);
        g.fillArc(183,140,30,30,270,180);//Rear
        g.setColor(cb);
        g.fillArc(183,120,20,40,270,180);//rhalfhair
        g.fillArc(115,144,27,10,0,180);//Leyebrow
        g.fillArc(155,144,27,10,0,180);//Reyebrow
        g.setColor(cw);
        
        g.fillArc(117,152,24,15,0,360);//Leye
        g.fillArc(157,152,24,15,0,360);//Reye
        g.setColor(cb);
        g.drawArc(117,152,24,15,0,360);
        g.drawArc(157,152,24,15,0,360);
        int xa=117;
        /*for(;xa<=117;xa++){
        for(xa=117;xa<=124;xa++)
        {
        g.fillArc(xa,152,15,15,0,360);
        }       
        xa=117;}
        g.fillArc(157,152,15,15,0,360);*/                           //working on blinking or moving of eyes
        /*while(true){
        //g.fillArc(117,152,15,15,0,360);
        try{Thread.sleep(100);
        g.fillArc(117,152,15,15,0,360);
        g.fillArc(157,152,15,15,0,360);}catch(Exception e){}
        continue;}
        //g.fillArc(157,152,15,15,0,360);*/
        g.drawArc(139,170,20,15,180,180);//nose
        g.drawArc(129,183,40,20,180,180);//smile
        g.setColor(Color.red);
        g.fillArc(139,193,20,20,180,180);
        g.setColor(cb);;
        g.fillArc(125,152,15,15,0,360);
        try{Thread.sleep(500);}catch(Exception e){}
        g.fillArc(125,152,15,15,0,360);
        try{Thread.sleep(500);}catch(Exception e){}
        g.fillArc(125,152,15,15,0,360);
        try{Thread.sleep(50);}catch(Exception e){}
        g.fillArc(125,152,15,15,0,360);
        
        
        g.fillArc(157,152,15,15,0,360);
        try{Thread.sleep(500);}catch(Exception e){}
        g.fillArc(157,152,15,15,0,360);
        try{Thread.sleep(500);}catch(Exception e){}
        g.fillArc(157,152,15,15,0,360);
        try{Thread.sleep(50);}catch(Exception e){}
        g.fillArc(157,152,15,15,0,360);
        
     }
}
class Demo16
{
    public static void main(String ar[])
    {
        FDemo f=new FDemo();
    }
}
