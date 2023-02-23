package io.grpc.p385i1.p386r.p387j;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import p576m.C14347f;
import p576m.InterfaceC14346e;
/* compiled from: FrameReader.java */
/* renamed from: io.grpc.i1.r.j.b */
/* loaded from: classes2.dex */
public interface InterfaceC9963b extends Closeable {

    /* compiled from: FrameReader.java */
    /* renamed from: io.grpc.i1.r.j.b$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC9964a {
        /* renamed from: E */
        void mo13467E(int i, EnumC9962a enumC9962a);

        /* renamed from: F */
        void mo13466F(int i, EnumC9962a enumC9962a, C14347f c14347f);

        /* renamed from: G */
        void mo13465G(boolean z, C9978i c9978i);

        /* renamed from: H */
        void mo13464H(boolean z, boolean z2, int i, int i2, List<C9966d> list, EnumC9967e enumC9967e);

        /* renamed from: a */
        void mo13463a(boolean z, int i, InterfaceC14346e interfaceC14346e, int i2) throws IOException;

        void ackSettings();

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<C9966d> list) throws IOException;

        void windowUpdate(int i, long j);
    }

    /* renamed from: S */
    boolean mo13412S(InterfaceC9964a interfaceC9964a) throws IOException;
}
