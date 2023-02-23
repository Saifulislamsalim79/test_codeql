package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import p576m.InterfaceC14346e;
/* compiled from: PushObserver.java */
/* renamed from: okhttp3.internal.http2.k */
/* loaded from: classes3.dex */
public interface InterfaceC14515k {

    /* renamed from: a */
    public static final InterfaceC14515k f32056a = new C14516a();

    /* compiled from: PushObserver.java */
    /* renamed from: okhttp3.internal.http2.k$a */
    /* loaded from: classes3.dex */
    class C14516a implements InterfaceC14515k {
        C14516a() {
        }

        @Override // okhttp3.internal.http2.InterfaceC14515k
        /* renamed from: a */
        public void mo1420a(int i, EnumC14481a enumC14481a) {
        }

        @Override // okhttp3.internal.http2.InterfaceC14515k
        /* renamed from: b */
        public boolean mo1419b(int i, InterfaceC14346e interfaceC14346e, int i2, boolean z) throws IOException {
            interfaceC14346e.mo1994a(i2);
            return true;
        }

        @Override // okhttp3.internal.http2.InterfaceC14515k
        public boolean onHeaders(int i, List<C14482b> list, boolean z) {
            return true;
        }

        @Override // okhttp3.internal.http2.InterfaceC14515k
        public boolean onRequest(int i, List<C14482b> list) {
            return true;
        }
    }

    /* renamed from: a */
    void mo1420a(int i, EnumC14481a enumC14481a);

    /* renamed from: b */
    boolean mo1419b(int i, InterfaceC14346e interfaceC14346e, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, List<C14482b> list, boolean z);

    boolean onRequest(int i, List<C14482b> list);
}
