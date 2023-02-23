package p272h.p286c.p287a.p300b.p307d.p313f;

import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5966e;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: h.c.a.b.d.f.x */
/* loaded from: classes2.dex */
public final class C8452x {

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC5964c<?>> f20146a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC5966e<?>> f20147b;

    /* renamed from: c */
    private final InterfaceC5964c<Object> f20148c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8452x(Map<Class<?>, InterfaceC5964c<?>> map, Map<Class<?>, InterfaceC5966e<?>> map2, InterfaceC5964c<Object> interfaceC5964c) {
        this.f20146a = map;
        this.f20147b = map2;
        this.f20148c = interfaceC5964c;
    }

    /* renamed from: a */
    public final void m16077a(Object obj, OutputStream outputStream) throws IOException {
        new C8449u(outputStream, this.f20146a, this.f20147b, this.f20148c).m16088j(obj);
    }
}
