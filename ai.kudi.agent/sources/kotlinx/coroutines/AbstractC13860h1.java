package kotlinx.coroutines;

import java.io.Closeable;
import kotlin.p476c0.AbstractC11711b;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: Executors.kt */
/* renamed from: kotlinx.coroutines.h1 */
/* loaded from: classes3.dex */
public abstract class AbstractC13860h1 extends AbstractC13857h0 implements Closeable {

    /* compiled from: Executors.kt */
    /* renamed from: kotlinx.coroutines.h1$a */
    /* loaded from: classes3.dex */
    public static final class C13861a extends AbstractC11711b<AbstractC13857h0, AbstractC13860h1> {

        /* compiled from: Executors.kt */
        /* renamed from: kotlinx.coroutines.h1$a$a */
        /* loaded from: classes3.dex */
        static final class C13862a extends AbstractC11802m implements InterfaceC11767l<InterfaceC11719g.InterfaceC11722b, AbstractC13860h1> {

            /* renamed from: c */
            public static final C13862a f30334c = new C13862a();

            C13862a() {
                super(1);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public final AbstractC13860h1 invoke(InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
                if (interfaceC11722b instanceof AbstractC13860h1) {
                    return (AbstractC13860h1) interfaceC11722b;
                }
                return null;
            }
        }

        private C13861a() {
            super(AbstractC13857h0.f30332c, C13862a.f30334c);
        }

        public /* synthetic */ C13861a(kotlin.e0.d.g gVar) {
            this();
        }
    }

    static {
        new C13861a(null);
    }
}
