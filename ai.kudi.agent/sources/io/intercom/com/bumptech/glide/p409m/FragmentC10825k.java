package io.intercom.com.bumptech.glide.p409m;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import java.util.HashSet;
/* compiled from: RequestManagerFragment.java */
/* renamed from: io.intercom.com.bumptech.glide.m.k */
/* loaded from: classes3.dex */
public class FragmentC10825k extends Fragment {

    /* renamed from: c */
    private final C10813a f24697c;

    /* renamed from: d */
    private final InterfaceC10830m f24698d;

    /* renamed from: e */
    private final HashSet<FragmentC10825k> f24699e;

    /* renamed from: f */
    private C10486i f24700f;

    /* renamed from: w */
    private FragmentC10825k f24701w;

    /* renamed from: x */
    private Fragment f24702x;

    /* compiled from: RequestManagerFragment.java */
    /* renamed from: io.intercom.com.bumptech.glide.m.k$a */
    /* loaded from: classes3.dex */
    private class C10826a implements InterfaceC10830m {
        C10826a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + FragmentC10825k.this + "}";
        }
    }

    public FragmentC10825k() {
        this(new C10813a());
    }

    /* renamed from: a */
    private void m12255a(FragmentC10825k fragmentC10825k) {
        this.f24699e.add(fragmentC10825k);
    }

    /* renamed from: c */
    private Fragment m12253c() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f24702x;
    }

    /* renamed from: f */
    private void m12250f(Activity activity) {
        m12246j();
        FragmentC10825k m12238h = ComponentCallbacks2C10478c.m13034c(activity).m13026k().m12238h(activity.getFragmentManager(), null);
        this.f24701w = m12238h;
        if (m12238h != this) {
            m12238h.m12255a(this);
        }
    }

    /* renamed from: g */
    private void m12249g(FragmentC10825k fragmentC10825k) {
        this.f24699e.remove(fragmentC10825k);
    }

    /* renamed from: j */
    private void m12246j() {
        FragmentC10825k fragmentC10825k = this.f24701w;
        if (fragmentC10825k != null) {
            fragmentC10825k.m12249g(this);
            this.f24701w = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C10813a m12254b() {
        return this.f24697c;
    }

    /* renamed from: d */
    public C10486i m12252d() {
        return this.f24700f;
    }

    /* renamed from: e */
    public InterfaceC10830m m12251e() {
        return this.f24698d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m12248h(Fragment fragment) {
        this.f24702x = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m12250f(fragment.getActivity());
    }

    /* renamed from: i */
    public void m12247i(C10486i c10486i) {
        this.f24700f = c10486i;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m12250f(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f24697c.m12265c();
        m12246j();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m12246j();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f24697c.m12264d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f24697c.m12263e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m12253c() + "}";
    }

    FragmentC10825k(C10813a c10813a) {
        this.f24698d = new C10826a();
        this.f24699e = new HashSet<>();
        this.f24697c = c10813a;
    }
}
