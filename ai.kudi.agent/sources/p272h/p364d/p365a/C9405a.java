package p272h.p364d.p365a;

import h.d.a.c.e;
import java.util.Map;
import p201g.p218e.C7521a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityScopedCache.java */
/* renamed from: h.d.a.a */
/* loaded from: classes2.dex */
public class C9405a {

    /* renamed from: a */
    private final Map<String, C9406a> f22038a = new C7521a();

    /* compiled from: ActivityScopedCache.java */
    /* renamed from: h.d.a.a$a */
    /* loaded from: classes2.dex */
    static final class C9406a {

        /* renamed from: a */
        private InterfaceC9413d<?> f22039a;

        C9406a() {
        }
    }

    /* renamed from: a */
    public void m14822a() {
        this.f22038a.clear();
    }

    /* renamed from: b */
    public <P> P m14821b(String str) {
        C9406a c9406a = this.f22038a.get(str);
        if (c9406a == null) {
            return null;
        }
        return (P) c9406a.f22039a;
    }

    /* renamed from: c */
    public void m14820c(String str, InterfaceC9413d<? extends e> interfaceC9413d) {
        if (str == null) {
            throw new NullPointerException("ViewId is null");
        }
        if (interfaceC9413d != null) {
            C9406a c9406a = this.f22038a.get(str);
            if (c9406a != null) {
                c9406a.f22039a = interfaceC9413d;
                return;
            }
            C9406a c9406a2 = new C9406a();
            c9406a2.f22039a = interfaceC9413d;
            this.f22038a.put(str, c9406a2);
            return;
        }
        throw new NullPointerException("Presenter is null");
    }

    /* renamed from: d */
    public void m14819d(String str) {
        if (str != null) {
            this.f22038a.remove(str);
            return;
        }
        throw new NullPointerException("View Id is null");
    }
}
