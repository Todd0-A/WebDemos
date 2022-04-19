package impl;

import DAO.FruitDAO;
import basedao.BaseDAO;
import pojo.Fruit;

import java.util.List;

public class FruitDAOImpl extends BaseDAO<Fruit> implements FruitDAO {

    @Override
    public List<Fruit> getFruitList() {
        return super.executeQuery("select * from fruitdb.t_fruit");
    }
}
