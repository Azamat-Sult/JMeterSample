package ru.example.server.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import ru.example.server.api.FiveApiDelegate;
import ru.example.server.model.ApiFiveRq;
import ru.example.server.model.ApiFiveRs;
import ru.example.server.utils.TimeUtils;

@Slf4j
@Component
@AllArgsConstructor
public class FiveController implements FiveApiDelegate {

    @Override
    public ResponseEntity<ApiFiveRs> apiFive(ApiFiveRq apiFiveRq) {
        log.info("apiFive called");
        TimeUtils.sleepForRandomSeconds(10);
        return ResponseEntity.ok(new ApiFiveRs(apiFiveRq.getUuid(), apiFiveRq.getParamFiveRq()));
    }
}