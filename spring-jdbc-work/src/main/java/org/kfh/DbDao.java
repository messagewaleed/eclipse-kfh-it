package org.kfh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component("dao")
public class DbDao {

    DataSource dataSource;

    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
       jdbcTemplate = new JdbcTemplate(dataSource);
    }

    Integer getCountOfPersons(){
        return jdbcTemplate.queryForObject(
                "select count(*) from persons",
                Integer.class);
    }

    String getPersonNameById(Integer id){

        return jdbcTemplate.queryForObject(
                "select name from persons where id = ?",
                String.class,
                new Object[]{id});
    }





}
