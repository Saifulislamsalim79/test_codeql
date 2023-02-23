package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import p565l.C14140e0;
/* compiled from: RouteDatabase.java */
/* renamed from: okhttp3.internal.connection.d */
/* loaded from: classes3.dex */
public final class C14476d {

    /* renamed from: a */
    private final Set<C14140e0> f31864a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void m1592a(C14140e0 c14140e0) {
        this.f31864a.remove(c14140e0);
    }

    /* renamed from: b */
    public synchronized void m1591b(C14140e0 c14140e0) {
        this.f31864a.add(c14140e0);
    }

    /* renamed from: c */
    public synchronized boolean m1590c(C14140e0 c14140e0) {
        return this.f31864a.contains(c14140e0);
    }
}
