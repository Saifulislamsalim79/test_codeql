package kotlinx.coroutines.channels;

import java.util.ArrayList;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlinx.coroutines.channels.AbstractC13773c;
import kotlinx.coroutines.internal.C13908t;
import kotlinx.coroutines.internal.C13914y;
import kotlinx.coroutines.internal.UndeliveredElementException;
/* compiled from: LinkedListChannel.kt */
/* renamed from: kotlinx.coroutines.channels.o */
/* loaded from: classes3.dex */
public class C13792o<E> extends AbstractC13764a<E> {
    public C13792o(InterfaceC11767l<? super E, C13666w> interfaceC11767l) {
        super(interfaceC11767l);
    }

    @Override // kotlinx.coroutines.channels.AbstractC13764a
    /* renamed from: G */
    protected final boolean mo3645G() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractC13764a
    /* renamed from: H */
    protected final boolean mo3644H() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractC13764a
    /* renamed from: L */
    protected void mo3660L(Object obj, C13790m<?> c13790m) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                AbstractC13800w abstractC13800w = (AbstractC13800w) obj;
                if (abstractC13800w instanceof AbstractC13773c.C13774a) {
                    InterfaceC11767l<E, C13666w> interfaceC11767l = this.f30231c;
                    if (interfaceC11767l != null) {
                        undeliveredElementException = C13908t.m3440c(interfaceC11767l, ((AbstractC13773c.C13774a) abstractC13800w).f30233f, null);
                    }
                } else {
                    abstractC13800w.mo3635D(c13790m);
                }
            } else if (obj != null) {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    UndeliveredElementException undeliveredElementException2 = null;
                    while (true) {
                        int i = size - 1;
                        AbstractC13800w abstractC13800w2 = (AbstractC13800w) arrayList.get(size);
                        if (abstractC13800w2 instanceof AbstractC13773c.C13774a) {
                            InterfaceC11767l<E, C13666w> interfaceC11767l2 = this.f30231c;
                            undeliveredElementException2 = interfaceC11767l2 == null ? null : C13908t.m3440c(interfaceC11767l2, ((AbstractC13773c.C13774a) abstractC13800w2).f30233f, undeliveredElementException2);
                        } else {
                            abstractC13800w2.mo3635D(c13790m);
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                    undeliveredElementException = undeliveredElementException2;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC13773c
    /* renamed from: s */
    protected final boolean mo3643s() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractC13773c
    /* renamed from: t */
    protected final boolean mo3642t() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC13773c
    /* renamed from: v */
    public Object mo3659v(E e) {
        InterfaceC13798u<?> m3701x;
        do {
            Object mo3659v = super.mo3659v(e);
            C13914y c13914y = C13772b.f30225b;
            if (mo3659v == c13914y) {
                return c13914y;
            }
            if (mo3659v == C13772b.f30226c) {
                m3701x = m3701x(e);
                if (m3701x == null) {
                    return C13772b.f30225b;
                }
            } else if (mo3659v instanceof C13790m) {
                return mo3659v;
            } else {
                throw new IllegalStateException(kotlin.e0.d.l.m("Invalid offerInternal result ", mo3659v).toString());
            }
        } while (!(m3701x instanceof C13790m));
        return m3701x;
    }
}
