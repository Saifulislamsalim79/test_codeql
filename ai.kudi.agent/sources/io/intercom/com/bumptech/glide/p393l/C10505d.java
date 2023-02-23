package io.intercom.com.bumptech.glide.p393l;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* compiled from: GifHeaderParser.java */
/* renamed from: io.intercom.com.bumptech.glide.l.d */
/* loaded from: classes3.dex */
public class C10505d {

    /* renamed from: b */
    private ByteBuffer f24068b;

    /* renamed from: c */
    private C10504c f24069c;

    /* renamed from: a */
    private final byte[] f24067a = new byte[256];

    /* renamed from: d */
    private int f24070d = 0;

    /* renamed from: b */
    private boolean m12909b() {
        return this.f24069c.f24055b != 0;
    }

    /* renamed from: d */
    private int m12907d() {
        try {
            return this.f24068b.get() & 255;
        } catch (Exception unused) {
            this.f24069c.f24055b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m12906e() {
        this.f24069c.f24057d.f24043a = m12897n();
        this.f24069c.f24057d.f24044b = m12897n();
        this.f24069c.f24057d.f24045c = m12897n();
        this.f24069c.f24057d.f24046d = m12897n();
        int m12907d = m12907d();
        boolean z = (m12907d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (m12907d & 7) + 1);
        this.f24069c.f24057d.f24047e = (m12907d & 64) != 0;
        if (z) {
            this.f24069c.f24057d.f24053k = m12904g(pow);
        } else {
            this.f24069c.f24057d.f24053k = null;
        }
        this.f24069c.f24057d.f24052j = this.f24068b.position();
        m12893r();
        if (m12909b()) {
            return;
        }
        C10504c c10504c = this.f24069c;
        c10504c.f24056c++;
        c10504c.f24058e.add(c10504c.f24057d);
    }

    /* renamed from: f */
    private void m12905f() {
        int m12907d = m12907d();
        this.f24070d = m12907d;
        if (m12907d > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.f24070d) {
                try {
                    i2 = this.f24070d - i;
                    this.f24068b.get(this.f24067a, i, i2);
                    i += i2;
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f24070d, e);
                    }
                    this.f24069c.f24055b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private int[] m12904g(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f24068b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f24069c.f24055b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m12903h() {
        m12902i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    private void m12902i(int i) {
        boolean z = false;
        while (!z && !m12909b() && this.f24069c.f24056c <= i) {
            int m12907d = m12907d();
            if (m12907d == 33) {
                int m12907d2 = m12907d();
                if (m12907d2 == 1) {
                    m12894q();
                } else if (m12907d2 == 249) {
                    this.f24069c.f24057d = new C10503b();
                    m12901j();
                } else if (m12907d2 == 254) {
                    m12894q();
                } else if (m12907d2 != 255) {
                    m12894q();
                } else {
                    m12905f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f24067a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m12898m();
                    } else {
                        m12894q();
                    }
                }
            } else if (m12907d == 44) {
                C10504c c10504c = this.f24069c;
                if (c10504c.f24057d == null) {
                    c10504c.f24057d = new C10503b();
                }
                m12906e();
            } else if (m12907d != 59) {
                this.f24069c.f24055b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: j */
    private void m12901j() {
        m12907d();
        int m12907d = m12907d();
        C10503b c10503b = this.f24069c.f24057d;
        int i = (m12907d & 28) >> 2;
        c10503b.f24049g = i;
        if (i == 0) {
            c10503b.f24049g = 1;
        }
        this.f24069c.f24057d.f24048f = (m12907d & 1) != 0;
        int m12897n = m12897n();
        if (m12897n < 2) {
            m12897n = 10;
        }
        C10503b c10503b2 = this.f24069c.f24057d;
        c10503b2.f24051i = m12897n * 10;
        c10503b2.f24050h = m12907d();
        m12907d();
    }

    /* renamed from: k */
    private void m12900k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m12907d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f24069c.f24055b = 1;
            return;
        }
        m12899l();
        if (!this.f24069c.f24061h || m12909b()) {
            return;
        }
        C10504c c10504c = this.f24069c;
        c10504c.f24054a = m12904g(c10504c.f24062i);
        C10504c c10504c2 = this.f24069c;
        c10504c2.f24065l = c10504c2.f24054a[c10504c2.f24063j];
    }

    /* renamed from: l */
    private void m12899l() {
        this.f24069c.f24059f = m12897n();
        this.f24069c.f24060g = m12897n();
        int m12907d = m12907d();
        this.f24069c.f24061h = (m12907d & 128) != 0;
        this.f24069c.f24062i = (int) Math.pow(2.0d, (m12907d & 7) + 1);
        this.f24069c.f24063j = m12907d();
        this.f24069c.f24064k = m12907d();
    }

    /* renamed from: m */
    private void m12898m() {
        do {
            m12905f();
            byte[] bArr = this.f24067a;
            if (bArr[0] == 1) {
                this.f24069c.f24066m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f24070d <= 0) {
                return;
            }
        } while (!m12909b());
    }

    /* renamed from: n */
    private int m12897n() {
        return this.f24068b.getShort();
    }

    /* renamed from: o */
    private void m12896o() {
        this.f24068b = null;
        Arrays.fill(this.f24067a, (byte) 0);
        this.f24069c = new C10504c();
        this.f24070d = 0;
    }

    /* renamed from: q */
    private void m12894q() {
        int m12907d;
        do {
            m12907d = m12907d();
            this.f24068b.position(Math.min(this.f24068b.position() + m12907d, this.f24068b.limit()));
        } while (m12907d > 0);
    }

    /* renamed from: r */
    private void m12893r() {
        m12907d();
        m12894q();
    }

    /* renamed from: a */
    public void m12910a() {
        this.f24068b = null;
        this.f24069c = null;
    }

    /* renamed from: c */
    public C10504c m12908c() {
        if (this.f24068b != null) {
            if (m12909b()) {
                return this.f24069c;
            }
            m12900k();
            if (!m12909b()) {
                m12903h();
                C10504c c10504c = this.f24069c;
                if (c10504c.f24056c < 0) {
                    c10504c.f24055b = 1;
                }
            }
            return this.f24069c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    /* renamed from: p */
    public C10505d m12895p(ByteBuffer byteBuffer) {
        m12896o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f24068b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f24068b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
