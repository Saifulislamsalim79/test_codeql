package com.google.android.gms.internal.measurement;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.o5 */
/* loaded from: classes2.dex */
final class C3923o5 extends AbstractC3861k6 {

    /* renamed from: a */
    private final Context f9593a;

    /* renamed from: b */
    private final InterfaceC4018u6<AbstractC3970r6<C3703a6>> f9594b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3923o5(Context context, InterfaceC4018u6<AbstractC3970r6<C3703a6>> interfaceC4018u6) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f9593a = context;
        this.f9594b = interfaceC4018u6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC3861k6
    /* renamed from: a */
    public final Context mo29252a() {
        return this.f9593a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC3861k6
    /* renamed from: b */
    public final InterfaceC4018u6<AbstractC3970r6<C3703a6>> mo29251b() {
        return this.f9594b;
    }

    public final boolean equals(Object obj) {
        InterfaceC4018u6<AbstractC3970r6<C3703a6>> interfaceC4018u6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3861k6) {
            AbstractC3861k6 abstractC3861k6 = (AbstractC3861k6) obj;
            if (this.f9593a.equals(abstractC3861k6.mo29252a()) && ((interfaceC4018u6 = this.f9594b) != null ? interfaceC4018u6.equals(abstractC3861k6.mo29251b()) : abstractC3861k6.mo29251b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f9593a.hashCode() ^ 1000003) * 1000003;
        InterfaceC4018u6<AbstractC3970r6<C3703a6>> interfaceC4018u6 = this.f9594b;
        return hashCode ^ (interfaceC4018u6 == null ? 0 : interfaceC4018u6.hashCode());
    }

    public final String toString() {
        String obj = this.f9593a.toString();
        String valueOf = String.valueOf(this.f9594b);
        StringBuilder sb = new StringBuilder(obj.length() + 46 + String.valueOf(valueOf).length());
        sb.append("FlagsContext{context=");
        sb.append(obj);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
