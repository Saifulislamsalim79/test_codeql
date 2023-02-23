package p272h.p364d.p365a.p366c;

import android.os.Bundle;
import h.d.a.c.e;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p272h.p364d.p365a.p366c.p367f.C9415b;
import p272h.p364d.p365a.p366c.p367f.InterfaceC9414a;
import p272h.p364d.p365a.p366c.p367f.InterfaceC9418e;
/* compiled from: MvpActivity.java */
/* renamed from: h.d.a.c.a */
/* loaded from: classes2.dex */
public abstract class AbstractC9409a<V extends e, P extends InterfaceC9413d<V>> extends androidx.appcompat.app.e implements e, InterfaceC9418e<V, P> {
    protected InterfaceC9414a mvpDelegate;
    protected P presenter;
    protected boolean retainInstance;

    public abstract P createPresenter();

    /* JADX WARN: Multi-variable type inference failed */
    protected InterfaceC9414a<V, P> getMvpDelegate() {
        if (this.mvpDelegate == null) {
            this.mvpDelegate = new C9415b(this, this, true);
        }
        return this.mvpDelegate;
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public V getMvpView() {
        return this;
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public P getPresenter() {
        return this.presenter;
    }

    public void onContentChanged() {
        super.onContentChanged();
        getMvpDelegate().onContentChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.i*/.onCreate(bundle);
        getMvpDelegate().mo14806c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        getMvpDelegate().onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onPause() {
        super/*androidx.fragment.app.i*/.onPause();
        getMvpDelegate().onPause();
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getMvpDelegate().mo14805d(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onRestart() {
        super/*android.app.Activity*/.onRestart();
        getMvpDelegate().mo14804e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onResume() {
        super/*androidx.fragment.app.i*/.onResume();
        getMvpDelegate().mo14808a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public void onSaveInstanceState(Bundle bundle) {
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        getMvpDelegate().mo14807b(bundle);
    }

    protected void onStart() {
        super.onStart();
        getMvpDelegate().onStart();
    }

    protected void onStop() {
        super.onStop();
        getMvpDelegate().onStop();
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public void setPresenter(P p) {
        this.presenter = p;
    }
}
