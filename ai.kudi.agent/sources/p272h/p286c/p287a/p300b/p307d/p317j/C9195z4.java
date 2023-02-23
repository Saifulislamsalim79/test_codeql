package p272h.p286c.p287a.p300b.p307d.p317j;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.z4 */
/* loaded from: classes2.dex */
final class C9195z4 implements InterfaceC5964c {

    /* renamed from: a */
    static final C9195z4 f21578a = new C9195z4();

    /* renamed from: b */
    private static final C5961b f21579b;

    /* renamed from: c */
    private static final C5961b f21580c;

    /* renamed from: d */
    private static final C5961b f21581d;

    /* renamed from: e */
    private static final C5961b f21582e;

    /* renamed from: f */
    private static final C5961b f21583f;

    /* renamed from: g */
    private static final C5961b f21584g;

    static {
        C5961b.C5963b m23171a = C5961b.m23171a("maxMs");
        C9092s1 c9092s1 = new C9092s1();
        c9092s1.m15548a(1);
        m23171a.m23166b(c9092s1.m15547b());
        f21579b = m23171a.m23167a();
        C5961b.C5963b m23171a2 = C5961b.m23171a("minMs");
        C9092s1 c9092s12 = new C9092s1();
        c9092s12.m15548a(2);
        m23171a2.m23166b(c9092s12.m15547b());
        f21580c = m23171a2.m23167a();
        C5961b.C5963b m23171a3 = C5961b.m23171a("avgMs");
        C9092s1 c9092s13 = new C9092s1();
        c9092s13.m15548a(3);
        m23171a3.m23166b(c9092s13.m15547b());
        f21581d = m23171a3.m23167a();
        C5961b.C5963b m23171a4 = C5961b.m23171a("firstQuartileMs");
        C9092s1 c9092s14 = new C9092s1();
        c9092s14.m15548a(4);
        m23171a4.m23166b(c9092s14.m15547b());
        f21582e = m23171a4.m23167a();
        C5961b.C5963b m23171a5 = C5961b.m23171a("medianMs");
        C9092s1 c9092s15 = new C9092s1();
        c9092s15.m15548a(5);
        m23171a5.m23166b(c9092s15.m15547b());
        f21583f = m23171a5.m23167a();
        C5961b.C5963b m23171a6 = C5961b.m23171a("thirdQuartileMs");
        C9092s1 c9092s16 = new C9092s1();
        c9092s16.m15548a(6);
        m23171a6.m23166b(c9092s16.m15547b());
        f21584g = m23171a6.m23167a();
    }

    private C9195z4() {
    }

    @Override // com.google.firebase.encoders.InterfaceC5964c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15475a(Object obj, Object obj2) throws IOException {
        C9010m8 c9010m8 = (C9010m8) obj;
        InterfaceC5965d interfaceC5965d = (InterfaceC5965d) obj2;
        interfaceC5965d.mo15507f(f21579b, c9010m8.m15640c());
        interfaceC5965d.mo15507f(f21580c, c9010m8.m15638e());
        interfaceC5965d.mo15507f(f21581d, c9010m8.m15642a());
        interfaceC5965d.mo15507f(f21582e, c9010m8.m15641b());
        interfaceC5965d.mo15507f(f21583f, c9010m8.m15639d());
        interfaceC5965d.mo15507f(f21584g, c9010m8.m15637f());
    }
}
