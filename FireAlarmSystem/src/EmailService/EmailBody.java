/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailService;

/**
 *
 * @author DELL
 */

/*** used to send an email ***/
public class EmailBody {
    
        String username=null;
        String password=null;
        
        public EmailBody recieveEmailInfo(){
            EmailBody body=new EmailBody();
            body.username="dsassignment2dreamteam2020@gmail.com";
            body.password="ds2020@#";
            
            return body;
        }
}
