package p565l.p566g0.p567e;

import java.io.IOException;
import p576m.AbstractC14348g;
import p576m.C14342c;
import p576m.InterfaceC14364r;
/* compiled from: FaultHidingSink.java */
/* renamed from: l.g0.e.e */
/* loaded from: classes3.dex */
class C14164e extends AbstractC14348g {

    /* renamed from: d */
    private boolean f30983d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14164e(InterfaceC14364r interfaceC14364r) {
        super(interfaceC14364r);
    }

    /* renamed from: c */
    protected void mo2739c(IOException iOException) {
        throw null;
    }

    @Override // p576m.AbstractC14348g, p576m.InterfaceC14364r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f30983d) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.f30983d = true;
            mo2739c(e);
        }
    }

    @Override // p576m.AbstractC14348g, p576m.InterfaceC14364r, java.io.Flushable
    public void flush() throws IOException {
        if (this.f30983d) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.f30983d = true;
            mo2739c(e);
        }
    }

    @Override // p576m.AbstractC14348g, p576m.InterfaceC14364r
    /* renamed from: r0 */
    public void mo1444r0(C14342c c14342c, long j) throws IOException {
        if (this.f30983d) {
            c14342c.mo1994a(j);
            return;
        }
        try {
            super.mo1444r0(c14342c, j);
        } catch (IOException e) {
            this.f30983d = true;
            mo2739c(e);
        }
    }
}
