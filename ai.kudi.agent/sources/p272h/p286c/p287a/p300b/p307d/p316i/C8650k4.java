package p272h.p286c.p287a.p300b.p307d.p316i;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import java.io.IOException;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.k4 */
/* loaded from: classes2.dex */
final class C8650k4 implements InterfaceC5964c {

    /* renamed from: a */
    static final C8650k4 f20505a = new C8650k4();

    /* renamed from: b */
    private static final C5961b f20506b;

    /* renamed from: c */
    private static final C5961b f20507c;

    /* renamed from: d */
    private static final C5961b f20508d;

    /* renamed from: e */
    private static final C5961b f20509e;

    /* renamed from: f */
    private static final C5961b f20510f;

    /* renamed from: g */
    private static final C5961b f20511g;

    /* renamed from: h */
    private static final C5961b f20512h;

    /* renamed from: i */
    private static final C5961b f20513i;

    /* renamed from: j */
    private static final C5961b f20514j;

    /* renamed from: k */
    private static final C5961b f20515k;

    /* renamed from: l */
    private static final C5961b f20516l;

    /* renamed from: m */
    private static final C5961b f20517m;

    /* renamed from: n */
    private static final C5961b f20518n;

    /* renamed from: o */
    private static final C5961b f20519o;

    static {
        C5961b.C5963b m23171a = C5961b.m23171a("appId");
        C8580e c8580e = new C8580e();
        c8580e.m15976a(1);
        m23171a.m23166b(c8580e.m15975b());
        f20506b = m23171a.m23167a();
        C5961b.C5963b m23171a2 = C5961b.m23171a("appVersion");
        C8580e c8580e2 = new C8580e();
        c8580e2.m15976a(2);
        m23171a2.m23166b(c8580e2.m15975b());
        f20507c = m23171a2.m23167a();
        C5961b.C5963b m23171a3 = C5961b.m23171a("firebaseProjectId");
        C8580e c8580e3 = new C8580e();
        c8580e3.m15976a(3);
        m23171a3.m23166b(c8580e3.m15975b());
        f20508d = m23171a3.m23167a();
        C5961b.C5963b m23171a4 = C5961b.m23171a("mlSdkVersion");
        C8580e c8580e4 = new C8580e();
        c8580e4.m15976a(4);
        m23171a4.m23166b(c8580e4.m15975b());
        f20509e = m23171a4.m23167a();
        C5961b.C5963b m23171a5 = C5961b.m23171a("tfliteSchemaVersion");
        C8580e c8580e5 = new C8580e();
        c8580e5.m15976a(5);
        m23171a5.m23166b(c8580e5.m15975b());
        f20510f = m23171a5.m23167a();
        C5961b.C5963b m23171a6 = C5961b.m23171a("gcmSenderId");
        C8580e c8580e6 = new C8580e();
        c8580e6.m15976a(6);
        m23171a6.m23166b(c8580e6.m15975b());
        f20511g = m23171a6.m23167a();
        C5961b.C5963b m23171a7 = C5961b.m23171a("apiKey");
        C8580e c8580e7 = new C8580e();
        c8580e7.m15976a(7);
        m23171a7.m23166b(c8580e7.m15975b());
        f20512h = m23171a7.m23167a();
        C5961b.C5963b m23171a8 = C5961b.m23171a("languages");
        C8580e c8580e8 = new C8580e();
        c8580e8.m15976a(8);
        m23171a8.m23166b(c8580e8.m15975b());
        f20513i = m23171a8.m23167a();
        C5961b.C5963b m23171a9 = C5961b.m23171a("mlSdkInstanceId");
        C8580e c8580e9 = new C8580e();
        c8580e9.m15976a(9);
        m23171a9.m23166b(c8580e9.m15975b());
        f20514j = m23171a9.m23167a();
        C5961b.C5963b m23171a10 = C5961b.m23171a("isClearcutClient");
        C8580e c8580e10 = new C8580e();
        c8580e10.m15976a(10);
        m23171a10.m23166b(c8580e10.m15975b());
        f20515k = m23171a10.m23167a();
        C5961b.C5963b m23171a11 = C5961b.m23171a("isStandaloneMlkit");
        C8580e c8580e11 = new C8580e();
        c8580e11.m15976a(11);
        m23171a11.m23166b(c8580e11.m15975b());
        f20516l = m23171a11.m23167a();
        C5961b.C5963b m23171a12 = C5961b.m23171a("isJsonLogging");
        C8580e c8580e12 = new C8580e();
        c8580e12.m15976a(12);
        m23171a12.m23166b(c8580e12.m15975b());
        f20517m = m23171a12.m23167a();
        C5961b.C5963b m23171a13 = C5961b.m23171a("buildLevel");
        C8580e c8580e13 = new C8580e();
        c8580e13.m15976a(13);
        m23171a13.m23166b(c8580e13.m15975b());
        f20518n = m23171a13.m23167a();
        C5961b.C5963b m23171a14 = C5961b.m23171a("optionalModuleVersion");
        C8580e c8580e14 = new C8580e();
        c8580e14.m15976a(14);
        m23171a14.m23166b(c8580e14.m15975b());
        f20519o = m23171a14.m23167a();
    }

    private C8650k4() {
    }

    @Override // com.google.firebase.encoders.InterfaceC5964c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15475a(Object obj, Object obj2) throws IOException {
        C8763u7 c8763u7 = (C8763u7) obj;
        InterfaceC5965d interfaceC5965d = (InterfaceC5965d) obj2;
        interfaceC5965d.mo15507f(f20506b, c8763u7.m15889g());
        interfaceC5965d.mo15507f(f20507c, c8763u7.m15888h());
        interfaceC5965d.mo15507f(f20508d, null);
        interfaceC5965d.mo15507f(f20509e, c8763u7.m15886j());
        interfaceC5965d.mo15507f(f20510f, c8763u7.m15885k());
        interfaceC5965d.mo15507f(f20511g, null);
        interfaceC5965d.mo15507f(f20512h, null);
        interfaceC5965d.mo15507f(f20513i, c8763u7.m15895a());
        interfaceC5965d.mo15507f(f20514j, c8763u7.m15887i());
        interfaceC5965d.mo15507f(f20515k, c8763u7.m15894b());
        interfaceC5965d.mo15507f(f20516l, c8763u7.m15892d());
        interfaceC5965d.mo15507f(f20517m, c8763u7.m15893c());
        interfaceC5965d.mo15507f(f20518n, c8763u7.m15891e());
        interfaceC5965d.mo15507f(f20519o, c8763u7.m15890f());
    }
}
