package kotlin.reflect.jvm.internal.impl.descriptors;
/* compiled from: Modality.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z */
/* loaded from: classes3.dex */
public enum EnumC13560z {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    

    /* renamed from: c */
    public static final C13561a f29908c = new C13561a(null);

    /* compiled from: Modality.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z$a */
    /* loaded from: classes3.dex */
    public static final class C13561a {
        private C13561a() {
        }

        public /* synthetic */ C13561a(kotlin.e0.d.g gVar) {
            this();
        }

        /* renamed from: a */
        public final EnumC13560z m4653a(boolean z, boolean z2, boolean z3) {
            if (z) {
                return EnumC13560z.SEALED;
            }
            if (z2) {
                return EnumC13560z.ABSTRACT;
            }
            if (z3) {
                return EnumC13560z.OPEN;
            }
            return EnumC13560z.FINAL;
        }
    }
}
