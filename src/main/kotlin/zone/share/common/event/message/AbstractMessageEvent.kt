package zone.share.common.event.message

import zone.share.common.event.AbstractEvent

/**
 * AbstractMessageEvent
 * @author Iamee
 * @create 2019-01-29 18:42
 */
abstract class AbstractMessageEvent : AbstractEvent {

    lateinit var messageId: String
        private set

    constructor()

    constructor(seq: String, messageId: String, time: Long) : super(seq = seq, time = time) {
        this.messageId = messageId
    }

    override fun getIdentifier(): String {
        return "Message { messageId = $messageId }"
    }

}