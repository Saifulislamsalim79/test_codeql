package p272h.p286c.p287a.p300b.p322g;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.p100m.C2948a;
import com.google.android.gms.common.util.C2977p;
import com.google.android.gms.common.util.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: h.c.a.b.g.a */
/* loaded from: classes2.dex */
public class C9226a {

    /* renamed from: l */
    private static ScheduledExecutorService f21622l;

    /* renamed from: a */
    private final Object f21623a;

    /* renamed from: b */
    private final PowerManager.WakeLock f21624b;

    /* renamed from: c */
    private WorkSource f21625c;

    /* renamed from: d */
    private final int f21626d;

    /* renamed from: e */
    private final String f21627e;

    /* renamed from: f */
    private final String f21628f;

    /* renamed from: g */
    private final Context f21629g;

    /* renamed from: h */
    private boolean f21630h;

    /* renamed from: i */
    private final Map<String, Integer[]> f21631i;

    /* renamed from: j */
    private int f21632j;

    /* renamed from: k */
    private AtomicInteger f21633k;

    public C9226a(Context context, int i, String str) {
        this(context, i, str, null, context == null ? null : context.getPackageName());
    }

    /* renamed from: d */
    private final String m15453d(String str) {
        return (!this.f21630h || TextUtils.isEmpty(str)) ? this.f21628f : str;
    }

    /* renamed from: e */
    private final List<String> m15452e() {
        return C2977p.m31506c(this.f21625c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m15451f(int i) {
        if (this.f21624b.isHeld()) {
            try {
                this.f21624b.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.f21627e).concat(" was already released!"), e);
                } else {
                    throw e;
                }
            }
            this.f21624b.isHeld();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r2 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r13.f21632j == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        com.google.android.gms.common.p101n.C2953c.m31559a().m31557c(r13.f21629g, com.google.android.gms.common.p101n.C2952b.m31560a(r13.f21624b, r6), 7, r13.f21627e, r6, null, r13.f21626d, m15452e(), r14);
        r13.f21632j++;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m15456a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.f21633k
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.m15453d(r0)
            java.lang.Object r0 = r13.f21623a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f21631i     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L96
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = r13.f21632j     // Catch: java.lang.Throwable -> L96
            if (r1 <= 0) goto L29
        L1a:
            android.os.PowerManager$WakeLock r1 = r13.f21624b     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isHeld()     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L29
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f21631i     // Catch: java.lang.Throwable -> L96
            r1.clear()     // Catch: java.lang.Throwable -> L96
            r13.f21632j = r2     // Catch: java.lang.Throwable -> L96
        L29:
            boolean r1 = r13.f21630h     // Catch: java.lang.Throwable -> L96
            r12 = 1
            if (r1 == 0) goto L56
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f21631i     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L47
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f21631i     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L96
            r3[r2] = r4     // Catch: java.lang.Throwable -> L96
            r1.put(r6, r3)     // Catch: java.lang.Throwable -> L96
            r2 = 1
            goto L54
        L47:
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L96
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L96
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L96
            r1[r2] = r3     // Catch: java.lang.Throwable -> L96
        L54:
            if (r2 != 0) goto L5e
        L56:
            boolean r1 = r13.f21630h     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
            int r1 = r13.f21632j     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
        L5e:
            com.google.android.gms.common.n.c r1 = com.google.android.gms.common.p101n.C2953c.m31559a()     // Catch: java.lang.Throwable -> L96
            android.content.Context r2 = r13.f21629g     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r3 = r13.f21624b     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = com.google.android.gms.common.p101n.C2952b.m31560a(r3, r6)     // Catch: java.lang.Throwable -> L96
            r4 = 7
            java.lang.String r5 = r13.f21627e     // Catch: java.lang.Throwable -> L96
            r7 = 0
            int r8 = r13.f21626d     // Catch: java.lang.Throwable -> L96
            java.util.List r9 = r13.m15452e()     // Catch: java.lang.Throwable -> L96
            r10 = r14
            r1.m31557c(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L96
            int r1 = r13.f21632j     // Catch: java.lang.Throwable -> L96
            int r1 = r1 + r12
            r13.f21632j = r1     // Catch: java.lang.Throwable -> L96
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r0 = r13.f21624b
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L95
            java.util.concurrent.ScheduledExecutorService r0 = p272h.p286c.p287a.p300b.p322g.C9226a.f21622l
            h.c.a.b.g.b r1 = new h.c.a.b.g.b
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L95:
            return
        L96:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p272h.p286c.p287a.p300b.p322g.C9226a.m15456a(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r1 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r12.f21632j == 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        com.google.android.gms.common.p101n.C2953c.m31559a().m31558b(r12.f21629g, com.google.android.gms.common.p101n.C2952b.m31560a(r12.f21624b, r6), 8, r12.f21627e, r6, null, r12.f21626d, m15452e());
        r12.f21632j--;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m15455b() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.f21633k
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L19
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r12.f21627e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " release without a matched acquire!"
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r0, r1)
        L19:
            r0 = 0
            java.lang.String r6 = r12.m15453d(r0)
            java.lang.Object r0 = r12.f21623a
            monitor-enter(r0)
            boolean r1 = r12.f21630h     // Catch: java.lang.Throwable -> L7e
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L52
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f21631i     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L33
        L31:
            r1 = 0
            goto L50
        L33:
            r2 = r1[r11]     // Catch: java.lang.Throwable -> L7e
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7e
            if (r2 != r10) goto L42
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f21631i     // Catch: java.lang.Throwable -> L7e
            r1.remove(r6)     // Catch: java.lang.Throwable -> L7e
            r1 = 1
            goto L50
        L42:
            r2 = r1[r11]     // Catch: java.lang.Throwable -> L7e
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7e
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7e
            r1[r11] = r2     // Catch: java.lang.Throwable -> L7e
            goto L31
        L50:
            if (r1 != 0) goto L5a
        L52:
            boolean r1 = r12.f21630h     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L79
            int r1 = r12.f21632j     // Catch: java.lang.Throwable -> L7e
            if (r1 != r10) goto L79
        L5a:
            com.google.android.gms.common.n.c r1 = com.google.android.gms.common.p101n.C2953c.m31559a()     // Catch: java.lang.Throwable -> L7e
            android.content.Context r2 = r12.f21629g     // Catch: java.lang.Throwable -> L7e
            android.os.PowerManager$WakeLock r3 = r12.f21624b     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = com.google.android.gms.common.p101n.C2952b.m31560a(r3, r6)     // Catch: java.lang.Throwable -> L7e
            r4 = 8
            java.lang.String r5 = r12.f21627e     // Catch: java.lang.Throwable -> L7e
            r7 = 0
            int r8 = r12.f21626d     // Catch: java.lang.Throwable -> L7e
            java.util.List r9 = r12.m15452e()     // Catch: java.lang.Throwable -> L7e
            r1.m31558b(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7e
            int r1 = r12.f21632j     // Catch: java.lang.Throwable -> L7e
            int r1 = r1 - r10
            r12.f21632j = r1     // Catch: java.lang.Throwable -> L7e
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            r12.m15451f(r11)
            return
        L7e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            goto L82
        L81:
            throw r1
        L82:
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: p272h.p286c.p287a.p300b.p322g.C9226a.m15455b():void");
    }

    /* renamed from: c */
    public void m15454c(boolean z) {
        this.f21624b.setReferenceCounted(z);
        this.f21630h = z;
    }

    private C9226a(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, null, str3, null);
    }

    private C9226a(Context context, int i, String str, String str2, String str3, String str4) {
        this.f21623a = this;
        this.f21630h = true;
        this.f21631i = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.f21633k = new AtomicInteger(0);
        s.k(context, "WakeLock: context must not be null");
        s.g(str, "WakeLock: wakeLockName must not be empty");
        this.f21626d = i;
        this.f21628f = null;
        this.f21629g = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f21627e = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f21627e = str;
        }
        this.f21624b = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (C2977p.m31505d(context)) {
            WorkSource m31507b = C2977p.m31507b(context, n.b(str3) ? context.getPackageName() : str3);
            this.f21625c = m31507b;
            if (m31507b != null && C2977p.m31505d(this.f21629g)) {
                WorkSource workSource = this.f21625c;
                if (workSource != null) {
                    workSource.add(m31507b);
                } else {
                    this.f21625c = m31507b;
                }
                try {
                    this.f21624b.setWorkSource(this.f21625c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (f21622l == null) {
            f21622l = C2948a.m31570a().mo31569a();
        }
    }
}
