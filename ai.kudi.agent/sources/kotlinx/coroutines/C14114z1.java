package kotlinx.coroutines;

import kotlinx.coroutines.internal.C13895l;
import kotlinx.coroutines.internal.C13897n;
/* compiled from: JobSupport.kt */
/* renamed from: kotlinx.coroutines.z1 */
/* loaded from: classes3.dex */
public final class C14114z1 extends C13895l implements InterfaceC13923k1 {
    /* renamed from: C */
    public final String m2935C(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (C13897n c13897n = (C13897n) m3480p(); !kotlin.e0.d.l.b(c13897n, this); c13897n = c13897n.m3479r()) {
            if (c13897n instanceof AbstractC14069u1) {
                AbstractC14069u1 abstractC14069u1 = (AbstractC14069u1) c13897n;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(abstractC14069u1);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        kotlin.e0.d.l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // kotlinx.coroutines.InterfaceC13923k1
    /* renamed from: c */
    public C14114z1 mo2934c() {
        return this;
    }

    @Override // kotlinx.coroutines.InterfaceC13923k1
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.C13897n
    public String toString() {
        return C13952q0.m3343c() ? m2935C("Active") : super.toString();
    }
}
