package com.company.assync;

import java.util.concurrent.CompletableFuture;

public class UserRequest {
    static void apply(User user){
        if (validate()){
            sendMail(user);

            saveDB(user);
        }
    }

    private static void saveDB(User user) {
        System.out.println("Persist to DB!");
    }

    private static void sendMail(User user) {
        CompletableFuture.supplyAsync(() -> send(user))
                .exceptionally(throwable -> throwable.getMessage())
                .thenAccept(System.out::println);
    }

    private static String send(User user) {
        try {
            Thread.sleep(1000);
        } catch (Exception ex){
            throw  new RuntimeException("Thread Interrupted");
        }
        if (!user.getEmailId().isEmpty()){
            return "SUCCESS ! email sent !";
        }
        throw new RuntimeException("FAILED! email sent failed!");
    }

    private static boolean validate() {
        return true;
    }
}
