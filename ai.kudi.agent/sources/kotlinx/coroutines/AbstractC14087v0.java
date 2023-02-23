package kotlinx.coroutines;

import kotlin.C11709c;
import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p478k.p479a.InterfaceC11739e;
import kotlinx.coroutines.internal.C13873c0;
import kotlinx.coroutines.internal.C13881f;
import kotlinx.coroutines.internal.C13913x;
import kotlinx.coroutines.p563u2.AbstractRunnableC14081i;
import kotlinx.coroutines.p563u2.InterfaceC14082j;
/* compiled from: DispatchedTask.kt */
/* renamed from: kotlinx.coroutines.v0 */
/* loaded from: classes3.dex */
public abstract class AbstractC14087v0<T> extends AbstractRunnableC14081i {

    /* renamed from: e */
    public int f30728e;

    public AbstractC14087v0(int i) {
        this.f30728e = i;
    }

    /* renamed from: c */
    public void mo3066c(Object obj, Throwable th) {
    }

    /* renamed from: d */
    public abstract InterfaceC11714d<T> mo3065d();

    /* renamed from: e */
    public Throwable mo3064e(Object obj) {
        C13755b0 c13755b0 = obj instanceof C13755b0 ? (C13755b0) obj : null;
        if (c13755b0 == null) {
            return null;
        }
        return c13755b0.f30198a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public <T> T mo3063f(Object obj) {
        return obj;
    }

    /* renamed from: g */
    public final void m3062g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C11709c.m10411a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.e0.d.l.d(th);
        C13917j0.m3410a(mo3065d().getContext(), new C13946p0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: k */
    public abstract Object mo3061k();

    @Override // java.lang.Runnable
    public final void run() {
        Object m5358a;
        Object m5358a2;
        if (C13952q0.m3345a()) {
            if (!(this.f30728e != -1)) {
                throw new AssertionError();
            }
        }
        InterfaceC14082j interfaceC14082j = this.f30713d;
        try {
            C13881f c13881f = (C13881f) mo3065d();
            InterfaceC11714d<T> interfaceC11714d = c13881f.f30354w;
            Object obj = c13881f.f30356y;
            InterfaceC11719g context = interfaceC11714d.getContext();
            Object m3549c = C13873c0.m3549c(context, obj);
            C13934m2<?> m3574e = m3549c != C13873c0.f30342a ? C13853g0.m3574e(interfaceC11714d, context, m3549c) : null;
            InterfaceC11719g context2 = interfaceC11714d.getContext();
            Object mo3061k = mo3061k();
            Throwable mo3064e = mo3064e(mo3061k);
            InterfaceC13947p1 interfaceC13947p1 = (mo3064e == null && C14104w0.m2961b(this.f30728e)) ? (InterfaceC13947p1) context2.get(InterfaceC13947p1.f30435u) : null;
            if (interfaceC13947p1 != null && !interfaceC13947p1.isActive()) {
                Throwable mo3025X = interfaceC13947p1.mo3025X();
                mo3066c(mo3061k, mo3025X);
                C13288p.C13289a c13289a = C13288p.f29444c;
                if (C13952q0.m3342d() && (interfaceC11714d instanceof InterfaceC11739e)) {
                    mo3025X = C13913x.m3434a(mo3025X, (InterfaceC11739e) interfaceC11714d);
                }
                Object m5358a3 = C13291q.m5358a(mo3025X);
                C13288p.m5362a(m5358a3);
                interfaceC11714d.resumeWith(m5358a3);
            } else if (mo3064e != null) {
                C13288p.C13289a c13289a2 = C13288p.f29444c;
                Object m5358a4 = C13291q.m5358a(mo3064e);
                C13288p.m5362a(m5358a4);
                interfaceC11714d.resumeWith(m5358a4);
            } else {
                T mo3063f = mo3063f(mo3061k);
                C13288p.C13289a c13289a3 = C13288p.f29444c;
                C13288p.m5362a(mo3063f);
                interfaceC11714d.resumeWith(mo3063f);
            }
            C13666w c13666w = C13666w.f30112a;
            if (m3574e == null || m3574e.m3396X0()) {
                C13873c0.m3551a(context, m3549c);
            }
            try {
                C13288p.C13289a c13289a4 = C13288p.f29444c;
                interfaceC14082j.mo3091I();
                m5358a2 = C13666w.f30112a;
                C13288p.m5362a(m5358a2);
            } catch (Throwable th) {
                C13288p.C13289a c13289a5 = C13288p.f29444c;
                m5358a2 = C13291q.m5358a(th);
                C13288p.m5362a(m5358a2);
            }
            m3062g(null, C13288p.m5361b(m5358a2));
        } catch (Throwable th2) {
            try {
                C13288p.C13289a c13289a6 = C13288p.f29444c;
                interfaceC14082j.mo3091I();
                m5358a = C13666w.f30112a;
                C13288p.m5362a(m5358a);
            } catch (Throwable th3) {
                C13288p.C13289a c13289a7 = C13288p.f29444c;
                m5358a = C13291q.m5358a(th3);
                C13288p.m5362a(m5358a);
            }
            m3062g(th2, C13288p.m5361b(m5358a));
        }
    }
}
