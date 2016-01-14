package com.and.springframework.board.service;

import com.and.springframework.board.dao.CreateTableDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author k, Created on 16. 1. 5.
 */
@Service("createTableService")
public class CreateTableServiceImpl implements CreateTableService {

    @Resource(name = "createTableDAO")
    private CreateTableDAO create_table_dao_;

    @Override
    public int createTable() throws Exception {
        return create_table_dao_.create();
    }
}
