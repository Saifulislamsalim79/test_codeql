package p272h.p286c.p287a.p300b.p307d.p317j;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.n3 */
/* loaded from: classes2.dex */
final class C9020n3 implements InterfaceC5964c {

    /* renamed from: a */
    static final C9020n3 f21316a = new C9020n3();

    /* renamed from: b */
    private static final C5961b f21317b;

    /* renamed from: c */
    private static final C5961b f21318c;

    /* renamed from: d */
    private static final C5961b f21319d;

    /* renamed from: e */
    private static final C5961b f21320e;

    /* renamed from: f */
    private static final C5961b f21321f;

    /* renamed from: g */
    private static final C5961b f21322g;

    static {
        C5961b.C5963b m23171a = C5961b.m23171a("errorCode");
        C9092s1 c9092s1 = new C9092s1();
        c9092s1.m15548a(1);
        m23171a.m23166b(c9092s1.m15547b());
        f21317b = m23171a.m23167a();
        C5961b.C5963b m23171a2 = C5961b.m23171a("isColdCall");
        C9092s1 c9092s12 = new C9092s1();
        c9092s12.m15548a(2);
        m23171a2.m23166b(c9092s12.m15547b());
        f21318c = m23171a2.m23167a();
        C5961b.C5963b m23171a3 = C5961b.m23171a("imageInfo");
        C9092s1 c9092s13 = new C9092s1();
        c9092s13.m15548a(3);
        m23171a3.m23166b(c9092s13.m15547b());
        f21319d = m23171a3.m23167a();
        C5961b.C5963b m23171a4 = C5961b.m23171a("detectorOptions");
        C9092s1 c9092s14 = new C9092s1();
        c9092s14.m15548a(4);
        m23171a4.m23166b(c9092s14.m15547b());
        f21320e = m23171a4.m23167a();
        C5961b.C5963b m23171a5 = C5961b.m23171a("contourDetectedFaces");
        C9092s1 c9092s15 = new C9092s1();
        c9092s15.m15548a(5);
        m23171a5.m23166b(c9092s15.m15547b());
        f21321f = m23171a5.m23167a();
        C5961b.C5963b m23171a6 = C5961b.m23171a("nonContourDetectedFaces");
        C9092s1 c9092s16 = new C9092s1();
        c9092s16.m15548a(6);
        m23171a6.m23166b(c9092s16.m15547b());
        f21322g = m23171a6.m23167a();
    }

    private C9020n3() {
    }

    @Override // com.google.firebase.encoders.InterfaceC5964c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15475a(Object obj, Object obj2) throws IOException {
        C9034o2 c9034o2 = (C9034o2) obj;
        InterfaceC5965d interfaceC5965d = (InterfaceC5965d) obj2;
        interfaceC5965d.mo15507f(f21317b, c9034o2.m15612b());
        interfaceC5965d.mo15507f(f21318c, c9034o2.m15611c());
        interfaceC5965d.mo15507f(f21319d, null);
        interfaceC5965d.mo15507f(f21320e, c9034o2.m15613a());
        interfaceC5965d.mo15507f(f21321f, c9034o2.m15610d());
        interfaceC5965d.mo15507f(f21322g, c9034o2.m15609e());
    }
}
