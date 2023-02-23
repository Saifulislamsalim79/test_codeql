package p272h.p286c.p287a.p300b.p307d.p316i;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.core.p058os.C1375d;
import androidx.core.p058os.C1378f;
import com.google.android.gms.common.internal.C2900o;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.j;
import com.google.mlkit.common.p186b.C6927c;
import com.google.mlkit.common.p186b.C6935g;
import com.google.mlkit.common.p186b.C6944n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.b9 */
/* loaded from: classes2.dex */
public final class C8555b9 {

    /* renamed from: j */
    private static AbstractC8765u9 f20253j;

    /* renamed from: k */
    private static final AbstractC8787w9 f20254k = AbstractC8787w9.m15856c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: l */
    public static final /* synthetic */ int f20255l = 0;

    /* renamed from: a */
    private final String f20256a;

    /* renamed from: b */
    private final String f20257b;

    /* renamed from: c */
    private final InterfaceC8543a9 f20258c;

    /* renamed from: d */
    private final C6944n f20259d;

    /* renamed from: e */
    private final j f20260e;

    /* renamed from: f */
    private final j f20261f;

    /* renamed from: g */
    private final String f20262g;

    /* renamed from: h */
    private final int f20263h;

    /* renamed from: i */
    private final Map f20264i = new HashMap();

    public C8555b9(Context context, final C6944n c6944n, InterfaceC8543a9 interfaceC8543a9, final String str) {
        new HashMap();
        this.f20256a = context.getPackageName();
        this.f20257b = C6927c.m20457a(context);
        this.f20259d = c6944n;
        this.f20258c = interfaceC8543a9;
        this.f20262g = str;
        this.f20260e = C6935g.m20453a().m20452b(new Callable() { // from class: h.c.a.b.d.i.z8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                int i = C8555b9.f20255l;
                return C2900o.m31704a().m31703b(str2);
            }
        });
        C6935g m20453a = C6935g.m20453a();
        c6944n.getClass();
        this.f20261f = m20453a.m20452b(new Callable() { // from class: h.c.a.b.d.i.y8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6944n.this.m20433a();
            }
        });
        this.f20263h = f20254k.containsKey(str) ? DynamiteModule.m31491c(context, (String) f20254k.get(str)) : -1;
    }

    /* renamed from: c */
    private static synchronized AbstractC8765u9 m15988c() {
        synchronized (C8555b9.class) {
            AbstractC8765u9 abstractC8765u9 = f20253j;
            if (abstractC8765u9 != null) {
                return abstractC8765u9;
            }
            C1378f m36169a = C1375d.m36169a(Resources.getSystem().getConfiguration());
            C8732r9 c8732r9 = new C8732r9();
            for (int i = 0; i < m36169a.m36164d(); i++) {
                c8732r9.m15921c(C6927c.m20456b(m36169a.m36165c(i)));
            }
            AbstractC8765u9 m15920d = c8732r9.m15920d();
            f20253j = m15920d;
            return m15920d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m15990a(C8567c9 c8567c9, EnumC8587e6 enumC8587e6, String str) {
        String m20433a;
        c8567c9.m15983d(enumC8587e6);
        String m15986a = c8567c9.m15986a();
        C8741s7 c8741s7 = new C8741s7();
        c8741s7.m15918b(this.f20256a);
        c8741s7.m15917c(this.f20257b);
        c8741s7.m15912h(m15988c());
        c8741s7.m15913g(Boolean.TRUE);
        c8741s7.m15908l(m15986a);
        c8741s7.m15910j(str);
        if (this.f20261f.p()) {
            m20433a = (String) this.f20261f.l();
        } else {
            m20433a = this.f20259d.m20433a();
        }
        c8741s7.m15911i(m20433a);
        c8741s7.m15916d(10);
        c8741s7.m15909k(Integer.valueOf(this.f20263h));
        c8567c9.m15982e(c8741s7);
        this.f20258c.mo15859a(c8567c9);
    }

    /* renamed from: b */
    public final void m15989b(C8677m9 c8677m9, final EnumC8587e6 enumC8587e6) {
        EnumC8739s5 enumC8739s5;
        EnumC8794x5 enumC8794x5;
        String m31703b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f20264i.get(enumC8587e6) != null && elapsedRealtime - ((Long) this.f20264i.get(enumC8587e6)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f20264i.put(enumC8587e6, Long.valueOf(elapsedRealtime));
        int i = c8677m9.f20536a;
        int i2 = c8677m9.f20537b;
        int i3 = c8677m9.f20538c;
        int i4 = c8677m9.f20539d;
        int i5 = c8677m9.f20540e;
        long j = c8677m9.f20541f;
        int i6 = c8677m9.f20542g;
        C8783w5 c8783w5 = new C8783w5();
        if (i == -1) {
            enumC8739s5 = EnumC8739s5.BITMAP;
        } else if (i == 35) {
            enumC8739s5 = EnumC8739s5.YUV_420_888;
        } else if (i == 842094169) {
            enumC8739s5 = EnumC8739s5.YV12;
        } else if (i == 16) {
            enumC8739s5 = EnumC8739s5.NV16;
        } else if (i != 17) {
            enumC8739s5 = EnumC8739s5.UNKNOWN_FORMAT;
        } else {
            enumC8739s5 = EnumC8739s5.NV21;
        }
        c8783w5.m15871d(enumC8739s5);
        if (i2 == 1) {
            enumC8794x5 = EnumC8794x5.BITMAP;
        } else if (i2 == 2) {
            enumC8794x5 = EnumC8794x5.BYTEARRAY;
        } else if (i2 == 3) {
            enumC8794x5 = EnumC8794x5.BYTEBUFFER;
        } else if (i2 != 4) {
            enumC8794x5 = EnumC8794x5.ANDROID_MEDIA_IMAGE;
        } else {
            enumC8794x5 = EnumC8794x5.FILEPATH;
        }
        c8783w5.m15869f(enumC8794x5);
        c8783w5.m15872c(Integer.valueOf(i3));
        c8783w5.m15870e(Integer.valueOf(i4));
        c8783w5.m15868g(Integer.valueOf(i5));
        c8783w5.m15873b(Long.valueOf(j));
        c8783w5.m15867h(Integer.valueOf(i6));
        C8816z5 m15865j = c8783w5.m15865j();
        C8610g6 c8610g6 = new C8610g6();
        c8610g6.m15967d(m15865j);
        final C8567c9 m15984c = C8567c9.m15984c(c8610g6);
        if (this.f20260e.p()) {
            m31703b = (String) this.f20260e.l();
        } else {
            m31703b = C2900o.m31704a().m31703b(this.f20262g);
        }
        final String str = m31703b;
        C6935g.m20450d().execute(new Runnable(m15984c, enumC8587e6, str, null) { // from class: h.c.a.b.d.i.x8

            /* renamed from: d */
            public final /* synthetic */ EnumC8587e6 f20750d;

            /* renamed from: e */
            public final /* synthetic */ String f20751e;

            /* renamed from: f */
            public final /* synthetic */ C8567c9 f20752f;

            @Override // java.lang.Runnable
            public final void run() {
                C8555b9.this.m15990a(this.f20752f, this.f20750d, this.f20751e);
            }
        });
    }
}
