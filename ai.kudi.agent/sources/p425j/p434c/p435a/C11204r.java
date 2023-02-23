package p425j.p434c.p435a;

import java.util.HashMap;
import java.util.Map;
/* compiled from: RenderPropsImpl.java */
/* renamed from: j.c.a.r */
/* loaded from: classes3.dex */
class C11204r implements InterfaceC11203q {

    /* renamed from: a */
    private final Map<C11201o, Object> f25296a = new HashMap(3);

    @Override // p425j.p434c.p435a.InterfaceC11203q
    /* renamed from: a */
    public <T> void mo11389a(C11201o<T> c11201o, T t) {
        if (t == null) {
            this.f25296a.remove(c11201o);
        } else {
            this.f25296a.put(c11201o, t);
        }
    }

    @Override // p425j.p434c.p435a.InterfaceC11203q
    /* renamed from: b */
    public <T> T mo11388b(C11201o<T> c11201o) {
        return (T) this.f25296a.get(c11201o);
    }
}
