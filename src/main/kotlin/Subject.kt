interface Subject<T> {
    fun registerObserver(observer: T) {}
    fun removeObserver(observer: T) {}
    fun notifyObservers(){}
}