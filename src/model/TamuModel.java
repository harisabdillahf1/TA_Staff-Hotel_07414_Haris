package model;

import java.util.Scanner;
import java.util.ArrayList;
import entity.TamuEntity;

public class TamuModel {

    private static ArrayList<TamuEntity> pengunjung = new ArrayList<>();

    public static ArrayList<TamuEntity> semua(){
        return pengunjung;
    }

    public static void insert(TamuEntity tamuBaru){
        pengunjung.add(tamuBaru);
    }

    public static void hapus(String nik){
        int index = indexTamu(nik);
        if (index != -1){
            pengunjung.remove(index);
        }
    }

    public static TamuEntity cariNik(String nik){
        for (TamuEntity entityTamu : pengunjung){
            if (entityTamu.getNik().equals(nik)){
                return entityTamu;
            }
        }
        return null;
    }

    public static TamuEntity cariNoKamar(int noKamr){
        for (TamuEntity entityTamu : pengunjung){
            if (entityTamu.getNoKamar() == noKamr){
                return entityTamu;
            }
        }
        return null;
    }

    public static int indexTamu(String nik){
        TamuEntity cariTamu = cariNik(nik);
        return pengunjung.indexOf(cariTamu);
    }
}