package p272h.p364d.p365a.p366c;

import h.d.a.c.e;
import java.lang.ref.WeakReference;
/* compiled from: MvpBasePresenter.java */
/* renamed from: h.d.a.c.b */
/* loaded from: classes2.dex */
public class C9410b<V extends e> implements InterfaceC9413d<V> {
    private boolean presenterDestroyed = false;
    private WeakReference<V> viewRef;

    /* compiled from: MvpBasePresenter.java */
    /* renamed from: h.d.a.c.b$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC9411a<V> {
        /* renamed from: a */
        void mo14809a(V v);
    }

    @Override // p272h.p364d.p365a.p366c.InterfaceC9413d
    public void attachView(V v) {
        this.viewRef = new WeakReference<>(v);
        this.presenterDestroyed = false;
    }

    @Override // p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        detachView(false);
        this.presenterDestroyed = true;
    }

    @Override // p272h.p364d.p365a.p366c.InterfaceC9413d
    public void detachView() {
        detachView(true);
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            weakReference.clear();
            this.viewRef = null;
        }
    }

    @Deprecated
    public void detachView(boolean z) {
    }

    @Deprecated
    public V getView() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    protected final void ifViewAttached(boolean z, InterfaceC9411a<V> interfaceC9411a) {
        WeakReference<V> weakReference = this.viewRef;
        V v = weakReference == null ? null : weakReference.get();
        if (v != null) {
            interfaceC9411a.mo14809a(v);
        } else if (z) {
            throw new IllegalStateException("No View attached to Presenter. Presenter destroyed = " + this.presenterDestroyed);
        }
    }

    @Deprecated
    public boolean isViewAttached() {
        WeakReference<V> weakReference = this.viewRef;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ifViewAttached(InterfaceC9411a<V> interfaceC9411a) {
        ifViewAttached(false, interfaceC9411a);
    }
}
