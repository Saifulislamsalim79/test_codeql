package p272h.p286c.p287a.p300b.p307d.p317j;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.m3 */
/* loaded from: classes2.dex */
final class C9005m3 implements InterfaceC5964c {

    /* renamed from: a */
    static final C9005m3 f21286a = new C9005m3();

    /* renamed from: b */
    private static final C5961b f21287b;

    /* renamed from: c */
    private static final C5961b f21288c;

    /* renamed from: d */
    private static final C5961b f21289d;

    static {
        C5961b.C5963b m23171a = C5961b.m23171a("logEventKey");
        C9092s1 c9092s1 = new C9092s1();
        c9092s1.m15548a(1);
        m23171a.m23166b(c9092s1.m15547b());
        f21287b = m23171a.m23167a();
        C5961b.C5963b m23171a2 = C5961b.m23171a("eventCount");
        C9092s1 c9092s12 = new C9092s1();
        c9092s12.m15548a(2);
        m23171a2.m23166b(c9092s12.m15547b());
        f21288c = m23171a2.m23167a();
        C5961b.C5963b m23171a3 = C5961b.m23171a("inferenceDurationStats");
        C9092s1 c9092s13 = new C9092s1();
        c9092s13.m15548a(3);
        m23171a3.m23166b(c9092s13.m15547b());
        f21289d = m23171a3.m23167a();
    }

    private C9005m3() {
    }

    @Override // com.google.firebase.encoders.InterfaceC5964c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15475a(Object obj, Object obj2) throws IOException {
        C9064q2 c9064q2 = (C9064q2) obj;
        InterfaceC5965d interfaceC5965d = (InterfaceC5965d) obj2;
        interfaceC5965d.mo15507f(f21287b, c9064q2.m15564a());
        interfaceC5965d.mo15507f(f21288c, c9064q2.m15562c());
        interfaceC5965d.mo15507f(f21289d, c9064q2.m15563b());
    }
}
