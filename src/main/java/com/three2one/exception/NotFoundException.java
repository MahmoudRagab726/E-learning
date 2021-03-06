package com.three2one.exception;

import com.three2one.common.Enums.*;


public class NotFoundException extends GeneralFailureException{


    public NotFoundException(String message) {
        super(message);
    }

    @Override
    public StatusCodes getStatusCode() {
        return StatusCodes.DOES_NOT_EXIST;
    }

}

