package p272h.p286c.p360e.p361a.p362a;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import com.google.mlkit.common.p186b.InterfaceC6937h;
import java.nio.ByteBuffer;
import p272h.p286c.p287a.p300b.p307d.p316i.C8666l9;
import p272h.p286c.p287a.p300b.p307d.p316i.C8688n9;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.e.a.a.a */
/* loaded from: classes2.dex */
public class C9395a implements InterfaceC6937h {

    /* renamed from: a */
    private volatile Bitmap f22002a;

    /* renamed from: b */
    private volatile ByteBuffer f22003b;

    /* renamed from: c */
    private volatile C9396b f22004c;

    /* renamed from: d */
    private final int f22005d;

    /* renamed from: e */
    private final int f22006e;

    /* renamed from: f */
    private final int f22007f;

    /* renamed from: g */
    private final int f22008g;

    /* renamed from: h */
    private final Matrix f22009h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private C9395a(java.nio.ByteBuffer r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 17
            r2 = 1
            r3 = 842094169(0x32315659, float:1.0322389E-8)
            if (r9 == r3) goto L13
            if (r9 != r1) goto L11
            r9 = 17
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            com.google.android.gms.common.internal.s.a(r1)
            com.google.android.gms.common.internal.s.j(r5)
            r1 = r5
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r4.f22003b = r1
            int r1 = r5.limit()
            int r3 = r6 * r7
            if (r1 <= r3) goto L28
            r0 = 1
        L28:
            java.lang.String r1 = "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format."
            com.google.android.gms.common.internal.s.b(r0, r1)
            r5.rewind()
            r4.f22005d = r6
            r4.f22006e = r7
            r4.f22007f = r8
            r4.f22008g = r9
            r5 = 0
            r4.f22009h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p272h.p286c.p360e.p361a.p362a.C9395a.<init>(java.nio.ByteBuffer, int, int, int, int):void");
    }

    /* renamed from: a */
    public static C9395a m14859a(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C9395a c9395a = new C9395a(byteBuffer, i, i2, i3, i4);
        m14849k(i4, 3, elapsedRealtime, i2, i, byteBuffer.limit(), i3);
        return c9395a;
    }

    /* renamed from: k */
    private static void m14849k(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        C8688n9.m15937a(C8666l9.m15940b("vision-common"), i, i2, j, i3, i4, i5, i6);
    }

    /* renamed from: b */
    public Bitmap m14858b() {
        return this.f22002a;
    }

    /* renamed from: c */
    public ByteBuffer m14857c() {
        return this.f22003b;
    }

    /* renamed from: d */
    public Matrix m14856d() {
        return this.f22009h;
    }

    /* renamed from: e */
    public int m14855e() {
        return this.f22008g;
    }

    /* renamed from: f */
    public int m14854f() {
        return this.f22006e;
    }

    /* renamed from: g */
    public Image m14853g() {
        if (this.f22004c == null) {
            return null;
        }
        this.f22004c.m14848a();
        throw null;
    }

    /* renamed from: h */
    public Image.Plane[] m14852h() {
        if (this.f22004c == null) {
            return null;
        }
        this.f22004c.m14847b();
        throw null;
    }

    /* renamed from: i */
    public int m14851i() {
        return this.f22007f;
    }

    /* renamed from: j */
    public int m14850j() {
        return this.f22005d;
    }
}
