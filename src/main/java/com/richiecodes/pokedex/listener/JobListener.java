package com.richiecodes.pokedex.listener;

import com.richiecodes.pokedex.model.PokemonDTO;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JobListener extends JobExecutionListenerSupport {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JobListener(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    @Override
//    public void afterJob(JobExecution jobExecution) {
//        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
//            System.out.println("In completion listener...");
//            List<PokemonDTO> results = jdbcTemplate.query("SELECT num,name,type1,type2,total,hp,att,def,spatk,spdef,speed,gen,legendary FROM pokemon",
//                    (rs, rowNum)->{
//                        return new PokemonDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
//                                rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
//                                rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13));
//                    });
//
//            results.forEach(System.out::println);
//        }
//    }
}
