package p425j.p429b.p430a.p431a.p432a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: EventHandler.java */
/* renamed from: j.b.a.a.a.d */
/* loaded from: classes3.dex */
class C11134d {

    /* renamed from: a */
    private final Object f25188a;

    /* renamed from: b */
    private final Method f25189b;

    /* renamed from: c */
    private final int f25190c;

    /* renamed from: d */
    private boolean f25191d = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11134d(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventHandler target cannot be null.");
        }
        if (method != null) {
            this.f25188a = obj;
            this.f25189b = method;
            method.setAccessible(true);
            this.f25190c = ((method.hashCode() + 31) * 31) + obj.hashCode();
            return;
        }
        throw new NullPointerException("EventHandler method cannot be null.");
    }

    /* renamed from: a */
    public void m11595a(Object obj) throws InvocationTargetException {
        if (this.f25191d) {
            try {
                this.f25189b.invoke(this.f25188a, obj);
                return;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof Error) {
                    throw ((Error) e2.getCause());
                }
                throw e2;
            }
        }
        throw new IllegalStateException(toString() + " has been invalidated and can no longer handle events.");
    }

    /* renamed from: b */
    public void m11594b() {
        this.f25191d = false;
    }

    /* renamed from: c */
    public boolean m11593c() {
        return this.f25191d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11134d.class == obj.getClass()) {
            C11134d c11134d = (C11134d) obj;
            return this.f25189b.equals(c11134d.f25189b) && this.f25188a == c11134d.f25188a;
        }
        return false;
    }

    public int hashCode() {
        return this.f25190c;
    }

    public String toString() {
        return "[EventHandler " + this.f25189b + "]";
    }
}
