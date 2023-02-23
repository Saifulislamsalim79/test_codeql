package com.google.android.play.core.internal;

import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.google.android.play.core.internal.q */
/* loaded from: classes2.dex */
public final class C4993q extends AbstractC4991p {

    /* renamed from: c */
    private final AbstractC4991p f12647c;

    /* renamed from: d */
    private final long f12648d;

    /* renamed from: e */
    private final long f12649e;

    public C4993q(AbstractC4991p abstractC4991p, long j, long j2) {
        this.f12647c = abstractC4991p;
        long m25888F = m25888F(j);
        this.f12648d = m25888F;
        this.f12649e = m25888F(m25888F + j2);
    }

    /* renamed from: F */
    private final long m25888F(long j) {
        if (j < 0) {
            return 0L;
        }
        return j > this.f12647c.mo25887c() ? this.f12647c.mo25887c() : j;
    }

    @Override // com.google.android.play.core.internal.AbstractC4991p
    /* renamed from: c */
    public final long mo25887c() {
        return this.f12649e - this.f12648d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractC4991p
    /* renamed from: g */
    public final InputStream mo25886g(long j, long j2) throws IOException {
        long m25888F = m25888F(this.f12648d);
        return this.f12647c.mo25886g(m25888F, m25888F(j2 + m25888F) - m25888F);
    }
}
