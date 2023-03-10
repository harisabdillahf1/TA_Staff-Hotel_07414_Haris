package controller;

import entity.KamarEntity;
import model.TamuModel;
import model.KamarModel;
import entity.TamuEntity;

import java.util.ArrayList;

public class TamuController {

    public boolean tambahTamu(String namaTamu, int usia, String nik, String notelp, String alamat, int noKamar){
        if (TamuModel.cariNik(nik) == null){
            if (TamuModel.cariNoKamar(noKamar) == null) {
                TamuEntity tamuBaru = new TamuEntity(namaTamu, usia, nik, notelp, alamat, noKamar);
                TamuModel.insert(tamuBaru);
                KamarModel.pesanKamar(noKamar);
                return true;
            }
        }
        return false;
    }

    public boolean hapusTamu(String nik){
        if(TamuModel.cariNik(nik) != null){
            int noKamar = TamuModel.cariNik(nik).getNoKamar();
            KamarModel.removeKamar(noKamar);
            TamuModel.hapus(nik);
            return true;
        }
        return false;
    }
    public ArrayList<TamuEntity> tamuList(){
        return TamuModel.semua();
    }

    public ArrayList<KamarEntity> kamarList(){
        return KamarModel.semua();
    }
}
