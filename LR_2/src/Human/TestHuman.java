package Human;

public class TestHuman {
    public static void main(String[] args){
        Human h1=new Human("Aleks", 32);
        Human.Head head1=h1.new Head();
        Human.Hand hand1=h1.new Hand();
        Human.Leg leg1=h1.new Leg();
        head1.setHeadSize("Big");
        head1.setHairCl("Red");
        hand1.setHandSize("Large");
        leg1.setLegSize(42);
        System.out.println(h1);
        head1.headInfo();
        hand1.handInfo();
        leg1.legInfo();
    }
}
