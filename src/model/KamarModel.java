package model;

import entity.KamarEntity;

import java.util.ArrayList;

public class KamarModel {
    private static ArrayList<KamarEntity> entityKamar = new ArrayList<>();

    public static void initialKamar(){
        KamarEntity kmr1 = new KamarEntity(109, "Single Room", "tersedia \n");
        KamarEntity kmr2 = new KamarEntity(110, "Single Room", "tersedia \n");
        KamarEntity kmr3 = new KamarEntity(111, "Double Room", "tersedia \n");
        KamarEntity kmr4 = new KamarEntity(112, "Oouble Room", "tersedia \n");
        KamarEntity kmr5 = new KamarEntity(114, "Family Room", "tersedia \n");

        entityKamar.add(kmr1);
        entityKamar.add(kmr2);
        entityKamar.add(kmr3);
        entityKamar.add(kmr4);
        entityKamar.add(kmr5);
    }

    public static ArrayList<KamarEntity> semua(){
        return entityKamar;
    }

    public static void pesanKamar(int nomor){
        for (KamarEntity objKamar : entityKamar){
            if (objKamar.getNoKamar() == nomor){
                objKamar.setStatuskamar("checkin");
            }
        }
    }

    public static void removeKamar(int nomor){
        for (KamarEntity objKamar : entityKamar){
            if (objKamar.getNoKamar() == nomor){
                objKamar.setStatuskamar("checkout");
            }
        }
    }
}
