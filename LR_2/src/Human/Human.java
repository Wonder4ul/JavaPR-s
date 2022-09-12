package Human;

public class Human {
    public String name;
    public int age;
    public Human(String n, int a){
        name=n;
        age=a;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
        public class Head{
            private String hairCl;
            private String headSize;
            public String getHeadSize(String headSize){
                return headSize;
            }
            public void setHeadSize(String headSize){
                this.headSize=headSize;
            }
            public String getHairCl(String hairCl){
                return hairCl;
            }
            public void setHairCl(String hairCl){
                this.hairCl=hairCl;
            }
            public void headInfo(){
                System.out.println("Head size is "+headSize+"; Hair color is "+hairCl);
            }
        }
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
        public class Hand{
            private String hs;
            public String getHandSize(String hs){
                return hs;
            }
            public void setHandSize(String hs){
                this.hs=hs;
            }
            public void handInfo(){
                System.out.println("Hand size is "+hs);
            }
        }
        public String toString(){
        return this.name+", age "+this.age;
        }
}
