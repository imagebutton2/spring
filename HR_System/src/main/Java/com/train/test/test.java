package com.train.test;

import com.train.pojo.Status;
import com.train.pojo.TrainPlus;
import com.train.pojo.Trains;
import com.train.service.StatusService;
import com.train.service.TrainPlusService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        TrainPlusService trainPlusService= (TrainPlusService) context.getBean("trainPlusService");
       // StatusService statusService= (StatusService) context.getBean("statusService");


        List<TrainPlus> trains = trainPlusService.showtrain();
        System.out.println(trains);

    }
}
