package kotlinx.coroutines.p559q2;

import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.InterfaceC13947p1;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.flow.internal.InterfaceC13837m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
/* renamed from: kotlinx.coroutines.q2.t */
/* loaded from: classes3.dex */
public final class C14023t<T> implements InterfaceC14025v<T>, Object<T>, InterfaceC13837m<T> {

    /* renamed from: c */
    private final /* synthetic */ InterfaceC14025v<T> f30587c;

    /* JADX WARN: Multi-variable type inference failed */
    public C14023t(InterfaceC14025v<? extends T> interfaceC14025v, InterfaceC13947p1 interfaceC13947p1) {
        this.f30587c = interfaceC14025v;
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
    /* renamed from: a */
    public Object mo3175a(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        return this.f30587c.mo3175a(interfaceC13969e, interfaceC11714d);
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC13837m
    /* renamed from: b */
    public InterfaceC13964d<T> mo3233b(InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        return C14030x.m3212e(this, interfaceC11719g, i, enumC13778e);
    }
}
