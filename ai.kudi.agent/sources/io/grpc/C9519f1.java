package io.grpc;

import io.grpc.C10043s;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadLocalContextStorage.java */
/* renamed from: io.grpc.f1 */
/* loaded from: classes2.dex */
public final class C9519f1 extends C10043s.AbstractC10048e {

    /* renamed from: a */
    private static final Logger f22268a = Logger.getLogger(C9519f1.class.getName());

    /* renamed from: b */
    static final ThreadLocal<C10043s> f22269b = new ThreadLocal<>();

    @Override // io.grpc.C10043s.AbstractC10048e
    /* renamed from: b */
    public C10043s mo13219b() {
        C10043s c10043s = f22269b.get();
        return c10043s == null ? C10043s.f23777f : c10043s;
    }

    @Override // io.grpc.C10043s.AbstractC10048e
    /* renamed from: c */
    public void mo13218c(C10043s c10043s, C10043s c10043s2) {
        if (mo13219b() != c10043s) {
            f22268a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (c10043s2 != C10043s.f23777f) {
            f22269b.set(c10043s2);
        } else {
            f22269b.set(null);
        }
    }

    @Override // io.grpc.C10043s.AbstractC10048e
    /* renamed from: d */
    public C10043s mo13217d(C10043s c10043s) {
        C10043s mo13219b = mo13219b();
        f22269b.set(c10043s);
        return mo13219b;
    }
}
