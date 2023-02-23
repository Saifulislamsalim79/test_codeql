package kotlin.reflect.jvm.internal.impl.descriptors;
/* compiled from: SourceElement.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.u0 */
/* loaded from: classes3.dex */
public interface InterfaceC13545u0 {

    /* renamed from: a */
    public static final InterfaceC13545u0 f29903a = new C13546a();

    /* compiled from: SourceElement.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.u0$a */
    /* loaded from: classes3.dex */
    static class C13546a implements InterfaceC13545u0 {
        C13546a() {
        }

        /* renamed from: d */
        private static /* synthetic */ void m4705d(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0
        /* renamed from: a */
        public InterfaceC13548v0 mo4706a() {
            InterfaceC13548v0 interfaceC13548v0 = InterfaceC13548v0.f29904a;
            if (interfaceC13548v0 != null) {
                return interfaceC13548v0;
            }
            m4705d(0);
            throw null;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    /* renamed from: a */
    InterfaceC13548v0 mo4706a();
}
