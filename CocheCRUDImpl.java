package Interfaces;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
    }

    @Override
    public void findAll() {
    }

    @Override
    public void delete() {
    }

    String save = "Guardando";
    String findAll = "EncontrarTodo";
    String delete = "Borrando";


    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
