package kotlinx.coroutines;

import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: CompletionState.kt */
/* renamed from: kotlinx.coroutines.c0 */
/* loaded from: classes3.dex */
public final class C13759c0 {

    /* renamed from: a */
    public final Object f30203a;

    /* renamed from: b */
    public final InterfaceC11767l<Throwable, C13666w> f30204b;

    /* JADX WARN: Multi-variable type inference failed */
    public C13759c0(Object obj, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        this.f30203a = obj;
        this.f30204b = interfaceC11767l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13759c0) {
            C13759c0 c13759c0 = (C13759c0) obj;
            return kotlin.e0.d.l.b(this.f30203a, c13759c0.f30203a) && kotlin.e0.d.l.b(this.f30204b, c13759c0.f30204b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f30203a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f30204b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f30203a + ", onCancellation=" + this.f30204b + ')';
    }
}
