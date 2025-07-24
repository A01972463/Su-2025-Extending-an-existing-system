interface Subject<T> {
    fun registerObserver(observerTracker: T) {}
    fun removeObserver(observerTracker: T) {}
    fun notifyObservers(){}
}