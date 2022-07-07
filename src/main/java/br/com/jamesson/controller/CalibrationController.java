package br.com.jamesson.controller;

import br.com.jamesson.dto.CalibrationParameters;
import br.com.jamesson.dto.CalibrationUpdateResult;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Put;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("calibrations")
public class CalibrationController {

    private static final Logger logger = LoggerFactory.getLogger(CalibrationController.class);

    @Get("/{modelName}")
    public CalibrationParameters getCalibrationParameters(String modelName){
        logger.info("getCallibrationParameters called for model {}", modelName);
        return new CalibrationParameters(modelName, 800, 150);
    }

    @Put("/updates")
    public CalibrationUpdateResult updateCalibrationStatus(@Body CalibrationUpdate update){
        logger.info("updateCalibrationStatus called for model {}", update);
        return new CalibrationUpdateResult(true);

    }


}
