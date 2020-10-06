package mail

class PersonalInfo(val email: String?)
class Client (val personalInfo: PersonalInfo?)


interface Mailer {
    fun sendMessage(email : String, message: String)
}

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer)
{
    if (message != null && client?.personalInfo?.email != null) mailer.sendMessage(client.personalInfo.email, message)
}
