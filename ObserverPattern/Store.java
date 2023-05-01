package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneObservableImpl = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneObservableImpl);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("def@gmail.com", iphoneObservableImpl);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("userName_xyz", iphoneObservableImpl);

        iphoneObservableImpl.add(observer1);
        iphoneObservableImpl.add(observer2);
        iphoneObservableImpl.add(observer3);

        iphoneObservableImpl.setStockCount(10);
    }
}