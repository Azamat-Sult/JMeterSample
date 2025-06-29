package ru.example.server.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import ru.example.server.api.TwoApiDelegate;
import ru.example.server.model.ApiTwoRq;
import ru.example.server.model.ApiTwoRs;
import ru.example.server.utils.TimeUtils;

@Slf4j
@Component
@AllArgsConstructor
public class TwoController implements TwoApiDelegate {

    @Override
    public ResponseEntity<ApiTwoRs> apiTwo(ApiTwoRq apiTwoRq) {
        log.info("apiTwo called");
        TimeUtils.sleepForRandomSeconds(10);
        return ResponseEntity.ok(new ApiTwoRs(apiTwoRq.getUuid(), apiTwoRq.getParamTwoRq()));
    }
}