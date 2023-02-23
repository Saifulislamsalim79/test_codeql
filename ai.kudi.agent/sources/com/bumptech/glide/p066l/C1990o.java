package com.bumptech.glide.p066l;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C1943b;
import com.bumptech.glide.ComponentCallbacks2C1952h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: SupportRequestManagerFragment.java */
/* renamed from: com.bumptech.glide.l.o */
/* loaded from: classes2.dex */
public class C1990o extends Fragment {

    /* renamed from: c */
    private final C1971a f6062c;

    /* renamed from: d */
    private final InterfaceC1988m f6063d;

    /* renamed from: e */
    private final Set<C1990o> f6064e;

    /* renamed from: f */
    private C1990o f6065f;

    /* renamed from: w */
    private ComponentCallbacks2C1952h f6066w;

    /* renamed from: x */
    private Fragment f6067x;

    /* compiled from: SupportRequestManagerFragment.java */
    /* renamed from: com.bumptech.glide.l.o$a */
    /* loaded from: classes2.dex */
    private class C1991a implements InterfaceC1988m {
        C1991a() {
        }

        @Override // com.bumptech.glide.p066l.InterfaceC1988m
        /* renamed from: a */
        public Set<ComponentCallbacks2C1952h> mo33956a() {
            Set<C1990o> m33968f = C1990o.this.m33968f();
            HashSet hashSet = new HashSet(m33968f.size());
            for (C1990o c1990o : m33968f) {
                if (c1990o.m33965j() != null) {
                    hashSet.add(c1990o.m33965j());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C1990o.this + "}";
        }
    }

    public C1990o() {
        this(new C1971a());
    }

    /* renamed from: e */
    private void m33969e(C1990o c1990o) {
        this.f6064e.add(c1990o);
    }

    /* renamed from: i */
    private Fragment m33966i() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f6067x;
    }

    /* renamed from: l */
    private static FragmentManager m33963l(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    /* renamed from: n */
    private boolean m33962n(Fragment fragment) {
        Fragment m33966i = m33966i();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(m33966i)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: o */
    private void m33961o(Context context, FragmentManager fragmentManager) {
        m33957s();
        C1990o m33981j = ComponentCallbacks2C1943b.m34169c(context).m34161k().m33981j(context, fragmentManager);
        this.f6065f = m33981j;
        if (equals(m33981j)) {
            return;
        }
        this.f6065f.m33969e(this);
    }

    /* renamed from: p */
    private void m33960p(C1990o c1990o) {
        this.f6064e.remove(c1990o);
    }

    /* renamed from: s */
    private void m33957s() {
        C1990o c1990o = this.f6065f;
        if (c1990o != null) {
            c1990o.m33960p(this);
            this.f6065f = null;
        }
    }

    /* renamed from: f */
    Set<C1990o> m33968f() {
        C1990o c1990o = this.f6065f;
        if (c1990o == null) {
            return Collections.emptySet();
        }
        if (equals(c1990o)) {
            return Collections.unmodifiableSet(this.f6064e);
        }
        HashSet hashSet = new HashSet();
        for (C1990o c1990o2 : this.f6065f.m33968f()) {
            if (m33962n(c1990o2.m33966i())) {
                hashSet.add(c1990o2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C1971a m33967h() {
        return this.f6062c;
    }

    /* renamed from: j */
    public ComponentCallbacks2C1952h m33965j() {
        return this.f6066w;
    }

    /* renamed from: k */
    public InterfaceC1988m m33964k() {
        return this.f6063d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager m33963l = m33963l(this);
        if (m33963l == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            m33961o(getContext(), m33963l);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f6062c.m34012c();
        m33957s();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f6067x = null;
        m33957s();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f6062c.m34011d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f6062c.m34010e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m33959q(Fragment fragment) {
        FragmentManager m33963l;
        this.f6067x = fragment;
        if (fragment == null || fragment.getContext() == null || (m33963l = m33963l(fragment)) == null) {
            return;
        }
        m33961o(fragment.getContext(), m33963l);
    }

    /* renamed from: r */
    public void m33958r(ComponentCallbacks2C1952h componentCallbacks2C1952h) {
        this.f6066w = componentCallbacks2C1952h;
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m33966i() + "}";
    }

    public C1990o(C1971a c1971a) {
        this.f6063d = new C1991a();
        this.f6064e = new HashSet();
        this.f6062c = c1971a;
    }
}
