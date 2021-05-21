package co.com.tigo.qa.utils;

import net.serenitybdd.rest.SerenityRest;

import java.io.File;
import java.util.List;

public class API {
    public static String sentApp(String appPath) {
        SerenityRest
                .given()
                .header("Content-Type", "multipart/form-data; boundary=<calculated when request is sent>")
                .header("Authorization", "Basic ZWx2aXNwZXJlemd0el9FcjBRUGg6aEpvc2tXYXV3MXpMdEdvU3F0cHo=")
                .multiPart("file",new File(appPath))
                .when()
                .post("https://api-cloud.browserstack.com/app-automate/upload")
        ;
        System.out.println(SerenityRest.lastResponse().getStatusCode());
        return SerenityRest.lastResponse().jsonPath().getJsonObject("app_url");
    }

    public static List<String> getAppUrl(){
        SerenityRest.given()
                .header("Authorization", "Basic ZWx2aXNwZXJlemd0el9FcjBRUGg6aEpvc2tXYXV3MXpMdEdvU3F0cHo=")
                .when().get("https://api-cloud.browserstack.com/app-automate/recent_apps");
        System.out.println(SerenityRest.lastResponse().getStatusCode());
               return  SerenityRest.lastResponse().jsonPath().getJsonObject("app_url");
    }
    public static void main(String[] args) {
       List<String> lastApps= getAppUrl();
        System.out.println(lastApps.get(0));

    }
}
