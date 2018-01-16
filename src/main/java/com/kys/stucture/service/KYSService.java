package com.kys.stucture.service;

import com.kys.stucture.exception.KYSException;
import org.springframework.stereotype.Service;

/**
 * Created by esha on 06/12/17.
 */

@Service
public class KYSService {

    public String checkCallerName(String name) throws KYSException {
        if (name.equals("Virendra")) {
            return "Hello Virendea";
        } else {
            throw new KYSException("Caller is Not Virendra");
        }
    }
}
