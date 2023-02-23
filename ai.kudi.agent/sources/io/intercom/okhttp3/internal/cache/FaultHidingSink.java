package io.intercom.okhttp3.internal.cache;

import java.io.IOException;
import p425j.p429b.p433b.AbstractC11153g;
import p425j.p429b.p433b.C11146c;
import p425j.p429b.p433b.InterfaceC11169r;
/* loaded from: classes3.dex */
class FaultHidingSink extends AbstractC11153g {
    private boolean hasErrors;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FaultHidingSink(InterfaceC11169r interfaceC11169r) {
        super(interfaceC11169r);
    }

    @Override // p425j.p429b.p433b.AbstractC11153g, p425j.p429b.p433b.InterfaceC11169r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }

    @Override // p425j.p429b.p433b.AbstractC11153g, p425j.p429b.p433b.InterfaceC11169r, java.io.Flushable
    public void flush() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }

    protected void onException(IOException iOException) {
    }

    @Override // p425j.p429b.p433b.AbstractC11153g, p425j.p429b.p433b.InterfaceC11169r
    public void write(C11146c c11146c, long j) throws IOException {
        if (this.hasErrors) {
            c11146c.mo11499a(j);
            return;
        }
        try {
            super.write(c11146c, j);
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }
}
