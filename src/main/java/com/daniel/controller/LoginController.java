package com.daniel.controller;

import com.daniel.utils.BubbleSort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {



    public void userLogin(){
        Integer[] integers= new Integer[]{1,5,3,7,10,9,8,6,2};
        BubbleSort.listBubbleSort(integers);
    }
}
