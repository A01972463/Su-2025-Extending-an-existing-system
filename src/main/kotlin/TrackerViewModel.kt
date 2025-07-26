object TrackerViewModel: Subject<Observer> {
    val shipments = mutableListOf<Observer>()

    override fun registerObserver(observer: Observer) {
        TODO("Not yet implemented")
    }

    override fun removeObserver(observer: Observer) {
        TODO("Not yet implemented")
    }

    override fun notifyObservers() {
        TODO("Not yet implemented")
    }
}