package p272h.p275b.p276a.p277a.p279c;

import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: ProgressInputStream.kt */
/* renamed from: h.b.a.a.c.c */
/* loaded from: classes2.dex */
public final class C8225c extends FilterInputStream {

    /* renamed from: c */
    private long f19791c;

    /* renamed from: d */
    private long f19792d;

    /* renamed from: e */
    private final InterfaceC11767l<Long, C13666w> f19793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8225c(InputStream inputStream, InterfaceC11767l<? super Long, C13666w> interfaceC11767l) {
        super(inputStream);
        l.g(inputStream, "stream");
        l.g(interfaceC11767l, "onProgress");
        this.f19793e = interfaceC11767l;
        this.f19792d = -1L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        super.mark(i);
        this.f19792d = this.f19791c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        long max = this.f19791c + Math.max(read, 0);
        this.f19791c = max;
        this.f19793e.invoke(Long.valueOf(max));
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        super.reset();
        this.f19791c = this.f19792d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        return super.skip(j);
    }
}
