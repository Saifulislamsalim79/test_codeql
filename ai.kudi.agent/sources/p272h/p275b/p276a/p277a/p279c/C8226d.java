package p272h.p275b.p276a.p277a.p279c;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: ProgressOutputStream.kt */
/* renamed from: h.b.a.a.c.d */
/* loaded from: classes2.dex */
public final class C8226d extends FilterOutputStream {

    /* renamed from: c */
    private long f19794c;

    /* renamed from: d */
    private final InterfaceC11767l<Long, C13666w> f19795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8226d(OutputStream outputStream, InterfaceC11767l<? super Long, C13666w> interfaceC11767l) {
        super(outputStream);
        l.g(outputStream, "stream");
        l.g(interfaceC11767l, "onProgress");
        this.f19795d = interfaceC11767l;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        long j = this.f19794c + i2;
        this.f19794c = j;
        this.f19795d.invoke(Long.valueOf(j));
    }
}
