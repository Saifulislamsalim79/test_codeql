package com.google.mlkit.vision.face.internal;

import android.os.SystemClock;
import com.google.android.gms.common.internal.s;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.p186b.AbstractC6933f;
import com.google.mlkit.common.p186b.C6935g;
import com.google.mlkit.common.p186b.C6939i;
import com.google.mlkit.vision.common.internal.C6967a;
import com.google.mlkit.vision.common.internal.C6970d;
import com.google.mlkit.vision.face.internal.C6982f;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p272h.p286c.p287a.p300b.p307d.p317j.C8831a9;
import p272h.p286c.p287a.p300b.p307d.p317j.C8832aa;
import p272h.p286c.p287a.p300b.p307d.p317j.C8984kc;
import p272h.p286c.p287a.p300b.p307d.p317j.C8989l2;
import p272h.p286c.p287a.p300b.p307d.p317j.C9004m2;
import p272h.p286c.p287a.p300b.p307d.p317j.C9010m8;
import p272h.p286c.p287a.p300b.p307d.p317j.C9011m9;
import p272h.p286c.p287a.p300b.p307d.p317j.C9029nc;
import p272h.p286c.p287a.p300b.p307d.p317j.C9034o2;
import p272h.p286c.p287a.p300b.p307d.p317j.C9044oc;
import p272h.p286c.p287a.p300b.p307d.p317j.C9143v8;
import p272h.p286c.p287a.p300b.p307d.p317j.C9186y9;
import p272h.p286c.p287a.p300b.p307d.p317j.EnumC8951i9;
import p272h.p286c.p287a.p300b.p307d.p317j.EnumC8981k9;
import p272h.p286c.p287a.p300b.p307d.p317j.EnumC8996l9;
import p272h.p286c.p287a.p300b.p307d.p317j.EnumC9157w8;
import p272h.p286c.p287a.p300b.p307d.p317j.InterfaceC8954ic;
import p272h.p286c.p360e.p361a.p362a.C9395a;
import p272h.p286c.p360e.p361a.p363b.C9397a;
import p272h.p286c.p360e.p361a.p363b.C9401e;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: com.google.mlkit.vision.face.internal.h */
/* loaded from: classes2.dex */
public final class C6984h extends AbstractC6933f {

    /* renamed from: j */
    static final AtomicBoolean f16721j = new AtomicBoolean(true);

    /* renamed from: k */
    private static final C6970d f16722k = C6970d.m20410b();

    /* renamed from: d */
    private final C9401e f16723d;

    /* renamed from: e */
    private final C8984kc f16724e;

    /* renamed from: f */
    private final C9029nc f16725f;

    /* renamed from: g */
    private final InterfaceC6978b f16726g;

    /* renamed from: h */
    private boolean f16727h;

    /* renamed from: i */
    private final C6967a f16728i = new C6967a();

    public C6984h(C8984kc c8984kc, C9401e c9401e, InterfaceC6978b interfaceC6978b) {
        s.k(c9401e, "FaceDetectorOptions can not be null");
        this.f16723d = c9401e;
        this.f16724e = c8984kc;
        this.f16726g = interfaceC6978b;
        this.f16725f = C9029nc.m15619a(C6939i.m20446c().m20447b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static void m20393j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C9397a) it.next()).m14837j(-1);
        }
    }

    /* renamed from: m */
    private final synchronized void m20390m(final EnumC8981k9 enumC8981k9, long j, final C9395a c9395a, final int i, final int i2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f16724e.m15678b(new InterfaceC8954ic() { // from class: com.google.mlkit.vision.face.internal.g
            @Override // p272h.p286c.p287a.p300b.p307d.p317j.InterfaceC8954ic
            public final C9044oc zza() {
                return C6984h.this.m20392k(elapsedRealtime, enumC8981k9, i, i2, c9395a);
            }
        }, EnumC8996l9.ON_DEVICE_FACE_DETECT);
        C9004m2 c9004m2 = new C9004m2();
        c9004m2.m15651c(enumC8981k9);
        c9004m2.m15650d(Boolean.valueOf(f16721j.get()));
        c9004m2.m15653a(Integer.valueOf(i));
        c9004m2.m15649e(Integer.valueOf(i2));
        c9004m2.m15652b(C6986j.m20389a(this.f16723d));
        final C9034o2 m15648f = c9004m2.m15648f();
        final C6982f c6982f = new C6982f(this);
        final C8984kc c8984kc = this.f16724e;
        final EnumC8996l9 enumC8996l9 = EnumC8996l9.AGGREGATED_ON_DEVICE_FACE_DETECTION;
        C6935g.m20450d().execute(new Runnable(enumC8996l9, m15648f, elapsedRealtime, c6982f, null) { // from class: h.c.a.b.d.j.ec

            /* renamed from: d */
            public final /* synthetic */ EnumC8996l9 f20922d;

            /* renamed from: e */
            public final /* synthetic */ Object f20923e;

            /* renamed from: f */
            public final /* synthetic */ long f20924f;

            /* renamed from: w */
            public final /* synthetic */ C6982f f20925w;

            @Override // java.lang.Runnable
            public final void run() {
                C8984kc.this.m15676d(this.f20922d, this.f20923e, this.f20924f, this.f20925w);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        this.f16725f.m15617c(true != this.f16727h ? 24303 : 24304, enumC8981k9.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }

    @Override // com.google.mlkit.common.p186b.AbstractC6941k
    /* renamed from: b */
    public final synchronized void mo20397b() throws MlKitException {
        this.f16727h = this.f16726g.mo20381d();
    }

    @Override // com.google.mlkit.common.p186b.AbstractC6941k
    /* renamed from: d */
    public final synchronized void mo20396d() {
        this.f16726g.zzb();
        f16721j.set(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        com.google.android.gms.common.internal.s.j(r0);
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0119 A[Catch: MlKitException -> 0x0138, all -> 0x0157, TryCatch #1 {, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:12:0x002d, B:41:0x0113, B:48:0x0127, B:47:0x0122, B:44:0x0119, B:15:0x003a, B:16:0x0041, B:17:0x004a, B:19:0x0050, B:20:0x005b, B:22:0x0061, B:24:0x006d, B:26:0x0073, B:28:0x0081, B:30:0x00ac, B:33:0x00de, B:35:0x00ed, B:55:0x013d, B:57:0x0145, B:59:0x014a, B:60:0x0156, B:58:0x0148, B:38:0x0100, B:40:0x010b), top: B:67:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122 A[Catch: MlKitException -> 0x0138, all -> 0x0157, TryCatch #1 {, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:12:0x002d, B:41:0x0113, B:48:0x0127, B:47:0x0122, B:44:0x0119, B:15:0x003a, B:16:0x0041, B:17:0x004a, B:19:0x0050, B:20:0x005b, B:22:0x0061, B:24:0x006d, B:26:0x0073, B:28:0x0081, B:30:0x00ac, B:33:0x00de, B:35:0x00ed, B:55:0x013d, B:57:0x0145, B:59:0x014a, B:60:0x0156, B:58:0x0148, B:38:0x0100, B:40:0x010b), top: B:67:0x0005 }] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    @Override // com.google.mlkit.common.p186b.AbstractC6933f
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List mo20395h(p272h.p286c.p360e.p361a.p362a.C9395a r21) throws com.google.mlkit.common.MlKitException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.internal.C6984h.mo20395h(h.c.e.a.a.a):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ C9044oc m20392k(long j, EnumC8981k9 enumC8981k9, int i, int i2, C9395a c9395a) {
        EnumC9157w8 enumC9157w8;
        C9186y9 c9186y9 = new C9186y9();
        C8831a9 c8831a9 = new C8831a9();
        c8831a9.m15829c(Long.valueOf(j));
        c8831a9.m15828d(enumC8981k9);
        c8831a9.m15827e(Boolean.valueOf(f16721j.get()));
        Boolean bool = Boolean.TRUE;
        c8831a9.m15831a(bool);
        c8831a9.m15830b(bool);
        c9186y9.m15485g(c8831a9.m15826f());
        c9186y9.m15487e(C6986j.m20389a(this.f16723d));
        c9186y9.m15488d(Integer.valueOf(i));
        c9186y9.m15484h(Integer.valueOf(i2));
        int m20409c = f16722k.m20409c(c9395a);
        int m20408d = f16722k.m20408d(c9395a);
        C9143v8 c9143v8 = new C9143v8();
        if (m20409c == -1) {
            enumC9157w8 = EnumC9157w8.BITMAP;
        } else if (m20409c == 35) {
            enumC9157w8 = EnumC9157w8.YUV_420_888;
        } else if (m20409c == 842094169) {
            enumC9157w8 = EnumC9157w8.YV12;
        } else if (m20409c == 16) {
            enumC9157w8 = EnumC9157w8.NV16;
        } else if (m20409c != 17) {
            enumC9157w8 = EnumC9157w8.UNKNOWN_FORMAT;
        } else {
            enumC9157w8 = EnumC9157w8.NV21;
        }
        c9143v8.m15524a(enumC9157w8);
        c9143v8.m15523b(Integer.valueOf(m20408d));
        c9186y9.m15486f(c9143v8.m15521d());
        C8832aa m15483i = c9186y9.m15483i();
        C9011m9 c9011m9 = new C9011m9();
        c9011m9.m15632e(this.f16727h ? EnumC8951i9.TYPE_THICK : EnumC8951i9.TYPE_THIN);
        c9011m9.m15630g(m15483i);
        return C9044oc.m15586d(c9011m9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ C9044oc m20391l(C9034o2 c9034o2, int i, C9010m8 c9010m8) {
        C9011m9 c9011m9 = new C9011m9();
        c9011m9.m15632e(this.f16727h ? EnumC8951i9.TYPE_THICK : EnumC8951i9.TYPE_THIN);
        C8989l2 c8989l2 = new C8989l2();
        c8989l2.m15665a(Integer.valueOf(i));
        c8989l2.m15663c(c9034o2);
        c8989l2.m15664b(c9010m8);
        c9011m9.m15633d(c8989l2.m15661e());
        return C9044oc.m15586d(c9011m9);
    }
}
