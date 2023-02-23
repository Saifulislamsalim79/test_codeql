package p425j.p434c.p435a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p425j.p434c.p435a.InterfaceC11189j;
import p577n.p578a.p582b.AbstractC14429r;
/* compiled from: MarkwonSpansFactoryImpl.java */
/* renamed from: j.c.a.k */
/* loaded from: classes3.dex */
class C11191k implements InterfaceC11189j {

    /* renamed from: a */
    private final Map<Class<? extends AbstractC14429r>, InterfaceC11205s> f25281a;

    /* compiled from: MarkwonSpansFactoryImpl.java */
    /* renamed from: j.c.a.k$a */
    /* loaded from: classes3.dex */
    static class C11192a implements InterfaceC11189j.InterfaceC11190a {

        /* renamed from: a */
        private final Map<Class<? extends AbstractC14429r>, InterfaceC11205s> f25282a = new HashMap(3);

        @Override // p425j.p434c.p435a.InterfaceC11189j.InterfaceC11190a
        /* renamed from: a */
        public <N extends AbstractC14429r> InterfaceC11189j.InterfaceC11190a mo11415a(Class<N> cls, InterfaceC11205s interfaceC11205s) {
            if (interfaceC11205s == null) {
                this.f25282a.remove(cls);
            } else {
                this.f25282a.put(cls, interfaceC11205s);
            }
            return this;
        }

        @Override // p425j.p434c.p435a.InterfaceC11189j.InterfaceC11190a
        public InterfaceC11189j build() {
            return new C11191k(Collections.unmodifiableMap(this.f25282a));
        }
    }

    C11191k(Map<Class<? extends AbstractC14429r>, InterfaceC11205s> map) {
        this.f25281a = map;
    }

    @Override // p425j.p434c.p435a.InterfaceC11189j
    /* renamed from: a */
    public <N extends AbstractC14429r> InterfaceC11205s mo11416a(Class<N> cls) {
        return this.f25281a.get(cls);
    }
}
