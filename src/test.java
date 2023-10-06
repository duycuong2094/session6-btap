public class test {
    public static void main(String[] args) {
        String x=" Rikei_Academy_Viet_Nam ";
        x=x.trim();
        int index=x.indexOf("_");
        String y=x.substring(0,index);
        System.out.println(y);



    }
}
