package DAO;

import java.util.List;

public interface AppQuery {
    public Object buscar(int id);
    public List<Object> listar();
}