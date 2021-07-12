package com.Aj.Spring.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends RuntimeException{
    private  static final  long serialVirsionUID=1L;
    private String Resourcename;



    private String FieldName;
    private Object FildValue;

    public ResourceNotFoundException(String resourcename, String fieldName, Object fildValue) {
        super(String.format("% not found with %s : '%s'",resourcename,fildValue));
        Resourcename = resourcename;
        FieldName = fieldName;
        FildValue = fildValue;
    }


    public String getResourcename() {
        return Resourcename;
    }

    public String getFieldName() {
        return FieldName;
    }

    public Object getFildValue() {
        return FildValue;
    }
}
