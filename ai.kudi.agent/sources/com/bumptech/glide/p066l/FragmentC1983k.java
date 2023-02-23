package com.bumptech.glide.p066l;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C1943b;
import com.bumptech.glide.ComponentCallbacks2C1952h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: RequestManagerFragment.java */
@Deprecated
/* renamed from: com.bumptech.glide.l.k */
/* loaded from: classes2.dex */
public class FragmentC1983k extends Fragment {

    /* renamed from: c */
    private final C1971a f6046c;

    /* renamed from: d */
    private final InterfaceC1988m f6047d;

    /* renamed from: e */
    private final Set<FragmentC1983k> f6048e;

    /* renamed from: f */
    private ComponentCallbacks2C1952h f6049f;

    /* renamed from: w */
    private FragmentC1983k f6050w;

    /* renamed from: x */
    private Fragment f6051x;

    /* compiled from: RequestManagerFragment.java */
    /* renamed from: com.bumptech.glide.l.k$a */
    /* loaded from: classes2.dex */
    private class C1984a implements InterfaceC1988m {
        C1984a() {
        }

        @Override // com.bumptech.glide.p066l.InterfaceC1988m
        /* renamed from: a */
        public Set<ComponentCallbacks2C1952h> mo33956a() {
            Set<FragmentC1983k> m34001b = FragmentC1983k.this.m34001b();
            HashSet hashSet = new HashSet(m34001b.size());
            for (FragmentC1983k fragmentC1983k : m34001b) {
                if (fragmentC1983k.m33998e() != null) {
                    hashSet.add(fragmentC1983k.m33998e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + FragmentC1983k.this + "}";
        }
    }

    public FragmentC1983k() {
        this(new C1971a());
    }

    /* renamed from: a */
    private void m34002a(FragmentC1983k fragmentC1983k) {
        this.f6048e.add(fragmentC1983k);
    }

    /* renamed from: d */
    private Fragment m33999d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f6051x;
    }

    /* renamed from: g */
    private boolean m33996g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: h */
    private void m33995h(Activity activity) {
        m33991l();
        FragmentC1983k m33983h = ComponentCallbacks2C1943b.m34169c(activity).m34161k().m33983h(activity);
        this.f6050w = m33983h;
        if (equals(m33983h)) {
            return;
        }
        this.f6050w.m34002a(this);
    }

    /* renamed from: i */
    private void m33994i(FragmentC1983k fragmentC1983k) {
        this.f6048e.remove(fragmentC1983k);
    }

    /* renamed from: l */
    private void m33991l() {
        FragmentC1983k fragmentC1983k = this.f6050w;
        if (fragmentC1983k != null) {
            fragmentC1983k.m33994i(this);
            this.f6050w = null;
        }
    }

    /* renamed from: b */
    Set<FragmentC1983k> m34001b() {
        if (equals(this.f6050w)) {
            return Collections.unmodifiableSet(this.f6048e);
        }
        if (this.f6050w != null && Build.VERSION.SDK_INT >= 17) {
            HashSet hashSet = new HashSet();
            for (FragmentC1983k fragmentC1983k : this.f6050w.m34001b()) {
                if (m33996g(fragmentC1983k.getParentFragment())) {
                    hashSet.add(fragmentC1983k);
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C1971a m34000c() {
        return this.f6046c;
    }

    /* renamed from: e */
    public ComponentCallbacks2C1952h m33998e() {
        return this.f6049f;
    }

    /* renamed from: f */
    public InterfaceC1988m m33997f() {
        return this.f6047d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m33993j(Fragment fragment) {
        this.f6051x = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m33995h(fragment.getActivity());
    }

    /* renamed from: k */
    public void m33992k(ComponentCallbacks2C1952h componentCallbacks2C1952h) {
        this.f6049f = componentCallbacks2C1952h;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m33995h(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f6046c.m34012c();
        m33991l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m33991l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f6046c.m34011d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f6046c.m34010e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m33999d() + "}";
    }

    FragmentC1983k(C1971a c1971a) {
        this.f6047d = new C1984a();
        this.f6048e = new HashSet();
        this.f6046c = c1971a;
    }
}
