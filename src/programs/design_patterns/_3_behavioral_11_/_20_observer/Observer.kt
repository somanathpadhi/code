package programs.design_patterns._3_behavioral_11_._20_observer

interface Observer {
    fun receiveNotification(update: String)
}

class Subscriber(val name: String) : Observer {
    override fun receiveNotification(update: String) {
        println("$name is notified the update - $update")
    }
}

class Youtuber {

    val subscribers = mutableListOf<Observer>()

    fun addSubscriber(observer: Observer) {
        subscribers.add(observer)
    }

    fun uploadUpdate(update: String) {
        println("Video update is sending to subscribers in a moment")
        for (subscriber in subscribers) {
            subscriber.receiveNotification(update)
        }
    }
}

fun main() {
    val youtuber = Youtuber()
    youtuber.addSubscriber(Subscriber("somanath"))
    youtuber.addSubscriber(Subscriber("prashanth"))

    youtuber.uploadUpdate("Kotlin coroutine full tutorials!!")
}
