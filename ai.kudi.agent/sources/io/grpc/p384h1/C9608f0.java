package io.grpc.p384h1;

import com.google.common.base.C5051n;
import io.grpc.AbstractC10001l;
import io.grpc.C10049s0;
import io.grpc.C9497c1;
import io.grpc.p384h1.InterfaceC9753r;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: FailingClientStream.java */
/* renamed from: io.grpc.h1.f0 */
/* loaded from: classes2.dex */
public final class C9608f0 extends C9729o1 {

    /* renamed from: b */
    private boolean f22493b;

    /* renamed from: c */
    private final C9497c1 f22494c;

    /* renamed from: d */
    private final InterfaceC9753r.EnumC9754a f22495d;

    /* renamed from: e */
    private final AbstractC10001l[] f22496e;

    public C9608f0(C9497c1 c9497c1, AbstractC10001l[] abstractC10001lArr) {
        this(c9497c1, InterfaceC9753r.EnumC9754a.PROCESSED, abstractC10001lArr);
    }

    @Override // io.grpc.p384h1.C9729o1, io.grpc.p384h1.InterfaceC9749q
    /* renamed from: k */
    public void mo13785k(C9811x0 c9811x0) {
        c9811x0.m13938b(IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, this.f22494c);
        c9811x0.m13938b("progress", this.f22495d);
    }

    @Override // io.grpc.p384h1.C9729o1, io.grpc.p384h1.InterfaceC9749q
    /* renamed from: o */
    public void mo13781o(InterfaceC9753r interfaceC9753r) {
        C5051n.m25773u(!this.f22493b, "already started");
        this.f22493b = true;
        for (AbstractC10001l abstractC10001l : this.f22496e) {
            abstractC10001l.mo14047i(this.f22494c);
        }
        interfaceC9753r.mo13766d(this.f22494c, this.f22495d, new C10049s0());
    }

    public C9608f0(C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a, AbstractC10001l[] abstractC10001lArr) {
        C5051n.m25789e(!c9497c1.m14580p(), "error must not be OK");
        this.f22494c = c9497c1;
        this.f22495d = enumC9754a;
        this.f22496e = abstractC10001lArr;
    }
}
