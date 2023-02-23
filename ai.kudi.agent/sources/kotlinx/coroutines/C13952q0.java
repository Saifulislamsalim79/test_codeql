package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: Debug.kt */
/* renamed from: kotlinx.coroutines.q0 */
/* loaded from: classes3.dex */
public final class C13952q0 {

    /* renamed from: a */
    private static final boolean f30438a = C13921k0.class.desiredAssertionStatus();

    /* renamed from: b */
    private static final boolean f30439b;

    /* renamed from: c */
    private static final boolean f30440c;

    /* renamed from: d */
    private static final AtomicLong f30441d;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r0.equals("auto") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r0.equals("on") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r0.equals("") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        r0 = true;
     */
    static {
        /*
            java.lang.Class<kotlinx.coroutines.k0> r0 = kotlinx.coroutines.C13921k0.class
            boolean r0 = r0.desiredAssertionStatus()
            kotlinx.coroutines.C13952q0.f30438a = r0
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.C13915z.m3417d(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L6c
            int r3 = r0.hashCode()
            if (r3 == 0) goto L42
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L39
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L2f
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L4c
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L4c
            goto L6c
        L2f:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L4c
            r0 = 0
            goto L70
        L39:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L4c
            goto L4a
        L42:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L4c
        L4a:
            r0 = 1
            goto L70
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L6c:
            boolean r0 = m3345a()
        L70:
            kotlinx.coroutines.C13952q0.f30439b = r0
            if (r0 == 0) goto L7d
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.C13915z.m3416e(r0, r2)
            if (r0 == 0) goto L7d
            r1 = 1
        L7d:
            kotlinx.coroutines.C13952q0.f30440c = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.C13952q0.f30441d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13952q0.<clinit>():void");
    }

    /* renamed from: a */
    public static final boolean m3345a() {
        return f30438a;
    }

    /* renamed from: b */
    public static final AtomicLong m3344b() {
        return f30441d;
    }

    /* renamed from: c */
    public static final boolean m3343c() {
        return f30439b;
    }

    /* renamed from: d */
    public static final boolean m3342d() {
        return f30440c;
    }
}
