package p272h.p286c.p287a.p300b.p307d.p317j;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.e7 */
/* loaded from: classes2.dex */
final class C8889e7 implements InterfaceC5964c {

    /* renamed from: a */
    static final C8889e7 f20895a = new C8889e7();

    /* renamed from: b */
    private static final C5961b f20896b;

    /* renamed from: c */
    private static final C5961b f20897c;

    /* renamed from: d */
    private static final C5961b f20898d;

    /* renamed from: e */
    private static final C5961b f20899e;

    /* renamed from: f */
    private static final C5961b f20900f;

    /* renamed from: g */
    private static final C5961b f20901g;

    /* renamed from: h */
    private static final C5961b f20902h;

    /* renamed from: i */
    private static final C5961b f20903i;

    /* renamed from: j */
    private static final C5961b f20904j;

    /* renamed from: k */
    private static final C5961b f20905k;

    /* renamed from: l */
    private static final C5961b f20906l;

    /* renamed from: m */
    private static final C5961b f20907m;

    /* renamed from: n */
    private static final C5961b f20908n;

    /* renamed from: o */
    private static final C5961b f20909o;

    static {
        C5961b.C5963b m23171a = C5961b.m23171a("appId");
        C9092s1 c9092s1 = new C9092s1();
        c9092s1.m15548a(1);
        m23171a.m23166b(c9092s1.m15547b());
        f20896b = m23171a.m23167a();
        C5961b.C5963b m23171a2 = C5961b.m23171a("appVersion");
        C9092s1 c9092s12 = new C9092s1();
        c9092s12.m15548a(2);
        m23171a2.m23166b(c9092s12.m15547b());
        f20897c = m23171a2.m23167a();
        C5961b.C5963b m23171a3 = C5961b.m23171a("firebaseProjectId");
        C9092s1 c9092s13 = new C9092s1();
        c9092s13.m15548a(3);
        m23171a3.m23166b(c9092s13.m15547b());
        f20898d = m23171a3.m23167a();
        C5961b.C5963b m23171a4 = C5961b.m23171a("mlSdkVersion");
        C9092s1 c9092s14 = new C9092s1();
        c9092s14.m15548a(4);
        m23171a4.m23166b(c9092s14.m15547b());
        f20899e = m23171a4.m23167a();
        C5961b.C5963b m23171a5 = C5961b.m23171a("tfliteSchemaVersion");
        C9092s1 c9092s15 = new C9092s1();
        c9092s15.m15548a(5);
        m23171a5.m23166b(c9092s15.m15547b());
        f20900f = m23171a5.m23167a();
        C5961b.C5963b m23171a6 = C5961b.m23171a("gcmSenderId");
        C9092s1 c9092s16 = new C9092s1();
        c9092s16.m15548a(6);
        m23171a6.m23166b(c9092s16.m15547b());
        f20901g = m23171a6.m23167a();
        C5961b.C5963b m23171a7 = C5961b.m23171a("apiKey");
        C9092s1 c9092s17 = new C9092s1();
        c9092s17.m15548a(7);
        m23171a7.m23166b(c9092s17.m15547b());
        f20902h = m23171a7.m23167a();
        C5961b.C5963b m23171a8 = C5961b.m23171a("languages");
        C9092s1 c9092s18 = new C9092s1();
        c9092s18.m15548a(8);
        m23171a8.m23166b(c9092s18.m15547b());
        f20903i = m23171a8.m23167a();
        C5961b.C5963b m23171a9 = C5961b.m23171a("mlSdkInstanceId");
        C9092s1 c9092s19 = new C9092s1();
        c9092s19.m15548a(9);
        m23171a9.m23166b(c9092s19.m15547b());
        f20904j = m23171a9.m23167a();
        C5961b.C5963b m23171a10 = C5961b.m23171a("isClearcutClient");
        C9092s1 c9092s110 = new C9092s1();
        c9092s110.m15548a(10);
        m23171a10.m23166b(c9092s110.m15547b());
        f20905k = m23171a10.m23167a();
        C5961b.C5963b m23171a11 = C5961b.m23171a("isStandaloneMlkit");
        C9092s1 c9092s111 = new C9092s1();
        c9092s111.m15548a(11);
        m23171a11.m23166b(c9092s111.m15547b());
        f20906l = m23171a11.m23167a();
        C5961b.C5963b m23171a12 = C5961b.m23171a("isJsonLogging");
        C9092s1 c9092s112 = new C9092s1();
        c9092s112.m15548a(12);
        m23171a12.m23166b(c9092s112.m15547b());
        f20907m = m23171a12.m23167a();
        C5961b.C5963b m23171a13 = C5961b.m23171a("buildLevel");
        C9092s1 c9092s113 = new C9092s1();
        c9092s113.m15548a(13);
        m23171a13.m23166b(c9092s113.m15547b());
        f20908n = m23171a13.m23167a();
        C5961b.C5963b m23171a14 = C5961b.m23171a("optionalModuleVersion");
        C9092s1 c9092s114 = new C9092s1();
        c9092s114.m15548a(14);
        m23171a14.m23166b(c9092s114.m15547b());
        f20909o = m23171a14.m23167a();
    }

    private C8889e7() {
    }

    @Override // com.google.firebase.encoders.InterfaceC5964c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15475a(Object obj, Object obj2) throws IOException {
        C8893eb c8893eb = (C8893eb) obj;
        InterfaceC5965d interfaceC5965d = (InterfaceC5965d) obj2;
        interfaceC5965d.mo15507f(f20896b, c8893eb.m15755g());
        interfaceC5965d.mo15507f(f20897c, c8893eb.m15754h());
        interfaceC5965d.mo15507f(f20898d, null);
        interfaceC5965d.mo15507f(f20899e, c8893eb.m15752j());
        interfaceC5965d.mo15507f(f20900f, c8893eb.m15751k());
        interfaceC5965d.mo15507f(f20901g, null);
        interfaceC5965d.mo15507f(f20902h, null);
        interfaceC5965d.mo15507f(f20903i, c8893eb.m15761a());
        interfaceC5965d.mo15507f(f20904j, c8893eb.m15753i());
        interfaceC5965d.mo15507f(f20905k, c8893eb.m15760b());
        interfaceC5965d.mo15507f(f20906l, c8893eb.m15758d());
        interfaceC5965d.mo15507f(f20907m, c8893eb.m15759c());
        interfaceC5965d.mo15507f(f20908n, c8893eb.m15757e());
        interfaceC5965d.mo15507f(f20909o, c8893eb.m15756f());
    }
}
