interface Subject<T> {
    abstract fun registerObserver(observer: T)
    abstract fun removeObserver(observer: T)
    abstract fun notifyObservers()
}