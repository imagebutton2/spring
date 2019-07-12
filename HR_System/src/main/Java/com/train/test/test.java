package com.train.test;

import com.train.pojo.Response;
import com.train.pojo.Train;
import com.train.pojo.TrainPlus;
import com.train.service.RespService;
import com.train.service.TrainPlusService;
import com.train.service.TrainService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        //TrainPlusService trainPlusService= (TrainPlusService) context.getBean("trainPlusService");
       // StatusService statusService= (StatusService) context.getBean("statusService");

        TrainService trainService= (TrainService) context.getBean("trainService");
        RespService respService= (RespService) context.getBean("respService");
    //    List<TrainPlus> trains = trainPlusService.showtrain();
       // Train train=trainService.getOneTrain(1);
       // Response respon=respService.showone(1);

        Train train = new Train();
        train.setsId(1);
        train.settName("test");
        train.settTeacher("test");
        train.settStart("test");
        train.settEnd("test");
        train.settGoal("test");
        train.settMember("test");
        train.settIntroduction("test");
        trainService.SetTrainPlan(train);
        System.out.println(train.gettPid());
        System.out.println(train);

    }
}
