package zone.share.common.command.message

/**
 * CreateMessageCommand
 * @author Iamee
 * @create 2019-01-29 18:43
 */
class CreateMessageCommand : AbstractMessageCommand {

    lateinit var type: String
        private set

    lateinit var to: String
        private set

    lateinit var content: String
        private set

    lateinit var secret: String
        private set

    constructor()

    constructor(messageId: String, type: String, to: String, content: String, secret: String) : super(messageId) {
        this.type = type
        this.to = to
        this.content = content
        this.secret = secret
    }

}