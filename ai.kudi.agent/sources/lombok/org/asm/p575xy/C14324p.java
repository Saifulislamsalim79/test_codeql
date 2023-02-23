package lombok.org.asm.p575xy;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.p476c0.InterfaceC11719g;
import lombok.org.asm.Handler;
import lombok.org.asm.SpdyStream$SpdyDataSource;
/* renamed from: lombok.org.asm.xy.p */
/* loaded from: classes.dex */
public class C14324p extends SpdyStream$SpdyDataSource {

    /* renamed from: a */
    public final long f31550a;

    /* renamed from: b */
    public final String f31551b;

    /* renamed from: c */
    public ExecutorC14320i f31552c;

    /* renamed from: d */
    public final int f31553d;

    /* renamed from: e */
    public final int f31554e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14324p(int i, int i2, long j, String str) {
        this.f31554e = i;
        this.f31553d = i2;
        this.f31550a = j;
        this.f31551b = str;
        ExecutorC14320i $r2 = m2140a();
        this.f31552c = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14324p(int r9, int r10, java.lang.String r11) {
        /*
            r8 = this;
            long r6 = lombok.org.asm.p575xy.C14318g.f31521d
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r6
            r5 = r11
            r0.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.p575xy.C14324p.<init>(int, int, java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C14324p(int r2, int r3, java.lang.String r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r1 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L6
            int r2 = lombok.org.asm.p575xy.C14318g.f31520c
        L6:
            r0 = r5 & 2
            if (r0 == 0) goto Lc
            int r3 = lombok.org.asm.p575xy.C14318g.f31519b
        Lc:
            r5 = r5 & 4
            if (r5 == 0) goto L13
            java.lang.String r4 = "DefaultDispatcher"
            goto L14
        L13:
            r4 = 0
        L14:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.p575xy.C14324p.<init>(int, int, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final ExecutorC14320i m2140a() {
        int $i0 = this.f31554e;
        int $i1 = this.f31553d;
        long $l2 = this.f31550a;
        String $r1 = this.f31551b;
        ExecutorC14320i $r2 = new ExecutorC14320i($i0, $i1, $l2, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.AbstractC14272i
    /* renamed from: a */
    public void mo2139a(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        ExecutorC14320i $r4 = this.f31552c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC14320i.f31526g;
        C14322l $r6 = C14322l.f31538h;
        try {
            $r4.m2153a(runnable, (Label) $r6, false);
        } catch (RejectedExecutionException e) {
            Handler $r7 = Handler.f31286d;
            $r7.m2348d(runnable);
        }
    }
}
