package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C1556g0;
import androidx.lifecycle.C1566i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManagerViewModel.java */
/* renamed from: androidx.fragment.app.t */
/* loaded from: classes2.dex */
public final class C1519t extends androidx.lifecycle.d0 {

    /* renamed from: h */
    private static final C1556g0.InterfaceC1559b f4664h = new C1520a();

    /* renamed from: d */
    private final boolean f4668d;

    /* renamed from: a */
    private final HashMap<String, Fragment> f4665a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<String, C1519t> f4666b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, C1566i0> f4667c = new HashMap<>();

    /* renamed from: e */
    private boolean f4669e = false;

    /* renamed from: f */
    private boolean f4670f = false;

    /* renamed from: g */
    private boolean f4671g = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* renamed from: androidx.fragment.app.t$a */
    /* loaded from: classes2.dex */
    class C1520a implements C1556g0.InterfaceC1559b {
        C1520a() {
        }

        @Override // androidx.lifecycle.C1556g0.InterfaceC1559b
        public <T extends androidx.lifecycle.d0> T create(Class<T> cls) {
            return new C1519t(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1519t(boolean z) {
        this.f4668d = z;
    }

    /* renamed from: d */
    private void m35622d(String str) {
        C1519t c1519t = this.f4666b.get(str);
        if (c1519t != null) {
            c1519t.onCleared();
            this.f4666b.remove(str);
        }
        C1566i0 c1566i0 = this.f4667c.get(str);
        if (c1566i0 != null) {
            c1566i0.m35517a();
            this.f4667c.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C1519t m35619g(C1566i0 c1566i0) {
        return (C1519t) new C1556g0(c1566i0, f4664h).m35533a(C1519t.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35625a(Fragment fragment) {
        if (this.f4671g) {
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f4665a.containsKey(fragment.mWho)) {
        } else {
            this.f4665a.put(fragment.mWho, fragment);
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35624b(Fragment fragment) {
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        m35622d(fragment.mWho);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m35623c(String str) {
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m35622d(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Fragment m35621e(String str) {
        return this.f4665a.get(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1519t.class != obj.getClass()) {
            return false;
        }
        C1519t c1519t = (C1519t) obj;
        return this.f4665a.equals(c1519t.f4665a) && this.f4666b.equals(c1519t.f4666b) && this.f4667c.equals(c1519t.f4667c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C1519t m35620f(Fragment fragment) {
        C1519t c1519t = this.f4666b.get(fragment.mWho);
        if (c1519t == null) {
            C1519t c1519t2 = new C1519t(this.f4668d);
            this.f4666b.put(fragment.mWho, c1519t2);
            return c1519t2;
        }
        return c1519t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Collection<Fragment> m35618h() {
        return new ArrayList(this.f4665a.values());
    }

    public int hashCode() {
        return (((this.f4665a.hashCode() * 31) + this.f4666b.hashCode()) * 31) + this.f4667c.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C1566i0 m35617i(Fragment fragment) {
        C1566i0 c1566i0 = this.f4667c.get(fragment.mWho);
        if (c1566i0 == null) {
            C1566i0 c1566i02 = new C1566i0();
            this.f4667c.put(fragment.mWho, c1566i02);
            return c1566i02;
        }
        return c1566i0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean m35616j() {
        return this.f4669e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m35615k(Fragment fragment) {
        if (this.f4671g) {
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f4665a.remove(fragment.mWho) != null) && FragmentManager.m35996G0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m35614l(boolean z) {
        this.f4671g = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean m35613m(Fragment fragment) {
        if (this.f4665a.containsKey(fragment.mWho)) {
            if (this.f4668d) {
                return this.f4669e;
            }
            return !this.f4670f;
        }
        return true;
    }

    protected void onCleared() {
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4669e = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f4665a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f4666b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f4667c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
