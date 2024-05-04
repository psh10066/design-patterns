package com.psh10066.designpatterns._03_behavioral_patterns._14_command._03_java;

import com.psh10066.designpatterns._03_behavioral_patterns._14_command._02_after.Command;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class CommandInSpring {

    private final DataSource dataSource;

    public void add(Command command) {
        // insert 쿼리를 만들기 위한 정보를 담는 command
        SimpleJdbcInsert insert = new SimpleJdbcInsert(dataSource)
            .withTableName("command")
            .usingGeneratedKeyColumns("id");

        Map<String, Object> data = new HashMap<>();
        data.put("name", command.getClass().getSimpleName());
        data.put("when", LocalDateTime.now());
        insert.execute(data);
    }

}
