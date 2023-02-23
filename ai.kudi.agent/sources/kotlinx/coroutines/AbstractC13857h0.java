package kotlinx.coroutines;

import kotlin.p476c0.AbstractC11710a;
import kotlin.p476c0.AbstractC11711b;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11715e;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlinx.coroutines.internal.C13881f;
/* compiled from: CoroutineDispatcher.kt */
/* renamed from: kotlinx.coroutines.h0 */
/* loaded from: classes3.dex */
public abstract class AbstractC13857h0 extends AbstractC11710a implements InterfaceC11715e {

    /* renamed from: c */
    public static final C13858a f30332c = new C13858a(null);

    /* compiled from: CoroutineDispatcher.kt */
    /* renamed from: kotlinx.coroutines.h0$a */
    /* loaded from: classes3.dex */
    public static final class C13858a extends AbstractC11711b<InterfaceC11715e, AbstractC13857h0> {

        /* compiled from: CoroutineDispatcher.kt */
        /* renamed from: kotlinx.coroutines.h0$a$a */
        /* loaded from: classes3.dex */
        static final class C13859a extends AbstractC11802m implements InterfaceC11767l<InterfaceC11719g.InterfaceC11722b, AbstractC13857h0> {

            /* renamed from: c */
            public static final C13859a f30333c = new C13859a();

            C13859a() {
                super(1);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public final AbstractC13857h0 invoke(InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
                if (interfaceC11722b instanceof AbstractC13857h0) {
                    return (AbstractC13857h0) interfaceC11722b;
                }
                return null;
            }
        }

        private C13858a() {
            super(InterfaceC11715e.f26443r, C13859a.f30333c);
        }

        public /* synthetic */ C13858a(kotlin.e0.d.g gVar) {
            this();
        }
    }

    public AbstractC13857h0() {
        super(InterfaceC11715e.f26443r);
    }

    @Override // kotlin.p476c0.InterfaceC11715e
    /* renamed from: F */
    public final void mo3572F(InterfaceC11714d<?> interfaceC11714d) {
        ((C13881f) interfaceC11714d).m3520u();
    }

    /* renamed from: F0 */
    public void mo3094F0(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        mo3067o0(interfaceC11719g, runnable);
    }

    /* renamed from: H0 */
    public boolean mo3399H0(InterfaceC11719g interfaceC11719g) {
        return true;
    }

    @Override // kotlin.p476c0.InterfaceC11715e
    /* renamed from: J */
    public final <T> InterfaceC11714d<T> mo3571J(InterfaceC11714d<? super T> interfaceC11714d) {
        return new C13881f(this, interfaceC11714d);
    }

    @Override // kotlin.p476c0.AbstractC11710a, kotlin.p476c0.InterfaceC11719g.InterfaceC11722b, kotlin.p476c0.InterfaceC11719g
    public <E extends InterfaceC11719g.InterfaceC11722b> E get(InterfaceC11719g.InterfaceC11724c<E> interfaceC11724c) {
        return (E) InterfaceC11715e.C11716a.m10404a(this, interfaceC11724c);
    }

    @Override // kotlin.p476c0.AbstractC11710a, kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g minusKey(InterfaceC11719g.InterfaceC11724c<?> interfaceC11724c) {
        return InterfaceC11715e.C11716a.m10403b(this, interfaceC11724c);
    }

    /* renamed from: o0 */
    public abstract void mo3067o0(InterfaceC11719g interfaceC11719g, Runnable runnable);

    public String toString() {
        return C14034r0.m3204a(this) + '@' + C14034r0.m3203b(this);
    }
}
