package io.intercom.com.bumptech.glide.p409m;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import java.util.HashSet;
/* compiled from: SupportRequestManagerFragment.java */
/* renamed from: io.intercom.com.bumptech.glide.m.o */
/* loaded from: classes3.dex */
public class C10832o extends Fragment {

    /* renamed from: c */
    private final C10813a f24713c;

    /* renamed from: d */
    private final InterfaceC10830m f24714d;

    /* renamed from: e */
    private final HashSet<C10832o> f24715e;

    /* renamed from: f */
    private C10832o f24716f;

    /* renamed from: w */
    private C10486i f24717w;

    /* renamed from: x */
    private Fragment f24718x;

    /* compiled from: SupportRequestManagerFragment.java */
    /* renamed from: io.intercom.com.bumptech.glide.m.o$a */
    /* loaded from: classes3.dex */
    private class C10833a implements InterfaceC10830m {
        C10833a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + C10832o.this + "}";
        }
    }

    public C10832o() {
        this(new C10813a());
    }

    /* renamed from: e */
    private void m12227e(C10832o c10832o) {
        this.f24715e.add(c10832o);
    }

    /* renamed from: h */
    private Fragment m12225h() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f24718x;
    }

    /* renamed from: k */
    private void m12222k(i iVar) {
        m12218p();
        C10832o m12237i = ComponentCallbacks2C10478c.m13034c(iVar).m13026k().m12237i(iVar.getSupportFragmentManager(), null);
        this.f24716f = m12237i;
        if (m12237i != this) {
            m12237i.m12227e(this);
        }
    }

    /* renamed from: l */
    private void m12221l(C10832o c10832o) {
        this.f24715e.remove(c10832o);
    }

    /* renamed from: p */
    private void m12218p() {
        C10832o c10832o = this.f24716f;
        if (c10832o != null) {
            c10832o.m12221l(this);
            this.f24716f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C10813a m12226f() {
        return this.f24713c;
    }

    /* renamed from: i */
    public C10486i m12224i() {
        return this.f24717w;
    }

    /* renamed from: j */
    public InterfaceC10830m m12223j() {
        return this.f24714d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m12220n(Fragment fragment) {
        this.f24718x = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m12222k(fragment.getActivity());
    }

    /* renamed from: o */
    public void m12219o(C10486i c10486i) {
        this.f24717w = c10486i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            m12222k(getActivity());
        } catch (IllegalStateException e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f24713c.m12265c();
        m12218p();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f24718x = null;
        m12218p();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f24713c.m12264d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f24713c.m12263e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m12225h() + "}";
    }

    public C10832o(C10813a c10813a) {
        this.f24714d = new C10833a();
        this.f24715e = new HashSet<>();
        this.f24713c = c10813a;
    }
}
