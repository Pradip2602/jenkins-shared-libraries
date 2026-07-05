def call(String fromMail,String subject,String mailBody,String toMail){
    emailext from: "${fromMail}",
                subject: "${subject}",
                body: "${mailBody}",
                to: "${toMail}"
}