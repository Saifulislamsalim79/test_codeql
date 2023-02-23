package p272h.p286c.p287a.p300b.p307d.p317j;

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
import com.google.mlkit.vision.face.internal.C6982f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.kc */
/* loaded from: classes2.dex */
public final class C8984kc {

    /* renamed from: k */
    private static AbstractC9047p0 f21083k;

    /* renamed from: l */
    private static final AbstractC9077r0 f21084l = AbstractC9077r0.m15558c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: m */
    public static final /* synthetic */ int f21085m = 0;

    /* renamed from: a */
    private final String f21086a;

    /* renamed from: b */
    private final String f21087b;

    /* renamed from: c */
    private final InterfaceC8969jc f21088c;

    /* renamed from: d */
    private final C6944n f21089d;

    /* renamed from: e */
    private final j f21090e;

    /* renamed from: f */
    private final j f21091f;

    /* renamed from: g */
    private final String f21092g;

    /* renamed from: h */
    private final int f21093h;

    /* renamed from: i */
    private final Map f21094i = new HashMap();

    /* renamed from: j */
    private final Map f21095j = new HashMap();

    public C8984kc(Context context, final C6944n c6944n, InterfaceC8969jc interfaceC8969jc, final String str) {
        this.f21086a = context.getPackageName();
        this.f21087b = C6927c.m20457a(context);
        this.f21089d = c6944n;
        this.f21088c = interfaceC8969jc;
        this.f21092g = str;
        this.f21090e = C6935g.m20453a().m20452b(new Callable() { // from class: h.c.a.b.d.j.hc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                int i = C8984kc.f21085m;
                return C2900o.m31704a().m31703b(str2);
            }
        });
        C6935g m20453a = C6935g.m20453a();
        c6944n.getClass();
        this.f21091f = m20453a.m20452b(new Callable() { // from class: h.c.a.b.d.j.gc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6944n.this.m20433a();
            }
        });
        this.f21093h = f21084l.containsKey(str) ? DynamiteModule.m31491c(context, (String) f21084l.get(str)) : -1;
    }

    /* renamed from: a */
    static long m15679a(List list, double d) {
        double d2;
        Double.isNaN(list.size());
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * d2)) - 1, 0))).longValue();
    }

    /* renamed from: g */
    private static synchronized AbstractC9047p0 m15673g() {
        synchronized (C8984kc.class) {
            AbstractC9047p0 abstractC9047p0 = f21083k;
            if (abstractC9047p0 != null) {
                return abstractC9047p0;
            }
            C1378f m36169a = C1375d.m36169a(Resources.getSystem().getConfiguration());
            C9002m0 c9002m0 = new C9002m0();
            for (int i = 0; i < m36169a.m36164d(); i++) {
                c9002m0.m15655c(C6927c.m20456b(m36169a.m36165c(i)));
            }
            AbstractC9047p0 m15654d = c9002m0.m15654d();
            f21083k = m15654d;
            return m15654d;
        }
    }

    /* renamed from: h */
    private final String m15672h() {
        if (this.f21090e.p()) {
            return (String) this.f21090e.l();
        }
        return C2900o.m31704a().m31703b(this.f21092g);
    }

    /* renamed from: i */
    private final boolean m15671i(EnumC8996l9 enumC8996l9, long j, long j2) {
        return this.f21094i.get(enumC8996l9) == null || j - ((Long) this.f21094i.get(enumC8996l9)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    /* renamed from: b */
    public final void m15678b(InterfaceC8954ic interfaceC8954ic, EnumC8996l9 enumC8996l9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m15671i(enumC8996l9, elapsedRealtime, 30L)) {
            this.f21094i.put(enumC8996l9, Long.valueOf(elapsedRealtime));
            m15674f(interfaceC8954ic.zza(), enumC8996l9, m15672h());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m15677c(C9044oc c9044oc, EnumC8996l9 enumC8996l9, String str) {
        String m20433a;
        c9044oc.m15584f(enumC8996l9);
        String m15588b = c9044oc.m15588b();
        C8863cb c8863cb = new C8863cb();
        c8863cb.m15795b(this.f21086a);
        c8863cb.m15794c(this.f21087b);
        c8863cb.m15789h(m15673g());
        c8863cb.m15790g(Boolean.TRUE);
        c8863cb.m15785l(m15588b);
        c8863cb.m15787j(str);
        if (this.f21091f.p()) {
            m20433a = (String) this.f21091f.l();
        } else {
            m20433a = this.f21089d.m20433a();
        }
        c8863cb.m15788i(m20433a);
        c8863cb.m15793d(10);
        c8863cb.m15786k(Integer.valueOf(this.f21093h));
        c9044oc.m15583g(c8863cb);
        this.f21088c.mo15542a(c9044oc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m15676d(EnumC8996l9 enumC8996l9, Object obj, long j, C6982f c6982f) {
        if (!this.f21095j.containsKey(enumC8996l9)) {
            this.f21095j.put(enumC8996l9, C9105t.m15545r());
        }
        InterfaceC9121u0 interfaceC9121u0 = (InterfaceC9121u0) this.f21095j.get(enumC8996l9);
        interfaceC9121u0.mo15575b(obj, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m15671i(enumC8996l9, elapsedRealtime, 30L)) {
            this.f21094i.put(enumC8996l9, Long.valueOf(elapsedRealtime));
            for (Object obj2 : interfaceC9121u0.mo15552e()) {
                ArrayList<Long> arrayList = new ArrayList(interfaceC9121u0.mo15535a(obj2));
                Collections.sort(arrayList);
                C8980k8 c8980k8 = new C8980k8();
                long j2 = 0;
                for (Long l : arrayList) {
                    j2 += l.longValue();
                }
                c8980k8.m15693a(Long.valueOf(j2 / arrayList.size()));
                c8980k8.m15691c(Long.valueOf(m15679a(arrayList, 100.0d)));
                c8980k8.m15688f(Long.valueOf(m15679a(arrayList, 75.0d)));
                c8980k8.m15690d(Long.valueOf(m15679a(arrayList, 50.0d)));
                c8980k8.m15692b(Long.valueOf(m15679a(arrayList, 25.0d)));
                c8980k8.m15689e(Long.valueOf(m15679a(arrayList, 0.0d)));
                m15674f(c6982f.m20398a(obj2, arrayList.size(), c8980k8.m15687g()), enumC8996l9, m15672h());
            }
            this.f21095j.remove(enumC8996l9);
        }
    }

    /* renamed from: e */
    public final void m15675e(C9044oc c9044oc, EnumC8996l9 enumC8996l9) {
        m15674f(c9044oc, enumC8996l9, m15672h());
    }

    /* renamed from: f */
    public final void m15674f(final C9044oc c9044oc, final EnumC8996l9 enumC8996l9, final String str) {
        C6935g.m20450d().execute(new Runnable(c9044oc, enumC8996l9, str, null) { // from class: h.c.a.b.d.j.fc

            /* renamed from: d */
            public final /* synthetic */ EnumC8996l9 f20953d;

            /* renamed from: e */
            public final /* synthetic */ String f20954e;

            /* renamed from: f */
            public final /* synthetic */ C9044oc f20955f;

            @Override // java.lang.Runnable
            public final void run() {
                C8984kc.this.m15677c(this.f20955f, this.f20953d, this.f20954e);
            }
        });
    }
}
