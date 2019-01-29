package zone.share.common.command.message

/**
 * ValidateMessageCommand
 * @author Iamee
 * @create 2019-01-29 18:46
 */
class ValidateMessageCommand : AbstractMessageCommand {

    lateinit var secret: String
        private set

    constructor()

    constructor(messageId: String, secret: String) : super(messageId = messageId) {
        this.secret = secret
    }

}