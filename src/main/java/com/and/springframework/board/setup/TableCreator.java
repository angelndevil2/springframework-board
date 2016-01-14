package com.and.springframework.board.setup;

import com.and.springframework.board.service.CreateTableService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author k, Created on 16. 1. 5.
 */
@Controller
public class TableCreator {

    @Resource(name = "createTableService")
    private CreateTableService create_table_service_;

    @RequestMapping(value = "/setup/createTable")
    public void createTable(Model model) throws Exception {

        int result = create_table_service_.createTable();

        model.addAttribute("result", result);
    }
}
