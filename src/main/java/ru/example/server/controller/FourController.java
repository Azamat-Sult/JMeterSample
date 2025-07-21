package ru.example.server.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import ru.example.server.api.FourApiDelegate;
import ru.example.server.model.ApiFourRs;
import ru.example.server.utils.TimeUtils;

import java.time.Instant;

@Slf4j
@Component
@AllArgsConstructor
public class FourController implements FourApiDelegate {

    @Override
    public ResponseEntity<ApiFourRs> apiFour(String id, String uuid, Instant time) {
        log.info("apiFour called - [id: " + id + ", uuid: " + uuid + ", time: " + time + "]");
        TimeUtils.sleepForRandomSeconds(10);
        return ResponseEntity.ok(new ApiFourRs(uuid, id));
    }
}