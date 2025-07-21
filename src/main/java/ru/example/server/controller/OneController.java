package ru.example.server.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import ru.example.server.api.OneApiDelegate;
import ru.example.server.model.ApiOneRq;
import ru.example.server.model.ApiOneRs;
import ru.example.server.utils.TimeUtils;

@Slf4j
@Component
@AllArgsConstructor
public class OneController implements OneApiDelegate {

    @Override
    public ResponseEntity<ApiOneRs> apiOne(ApiOneRq apiOneRq) {
        log.info("apiOne called - [uuid: " + apiOneRq.getUuid() + ", paramTwoRq: " + apiOneRq.getParamOneRq() + "]");
        TimeUtils.sleepForRandomSeconds(10);
        return ResponseEntity.ok(new ApiOneRs(apiOneRq.getUuid(), apiOneRq.getParamOneRq()));
    }
}