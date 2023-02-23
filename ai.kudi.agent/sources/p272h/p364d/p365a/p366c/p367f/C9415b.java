package p272h.p364d.p365a.p366c.p367f;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import h.d.a.c.e;
import java.util.UUID;
import p272h.p364d.p365a.C9407b;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: ActivityMvpDelegateImpl.java */
/* renamed from: h.d.a.c.f.b */
/* loaded from: classes2.dex */
public class C9415b<V extends e, P extends InterfaceC9413d<V>> implements InterfaceC9414a {

    /* renamed from: e */
    public static boolean f22044e = false;

    /* renamed from: a */
    private InterfaceC9418e<V, P> f22045a;

    /* renamed from: b */
    protected boolean f22046b;

    /* renamed from: c */
    protected Activity f22047c;

    /* renamed from: d */
    protected String f22048d = null;

    public C9415b(Activity activity, InterfaceC9418e<V, P> interfaceC9418e, boolean z) {
        if (activity == null) {
            throw new NullPointerException("Activity is null!");
        }
        if (interfaceC9418e != null) {
            this.f22045a = interfaceC9418e;
            this.f22047c = activity;
            this.f22046b = z;
            return;
        }
        throw new NullPointerException("MvpDelegateCallback is null!");
    }

    /* renamed from: f */
    private P m14803f() {
        P createPresenter = this.f22045a.createPresenter();
        if (createPresenter != null) {
            if (this.f22046b) {
                String uuid = UUID.randomUUID().toString();
                this.f22048d = uuid;
                C9407b.m14811f(this.f22047c, uuid, createPresenter);
            }
            return createPresenter;
        }
        throw new NullPointerException("Presenter returned from createPresenter() is null. Activity is " + this.f22047c);
    }

    /* renamed from: g */
    private V m14802g() {
        V mvpView = this.f22045a.getMvpView();
        if (mvpView != null) {
            return mvpView;
        }
        throw new NullPointerException("View returned from getMvpView() is null");
    }

    /* renamed from: h */
    private P m14801h() {
        P presenter = this.f22045a.getPresenter();
        if (presenter != null) {
            return presenter;
        }
        throw new NullPointerException("Presenter returned from getPresenter() is null");
    }

    /* renamed from: i */
    static boolean m14800i(boolean z, Activity activity) {
        return z && (activity.isChangingConfigurations() || !activity.isFinishing());
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9414a
    /* renamed from: a */
    public void mo14808a() {
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9414a
    /* renamed from: b */
    public void mo14807b(Bundle bundle) {
        if (!this.f22046b || bundle == null) {
            return;
        }
        bundle.putString("com.hannesdorfmann.mosby3.activity.mvp.id", this.f22048d);
        if (f22044e) {
            Log.d("ActivityMvpDelegateImpl", "Saving MosbyViewId into Bundle. ViewId: " + this.f22048d + " for view " + m14802g());
        }
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9414a
    /* renamed from: c */
    public void mo14806c(Bundle bundle) {
        P m14803f;
        if (bundle != null && this.f22046b) {
            this.f22048d = bundle.getString("com.hannesdorfmann.mosby3.activity.mvp.id");
            if (f22044e) {
                Log.d("ActivityMvpDelegateImpl", "MosbyView ID = " + this.f22048d + " for MvpView: " + this.f22045a.getMvpView());
            }
            String str = this.f22048d;
            if (str != null && (m14803f = (P) C9407b.m14812e(this.f22047c, str)) != null) {
                if (f22044e) {
                    Log.d("ActivityMvpDelegateImpl", "Reused presenter " + m14803f + " for view " + this.f22045a.getMvpView());
                }
            } else {
                m14803f = m14803f();
                if (f22044e) {
                    Log.d("ActivityMvpDelegateImpl", "No presenter found although view Id was here: " + this.f22048d + ". Most likely this was caused by a process death. New Presenter created" + m14803f + " for view " + m14802g());
                }
            }
        } else {
            m14803f = m14803f();
            if (f22044e) {
                Log.d("ActivityMvpDelegateImpl", "New presenter " + m14803f + " for view " + m14802g());
            }
        }
        if (m14803f != null) {
            this.f22045a.setPresenter(m14803f);
            m14801h().attachView(m14802g());
            if (f22044e) {
                Log.d("ActivityMvpDelegateImpl", "View" + m14802g() + " attached to Presenter " + m14803f);
                return;
            }
            return;
        }
        throw new IllegalStateException("Oops, Presenter is null. This seems to be a Mosby internal bug. Please report this issue here: https://github.com/sockeqwe/mosby/issues");
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9414a
    /* renamed from: d */
    public void mo14805d(Bundle bundle) {
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9414a
    /* renamed from: e */
    public void mo14804e() {
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9414a
    public void onContentChanged() {
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9414a
    public void onDestroy() {
        String str;
        boolean m14800i = m14800i(this.f22046b, this.f22047c);
        m14801h().detachView();
        if (!m14800i) {
            m14801h().destroy();
        }
        if (!m14800i && (str = this.f22048d) != null) {
            C9407b.m14810g(this.f22047c, str);
        }
        if (f22044e) {
            if (m14800i) {
                Log.d("ActivityMvpDelegateImpl", "View" + m14802g() + " destroyed temporarily. View detached from presenter " + m14801h());
                return;
            }
            Log.d("ActivityMvpDelegateImpl", "View" + m14802g() + " destroyed permanently. View detached permanently from presenter " + m14801h());
        }
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9414a
    public void onPause() {
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9414a
    public void onStart() {
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9414a
    public void onStop() {
    }
}
