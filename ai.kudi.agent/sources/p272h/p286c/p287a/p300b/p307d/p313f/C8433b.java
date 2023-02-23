package p272h.p286c.p287a.p300b.p307d.p313f;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import com.google.firebase.messaging.p168h1.C6508b;
import java.io.IOException;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: h.c.a.b.d.f.b */
/* loaded from: classes2.dex */
final class C8433b implements InterfaceC5964c<C6508b> {

    /* renamed from: a */
    static final C8433b f20116a = new C8433b();

    /* renamed from: b */
    private static final C5961b f20117b;

    static {
        C5961b.C5963b m23171a = C5961b.m23171a("messagingClientEvent");
        C8445o c8445o = new C8445o();
        c8445o.m16097a(1);
        m23171a.m23166b(c8445o.m16096b());
        f20117b = m23171a.m23167a();
    }

    private C8433b() {
    }

    @Override // com.google.firebase.encoders.InterfaceC5964c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15475a(Object obj, Object obj2) throws IOException {
        ((InterfaceC5965d) obj2).mo15507f(f20117b, ((C6508b) obj).m21749a());
    }
}
