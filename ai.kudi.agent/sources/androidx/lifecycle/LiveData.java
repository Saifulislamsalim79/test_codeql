package androidx.lifecycle;

import androidx.lifecycle.AbstractC1565i;
import java.util.Iterator;
import java.util.Map;
import p201g.p210b.p211a.p212a.C7498a;
import p201g.p210b.p211a.p213b.C7504b;
/* loaded from: classes2.dex */
public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C7504b<InterfaceC1584v<? super T>, LiveData<T>.AbstractC1534c> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    /* loaded from: classes2.dex */
    class LifecycleBoundObserver extends LiveData<T>.AbstractC1534c implements InterfaceC1572l {

        /* renamed from: w */
        final o f4710w;

        LifecycleBoundObserver(o oVar, InterfaceC1584v<? super T> interfaceC1584v) {
            super(interfaceC1584v);
            this.f4710w = oVar;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1534c
        /* renamed from: b */
        void mo35578b() {
            this.f4710w.getLifecycle().mo35504c(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1534c
        /* renamed from: d */
        boolean mo35577d(o oVar) {
            return this.f4710w == oVar;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1534c
        /* renamed from: e */
        boolean mo35576e() {
            return this.f4710w.getLifecycle().mo35505b().a(AbstractC1565i.c.f);
        }

        @Override // androidx.lifecycle.InterfaceC1572l
        /* renamed from: m */
        public void mo34271m(o oVar, AbstractC1565i.b bVar) {
            AbstractC1565i.c mo35505b = this.f4710w.getLifecycle().mo35505b();
            if (mo35505b == AbstractC1565i.c.c) {
                LiveData.this.removeObserver(this.f4713c);
                return;
            }
            AbstractC1565i.c cVar = null;
            while (cVar != mo35505b) {
                m35579a(mo35576e());
                cVar = mo35505b;
                mo35505b = this.f4710w.getLifecycle().mo35505b();
            }
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes2.dex */
    class RunnableC1532a implements Runnable {
        RunnableC1532a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: classes2.dex */
    private class C1533b extends LiveData<T>.AbstractC1534c {
        C1533b(LiveData liveData, InterfaceC1584v<? super T> interfaceC1584v) {
            super(interfaceC1584v);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1534c
        /* renamed from: e */
        boolean mo35576e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.lifecycle.LiveData$c */
    /* loaded from: classes2.dex */
    public abstract class AbstractC1534c {

        /* renamed from: c */
        final InterfaceC1584v<? super T> f4713c;

        /* renamed from: d */
        boolean f4714d;

        /* renamed from: e */
        int f4715e = -1;

        AbstractC1534c(InterfaceC1584v<? super T> interfaceC1584v) {
            this.f4713c = interfaceC1584v;
        }

        /* renamed from: a */
        void m35579a(boolean z) {
            if (z == this.f4714d) {
                return;
            }
            this.f4714d = z;
            LiveData.this.changeActiveCounter(z ? 1 : -1);
            if (this.f4714d) {
                LiveData.this.dispatchingValue(this);
            }
        }

        /* renamed from: b */
        void mo35578b() {
        }

        /* renamed from: d */
        boolean mo35577d(o oVar) {
            return false;
        }

        /* renamed from: e */
        abstract boolean mo35576e();
    }

    public LiveData(T t) {
        this.mDataLock = new Object();
        this.mObservers = new C7504b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new RunnableC1532a();
        this.mData = t;
        this.mVersion = 0;
    }

    static void assertMainThread(String str) {
        if (C7498a.m18547f().mo18543c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void considerNotify(LiveData<T>.AbstractC1534c abstractC1534c) {
        if (abstractC1534c.f4714d) {
            if (!abstractC1534c.mo35576e()) {
                abstractC1534c.m35579a(false);
                return;
            }
            int i = abstractC1534c.f4715e;
            int i2 = this.mVersion;
            if (i >= i2) {
                return;
            }
            abstractC1534c.f4715e = i2;
            abstractC1534c.f4713c.mo35481a((Object) this.mData);
        }
    }

    void changeActiveCounter(int i) {
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                if (i2 == this.mActiveCount) {
                    return;
                }
                boolean z = i2 == 0 && this.mActiveCount > 0;
                boolean z2 = i2 > 0 && this.mActiveCount == 0;
                int i3 = this.mActiveCount;
                if (z) {
                    onActive();
                } else if (z2) {
                    onInactive();
                }
                i2 = i3;
            } finally {
                this.mChangingActiveState = false;
            }
        }
    }

    void dispatchingValue(LiveData<T>.AbstractC1534c abstractC1534c) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (abstractC1534c != null) {
                considerNotify(abstractC1534c);
                abstractC1534c = null;
            } else {
                C7504b<InterfaceC1584v<? super T>, LiveData<T>.AbstractC1534c>.C7508d m18538f = this.mObservers.m18538f();
                while (m18538f.hasNext()) {
                    considerNotify((AbstractC1534c) m18538f.next().getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t = (T) this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public void observe(o oVar, InterfaceC1584v<? super T> interfaceC1584v) {
        assertMainThread("observe");
        if (oVar.getLifecycle().mo35505b() == AbstractC1565i.c.c) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(oVar, interfaceC1584v);
        LiveData<T>.AbstractC1534c mo18535l = this.mObservers.mo18535l(interfaceC1584v, lifecycleBoundObserver);
        if (mo18535l != null && !mo18535l.mo35577d(oVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo18535l != null) {
            return;
        }
        oVar.getLifecycle().mo35506a(lifecycleBoundObserver);
    }

    public void observeForever(InterfaceC1584v<? super T> interfaceC1584v) {
        assertMainThread("observeForever");
        C1533b c1533b = new C1533b(this, interfaceC1584v);
        LiveData<T>.AbstractC1534c mo18535l = this.mObservers.mo18535l(interfaceC1584v, c1533b);
        if (mo18535l instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo18535l != null) {
            return;
        }
        c1533b.m35579a(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onActive() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onInactive() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = t;
        }
        if (z) {
            C7498a.m18547f().mo18542d(this.mPostValueRunnable);
        }
    }

    public void removeObserver(InterfaceC1584v<? super T> interfaceC1584v) {
        assertMainThread("removeObserver");
        LiveData<T>.AbstractC1534c mo18534m = this.mObservers.mo18534m(interfaceC1584v);
        if (mo18534m == null) {
            return;
        }
        mo18534m.mo35578b();
        mo18534m.m35579a(false);
    }

    public void removeObservers(o oVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<InterfaceC1584v<? super T>, LiveData<T>.AbstractC1534c>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry<InterfaceC1584v<? super T>, LiveData<T>.AbstractC1534c> next = it.next();
            if (next.getValue().mo35577d(oVar)) {
                removeObserver(next.getKey());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue(null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new C7504b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new RunnableC1532a();
        this.mData = NOT_SET;
        this.mVersion = -1;
    }
}
