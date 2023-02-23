package com.smartlook.coroutines;

import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* loaded from: classes2.dex */
public interface CoroutineExceptionHandler extends InterfaceC11719g.InterfaceC11722b {

    /* renamed from: a */
    public static final /* synthetic */ int f17116a = 0;

    /* renamed from: com.smartlook.coroutines.CoroutineExceptionHandler$a */
    /* loaded from: classes2.dex */
    public static final class C7205a implements InterfaceC11719g.InterfaceC11724c<CoroutineExceptionHandler> {

        /* renamed from: a */
        public static final /* synthetic */ C7205a f17117a = new C7205a();
    }

    /* renamed from: a */
    void m19313a(InterfaceC11719g interfaceC11719g, Throwable th);

    @Override // kotlin.p476c0.InterfaceC11719g
    /* synthetic */ <R> R fold(R r, InterfaceC11771p<? super R, ? super InterfaceC11719g.InterfaceC11722b, ? extends R> interfaceC11771p);

    @Override // kotlin.p476c0.InterfaceC11719g.InterfaceC11722b, kotlin.p476c0.InterfaceC11719g
    /* synthetic */ <E extends InterfaceC11719g.InterfaceC11722b> E get(InterfaceC11719g.InterfaceC11724c<E> interfaceC11724c);

    @Override // kotlin.p476c0.InterfaceC11719g.InterfaceC11722b
    /* synthetic */ InterfaceC11719g.InterfaceC11724c<?> getKey();

    @Override // kotlin.p476c0.InterfaceC11719g
    /* synthetic */ InterfaceC11719g minusKey(InterfaceC11719g.InterfaceC11724c<?> interfaceC11724c);

    @Override // kotlin.p476c0.InterfaceC11719g
    /* synthetic */ InterfaceC11719g plus(InterfaceC11719g interfaceC11719g);
}
