package p272h.p286c.p287a.p288a.p289i;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransportRuntimeComponent.java */
/* renamed from: h.c.a.a.i.u */
/* loaded from: classes2.dex */
public abstract class AbstractC8358u implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TransportRuntimeComponent.java */
    /* renamed from: h.c.a.a.i.u$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC8359a {
        /* renamed from: a */
        InterfaceC8359a mo16218a(Context context);

        AbstractC8358u build();
    }

    /* renamed from: c */
    abstract InterfaceC8272i0 mo16220c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo16220c().close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract C8357t mo16219g();
}
