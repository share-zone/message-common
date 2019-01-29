package zone.share.common.command.message

import zone.share.common.command.AbstractCommand

/**
 * AbstractMessageCommand
 * @author Iamee
 * @create 2019-01-29 18:40
 */
abstract class AbstractMessageCommand : AbstractCommand {

    lateinit var messageId: String
        private set

    constructor()

    constructor(messageId: String) {
        this.messageId = messageId
    }

    override fun getIdentifier(): String {
        return "Message { messageId = $messageId }"
    }

}