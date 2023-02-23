package p272h.p364d.p365a.p366c.p367f;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.core.app.C1305e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import h.d.a.c.e;
import java.util.UUID;
import p272h.p364d.p365a.C9407b;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: FragmentMvpDelegateImpl.java */
/* renamed from: h.d.a.c.f.d */
/* loaded from: classes2.dex */
public class C9417d<V extends e, P extends InterfaceC9413d<V>> implements InterfaceC9416c<V, P> {

    /* renamed from: g */
    public static boolean f22049g = false;

    /* renamed from: a */
    private InterfaceC9418e<V, P> f22050a;

    /* renamed from: b */
    protected Fragment f22051b;

    /* renamed from: c */
    protected final boolean f22052c;

    /* renamed from: d */
    protected final boolean f22053d;

    /* renamed from: e */
    private boolean f22054e = false;

    /* renamed from: f */
    protected String f22055f;

    public C9417d(Fragment fragment, InterfaceC9418e<V, P> interfaceC9418e, boolean z, boolean z2) {
        if (interfaceC9418e == null) {
            throw new NullPointerException("MvpDelegateCallback is null!");
        }
        if (fragment == null) {
            throw new NullPointerException("Fragment is null!");
        }
        if (!z && z2) {
            throw new IllegalArgumentException("It is not possible to keep the presenter on backstack, but NOT keep presenter through screen orientation changes. Keep presenter on backstack also requires keep presenter through screen orientation changes to be enabled");
        }
        this.f22051b = fragment;
        this.f22050a = interfaceC9418e;
        this.f22052c = z;
        this.f22053d = z2;
    }

    /* renamed from: i */
    private P m14791i() {
        P createPresenter = this.f22050a.createPresenter();
        if (createPresenter != null) {
            if (this.f22052c) {
                this.f22055f = UUID.randomUUID().toString();
                C9407b.m14811f(m14790j(), this.f22055f, createPresenter);
            }
            return createPresenter;
        }
        throw new NullPointerException("Presenter returned from createPresenter() is null. Activity is " + m14790j());
    }

    /* renamed from: j */
    private Activity m14790j() {
        i activity = this.f22051b.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new NullPointerException("Activity returned by Fragment.getActivity() is null. Fragment is " + this.f22051b);
    }

    /* renamed from: k */
    private V m14789k() {
        V mvpView = this.f22050a.getMvpView();
        if (mvpView != null) {
            return mvpView;
        }
        throw new NullPointerException("View returned from getMvpView() is null");
    }

    /* renamed from: l */
    private P m14788l() {
        P presenter = this.f22050a.getPresenter();
        if (presenter != null) {
            return presenter;
        }
        throw new NullPointerException("Presenter returned from getPresenter() is null");
    }

    /* renamed from: m */
    static boolean m14787m(Activity activity, Fragment fragment, boolean z, boolean z2) {
        if (activity.isChangingConfigurations()) {
            return z;
        }
        if (activity.isFinishing()) {
            return false;
        }
        if (z2 && C1305e.m36444a(fragment)) {
            return true;
        }
        return true ^ fragment.isRemoving();
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9416c
    /* renamed from: a */
    public void mo14799a() {
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9416c
    /* renamed from: b */
    public void mo14798b(Bundle bundle) {
        if ((this.f22052c || this.f22053d) && bundle != null) {
            bundle.putString("com.hannesdorfmann.mosby3.fragment.mvp.id", this.f22055f);
            if (f22049g) {
                Log.d("FragmentMvpVSDelegate", "Saving MosbyViewId into Bundle. ViewId: " + this.f22055f);
            }
        }
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9416c
    /* renamed from: c */
    public void mo14797c(Bundle bundle) {
        P m14791i;
        if (bundle != null && this.f22052c) {
            this.f22055f = bundle.getString("com.hannesdorfmann.mosby3.fragment.mvp.id");
            if (f22049g) {
                Log.d("FragmentMvpVSDelegate", "MosbyView ID = " + this.f22055f + " for MvpView: " + this.f22050a.getMvpView());
            }
            if (this.f22055f != null && (m14791i = (P) C9407b.m14812e(m14790j(), this.f22055f)) != null) {
                if (f22049g) {
                    Log.d("FragmentMvpVSDelegate", "Reused presenter " + m14791i + " for view " + this.f22050a.getMvpView());
                }
            } else {
                m14791i = m14791i();
                if (f22049g) {
                    Log.d("FragmentMvpVSDelegate", "No presenter found although view Id was here: " + this.f22055f + ". Most likely this was caused by a process death. New Presenter created" + m14791i + " for view " + m14789k());
                }
            }
        } else {
            m14791i = m14791i();
            if (f22049g) {
                Log.d("FragmentMvpVSDelegate", "New presenter " + m14791i + " for view " + m14789k());
            }
        }
        if (m14791i != null) {
            this.f22050a.setPresenter(m14791i);
            return;
        }
        throw new IllegalStateException("Oops, Presenter is null. This seems to be a Mosby internal bug. Please report this issue here: https://github.com/sockeqwe/mosby/issues");
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9416c
    /* renamed from: d */
    public void mo14796d() {
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9416c
    /* renamed from: e */
    public void mo14795e(View view, Bundle bundle) {
        P m14788l = m14788l();
        m14788l.attachView(m14789k());
        if (f22049g) {
            Log.d("FragmentMvpVSDelegate", "View" + m14789k() + " attached to Presenter " + m14788l);
        }
        this.f22054e = true;
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9416c
    /* renamed from: f */
    public void mo14794f(Activity activity) {
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9416c
    /* renamed from: g */
    public void mo14793g(Bundle bundle) {
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9416c
    /* renamed from: h */
    public void mo14792h() {
        this.f22054e = false;
        m14788l().detachView();
        if (f22049g) {
            Log.d("FragmentMvpVSDelegate", "detached MvpView from Presenter. MvpView " + this.f22050a.getMvpView() + "   Presenter: " + m14788l());
        }
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9416c
    public void onDestroy() {
        String str;
        Activity m14790j = m14790j();
        boolean m14787m = m14787m(m14790j, this.f22051b, this.f22052c, this.f22053d);
        P m14788l = m14788l();
        if (!m14787m) {
            m14788l.destroy();
            if (f22049g) {
                Log.d("FragmentMvpVSDelegate", "Presenter destroyed. MvpView " + this.f22050a.getMvpView() + "   Presenter: " + m14788l);
            }
        }
        if (m14787m || (str = this.f22055f) == null) {
            return;
        }
        C9407b.m14810g(m14790j, str);
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9416c
    public void onPause() {
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9416c
    public void onStart() {
        if (this.f22054e) {
            return;
        }
        throw new IllegalStateException("It seems that you are using " + this.f22050a.getClass().getCanonicalName() + " as headless (UI less) fragment (because onViewCreated() has not been called or maybe delegation misses that part). Having a Presenter without a View (UI) doesn't make sense. Simply use an usual fragment instead of an MvpFragment if you want to use a UI less Fragment");
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9416c
    public void onStop() {
    }
}
