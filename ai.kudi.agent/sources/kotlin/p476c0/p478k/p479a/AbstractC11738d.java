package kotlin.p476c0.p478k.p479a;

import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11715e;
import kotlin.p476c0.InterfaceC11719g;
/* compiled from: ContinuationImpl.kt */
/* renamed from: kotlin.c0.k.a.d */
/* loaded from: classes3.dex */
public abstract class AbstractC11738d extends AbstractC11735a {
    private final InterfaceC11719g _context;
    private transient InterfaceC11714d<Object> intercepted;

    public AbstractC11738d(InterfaceC11714d<Object> interfaceC11714d, InterfaceC11719g interfaceC11719g) {
        super(interfaceC11714d);
        this._context = interfaceC11719g;
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public InterfaceC11719g getContext() {
        InterfaceC11719g interfaceC11719g = this._context;
        l.d(interfaceC11719g);
        return interfaceC11719g;
    }

    public final InterfaceC11714d<Object> intercepted() {
        InterfaceC11714d<Object> interfaceC11714d = this.intercepted;
        if (interfaceC11714d == null) {
            InterfaceC11715e interfaceC11715e = (InterfaceC11715e) getContext().get(InterfaceC11715e.f26443r);
            if (interfaceC11715e == null || (interfaceC11714d = interfaceC11715e.mo3571J(this)) == null) {
                interfaceC11714d = this;
            }
            this.intercepted = interfaceC11714d;
        }
        return interfaceC11714d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public void releaseIntercepted() {
        InterfaceC11714d<?> interfaceC11714d = this.intercepted;
        if (interfaceC11714d != null && interfaceC11714d != this) {
            InterfaceC11719g.InterfaceC11722b interfaceC11722b = getContext().get(InterfaceC11715e.f26443r);
            l.d(interfaceC11722b);
            ((InterfaceC11715e) interfaceC11722b).mo3572F(interfaceC11714d);
        }
        this.intercepted = C11737c.f26463c;
    }

    public AbstractC11738d(InterfaceC11714d<Object> interfaceC11714d) {
        this(interfaceC11714d, interfaceC11714d != null ? interfaceC11714d.getContext() : null);
    }
}
