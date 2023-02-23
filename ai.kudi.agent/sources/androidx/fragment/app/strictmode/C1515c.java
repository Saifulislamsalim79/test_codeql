package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.C1515c;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13741y0;
import kotlin.p557z.C13742z;
/* compiled from: FragmentStrictMode.kt */
/* renamed from: androidx.fragment.app.strictmode.c */
/* loaded from: classes2.dex */
public final class C1515c {

    /* renamed from: a */
    public static final C1515c f4649a = new C1515c();

    /* renamed from: b */
    private static C1518c f4650b = C1518c.f4660d;

    /* compiled from: FragmentStrictMode.kt */
    /* renamed from: androidx.fragment.app.strictmode.c$a */
    /* loaded from: classes2.dex */
    public enum EnumC1516a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* compiled from: FragmentStrictMode.kt */
    /* renamed from: androidx.fragment.app.strictmode.c$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1517b {
        /* renamed from: a */
        void m35629a(Violation violation);
    }

    /* compiled from: FragmentStrictMode.kt */
    /* renamed from: androidx.fragment.app.strictmode.c$c */
    /* loaded from: classes2.dex */
    public static final class C1518c {

        /* renamed from: d */
        public static final C1518c f4660d;

        /* renamed from: a */
        private final Set<EnumC1516a> f4661a;

        /* renamed from: b */
        private final InterfaceC1517b f4662b;

        /* renamed from: c */
        private final Map<Class<? extends Fragment>, Set<Class<? extends Violation>>> f4663c;

        static {
            Set m3831b;
            Map m3881k;
            m3831b = C13741y0.m3831b();
            m3881k = C13727r0.m3881k();
            f4660d = new C1518c(m3831b, null, m3881k);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C1518c(Set<? extends EnumC1516a> set, InterfaceC1517b interfaceC1517b, Map<Class<? extends Fragment>, ? extends Set<Class<? extends Violation>>> map) {
            l.f(set, "flags");
            l.f(map, "allowedViolations");
            this.f4661a = set;
            this.f4662b = interfaceC1517b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Class<? extends Fragment>, ? extends Set<Class<? extends Violation>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f4663c = linkedHashMap;
        }

        /* renamed from: a */
        public final Set<EnumC1516a> m35628a() {
            return this.f4661a;
        }

        /* renamed from: b */
        public final InterfaceC1517b m35627b() {
            return this.f4662b;
        }

        /* renamed from: c */
        public final Map<Class<? extends Fragment>, Set<Class<? extends Violation>>> m35626c() {
            return this.f4663c;
        }
    }

    private C1515c() {
    }

    /* renamed from: a */
    private final C1518c m35648a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                l.e(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.m35882z0() != null) {
                    C1518c m35882z0 = parentFragmentManager.m35882z0();
                    l.d(m35882z0);
                    l.e(m35882z0, "fragmentManager.strictModePolicy!!");
                    return m35882z0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f4650b;
    }

    /* renamed from: b */
    private final void m35647b(final C1518c c1518c, final Violation violation) {
        Fragment m35649a = violation.m35649a();
        final String name = m35649a.getClass().getName();
        if (c1518c.m35628a().contains(EnumC1516a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", l.m("Policy violation in ", name), violation);
        }
        if (c1518c.m35627b() != null) {
            m35632q(m35649a, new Runnable() { // from class: androidx.fragment.app.strictmode.b
                @Override // java.lang.Runnable
                public final void run() {
                    C1515c.m35646c(C1515c.C1518c.this, violation);
                }
            });
        }
        if (c1518c.m35628a().contains(EnumC1516a.PENALTY_DEATH)) {
            m35632q(m35649a, new Runnable() { // from class: androidx.fragment.app.strictmode.a
                @Override // java.lang.Runnable
                public final void run() {
                    C1515c.m35645d(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m35646c(C1518c c1518c, Violation violation) {
        l.f(c1518c, "$policy");
        l.f(violation, "$violation");
        c1518c.m35627b().m35629a(violation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m35645d(String str, Violation violation) {
        l.f(violation, "$violation");
        Log.e("FragmentStrictMode", l.m("Policy violation with PENALTY_DEATH in ", str), violation);
        throw violation;
    }

    /* renamed from: g */
    private final void m35642g(Violation violation) {
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", l.m("StrictMode violation in ", violation.m35649a().getClass().getName()), violation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static final void m35641h(Fragment fragment, String str) {
        l.f(fragment, "fragment");
        l.f(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        f4649a.m35642g(fragmentReuseViolation);
        C1518c m35648a = f4649a.m35648a(fragment);
        if (m35648a.m35628a().contains(EnumC1516a.DETECT_FRAGMENT_REUSE) && f4649a.m35631r(m35648a, fragment.getClass(), fragmentReuseViolation.getClass())) {
            f4649a.m35647b(m35648a, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static final void m35640i(Fragment fragment, ViewGroup viewGroup) {
        l.f(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        f4649a.m35642g(fragmentTagUsageViolation);
        C1518c m35648a = f4649a.m35648a(fragment);
        if (m35648a.m35628a().contains(EnumC1516a.DETECT_FRAGMENT_TAG_USAGE) && f4649a.m35631r(m35648a, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            f4649a.m35647b(m35648a, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public static final void m35639j(Fragment fragment) {
        l.f(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        f4649a.m35642g(getRetainInstanceUsageViolation);
        C1518c m35648a = f4649a.m35648a(fragment);
        if (m35648a.m35628a().contains(EnumC1516a.DETECT_RETAIN_INSTANCE_USAGE) && f4649a.m35631r(m35648a, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            f4649a.m35647b(m35648a, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public static final void m35638k(Fragment fragment) {
        l.f(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        f4649a.m35642g(getTargetFragmentRequestCodeUsageViolation);
        C1518c m35648a = f4649a.m35648a(fragment);
        if (m35648a.m35628a().contains(EnumC1516a.DETECT_TARGET_FRAGMENT_USAGE) && f4649a.m35631r(m35648a, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            f4649a.m35647b(m35648a, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public static final void m35637l(Fragment fragment) {
        l.f(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        f4649a.m35642g(getTargetFragmentUsageViolation);
        C1518c m35648a = f4649a.m35648a(fragment);
        if (m35648a.m35628a().contains(EnumC1516a.DETECT_TARGET_FRAGMENT_USAGE) && f4649a.m35631r(m35648a, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            f4649a.m35647b(m35648a, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static final void m35636m(Fragment fragment) {
        l.f(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        f4649a.m35642g(setRetainInstanceUsageViolation);
        C1518c m35648a = f4649a.m35648a(fragment);
        if (m35648a.m35628a().contains(EnumC1516a.DETECT_RETAIN_INSTANCE_USAGE) && f4649a.m35631r(m35648a, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            f4649a.m35647b(m35648a, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static final void m35635n(Fragment fragment, Fragment fragment2, int i) {
        l.f(fragment, "violatingFragment");
        l.f(fragment2, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(fragment, fragment2, i);
        f4649a.m35642g(setTargetFragmentUsageViolation);
        C1518c m35648a = f4649a.m35648a(fragment);
        if (m35648a.m35628a().contains(EnumC1516a.DETECT_TARGET_FRAGMENT_USAGE) && f4649a.m35631r(m35648a, fragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            f4649a.m35647b(m35648a, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static final void m35634o(Fragment fragment, boolean z) {
        l.f(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z);
        f4649a.m35642g(setUserVisibleHintViolation);
        C1518c m35648a = f4649a.m35648a(fragment);
        if (m35648a.m35628a().contains(EnumC1516a.DETECT_SET_USER_VISIBLE_HINT) && f4649a.m35631r(m35648a, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            f4649a.m35647b(m35648a, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final void m35633p(Fragment fragment, ViewGroup viewGroup) {
        l.f(fragment, "fragment");
        l.f(viewGroup, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
        f4649a.m35642g(wrongFragmentContainerViolation);
        C1518c m35648a = f4649a.m35648a(fragment);
        if (m35648a.m35628a().contains(EnumC1516a.DETECT_WRONG_FRAGMENT_CONTAINER) && f4649a.m35631r(m35648a, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            f4649a.m35647b(m35648a, wrongFragmentContainerViolation);
        }
    }

    /* renamed from: q */
    private final void m35632q(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler m35676g = fragment.getParentFragmentManager().m35899t0().m35676g();
            l.e(m35676g, "fragment.parentFragmentManager.host.handler");
            if (l.b(m35676g.getLooper(), Looper.myLooper())) {
                runnable.run();
                return;
            } else {
                m35676g.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    /* renamed from: r */
    private final boolean m35631r(C1518c c1518c, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        boolean m3814J;
        Set<Class<? extends Violation>> set = c1518c.m35626c().get(cls);
        if (set == null) {
            return true;
        }
        if (!l.b(cls2.getSuperclass(), Violation.class)) {
            m3814J = C13742z.m3814J(set, cls2.getSuperclass());
            if (m3814J) {
                return false;
            }
        }
        return !set.contains(cls2);
    }
}
