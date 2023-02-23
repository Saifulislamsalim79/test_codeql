package io.intercom.android.sdk.store;

import android.os.Handler;
import android.os.Looper;
import io.intercom.android.sdk.store.Store;
/* loaded from: classes3.dex */
class TwoParamChangeSubscriber<S, T1, T2> implements Store.Subscriber<S> {
    private T1 last1;
    private T2 last2;
    private final Handler mainHandler;
    private final Store.Selector<S, T1> selector1;
    private final Store.Selector<S, T2> selector2;
    final Store.Subscriber2<T1, T2> subscriber;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TwoParamChangeSubscriber(Store.Selector<S, T1> selector, Store.Selector<S, T2> selector2, Store.Subscriber2<T1, T2> subscriber2) {
        this(selector, selector2, subscriber2, new Handler(Looper.getMainLooper()));
    }

    @Override // io.intercom.android.sdk.store.Store.Subscriber
    public void onStateChange(S s) {
        final T1 transform = this.selector1.transform(s);
        final T2 transform2 = this.selector2.transform(s);
        if (this.last1 == transform && this.last2 == transform2) {
            return;
        }
        this.last1 = transform;
        this.last2 = transform2;
        ChangeSubscriber.runOnMainThread(new Runnable() { // from class: io.intercom.android.sdk.store.TwoParamChangeSubscriber.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                TwoParamChangeSubscriber.this.subscriber.onStateChange(transform, transform2);
            }
        }, this.mainHandler);
    }

    TwoParamChangeSubscriber(Store.Selector<S, T1> selector, Store.Selector<S, T2> selector2, Store.Subscriber2<T1, T2> subscriber2, Handler handler) {
        this.last1 = null;
        this.last2 = null;
        this.selector1 = selector;
        this.selector2 = selector2;
        this.subscriber = subscriber2;
        this.mainHandler = handler;
    }
}
