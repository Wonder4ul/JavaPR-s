package Human;

public class Leg{
        private int ls;
        public int getLegSize(int ls){
            return ls;
        }
        public void setLegSize(int ls){
            this.ls=ls;
        }
        public void legInfo(){
            System.out.println("Leg size is "+ls);
        }
}

