package kotlin.p476c0;

import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.InterfaceC11719g.InterfaceC11722b;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: CoroutineContextImpl.kt */
/* renamed from: kotlin.c0.b */
/* loaded from: classes3.dex */
public abstract class AbstractC11711b<B extends InterfaceC11719g.InterfaceC11722b, E extends B> implements InterfaceC11719g.InterfaceC11724c<E> {

    /* renamed from: c */
    private final InterfaceC11719g.InterfaceC11724c<?> f26438c;

    /* renamed from: d */
    private final InterfaceC11767l<InterfaceC11719g.InterfaceC11722b, E> f26439d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.e0.c.l<kotlin.c0.g$b, E extends B>, java.lang.Object, kotlin.e0.c.l<? super kotlin.c0.g$b, ? extends E extends B>] */
    public AbstractC11711b(InterfaceC11719g.InterfaceC11724c<B> interfaceC11724c, InterfaceC11767l<? super InterfaceC11719g.InterfaceC11722b, ? extends E> interfaceC11767l) {
        l.f(interfaceC11724c, "baseKey");
        l.f((Object) interfaceC11767l, "safeCast");
        this.f26439d = interfaceC11767l;
        this.f26438c = interfaceC11724c instanceof AbstractC11711b ? (InterfaceC11719g.InterfaceC11724c<B>) ((AbstractC11711b) interfaceC11724c).f26438c : interfaceC11724c;
    }

    /* renamed from: a */
    public final boolean m10410a(InterfaceC11719g.InterfaceC11724c<?> interfaceC11724c) {
        l.f(interfaceC11724c, "key");
        return interfaceC11724c == this || this.f26438c == interfaceC11724c;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/c0/g$b;)TE; */
    /* renamed from: b */
    public final InterfaceC11719g.InterfaceC11722b m10409b(InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
        l.f(interfaceC11722b, "element");
        return (InterfaceC11719g.InterfaceC11722b) this.f26439d.invoke(interfaceC11722b);
    }
}
