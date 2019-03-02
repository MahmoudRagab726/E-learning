package com.three2one.controller;

import com.three2one.common.Enums;
import com.three2one.common.Response;
import com.three2one.common.StudentInfo;
import com.three2one.common.StudentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;

@RestController
@RequestMapping("/api/auth")
public class StudentController {
    @Autowired
    StudentManager studentManager;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Response login(@RequestBody StudentInfo studentInfo){
        Response response=null;
        if(studentInfo!=null){
            response= studentManager.login(studentInfo);
        }
        return response;
    }

    @RequestMapping(value = "/signUp",method = RequestMethod.POST)
    public Response signUp(@RequestBody StudentInfo studentInfo) throws MessagingException {
        Response response=null;
        if(studentInfo!=null){
            response = studentManager.signUp(studentInfo);

        }
        return response;
    }

    @RequestMapping(method = RequestMethod.POST , value = "/activate")
    public Response activateAccount(@RequestBody StudentInfo studentInfo){
        Response response = studentManager.activateAccount(studentInfo);
        //response.setStatusCode(Enums.StatusCodes.SUCCESS.getCode());
        return response;
    }
}
