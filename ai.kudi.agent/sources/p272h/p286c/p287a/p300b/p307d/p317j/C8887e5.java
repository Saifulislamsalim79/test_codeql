package p272h.p286c.p287a.p300b.p307d.p317j;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.e5 */
/* loaded from: classes2.dex */
final class C8887e5 implements InterfaceC5964c {

    /* renamed from: a */
    static final C8887e5 f20889a = new C8887e5();

    /* renamed from: b */
    private static final C5961b f20890b;

    /* renamed from: c */
    private static final C5961b f20891c;

    /* renamed from: d */
    private static final C5961b f20892d;

    /* renamed from: e */
    private static final C5961b f20893e;

    static {
        C5961b.C5963b m23171a = C5961b.m23171a("imageFormat");
        C9092s1 c9092s1 = new C9092s1();
        c9092s1.m15548a(1);
        m23171a.m23166b(c9092s1.m15547b());
        f20890b = m23171a.m23167a();
        C5961b.C5963b m23171a2 = C5961b.m23171a("originalImageSize");
        C9092s1 c9092s12 = new C9092s1();
        c9092s12.m15548a(2);
        m23171a2.m23166b(c9092s12.m15547b());
        f20891c = m23171a2.m23167a();
        C5961b.C5963b m23171a3 = C5961b.m23171a("compressedImageSize");
        C9092s1 c9092s13 = new C9092s1();
        c9092s13.m15548a(3);
        m23171a3.m23166b(c9092s13.m15547b());
        f20892d = m23171a3.m23167a();
        C5961b.C5963b m23171a4 = C5961b.m23171a("isOdmlImage");
        C9092s1 c9092s14 = new C9092s1();
        c9092s14.m15548a(4);
        m23171a4.m23166b(c9092s14.m15547b());
        f20893e = m23171a4.m23167a();
    }

    private C8887e5() {
    }

    @Override // com.google.firebase.encoders.InterfaceC5964c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15475a(Object obj, Object obj2) throws IOException {
        C9185y8 c9185y8 = (C9185y8) obj;
        InterfaceC5965d interfaceC5965d = (InterfaceC5965d) obj2;
        interfaceC5965d.mo15507f(f20890b, c9185y8.m15493a());
        interfaceC5965d.mo15507f(f20891c, c9185y8.m15492b());
        interfaceC5965d.mo15507f(f20892d, null);
        interfaceC5965d.mo15507f(f20893e, null);
    }
}
