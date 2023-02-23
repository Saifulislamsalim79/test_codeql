package p272h.p286c.p287a.p300b.p307d.p313f;

import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5966e;
import com.google.firebase.encoders.p141g.InterfaceC5969b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: h.c.a.b.d.f.w */
/* loaded from: classes2.dex */
public final class C8451w implements InterfaceC5969b<C8451w> {

    /* renamed from: d */
    private static final InterfaceC5964c<Object> f20141d = C8450v.f20140a;

    /* renamed from: e */
    public static final /* synthetic */ int f20142e = 0;

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC5964c<?>> f20143a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC5966e<?>> f20144b = new HashMap();

    /* renamed from: c */
    private final InterfaceC5964c<Object> f20145c = f20141d;

    @Override // com.google.firebase.encoders.p141g.InterfaceC5969b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C8451w mo15833a(Class cls, InterfaceC5964c interfaceC5964c) {
        this.f20143a.put(cls, interfaceC5964c);
        this.f20144b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C8452x m16078b() {
        return new C8452x(new HashMap(this.f20143a), new HashMap(this.f20144b), this.f20145c);
    }
}
