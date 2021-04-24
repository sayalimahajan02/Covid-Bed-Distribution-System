package Business.call;
import Business.Hospital.Patient;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.rest.api.v2010.account.CallCreator;

import java.net.URI;

public class EmergencyCall {
    // Find your Account Sid and Token at twilio.com/console
    

    public void Calling(String toPhone, Patient p) {
          final String ACCOUNT_SID = "ACafbfd012ed06bc8b2364adee75506c50";
      final String AUTH_TOKEN = "ed7b1dff1bab66eadb9adfd135d9a4dc";
        try{
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        CallCreator call = Call.creator(
                new com.twilio.type.PhoneNumber(toPhone),
                new com.twilio.type.PhoneNumber("+14159934238"),
                new com.twilio.type.Twiml("<Response><Say>This is an Emergency call. Please visit the assigned location to patient "+
                        p.getFirstname()+" "+p.getLastname()+"... Thank you</Say></Response>"));
        
        Call create = call.create();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}