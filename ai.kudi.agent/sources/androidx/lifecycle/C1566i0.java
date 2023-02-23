package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ViewModelStore.java */
/* renamed from: androidx.lifecycle.i0 */
/* loaded from: classes2.dex */
public class C1566i0 {

    /* renamed from: a */
    private final HashMap<String, d0> f4774a = new HashMap<>();

    /* renamed from: a */
    public final void m35517a() {
        for (d0 d0Var : this.f4774a.values()) {
            d0Var.clear();
        }
        this.f4774a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final d0 m35516b(String str) {
        return this.f4774a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<String> m35515c() {
        return new HashSet(this.f4774a.keySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m35514d(String str, d0 d0Var) {
        d0 put = this.f4774a.put(str, d0Var);
        if (put != null) {
            put.onCleared();
        }
    }
}
