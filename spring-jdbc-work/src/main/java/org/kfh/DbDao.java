package org.kfh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component("dao")
public class DbDao {

    JdbcTemplate jdbcTemplate;

    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
       jdbcTemplate = new JdbcTemplate(dataSource);
       namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
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

//    Return all details of a person by id
    Person getAllDetailsById(Integer id){
        return jdbcTemplate.queryForObject(
                "select * from persons where id = ?",
                new PersonMapper(),
                new Object[]{id}
                );
    }

//    Return all persons with all their details
    List<Person> getAllPersons(){
        return jdbcTemplate.query(
                "select * from persons",
                new PersonMapper()
        );
    }

//    Add new Person
    void addNewPerson(String name, String location){

        String qry = "insert into persons(name, location) values(:pName, :pLocation)";

        SqlParameterSource parameterSource =
                new MapSqlParameterSource("pName", name)
                .addValue("pLocation", location);

        namedParameterJdbcTemplate.update(
                qry,
                parameterSource
        );


//        jdbcTemplate.update(
//                "insert into persons(name, location) values(?, ?)",
//                new Object[]{name, location}
//        );
    }

//    Delete a person
    void deletePerson(Integer id){
        jdbcTemplate.update(
                "delete from persons where id =?",
                new Object[]{id});
    }



    class PersonMapper implements RowMapper<Person>{

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Person(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("location")
            );
        }
    }






}
