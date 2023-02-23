package p272h.p286c.p287a.p300b.p307d.p317j;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.b5 */
/* loaded from: classes2.dex */
final class C8842b5 implements InterfaceC5964c {

    /* renamed from: a */
    static final C8842b5 f20815a = new C8842b5();

    /* renamed from: b */
    private static final C5961b f20816b;

    /* renamed from: c */
    private static final C5961b f20817c;

    /* renamed from: d */
    private static final C5961b f20818d;

    /* renamed from: e */
    private static final C5961b f20819e;

    /* renamed from: f */
    private static final C5961b f20820f;

    /* renamed from: g */
    private static final C5961b f20821g;

    static {
        C5961b.C5963b m23171a = C5961b.m23171a("landmarkMode");
        C9092s1 c9092s1 = new C9092s1();
        c9092s1.m15548a(1);
        m23171a.m23166b(c9092s1.m15547b());
        f20816b = m23171a.m23167a();
        C5961b.C5963b m23171a2 = C5961b.m23171a("classificationMode");
        C9092s1 c9092s12 = new C9092s1();
        c9092s12.m15548a(2);
        m23171a2.m23166b(c9092s12.m15547b());
        f20817c = m23171a2.m23167a();
        C5961b.C5963b m23171a3 = C5961b.m23171a("performanceMode");
        C9092s1 c9092s13 = new C9092s1();
        c9092s13.m15548a(3);
        m23171a3.m23166b(c9092s13.m15547b());
        f20818d = m23171a3.m23167a();
        C5961b.C5963b m23171a4 = C5961b.m23171a("contourMode");
        C9092s1 c9092s14 = new C9092s1();
        c9092s14.m15548a(4);
        m23171a4.m23166b(c9092s14.m15547b());
        f20819e = m23171a4.m23167a();
        C5961b.C5963b m23171a5 = C5961b.m23171a("isTrackingEnabled");
        C9092s1 c9092s15 = new C9092s1();
        c9092s15.m15548a(5);
        m23171a5.m23166b(c9092s15.m15547b());
        f20820f = m23171a5.m23167a();
        C5961b.C5963b m23171a6 = C5961b.m23171a("minFaceSize");
        C9092s1 c9092s16 = new C9092s1();
        c9092s16.m15548a(6);
        m23171a6.m23166b(c9092s16.m15547b());
        f20821g = m23171a6.m23167a();
    }

    private C8842b5() {
    }

    @Override // com.google.firebase.encoders.InterfaceC5964c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15475a(Object obj, Object obj2) throws IOException {
        C9129u8 c9129u8 = (C9129u8) obj;
        InterfaceC5965d interfaceC5965d = (InterfaceC5965d) obj2;
        interfaceC5965d.mo15507f(f20816b, c9129u8.m15532c());
        interfaceC5965d.mo15507f(f20817c, c9129u8.m15534a());
        interfaceC5965d.mo15507f(f20818d, c9129u8.m15531d());
        interfaceC5965d.mo15507f(f20819e, c9129u8.m15533b());
        interfaceC5965d.mo15507f(f20820f, c9129u8.m15530e());
        interfaceC5965d.mo15507f(f20821g, c9129u8.m15529f());
    }
}
