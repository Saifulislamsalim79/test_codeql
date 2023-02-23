package p272h.p286c.p287a.p300b.p307d.p313f;

import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import com.google.firebase.messaging.p168h1.C6503a;
import java.io.IOException;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: h.c.a.b.d.f.a */
/* loaded from: classes2.dex */
final class C8432a implements InterfaceC5964c<C6503a> {

    /* renamed from: a */
    static final C8432a f20100a = new C8432a();

    /* renamed from: b */
    private static final C5961b f20101b;

    /* renamed from: c */
    private static final C5961b f20102c;

    /* renamed from: d */
    private static final C5961b f20103d;

    /* renamed from: e */
    private static final C5961b f20104e;

    /* renamed from: f */
    private static final C5961b f20105f;

    /* renamed from: g */
    private static final C5961b f20106g;

    /* renamed from: h */
    private static final C5961b f20107h;

    /* renamed from: i */
    private static final C5961b f20108i;

    /* renamed from: j */
    private static final C5961b f20109j;

    /* renamed from: k */
    private static final C5961b f20110k;

    /* renamed from: l */
    private static final C5961b f20111l;

    /* renamed from: m */
    private static final C5961b f20112m;

    /* renamed from: n */
    private static final C5961b f20113n;

    /* renamed from: o */
    private static final C5961b f20114o;

    /* renamed from: p */
    private static final C5961b f20115p;

    static {
        C5961b.C5963b m23171a = C5961b.m23171a("projectNumber");
        C8445o c8445o = new C8445o();
        c8445o.m16097a(1);
        m23171a.m23166b(c8445o.m16096b());
        f20101b = m23171a.m23167a();
        C5961b.C5963b m23171a2 = C5961b.m23171a("messageId");
        C8445o c8445o2 = new C8445o();
        c8445o2.m16097a(2);
        m23171a2.m23166b(c8445o2.m16096b());
        f20102c = m23171a2.m23167a();
        C5961b.C5963b m23171a3 = C5961b.m23171a("instanceId");
        C8445o c8445o3 = new C8445o();
        c8445o3.m16097a(3);
        m23171a3.m23166b(c8445o3.m16096b());
        f20103d = m23171a3.m23167a();
        C5961b.C5963b m23171a4 = C5961b.m23171a("messageType");
        C8445o c8445o4 = new C8445o();
        c8445o4.m16097a(4);
        m23171a4.m23166b(c8445o4.m16096b());
        f20104e = m23171a4.m23167a();
        C5961b.C5963b m23171a5 = C5961b.m23171a("sdkPlatform");
        C8445o c8445o5 = new C8445o();
        c8445o5.m16097a(5);
        m23171a5.m23166b(c8445o5.m16096b());
        f20105f = m23171a5.m23167a();
        C5961b.C5963b m23171a6 = C5961b.m23171a(BanksWithMethods.PACKAGE_NAME);
        C8445o c8445o6 = new C8445o();
        c8445o6.m16097a(6);
        m23171a6.m23166b(c8445o6.m16096b());
        f20106g = m23171a6.m23167a();
        C5961b.C5963b m23171a7 = C5961b.m23171a("collapseKey");
        C8445o c8445o7 = new C8445o();
        c8445o7.m16097a(7);
        m23171a7.m23166b(c8445o7.m16096b());
        f20107h = m23171a7.m23167a();
        C5961b.C5963b m23171a8 = C5961b.m23171a("priority");
        C8445o c8445o8 = new C8445o();
        c8445o8.m16097a(8);
        m23171a8.m23166b(c8445o8.m16096b());
        f20108i = m23171a8.m23167a();
        C5961b.C5963b m23171a9 = C5961b.m23171a("ttl");
        C8445o c8445o9 = new C8445o();
        c8445o9.m16097a(9);
        m23171a9.m23166b(c8445o9.m16096b());
        f20109j = m23171a9.m23167a();
        C5961b.C5963b m23171a10 = C5961b.m23171a("topic");
        C8445o c8445o10 = new C8445o();
        c8445o10.m16097a(10);
        m23171a10.m23166b(c8445o10.m16096b());
        f20110k = m23171a10.m23167a();
        C5961b.C5963b m23171a11 = C5961b.m23171a("bulkId");
        C8445o c8445o11 = new C8445o();
        c8445o11.m16097a(11);
        m23171a11.m23166b(c8445o11.m16096b());
        f20111l = m23171a11.m23167a();
        C5961b.C5963b m23171a12 = C5961b.m23171a("event");
        C8445o c8445o12 = new C8445o();
        c8445o12.m16097a(12);
        m23171a12.m23166b(c8445o12.m16096b());
        f20112m = m23171a12.m23167a();
        C5961b.C5963b m23171a13 = C5961b.m23171a("analyticsLabel");
        C8445o c8445o13 = new C8445o();
        c8445o13.m16097a(13);
        m23171a13.m23166b(c8445o13.m16096b());
        f20113n = m23171a13.m23167a();
        C5961b.C5963b m23171a14 = C5961b.m23171a("campaignId");
        C8445o c8445o14 = new C8445o();
        c8445o14.m16097a(14);
        m23171a14.m23166b(c8445o14.m16096b());
        f20114o = m23171a14.m23167a();
        C5961b.C5963b m23171a15 = C5961b.m23171a("composerLabel");
        C8445o c8445o15 = new C8445o();
        c8445o15.m16097a(15);
        m23171a15.m23166b(c8445o15.m16096b());
        f20115p = m23171a15.m23167a();
    }

    private C8432a() {
    }

    @Override // com.google.firebase.encoders.InterfaceC5964c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15475a(Object obj, Object obj2) throws IOException {
        C6503a c6503a = (C6503a) obj;
        InterfaceC5965d interfaceC5965d = (InterfaceC5965d) obj2;
        interfaceC5965d.mo15511b(f20101b, c6503a.m21770l());
        interfaceC5965d.mo15507f(f20102c, c6503a.m21774h());
        interfaceC5965d.mo15507f(f20103d, c6503a.m21775g());
        interfaceC5965d.mo15507f(f20104e, c6503a.m21773i());
        interfaceC5965d.mo15507f(f20105f, c6503a.m21769m());
        interfaceC5965d.mo15507f(f20106g, c6503a.m21772j());
        interfaceC5965d.mo15507f(f20107h, c6503a.m21778d());
        interfaceC5965d.mo15510c(f20108i, c6503a.m21771k());
        interfaceC5965d.mo15510c(f20109j, c6503a.m21767o());
        interfaceC5965d.mo15507f(f20110k, c6503a.m21768n());
        interfaceC5965d.mo15511b(f20111l, c6503a.m21780b());
        interfaceC5965d.mo15507f(f20112m, c6503a.m21776f());
        interfaceC5965d.mo15507f(f20113n, c6503a.m21781a());
        interfaceC5965d.mo15511b(f20114o, c6503a.m21779c());
        interfaceC5965d.mo15507f(f20115p, c6503a.m21777e());
    }
}
