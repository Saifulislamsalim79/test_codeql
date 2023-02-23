package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w;

import java.util.Collection;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
/* compiled from: ResolutionScope.kt */
/* renamed from: kotlin.j0.o.c.p0.i.w.k */
/* loaded from: classes3.dex */
public interface InterfaceC12783k {

    /* compiled from: ResolutionScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.w.k$a */
    /* loaded from: classes3.dex */
    public static final class C12784a {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ Collection m6774a(InterfaceC12783k interfaceC12783k, C12768d c12768d, InterfaceC11767l interfaceC11767l, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    c12768d = C12768d.f28647o;
                }
                InterfaceC11767l<C12614f, Boolean> interfaceC11767l2 = interfaceC11767l;
                if ((i & 2) != 0) {
                    interfaceC11767l2 = InterfaceC12777h.f28667a.m6777a();
                }
                return interfaceC12783k.mo5112g(c12768d, interfaceC11767l2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }
    }

    /* renamed from: f */
    InterfaceC13334h mo5794f(C12614f c12614f, InterfaceC12112b interfaceC12112b);

    /* renamed from: g */
    Collection<InterfaceC13513m> mo5112g(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l);
}
