object TrackerViewModel: Subject<Observer> {
    val shipments = mutableListOf<Observer>()

    override fun registerObserver(observer: Observer) {
        shipments.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        shipments.remove(observer)
    }

    override fun notifyObservers() {
        shipments.forEach {
            it.update()
        }
    }
}