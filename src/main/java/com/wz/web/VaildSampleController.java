package com.wz.web;

import com.wz.pojo.VaildSampleForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VaildSampleController {


    @RequestMapping("vaildSample")
    public String postVaild(@ModelAttribute @Validated VaildSampleForm form){
        return "vaildSample";
    }


}
