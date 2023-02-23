package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import android.os.Build;
import com.squareup.picasso.AbstractC7377y;
import com.squareup.picasso.C7356r;
import com.squareup.picasso.C7360t;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import p576m.C14353l;
import p576m.InterfaceC14346e;
import p576m.InterfaceC14365s;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BitmapHunter.java */
/* renamed from: com.squareup.picasso.c */
/* loaded from: classes2.dex */
public class RunnableC7323c implements Runnable {

    /* renamed from: L */
    private static final Object f17340L = new Object();

    /* renamed from: M */
    private static final ThreadLocal<StringBuilder> f17341M = new C7324a();

    /* renamed from: N */
    private static final AtomicInteger f17342N = new AtomicInteger();

    /* renamed from: O */
    private static final AbstractC7377y f17343O = new C7325b();

    /* renamed from: A */
    int f17344A;

    /* renamed from: B */
    final AbstractC7377y f17345B;

    /* renamed from: C */
    AbstractC7316a f17346C;

    /* renamed from: D */
    List<AbstractC7316a> f17347D;

    /* renamed from: E */
    Bitmap f17348E;

    /* renamed from: F */
    Future<?> f17349F;

    /* renamed from: G */
    C7360t.EnumC7366e f17350G;

    /* renamed from: H */
    Exception f17351H;

    /* renamed from: I */
    int f17352I;

    /* renamed from: J */
    int f17353J;

    /* renamed from: K */
    C7360t.EnumC7367f f17354K;

    /* renamed from: c */
    final int f17355c = f17342N.incrementAndGet();

    /* renamed from: d */
    final C7360t f17356d;

    /* renamed from: e */
    final C7340i f17357e;

    /* renamed from: f */
    final InterfaceC7331d f17358f;

    /* renamed from: w */
    final C7318a0 f17359w;

    /* renamed from: x */
    final String f17360x;

    /* renamed from: y */
    final C7373w f17361y;

    /* renamed from: z */
    final int f17362z;

    /* compiled from: BitmapHunter.java */
    /* renamed from: com.squareup.picasso.c$a */
    /* loaded from: classes2.dex */
    static class C7324a extends ThreadLocal<StringBuilder> {
        C7324a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* compiled from: BitmapHunter.java */
    /* renamed from: com.squareup.picasso.c$b */
    /* loaded from: classes2.dex */
    static class C7325b extends AbstractC7377y {
        C7325b() {
        }

        @Override // com.squareup.picasso.AbstractC7377y
        /* renamed from: c */
        public boolean mo18830c(C7373w c7373w) {
            return true;
        }

        @Override // com.squareup.picasso.AbstractC7377y
        /* renamed from: f */
        public AbstractC7377y.C7378a mo18829f(C7373w c7373w, int i) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + c7373w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapHunter.java */
    /* renamed from: com.squareup.picasso.c$c */
    /* loaded from: classes2.dex */
    public static class RunnableC7326c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC7330c0 f17363c;

        /* renamed from: d */
        final /* synthetic */ RuntimeException f17364d;

        RunnableC7326c(InterfaceC7330c0 interfaceC7330c0, RuntimeException runtimeException) {
            this.f17363c = interfaceC7330c0;
            this.f17364d = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.f17363c.key() + " crashed with exception.", this.f17364d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapHunter.java */
    /* renamed from: com.squareup.picasso.c$d */
    /* loaded from: classes2.dex */
    public static class RunnableC7327d implements Runnable {

        /* renamed from: c */
        final /* synthetic */ StringBuilder f17365c;

        RunnableC7327d(StringBuilder sb) {
            this.f17365c = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.f17365c.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapHunter.java */
    /* renamed from: com.squareup.picasso.c$e */
    /* loaded from: classes2.dex */
    public static class RunnableC7328e implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC7330c0 f17366c;

        RunnableC7328e(InterfaceC7330c0 interfaceC7330c0) {
            this.f17366c = interfaceC7330c0;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f17366c.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapHunter.java */
    /* renamed from: com.squareup.picasso.c$f */
    /* loaded from: classes2.dex */
    public static class RunnableC7329f implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC7330c0 f17367c;

        RunnableC7329f(InterfaceC7330c0 interfaceC7330c0) {
            this.f17367c = interfaceC7330c0;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f17367c.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    RunnableC7323c(C7360t c7360t, C7340i c7340i, InterfaceC7331d interfaceC7331d, C7318a0 c7318a0, AbstractC7316a abstractC7316a, AbstractC7377y abstractC7377y) {
        this.f17356d = c7360t;
        this.f17357e = c7340i;
        this.f17358f = interfaceC7331d;
        this.f17359w = c7318a0;
        this.f17346C = abstractC7316a;
        this.f17360x = abstractC7316a.m19008d();
        this.f17361y = abstractC7316a.m19003i();
        this.f17354K = abstractC7316a.m19004h();
        this.f17362z = abstractC7316a.m19007e();
        this.f17344A = abstractC7316a.m19006f();
        this.f17345B = abstractC7377y;
        this.f17353J = abstractC7377y.mo18838e();
    }

    /* renamed from: a */
    static Bitmap m18983a(List<InterfaceC7330c0> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            InterfaceC7330c0 interfaceC7330c0 = list.get(i);
            try {
                Bitmap transform = interfaceC7330c0.transform(bitmap);
                if (transform == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(interfaceC7330c0.key());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (InterfaceC7330c0 interfaceC7330c02 : list) {
                        sb.append(interfaceC7330c02.key());
                        sb.append('\n');
                    }
                    C7360t.f17429p.post(new RunnableC7327d(sb));
                    return null;
                } else if (transform == bitmap && bitmap.isRecycled()) {
                    C7360t.f17429p.post(new RunnableC7328e(interfaceC7330c0));
                    return null;
                } else if (transform != bitmap && !bitmap.isRecycled()) {
                    C7360t.f17429p.post(new RunnableC7329f(interfaceC7330c0));
                    return null;
                } else {
                    i++;
                    bitmap = transform;
                }
            } catch (RuntimeException e) {
                C7360t.f17429p.post(new RunnableC7326c(interfaceC7330c0, e));
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: d */
    private C7360t.EnumC7367f m18980d() {
        C7360t.EnumC7367f enumC7367f = C7360t.EnumC7367f.LOW;
        List<AbstractC7316a> list = this.f17347D;
        boolean z = true;
        boolean z2 = (list == null || list.isEmpty()) ? false : true;
        if (this.f17346C == null && !z2) {
            z = false;
        }
        if (z) {
            AbstractC7316a abstractC7316a = this.f17346C;
            if (abstractC7316a != null) {
                enumC7367f = abstractC7316a.m19004h();
            }
            if (z2) {
                int size = this.f17347D.size();
                for (int i = 0; i < size; i++) {
                    C7360t.EnumC7367f m19004h = this.f17347D.get(i).m19004h();
                    if (m19004h.ordinal() > enumC7367f.ordinal()) {
                        enumC7367f = m19004h;
                    }
                }
            }
            return enumC7367f;
        }
        return enumC7367f;
    }

    /* renamed from: e */
    static Bitmap m18979e(InterfaceC14365s interfaceC14365s, C7373w c7373w) throws IOException {
        InterfaceC14346e m2021d = C14353l.m2021d(interfaceC14365s);
        boolean m18939r = C7332d0.m18939r(m2021d);
        boolean z = c7373w.f17496r && Build.VERSION.SDK_INT < 21;
        BitmapFactory.Options m18839d = AbstractC7377y.m18839d(c7373w);
        boolean m18837g = AbstractC7377y.m18837g(m18839d);
        if (!m18939r && !z) {
            InputStream mo1997D = m2021d.mo1997D();
            if (m18837g) {
                C7351n c7351n = new C7351n(mo1997D);
                c7351n.m18899c(false);
                long m18897m = c7351n.m18897m(1024);
                BitmapFactory.decodeStream(c7351n, null, m18839d);
                AbstractC7377y.m18840b(c7373w.f17486h, c7373w.f17487i, m18839d, c7373w);
                c7351n.m18898g(m18897m);
                c7351n.m18899c(true);
                mo1997D = c7351n;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(mo1997D, null, m18839d);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] mo1988k = m2021d.mo1988k();
        if (m18837g) {
            BitmapFactory.decodeByteArray(mo1988k, 0, mo1988k.length, m18839d);
            AbstractC7377y.m18840b(c7373w.f17486h, c7373w.f17487i, m18839d, c7373w);
        }
        return BitmapFactory.decodeByteArray(mo1988k, 0, mo1988k.length, m18839d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static RunnableC7323c m18977g(C7360t c7360t, C7340i c7340i, InterfaceC7331d interfaceC7331d, C7318a0 c7318a0, AbstractC7316a abstractC7316a) {
        C7373w m19003i = abstractC7316a.m19003i();
        List<AbstractC7377y> m18880h = c7360t.m18880h();
        int size = m18880h.size();
        for (int i = 0; i < size; i++) {
            AbstractC7377y abstractC7377y = m18880h.get(i);
            if (abstractC7377y.mo18830c(m19003i)) {
                return new RunnableC7323c(c7360t, c7340i, interfaceC7331d, c7318a0, abstractC7316a, abstractC7377y);
            }
        }
        return new RunnableC7323c(c7360t, c7340i, interfaceC7331d, c7318a0, abstractC7316a, f17343O);
    }

    /* renamed from: l */
    static int m18972l(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: m */
    static int m18971m(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    /* renamed from: v */
    private static boolean m18962v(boolean z, int i, int i2, int i3, int i4) {
        return !z || (i3 != 0 && i > i3) || (i4 != 0 && i2 > i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a0  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.graphics.Bitmap m18959y(com.squareup.picasso.C7373w r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.RunnableC7323c.m18959y(com.squareup.picasso.w, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* renamed from: z */
    static void m18958z(C7373w c7373w) {
        String m18863a = c7373w.m18863a();
        StringBuilder sb = f17341M.get();
        sb.ensureCapacity(m18863a.length() + 8);
        sb.replace(8, sb.length(), m18863a);
        Thread.currentThread().setName(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m18982b(AbstractC7316a abstractC7316a) {
        boolean z = this.f17356d.f17444n;
        C7373w c7373w = abstractC7316a.f17294b;
        if (this.f17346C == null) {
            this.f17346C = abstractC7316a;
            if (z) {
                List<AbstractC7316a> list = this.f17347D;
                if (list != null && !list.isEmpty()) {
                    C7332d0.m18937t("Hunter", "joined", c7373w.m18860d(), C7332d0.m18946k(this, "to "));
                    return;
                } else {
                    C7332d0.m18937t("Hunter", "joined", c7373w.m18860d(), "to empty hunter");
                    return;
                }
            }
            return;
        }
        if (this.f17347D == null) {
            this.f17347D = new ArrayList(3);
        }
        this.f17347D.add(abstractC7316a);
        if (z) {
            C7332d0.m18937t("Hunter", "joined", c7373w.m18860d(), C7332d0.m18946k(this, "to "));
        }
        C7360t.EnumC7367f m19004h = abstractC7316a.m19004h();
        if (m19004h.ordinal() > this.f17354K.ordinal()) {
            this.f17354K = m19004h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m18981c() {
        Future<?> future;
        if (this.f17346C == null) {
            List<AbstractC7316a> list = this.f17347D;
            return (list == null || list.isEmpty()) && (future = this.f17349F) != null && future.cancel(false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m18978f(AbstractC7316a abstractC7316a) {
        boolean remove;
        if (this.f17346C == abstractC7316a) {
            this.f17346C = null;
            remove = true;
        } else {
            List<AbstractC7316a> list = this.f17347D;
            remove = list != null ? list.remove(abstractC7316a) : false;
        }
        if (remove && abstractC7316a.m19004h() == this.f17354K) {
            this.f17354K = m18980d();
        }
        if (this.f17356d.f17444n) {
            C7332d0.m18937t("Hunter", "removed", abstractC7316a.f17294b.m18860d(), C7332d0.m18946k(this, "from "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public AbstractC7316a m18976h() {
        return this.f17346C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public List<AbstractC7316a> m18975i() {
        return this.f17347D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C7373w m18974j() {
        return this.f17361y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Exception m18973k() {
        return this.f17351H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public String m18970n() {
        return this.f17360x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C7360t.EnumC7366e m18969o() {
        return this.f17350G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public int m18968p() {
        return this.f17362z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public C7360t m18967q() {
        return this.f17356d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public C7360t.EnumC7367f m18966r() {
        return this.f17354K;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    m18958z(this.f17361y);
                    if (this.f17356d.f17444n) {
                        C7332d0.m18938s("Hunter", "executing", C7332d0.m18947j(this));
                    }
                    Bitmap m18964t = m18964t();
                    this.f17348E = m18964t;
                    if (m18964t == null) {
                        this.f17357e.m18929e(this);
                    } else {
                        this.f17357e.m18930d(this);
                    }
                } catch (C7356r.C7358b e) {
                    if (!EnumC7355q.m18892a(e.f17427d) || e.f17426c != 504) {
                        this.f17351H = e;
                    }
                    this.f17357e.m18929e(this);
                } catch (Exception e2) {
                    this.f17351H = e2;
                    this.f17357e.m18929e(this);
                }
            } catch (IOException e3) {
                this.f17351H = e3;
                this.f17357e.m18927g(this);
            } catch (OutOfMemoryError e4) {
                StringWriter stringWriter = new StringWriter();
                this.f17359w.m18998a().m18984a(new PrintWriter(stringWriter));
                this.f17351H = new RuntimeException(stringWriter.toString(), e4);
                this.f17357e.m18929e(this);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public Bitmap m18965s() {
        return this.f17348E;
    }

    /* renamed from: t */
    Bitmap m18964t() throws IOException {
        Bitmap bitmap;
        if (EnumC7354p.m18894a(this.f17362z)) {
            bitmap = this.f17358f.mo18904b(this.f17360x);
            if (bitmap != null) {
                this.f17359w.m18995d();
                this.f17350G = C7360t.EnumC7366e.MEMORY;
                if (this.f17356d.f17444n) {
                    C7332d0.m18937t("Hunter", "decoded", this.f17361y.m18860d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        int i = this.f17353J == 0 ? EnumC7355q.OFFLINE.f17423c : this.f17344A;
        this.f17344A = i;
        AbstractC7377y.C7378a mo18829f = this.f17345B.mo18829f(this.f17361y, i);
        if (mo18829f != null) {
            this.f17350G = mo18829f.m18832c();
            this.f17352I = mo18829f.m18833b();
            bitmap = mo18829f.m18834a();
            if (bitmap == null) {
                InterfaceC14365s m18831d = mo18829f.m18831d();
                try {
                    bitmap = m18979e(m18831d, this.f17361y);
                } finally {
                    try {
                        m18831d.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.f17356d.f17444n) {
                C7332d0.m18938s("Hunter", "decoded", this.f17361y.m18860d());
            }
            this.f17359w.m18997b(bitmap);
            if (this.f17361y.m18858f() || this.f17352I != 0) {
                synchronized (f17340L) {
                    if (this.f17361y.m18859e() || this.f17352I != 0) {
                        bitmap = m18959y(this.f17361y, bitmap, this.f17352I);
                        if (this.f17356d.f17444n) {
                            C7332d0.m18938s("Hunter", "transformed", this.f17361y.m18860d());
                        }
                    }
                    if (this.f17361y.m18862b()) {
                        bitmap = m18983a(this.f17361y.f17485g, bitmap);
                        if (this.f17356d.f17444n) {
                            C7332d0.m18937t("Hunter", "transformed", this.f17361y.m18860d(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f17359w.m18996c(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean m18963u() {
        Future<?> future = this.f17349F;
        return future != null && future.isCancelled();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean m18961w(boolean z, NetworkInfo networkInfo) {
        if (this.f17353J > 0) {
            this.f17353J--;
            return this.f17345B.mo18836h(z, networkInfo);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m18960x() {
        return this.f17345B.mo18835i();
    }
}
