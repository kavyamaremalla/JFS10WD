package com.spring.batch.spring_batch;

import lombok.AllArgsConstructor;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class JobCompletionNotificationListener implements JobExecutionListener {

    private JdbcTemplate jdbcTemplate;

    @Override
    public void afterJob(JobExecution jobExecution) {
        if(jobExecution.getStatus() == BatchStatus.COMPLETED){
            System.out.println("Batch Job completed, Please check your data");

            jdbcTemplate.query("select first_name, last_name from people", new DataClassRowMapper<>(Person.class))
                    .forEach(person -> System.out.println(person.firstName() + " " + person.lastName() + " details from db"));
        }
    }

}
