package br.com.narciso.medicorpoapp.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import br.com.narciso.medicorpoapp.model.Avaliacao;

public class AvaliacaoDAO extends SQLiteOpenHelper {

    public AvaliacaoDAO(Context context) {
        super(context, "Avaliacao", null, 9);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Avaliacoes (" +
                    "id INTEGER PRIMARY KEY," +
                    "pescoco FLOAT NOT NULL," +
                    "ombro FLOAT NOT NULL," +
                    "peito FLOAT NOT NULL," +
                    "abdomen FLOAT NOT NULL," +
                    "bracoEsq FLOAT NOT NULL," +
                    "bracoDir FLOAT NOT NULL," +
                    "anteBracoEsq FLOAT NOT NULL," +
                    "anteBracoDir FLOAT NOT NULL," +
                    "cintura FLOAT NOT NULL," +
                    "gluteos FLOAT NOT NULL," +
                    "coxaEsq FLOAT NOT NULL," +
                    "coxaDir FLOAT NOT NULL," +
                    "panturrilhaEsq FLOAT NOT NULL," +
                    "panturrilhaDir FLOAT NOT NULL," +
                    "altura FLOAT NOT NULL," +
                    "peso FLOAT NOT NULL," +
                    "observacoes TEXT NOT NULL," +
                    "dataHora TEXT NOT NULL);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Avaliacoes";
        db.execSQL(sql);
        onCreate(db);
    }


    public void insere(Avaliacao ava) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = new ContentValues();

        dados.put("pescoco", ava.getPescoco());
        dados.put("ombro", ava.getOmbro());
        dados.put("peito", ava.getPeito());
        dados.put("abdomen", ava.getAbdomen());
        dados.put("bracoEsq", ava.getBracoEsq());
        dados.put("bracoDir", ava.getBracoDir());
        dados.put("anteBracoEsq", ava.getAnteBracoEsq());
        dados.put("anteBracoDir", ava.getAnteBracoDir());
        dados.put("cintura", ava.getCintura());
        dados.put("gluteos", ava.getGluteos());
        dados.put("coxaEsq", ava.getCoxaEsq());
        dados.put("coxaDir", ava.getCoxaDir());
        dados.put("panturrilhaEsq", ava.getPanturrilhaEsq());
        dados.put("panturrilhaDir", ava.getPanturrilhaDir());
        dados.put("altura", ava.getAltura());
        dados.put("peso", ava.getPeso());
        dados.put("observacoes", ava.getObservacoes());
        dados.put("dataHora", ava.getDataHora());

        db.insert("Avaliacoes", null, dados);
        close();
    }

    public List<Avaliacao> buscaAvaliacoes() {
        ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

        String sql = "SELECT * FROM Avaliacoes;";
        SQLiteDatabase db = getReadableDatabase();

        Cursor c = db.rawQuery(sql, null);
        while(c.moveToNext()) {
            Avaliacao ava = new Avaliacao();
            ava.setId(c.getLong(c.getColumnIndex("id")));
            ava.setPescoco(c.getFloat(c.getColumnIndex("pescoco")));
            ava.setOmbro(c.getFloat(c.getColumnIndex("ombro")));
            ava.setPeito(c.getFloat(c.getColumnIndex("peito")));
            ava.setAbdomen(c.getFloat(c.getColumnIndex("abdomen")));
            ava.setBracoEsq(c.getFloat(c.getColumnIndex("bracoEsq")));
            ava.setBracoDir(c.getFloat(c.getColumnIndex("bracoDir")));
            ava.setAnteBracoEsq(c.getFloat(c.getColumnIndex("anteBracoEsq")));
            ava.setAnteBracoDir(c.getFloat(c.getColumnIndex("anteBracoDir")));
            ava.setCintura(c.getFloat(c.getColumnIndex("cintura")));
            ava.setGluteos(c.getFloat(c.getColumnIndex("gluteos")));
            ava.setCoxaEsq(c.getFloat(c.getColumnIndex("coxaEsq")));
            ava.setCoxaDir(c.getFloat(c.getColumnIndex("coxaDir")));
            ava.setPanturrilhaEsq(c.getFloat(c.getColumnIndex("panturrilhaEsq")));
            ava.setPanturrilhaDir(c.getFloat(c.getColumnIndex("panturrilhaDir")));
            ava.setAltura(c.getFloat(c.getColumnIndex("altura")));
            ava.setPeso(c.getFloat(c.getColumnIndex("peso")));
            ava.setObservacoes(c.getString(c.getColumnIndex("observacoes")));
            ava.setDataHora(c.getString(c.getColumnIndex("dataHora")));

            avaliacoes.add(ava);
        }
        c.close();
        close();

        return avaliacoes;
    }

    public void remover(Avaliacao avaliacao) {
        SQLiteDatabase db = getWritableDatabase();

        String[] params = {String.valueOf(avaliacao.getId())};
        db.delete("Avaliacoes", "id = ?", params);
    }
}
