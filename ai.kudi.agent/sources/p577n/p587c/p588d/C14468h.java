package p577n.p587c.p588d;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p577n.p587c.InterfaceC14458a;
import p577n.p587c.InterfaceC14459b;
/* compiled from: SubstituteLoggerFactory.java */
/* renamed from: n.c.d.h */
/* loaded from: classes3.dex */
public class C14468h implements InterfaceC14458a {

    /* renamed from: a */
    final ConcurrentMap<String, C14467g> f31837a = new ConcurrentHashMap();

    @Override // p577n.p587c.InterfaceC14458a
    /* renamed from: a */
    public InterfaceC14459b mo1633a(String str) {
        C14467g c14467g = this.f31837a.get(str);
        if (c14467g == null) {
            C14467g c14467g2 = new C14467g(str);
            C14467g putIfAbsent = this.f31837a.putIfAbsent(str, c14467g2);
            return putIfAbsent != null ? putIfAbsent : c14467g2;
        }
        return c14467g;
    }

    /* renamed from: b */
    public void m1650b() {
        this.f31837a.clear();
    }

    /* renamed from: c */
    public List<C14467g> m1649c() {
        return new ArrayList(this.f31837a.values());
    }
}
