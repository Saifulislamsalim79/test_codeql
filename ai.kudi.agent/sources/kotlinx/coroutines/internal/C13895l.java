package kotlinx.coroutines.internal;
/* compiled from: LockFreeLinkedList.kt */
/* renamed from: kotlinx.coroutines.internal.l */
/* loaded from: classes3.dex */
public class C13895l extends C13897n {
    /* renamed from: B */
    public final boolean m3491B() {
        return m3480p() == this;
    }

    @Override // kotlinx.coroutines.internal.C13897n
    /* renamed from: v */
    public boolean mo3475v() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.C13897n
    /* renamed from: w */
    public final boolean mo3474w() {
        throw new IllegalStateException("head cannot be removed".toString());
    }
}
