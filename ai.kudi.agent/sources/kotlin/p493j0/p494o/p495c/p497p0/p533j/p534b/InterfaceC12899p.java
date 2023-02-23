package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
/* compiled from: ErrorReporter.java */
/* renamed from: kotlin.j0.o.c.p0.j.b.p */
/* loaded from: classes3.dex */
public interface InterfaceC12899p {

    /* renamed from: a */
    public static final InterfaceC12899p f28931a = new C12900a();

    /* compiled from: ErrorReporter.java */
    /* renamed from: kotlin.j0.o.c.p0.j.b.p$a */
    /* loaded from: classes3.dex */
    static class C12900a implements InterfaceC12899p {
        C12900a() {
        }

        /* renamed from: c */
        private static /* synthetic */ void m6458c(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12899p
        /* renamed from: a */
        public void mo4913a(InterfaceC13300b interfaceC13300b) {
            if (interfaceC13300b != null) {
                return;
            }
            m6458c(2);
            throw null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12899p
        /* renamed from: b */
        public void mo4912b(InterfaceC13312e interfaceC13312e, List<String> list) {
            if (interfaceC13312e == null) {
                m6458c(0);
                throw null;
            } else if (list != null) {
            } else {
                m6458c(1);
                throw null;
            }
        }
    }

    /* renamed from: a */
    void mo4913a(InterfaceC13300b interfaceC13300b);

    /* renamed from: b */
    void mo4912b(InterfaceC13312e interfaceC13312e, List<String> list);
}
