package ru.example.server.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import ru.example.server.api.ThreeApiDelegate;
import ru.example.server.model.ApiThreeRq;
import ru.example.server.model.ApiThreeRs;
import ru.example.server.utils.TimeUtils;

@Slf4j
@Component
@AllArgsConstructor
public class ThreeController implements ThreeApiDelegate {

    @Override
    public ResponseEntity<ApiThreeRs> apiThree(ApiThreeRq apiThreeRq) {
        log.info("apiThree called - [uuid: " + apiThreeRq.getUuid() + ", paramThreeRq: " + apiThreeRq.getParamThreeRq() + "]");
        TimeUtils.sleepForRandomSeconds(10);
        return ResponseEntity.ok(new ApiThreeRs(apiThreeRq.getUuid(), apiThreeRq.getParamThreeRq()));
    }
}