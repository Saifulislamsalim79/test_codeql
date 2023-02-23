package io.intercom.android.sdk.store;

import android.os.Handler;
import android.os.Looper;
import io.intercom.android.sdk.store.Store;
/* loaded from: classes3.dex */
class ChangeSubscriber<S, T> implements Store.Subscriber<S> {
    private T last;
    private final Handler mainHandler;
    private final Store.Selector<S, T> selector;
    final Store.Subscriber<T> subscriber;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChangeSubscriber(Store.Selector<S, T> selector, Store.Subscriber<T> subscriber) {
        this(selector, subscriber, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void runOnMainThread(Runnable runnable, Handler handler) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @Override // io.intercom.android.sdk.store.Store.Subscriber
    public void onStateChange(S s) {
        final T transform = this.selector.transform(s);
        if (this.last != transform) {
            this.last = transform;
            runOnMainThread(new Runnable() { // from class: io.intercom.android.sdk.store.ChangeSubscriber.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    ChangeSubscriber.this.subscriber.onStateChange(transform);
                }
            }, this.mainHandler);
        }
    }

    ChangeSubscriber(Store.Selector<S, T> selector, Store.Subscriber<T> subscriber, Handler handler) {
        this.last = null;
        this.selector = selector;
        this.subscriber = subscriber;
        this.mainHandler = handler;
    }
}
