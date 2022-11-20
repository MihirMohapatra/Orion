package com.company.assync;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CilentTest {
    public static void main(String[] args) throws InterruptedException{
        User user1 = new User(1, "Sam", ProductType.CREDIT_CARD,
                new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()), "abc@gmail.com" );
        User user2 = new User(2, "Ram", ProductType.CREDIT_CARD,
                new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()), "" );
        UserRequest.apply(user1);
        UserRequest.apply(user2);

        Thread.sleep(3000);
    }
}
