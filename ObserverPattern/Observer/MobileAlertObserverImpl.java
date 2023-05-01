package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String userName, StockObservable stockObservable) {
        this.stockObservable = stockObservable;
        this.userName = userName;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "Product is in Stock. Hurry Up!!");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("Message sent to: " + userName);
    }
    
}
