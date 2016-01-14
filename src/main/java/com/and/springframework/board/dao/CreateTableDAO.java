package com.and.springframework.board.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author k, Created on 16. 1. 5.
 */
@Repository("createTableDAO")
public class CreateTableDAO {

    @Autowired
    private SqlSessionTemplate sql_session_;

    public int create() throws Exception {
        return sql_session_.update("setup.wrong-query");
        //return sql_session_.update("setup.create-table");
    }
}
