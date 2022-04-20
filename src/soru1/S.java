package soru1;

public class S extends Malzeme{

    /*
    * Bir gumrukte gelen tirlarin yurt disi ve icine geldigi kontrolune gore class ayir
    * getirdigi urunun icerini yazan method ve classlar yapin.
    * */

    public static void main(String[] args) {
        pecete="selpak";
        tuvaletKagidi="solo";
        cimento="cimbeton";
        vitesKolu="otomatik";

        Yurtdisi obj1= new Yurtdisi();
        obj1.setCekici(true);
        obj1.setPlaka("A 22 33");

        System.out.println(obj1);
    }

}
