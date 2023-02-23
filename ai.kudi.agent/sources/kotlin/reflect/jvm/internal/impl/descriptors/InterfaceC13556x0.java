package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
/* compiled from: SupertypeLoopChecker.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x0 */
/* loaded from: classes3.dex */
public interface InterfaceC13556x0 {

    /* compiled from: SupertypeLoopChecker.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x0$a */
    /* loaded from: classes3.dex */
    public static final class C13557a implements InterfaceC13556x0 {

        /* renamed from: a */
        public static final C13557a f29907a = new C13557a();

        private C13557a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13556x0
        /* renamed from: a */
        public Collection<AbstractC12965b0> mo4663a(InterfaceC13125t0 interfaceC13125t0, Collection<? extends AbstractC12965b0> collection, InterfaceC11767l<? super InterfaceC13125t0, ? extends Iterable<? extends AbstractC12965b0>> interfaceC11767l, InterfaceC11767l<? super AbstractC12965b0, C13666w> interfaceC11767l2) {
            kotlin.e0.d.l.f(interfaceC13125t0, "currentTypeConstructor");
            kotlin.e0.d.l.f(collection, "superTypes");
            kotlin.e0.d.l.f(interfaceC11767l, "neighbors");
            kotlin.e0.d.l.f(interfaceC11767l2, "reportLoop");
            return collection;
        }
    }

    /* renamed from: a */
    Collection<AbstractC12965b0> mo4663a(InterfaceC13125t0 interfaceC13125t0, Collection<? extends AbstractC12965b0> collection, InterfaceC11767l<? super InterfaceC13125t0, ? extends Iterable<? extends AbstractC12965b0>> interfaceC11767l, InterfaceC11767l<? super AbstractC12965b0, C13666w> interfaceC11767l2);
}
