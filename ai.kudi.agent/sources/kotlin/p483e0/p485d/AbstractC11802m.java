package kotlin.p483e0.p485d;

import java.io.Serializable;
/* compiled from: Lambda.kt */
/* renamed from: kotlin.e0.d.m */
/* loaded from: classes3.dex */
public abstract class AbstractC11802m<R> implements InterfaceC11798h<R>, Serializable {
    private final int arity;

    public AbstractC11802m(int i) {
        this.arity = i;
    }

    @Override // kotlin.p483e0.p485d.InterfaceC11798h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String m10310h = C11813x.m10310h(this);
        l.e(m10310h, "Reflection.renderLambdaToString(this)");
        return m10310h;
    }
}
