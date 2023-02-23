package kotlinx.coroutines.p559q2;

import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Distinct.kt */
/* renamed from: kotlinx.coroutines.q2.k */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13987k {

    /* renamed from: a */
    private static final InterfaceC11767l<Object, Object> f30509a = C13989b.f30512c;

    /* renamed from: b */
    private static final InterfaceC11771p<Object, Object, Boolean> f30510b = C13988a.f30511c;

    /* compiled from: Distinct.kt */
    /* renamed from: kotlinx.coroutines.q2.k$a */
    /* loaded from: classes3.dex */
    static final class C13988a extends AbstractC11802m implements InterfaceC11771p<Object, Object, Boolean> {

        /* renamed from: c */
        public static final C13988a f30511c = new C13988a();

        C13988a() {
            super(2);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: a */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(l.b(obj, obj2));
        }
    }

    /* compiled from: Distinct.kt */
    /* renamed from: kotlinx.coroutines.q2.k$b */
    /* loaded from: classes3.dex */
    static final class C13989b extends AbstractC11802m implements InterfaceC11767l<Object, Object> {

        /* renamed from: c */
        public static final C13989b f30512c = new C13989b();

        C13989b() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> InterfaceC13964d<T> m3281a(InterfaceC13964d<? extends T> interfaceC13964d) {
        return interfaceC13964d instanceof InterfaceC13970e0 ? interfaceC13964d : m3280b(interfaceC13964d, f30509a, f30510b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static final <T> InterfaceC13964d<T> m3280b(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11767l<? super T, ? extends Object> interfaceC11767l, InterfaceC11771p<Object, Object, Boolean> interfaceC11771p) {
        if (interfaceC13964d instanceof C13960c) {
            C13960c c13960c = (C13960c) interfaceC13964d;
            if (c13960c.f30458d == interfaceC11767l && c13960c.f30459e == interfaceC11771p) {
                return interfaceC13964d;
            }
        }
        return new C13960c(interfaceC13964d, interfaceC11767l, interfaceC11771p);
    }
}
