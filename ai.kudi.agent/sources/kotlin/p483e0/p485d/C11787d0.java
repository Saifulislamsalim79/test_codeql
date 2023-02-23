package kotlin.p483e0.p485d;

import kotlin.p493j0.InterfaceC11874k;
/* compiled from: TypeParameterReference.kt */
/* renamed from: kotlin.e0.d.d0 */
/* loaded from: classes3.dex */
public final class C11787d0 implements InterfaceC11874k {

    /* renamed from: c */
    public static final C11788a f26485c = new C11788a(null);

    /* compiled from: TypeParameterReference.kt */
    /* renamed from: kotlin.e0.d.d0$a */
    /* loaded from: classes3.dex */
    public static final class C11788a {
        private C11788a() {
        }

        /* renamed from: a */
        public final String m10330a(InterfaceC11874k interfaceC11874k) {
            l.f(interfaceC11874k, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i = C11785c0.f26484a[interfaceC11874k.mo10209r().ordinal()];
            if (i == 2) {
                sb.append("in ");
            } else if (i == 3) {
                sb.append("out ");
            }
            sb.append(interfaceC11874k.mo10212b());
            String sb2 = sb.toString();
            l.e(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        public /* synthetic */ C11788a(g gVar) {
            this();
        }
    }
}
