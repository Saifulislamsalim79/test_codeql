package kotlinx.coroutines.channels;

import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlinx.coroutines.InterfaceC13930m;
import kotlinx.coroutines.internal.C13908t;
/* compiled from: AbstractChannel.kt */
/* renamed from: kotlinx.coroutines.channels.z */
/* loaded from: classes3.dex */
public final class C13804z<E> extends C13803y<E> {

    /* renamed from: x */
    public final InterfaceC11767l<E, C13666w> f30258x;

    /* JADX WARN: Multi-variable type inference failed */
    public C13804z(E e, InterfaceC13930m<? super C13666w> interfaceC13930m, InterfaceC11767l<? super E, C13666w> interfaceC11767l) {
        super(e, interfaceC13930m);
        this.f30258x = interfaceC11767l;
    }

    @Override // kotlinx.coroutines.channels.AbstractC13800w
    /* renamed from: F */
    public void mo3633F() {
        C13908t.m3441b(this.f30258x, mo3636C(), this.f30257w.getContext());
    }

    @Override // kotlinx.coroutines.internal.C13897n
    /* renamed from: w */
    public boolean mo3474w() {
        if (super.mo3474w()) {
            mo3633F();
            return true;
        }
        return false;
    }
}
