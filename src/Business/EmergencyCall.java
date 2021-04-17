/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;
import com.twilio.type.Twiml;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author aishwarya
 */
public class EmergencyCall {

    // Install the Java helper library from twilio.com/docs/java/install
    // Find your Account Sid and Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "ACccbd1279a344b6265befb1298b0420fd";
    public static final String AUTH_TOKEN = "520a9bc7117b1ab2b745c00e793686a2";

    public static void main(String[] args) throws URISyntaxException {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//        Call call = Call.creator(
//                new com.twilio.type.PhoneNumber("+16174809437"),
//                new com.twilio.type.PhoneNumber("+14046090461"),
//                new com.twilio.type.Twiml("<Response><Say>Ahoy, World!</Say></Response>"))
//            .create();
        Call call = Call.creator(new PhoneNumber("+16174809437"), new PhoneNumber("+14046090461"),
                new URI("http://demo.twilio.com/docs/voice.xml")).create();

        System.out.println(call.getSid());
    }
}

//import com.twilio.twiml.VoiceResponse;
//import com.twilio.twiml.voice.Say;
//
//import static spark.Spark
//
//.*;
//
//public class VoiceApp {
//
//    public static void main(String[] args) {
//
//        get("/hello", (req, res) -> "Hello Web");
//
//        post("/", (request, response) -> {
//            Say say = new Say.Builder(
//                    "Hello from your pals at Twilio! Have fun.")
//                    .build();
//            VoiceResponse voiceResponse = new VoiceResponse.Builder()
//                    .say(say)
//                    .build();
//            return voiceResponse.toXml();
//        });
//    }
//}
