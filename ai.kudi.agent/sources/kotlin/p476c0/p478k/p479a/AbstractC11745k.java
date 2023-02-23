package kotlin.p476c0.p478k.p479a;

import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.InterfaceC11798h;
/* compiled from: ContinuationImpl.kt */
/* renamed from: kotlin.c0.k.a.k */
/* loaded from: classes3.dex */
public abstract class AbstractC11745k extends AbstractC11738d implements InterfaceC11798h<Object> {
    private final int arity;

    public AbstractC11745k(int i, InterfaceC11714d<Object> interfaceC11714d) {
        super(interfaceC11714d);
        this.arity = i;
    }

    @Override // kotlin.p483e0.p485d.InterfaceC11798h
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public String toString() {
        if (getCompletion() == null) {
            String m10311g = C11813x.m10311g(this);
            l.e(m10311g, "Reflection.renderLambdaToString(this)");
            return m10311g;
        }
        return super.toString();
    }

    public AbstractC11745k(int i) {
        this(i, null);
    }
}
