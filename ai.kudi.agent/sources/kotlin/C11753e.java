package kotlin;

import java.io.Serializable;
/* compiled from: Lazy.kt */
/* renamed from: kotlin.e */
/* loaded from: classes3.dex */
public final class C11753e<T> implements InterfaceC11824h<T>, Serializable {

    /* renamed from: c */
    private final T f26472c;

    public C11753e(T t) {
        this.f26472c = t;
    }

    @Override // kotlin.InterfaceC11824h
    public T getValue() {
        return this.f26472c;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
