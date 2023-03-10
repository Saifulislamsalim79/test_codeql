package io.intercom.android.sdk.store;

import io.intercom.android.sdk.actions.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes3.dex */
public class Store<S> {
    S currentState;
    private final List<NextDispatcher> next;
    final Reducer<S> reducer;
    final List<Subscriber<S>> subscribers = new CopyOnWriteArrayList();
    final Middleware<S> dispatcher = new Middleware<S>() { // from class: io.intercom.android.sdk.store.Store.1
        @Override // io.intercom.android.sdk.store.Store.Middleware
        public void dispatch(Store<S> store, Action<?> action, NextDispatcher nextDispatcher) {
            synchronized (this) {
                Store.this.currentState = store.reducer.reduce(action, Store.this.currentState);
            }
            for (int i = 0; i < Store.this.subscribers.size(); i++) {
                store.subscribers.get(i).onStateChange(Store.this.currentState);
            }
        }
    };

    /* loaded from: classes3.dex */
    public interface Middleware<S> {
        void dispatch(Store<S> store, Action<?> action, NextDispatcher nextDispatcher);
    }

    /* loaded from: classes3.dex */
    public interface NextDispatcher {
        void dispatch(Action<?> action);
    }

    /* loaded from: classes3.dex */
    public interface Reducer<S> {
        S reduce(Action<?> action, S s);
    }

    /* loaded from: classes3.dex */
    public interface Selector<S, T> {
        T transform(S s);
    }

    /* loaded from: classes3.dex */
    public interface Subscriber<T> {
        void onStateChange(T t);
    }

    /* loaded from: classes3.dex */
    public interface Subscriber2<T1, T2> {
        void onStateChange(T1 t1, T2 t2);
    }

    /* loaded from: classes3.dex */
    public interface Subscription {
        void unsubscribe();
    }

    @SafeVarargs
    public Store(Reducer<S> reducer, S s, Middleware<S>... middlewareArr) {
        ArrayList arrayList = new ArrayList();
        this.next = arrayList;
        this.reducer = reducer;
        this.currentState = s;
        arrayList.add(new NextDispatcher() { // from class: io.intercom.android.sdk.store.Store.2
            @Override // io.intercom.android.sdk.store.Store.NextDispatcher
            public void dispatch(Action<?> action) {
                Store<S> store = Store.this;
                store.dispatcher.dispatch(store, action, null);
            }
        });
        for (int length = middlewareArr.length - 1; length >= 0; length--) {
            final Middleware<S> middleware = middlewareArr[length];
            final NextDispatcher nextDispatcher = this.next.get(0);
            this.next.add(0, new NextDispatcher() { // from class: io.intercom.android.sdk.store.Store.3
                @Override // io.intercom.android.sdk.store.Store.NextDispatcher
                public void dispatch(Action<?> action) {
                    middleware.dispatch(Store.this, action, nextDispatcher);
                }
            });
        }
    }

    public S dispatch(Action<?> action) {
        this.next.get(0).dispatch(action);
        return state();
    }

    public <T> T select(Selector<S, T> selector) {
        return selector.transform(state());
    }

    public S state() {
        return this.currentState;
    }

    public Subscription subscribe(final Subscriber<S> subscriber) {
        this.subscribers.add(subscriber);
        subscriber.onStateChange(state());
        return new Subscription() { // from class: io.intercom.android.sdk.store.Store.4
            @Override // io.intercom.android.sdk.store.Store.Subscription
            public void unsubscribe() {
                Store.this.subscribers.remove(subscriber);
            }
        };
    }

    public <T> Subscription subscribeToChanges(Selector<S, T> selector, Subscriber<T> subscriber) {
        return subscribe(new ChangeSubscriber(selector, subscriber));
    }

    public <T1, T2> Subscription subscribeToChanges(Selector<S, T1> selector, Selector<S, T2> selector2, Subscriber2<T1, T2> subscriber2) {
        return subscribe(new TwoParamChangeSubscriber(selector, selector2, subscriber2));
    }
}
