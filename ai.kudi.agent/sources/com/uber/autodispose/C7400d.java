package com.uber.autodispose;

import java.util.concurrent.Callable;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11284d;
/* compiled from: AutoDispose.java */
/* renamed from: com.uber.autodispose.d */
/* loaded from: classes2.dex */
public final class C7400d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoDispose.java */
    /* renamed from: com.uber.autodispose.d$a */
    /* loaded from: classes2.dex */
    public class C7401a implements InterfaceC7404f<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11284d f17557a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AutoDispose.java */
        /* renamed from: com.uber.autodispose.d$a$a */
        /* loaded from: classes2.dex */
        public class C7402a implements InterfaceC7420n<T> {

            /* renamed from: a */
            final /* synthetic */ AbstractC11293f f17558a;

            C7402a(AbstractC11293f abstractC11293f) {
                this.f17558a = abstractC11293f;
            }

            @Override // com.uber.autodispose.InterfaceC7420n
            /* renamed from: a */
            public j.e.c0.c mo18766a(j.e.e0.e<? super T> eVar) {
                return new C7406h(this.f17558a, C7401a.this.f17557a).m11191H(eVar);
            }
        }

        C7401a(InterfaceC11284d interfaceC11284d) {
            this.f17557a = interfaceC11284d;
        }

        @Override // p425j.p444e.InterfaceC11670g
        /* renamed from: b */
        public InterfaceC7420n<T> mo10621a(AbstractC11293f<T> abstractC11293f) {
            return new C7402a(abstractC11293f);
        }
    }

    /* renamed from: a */
    public static <T> InterfaceC7404f<T> m18802a(final InterfaceC7422p interfaceC7422p) {
        C7408j.m18790a(interfaceC7422p, "provider == null");
        return m18801b(AbstractC11271b.m11245f(new Callable() { // from class: com.uber.autodispose.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7400d.m18800c(InterfaceC7422p.this);
            }
        }));
    }

    /* renamed from: b */
    public static <T> InterfaceC7404f<T> m18801b(InterfaceC11284d interfaceC11284d) {
        C7408j.m18790a(interfaceC11284d, "scope == null");
        return new C7401a(interfaceC11284d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ InterfaceC11284d m18800c(InterfaceC7422p interfaceC7422p) throws Exception {
        try {
            return interfaceC7422p.mo18762d();
        } catch (OutsideScopeException e) {
            j.e.e0.e<? super OutsideScopeException> m18791b = C7407i.m18791b();
            if (m18791b != null) {
                m18791b.accept(e);
                return AbstractC11271b.m11246e();
            }
            return AbstractC11271b.m11241j(e);
        }
    }
}
