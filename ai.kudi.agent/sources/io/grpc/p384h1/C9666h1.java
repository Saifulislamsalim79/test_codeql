package io.grpc.p384h1;

import android.support.p050v4.media.session.PlaybackStateCompat;
import com.google.common.base.C5051n;
import io.grpc.AbstractC10040q0;
import io.grpc.AbstractC10042r0;
import io.grpc.AbstractC10069u0;
import io.grpc.AbstractC9483b;
import io.grpc.AbstractC9490c;
import io.grpc.AbstractC9517f;
import io.grpc.C10036p;
import io.grpc.C10082w;
import io.grpc.C10084w0;
import io.grpc.C9493c0;
import io.grpc.InterfaceC10094z0;
import io.grpc.InterfaceC9896i;
import io.grpc.p384h1.C9593e0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
/* compiled from: ManagedChannelImplBuilder.java */
/* renamed from: io.grpc.h1.h1 */
/* loaded from: classes2.dex */
public final class C9666h1 extends AbstractC10042r0<C9666h1> {

    /* renamed from: H */
    private static final Logger f22675H = Logger.getLogger(C9666h1.class.getName());

    /* renamed from: I */
    static final long f22676I = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: J */
    static final long f22677J = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: K */
    private static final InterfaceC9747p1<? extends Executor> f22678K = C9661g2.m14232c(C9755r0.f22914n);

    /* renamed from: L */
    private static final C10082w f22679L = C10082w.m13099c();

    /* renamed from: M */
    private static final C10036p f22680M = C10036p.m13253a();

    /* renamed from: A */
    private boolean f22681A;

    /* renamed from: B */
    private boolean f22682B;

    /* renamed from: C */
    private boolean f22683C;

    /* renamed from: D */
    private boolean f22684D;

    /* renamed from: E */
    private boolean f22685E;

    /* renamed from: F */
    private final InterfaceC9669c f22686F;

    /* renamed from: G */
    private final InterfaceC9668b f22687G;

    /* renamed from: a */
    InterfaceC9747p1<? extends Executor> f22688a;

    /* renamed from: b */
    InterfaceC9747p1<? extends Executor> f22689b;

    /* renamed from: c */
    private final List<InterfaceC9896i> f22690c;

    /* renamed from: d */
    final C10084w0 f22691d;

    /* renamed from: e */
    AbstractC10069u0.AbstractC10074d f22692e;

    /* renamed from: f */
    final String f22693f;

    /* renamed from: g */
    final AbstractC9517f f22694g;

    /* renamed from: h */
    final AbstractC9490c f22695h;

    /* renamed from: i */
    String f22696i;

    /* renamed from: j */
    String f22697j;

    /* renamed from: k */
    String f22698k;

    /* renamed from: l */
    boolean f22699l;

    /* renamed from: m */
    C10082w f22700m;

    /* renamed from: n */
    C10036p f22701n;

    /* renamed from: o */
    long f22702o;

    /* renamed from: p */
    int f22703p;

    /* renamed from: q */
    int f22704q;

    /* renamed from: r */
    long f22705r;

    /* renamed from: s */
    long f22706s;

    /* renamed from: t */
    boolean f22707t;

    /* renamed from: u */
    C9493c0 f22708u;

    /* renamed from: v */
    int f22709v;

    /* renamed from: w */
    Map<String, ?> f22710w;

    /* renamed from: x */
    boolean f22711x;

    /* renamed from: y */
    AbstractC9483b f22712y;

    /* renamed from: z */
    InterfaceC10094z0 f22713z;

    /* compiled from: ManagedChannelImplBuilder.java */
    /* renamed from: io.grpc.h1.h1$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC9668b {
        /* renamed from: a */
        int mo13719a();
    }

    /* compiled from: ManagedChannelImplBuilder.java */
    /* renamed from: io.grpc.h1.h1$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC9669c {
        /* renamed from: a */
        InterfaceC9780t mo13718a();
    }

    /* compiled from: ManagedChannelImplBuilder.java */
    /* renamed from: io.grpc.h1.h1$d */
    /* loaded from: classes2.dex */
    private static final class C9670d implements InterfaceC9668b {
        private C9670d() {
        }

        @Override // io.grpc.p384h1.C9666h1.InterfaceC9668b
        /* renamed from: a */
        public int mo13719a() {
            return 443;
        }
    }

    public C9666h1(String str, InterfaceC9669c interfaceC9669c, InterfaceC9668b interfaceC9668b) {
        this(str, null, null, interfaceC9669c, interfaceC9668b);
    }

    @Override // io.grpc.AbstractC10042r0
    /* renamed from: a */
    public AbstractC10040q0 mo13240a() {
        return new C9674i1(new C9623g1(this, this.f22686F.mo13718a(), new C9593e0.C9594a(), C9661g2.m14232c(C9755r0.f22914n), C9755r0.f22916p, m14224d(), InterfaceC9708l2.f22790a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m14225c() {
        return this.f22687G.mo13719a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.util.List<io.grpc.InterfaceC9896i> m14224d() {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<io.grpc.i> r1 = r11.f22690c
            r0.<init>(r1)
            boolean r1 = r11.f22681A
            java.lang.String r2 = "getClientInterceptor"
            r3 = 0
            r4 = 0
            java.lang.String r5 = "Unable to apply census stats"
            if (r1 == 0) goto L76
            java.lang.String r1 = "io.grpc.census.InternalCensusStatsAccessor"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            r6 = 3
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            r7[r4] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            r9 = 1
            r7[r9] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            r10 = 2
            r7[r10] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            boolean r7 = r11.f22682B     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            r6[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            boolean r7 = r11.f22683C     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            r6[r9] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            boolean r7 = r11.f22684D     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            r6[r10] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            java.lang.Object r1 = r1.invoke(r3, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            io.grpc.i r1 = (io.grpc.InterfaceC9896i) r1     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L56 java.lang.NoSuchMethodException -> L5f java.lang.ClassNotFoundException -> L68
            goto L71
        L4d:
            r1 = move-exception
            java.util.logging.Logger r6 = io.grpc.p384h1.C9666h1.f22675H
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            r6.log(r7, r5, r1)
            goto L70
        L56:
            r1 = move-exception
            java.util.logging.Logger r6 = io.grpc.p384h1.C9666h1.f22675H
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            r6.log(r7, r5, r1)
            goto L70
        L5f:
            r1 = move-exception
            java.util.logging.Logger r6 = io.grpc.p384h1.C9666h1.f22675H
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            r6.log(r7, r5, r1)
            goto L70
        L68:
            r1 = move-exception
            java.util.logging.Logger r6 = io.grpc.p384h1.C9666h1.f22675H
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            r6.log(r7, r5, r1)
        L70:
            r1 = r3
        L71:
            if (r1 == 0) goto L76
            r0.add(r4, r1)
        L76:
            boolean r1 = r11.f22685E
            if (r1 == 0) goto Lb8
            java.lang.String r1 = "io.grpc.census.InternalCensusTracingAccessor"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.IllegalAccessException -> L99 java.lang.NoSuchMethodException -> La2 java.lang.ClassNotFoundException -> Lab
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.IllegalAccessException -> L99 java.lang.NoSuchMethodException -> La2 java.lang.ClassNotFoundException -> Lab
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.IllegalAccessException -> L99 java.lang.NoSuchMethodException -> La2 java.lang.ClassNotFoundException -> Lab
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.IllegalAccessException -> L99 java.lang.NoSuchMethodException -> La2 java.lang.ClassNotFoundException -> Lab
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.IllegalAccessException -> L99 java.lang.NoSuchMethodException -> La2 java.lang.ClassNotFoundException -> Lab
            io.grpc.i r1 = (io.grpc.InterfaceC9896i) r1     // Catch: java.lang.reflect.InvocationTargetException -> L90 java.lang.IllegalAccessException -> L99 java.lang.NoSuchMethodException -> La2 java.lang.ClassNotFoundException -> Lab
            r3 = r1
            goto Lb3
        L90:
            r1 = move-exception
            java.util.logging.Logger r2 = io.grpc.p384h1.C9666h1.f22675H
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r2.log(r6, r5, r1)
            goto Lb3
        L99:
            r1 = move-exception
            java.util.logging.Logger r2 = io.grpc.p384h1.C9666h1.f22675H
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r2.log(r6, r5, r1)
            goto Lb3
        La2:
            r1 = move-exception
            java.util.logging.Logger r2 = io.grpc.p384h1.C9666h1.f22675H
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r2.log(r6, r5, r1)
            goto Lb3
        Lab:
            r1 = move-exception
            java.util.logging.Logger r2 = io.grpc.p384h1.C9666h1.f22675H
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r2.log(r6, r5, r1)
        Lb3:
            if (r3 == 0) goto Lb8
            r0.add(r4, r3)
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.p384h1.C9666h1.m14224d():java.util.List");
    }

    public C9666h1(String str, AbstractC9517f abstractC9517f, AbstractC9490c abstractC9490c, InterfaceC9669c interfaceC9669c, InterfaceC9668b interfaceC9668b) {
        InterfaceC9747p1<? extends Executor> interfaceC9747p1 = f22678K;
        this.f22688a = interfaceC9747p1;
        this.f22689b = interfaceC9747p1;
        this.f22690c = new ArrayList();
        C10084w0 m13092d = C10084w0.m13092d();
        this.f22691d = m13092d;
        this.f22692e = m13092d.m13093c();
        this.f22698k = "pick_first";
        this.f22700m = f22679L;
        this.f22701n = f22680M;
        this.f22702o = f22676I;
        this.f22703p = 5;
        this.f22704q = 5;
        this.f22705r = 16777216L;
        this.f22706s = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        this.f22707t = true;
        this.f22708u = C9493c0.m14600g();
        this.f22711x = true;
        this.f22681A = true;
        this.f22682B = true;
        this.f22683C = true;
        this.f22684D = false;
        this.f22685E = true;
        C5051n.m25779o(str, "target");
        this.f22693f = str;
        this.f22694g = abstractC9517f;
        this.f22695h = abstractC9490c;
        C5051n.m25779o(interfaceC9669c, "clientTransportFactoryBuilder");
        this.f22686F = interfaceC9669c;
        if (interfaceC9668b != null) {
            this.f22687G = interfaceC9668b;
        } else {
            this.f22687G = new C9670d();
        }
    }
}
