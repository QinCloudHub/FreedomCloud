package com.freedomcloud.freedomcloud;

import org.hibernate.boot.model.relational.SimpleAuxiliaryDatabaseObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.jvm.hotspot.ui.EditableAtEndDocument;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class FreedomCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreedomCloudApplication.class, args);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        System.out.println("当前时间为  "+format);
    }

}
