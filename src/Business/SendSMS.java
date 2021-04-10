/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;

import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;


/**
 *
 * @author sayali mahajan
 */
public class SendSMS {

    public static final String ACCOUNT_SID = "ACafbfd012ed06bc8b2364adee75506c50";
    public static final String AUTH_TOKEN = "ed7b1dff1bab66eadb9adfd135d9a4dc";
    public final String fromNum = "+14159934238";
    public String toNum;
    public String body;

    public SendSMS(String toNum, String body) {
//        this.toNum = toNum;
//        this.body = body;
//        try {
//            TwilioRestClient client =new TwilioRestClient.Builder(ACCOUNT_SID, AUTH_TOKEN).build();
//            
//            Message message = new MessageCreator(
//                    new PhoneNumber(toNum),
//                    new PhoneNumber(fromNum),
//                    body).create(client);
//            System.out.println(message);
//        } catch (Exception e) {
//            System.out.println(e);
//        }

 this.toNum = toNum;
        this.body = body;
        try {
            TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

            List<NameValuePair> params = new ArrayList<>();
            params.add(new BasicNameValuePair("Body", body));
            params.add(new BasicNameValuePair("To", toNum));
            params.add(new BasicNameValuePair("From", fromNum));

            MessageFactory messageFactory = client.getAccount().getMessageFactory();
            Message message = messageFactory.create(params);
            System.out.println(message);
        } catch (TwilioRestException e) {
            System.out.println(e);
        }

    }

}
