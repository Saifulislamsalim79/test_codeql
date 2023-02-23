package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: com.google.android.play.core.assetpacks.w0 */
/* loaded from: classes2.dex */
final class C4935w0 extends OutputStream {

    /* renamed from: c */
    private final C4940x1 f12567c = new C4940x1();

    /* renamed from: d */
    private final File f12568d;

    /* renamed from: e */
    private final C4892l2 f12569e;

    /* renamed from: f */
    private long f12570f;

    /* renamed from: w */
    private long f12571w;

    /* renamed from: x */
    private FileOutputStream f12572x;

    /* renamed from: y */
    private C4917r2 f12573y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4935w0(File file, C4892l2 c4892l2) {
        this.f12568d = file;
        this.f12569e = c4892l2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int min;
        while (i2 > 0) {
            if (this.f12570f == 0 && this.f12571w == 0) {
                int m25982b = this.f12567c.m25982b(bArr, i, i2);
                if (m25982b == -1) {
                    return;
                }
                i += m25982b;
                i2 -= m25982b;
                C4917r2 m25981c = this.f12567c.m25981c();
                this.f12573y = m25981c;
                if (m25981c.m26020h()) {
                    this.f12570f = 0L;
                    this.f12569e.m26065k(this.f12573y.m26019i(), this.f12573y.m26019i().length);
                    this.f12571w = this.f12573y.m26019i().length;
                } else if (!this.f12573y.m26025c() || this.f12573y.m26026b()) {
                    byte[] m26019i = this.f12573y.m26019i();
                    this.f12569e.m26065k(m26019i, m26019i.length);
                    this.f12570f = this.f12573y.m26023e();
                } else {
                    this.f12569e.m26070f(this.f12573y.m26019i());
                    File file = new File(this.f12568d, this.f12573y.m26024d());
                    file.getParentFile().mkdirs();
                    this.f12570f = this.f12573y.m26023e();
                    this.f12572x = new FileOutputStream(file);
                }
            }
            if (!this.f12573y.m26026b()) {
                if (this.f12573y.m26020h()) {
                    this.f12569e.m26073c(this.f12571w, bArr, i, i2);
                    this.f12571w += i2;
                    min = i2;
                } else if (this.f12573y.m26025c()) {
                    min = (int) Math.min(i2, this.f12570f);
                    this.f12572x.write(bArr, i, min);
                    long j = this.f12570f - min;
                    this.f12570f = j;
                    if (j == 0) {
                        this.f12572x.close();
                    }
                } else {
                    min = (int) Math.min(i2, this.f12570f);
                    this.f12569e.m26073c((this.f12573y.m26019i().length + this.f12573y.m26023e()) - this.f12570f, bArr, i, min);
                    this.f12570f -= min;
                }
                i += min;
                i2 -= min;
            }
        }
    }
}
