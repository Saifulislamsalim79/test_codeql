package p272h.p286c.p287a.p300b.p307d.p317j;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.a6 */
/* loaded from: classes2.dex */
final class C8828a6 implements InterfaceC5964c {

    /* renamed from: a */
    static final C8828a6 f20788a = new C8828a6();

    /* renamed from: b */
    private static final C5961b f20789b;

    /* renamed from: c */
    private static final C5961b f20790c;

    /* renamed from: d */
    private static final C5961b f20791d;

    /* renamed from: e */
    private static final C5961b f20792e;

    /* renamed from: f */
    private static final C5961b f20793f;

    /* renamed from: g */
    private static final C5961b f20794g;

    static {
        C5961b.C5963b m23171a = C5961b.m23171a("inferenceCommonLogEvent");
        C9092s1 c9092s1 = new C9092s1();
        c9092s1.m15548a(1);
        m23171a.m23166b(c9092s1.m15547b());
        f20789b = m23171a.m23167a();
        C5961b.C5963b m23171a2 = C5961b.m23171a("options");
        C9092s1 c9092s12 = new C9092s1();
        c9092s12.m15548a(2);
        m23171a2.m23166b(c9092s12.m15547b());
        f20790c = m23171a2.m23167a();
        C5961b.C5963b m23171a3 = C5961b.m23171a("imageInfo");
        C9092s1 c9092s13 = new C9092s1();
        c9092s13.m15548a(3);
        m23171a3.m23166b(c9092s13.m15547b());
        f20791d = m23171a3.m23167a();
        C5961b.C5963b m23171a4 = C5961b.m23171a("detectorOptions");
        C9092s1 c9092s14 = new C9092s1();
        c9092s14.m15548a(4);
        m23171a4.m23166b(c9092s14.m15547b());
        f20792e = m23171a4.m23167a();
        C5961b.C5963b m23171a5 = C5961b.m23171a("contourDetectedFaces");
        C9092s1 c9092s15 = new C9092s1();
        c9092s15.m15548a(5);
        m23171a5.m23166b(c9092s15.m15547b());
        f20793f = m23171a5.m23167a();
        C5961b.C5963b m23171a6 = C5961b.m23171a("nonContourDetectedFaces");
        C9092s1 c9092s16 = new C9092s1();
        c9092s16.m15548a(6);
        m23171a6.m23166b(c9092s16.m15547b());
        f20794g = m23171a6.m23167a();
    }

    private C8828a6() {
    }

    @Override // com.google.firebase.encoders.InterfaceC5964c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15475a(Object obj, Object obj2) throws IOException {
        C8832aa c8832aa = (C8832aa) obj;
        InterfaceC5965d interfaceC5965d = (InterfaceC5965d) obj2;
        interfaceC5965d.mo15507f(f20789b, c8832aa.m15818c());
        interfaceC5965d.mo15507f(f20790c, null);
        interfaceC5965d.mo15507f(f20791d, c8832aa.m15819b());
        interfaceC5965d.mo15507f(f20792e, c8832aa.m15820a());
        interfaceC5965d.mo15507f(f20793f, c8832aa.m15817d());
        interfaceC5965d.mo15507f(f20794g, c8832aa.m15816e());
    }
}
