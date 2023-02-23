package p425j.p429b.p430a.p431a.p432a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: EventProducer.java */
/* renamed from: j.b.a.a.a.e */
/* loaded from: classes3.dex */
class C11135e {

    /* renamed from: a */
    final Object f25192a;

    /* renamed from: b */
    private final Method f25193b;

    /* renamed from: c */
    private final int f25194c;

    /* renamed from: d */
    private boolean f25195d = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11135e(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventProducer target cannot be null.");
        }
        if (method != null) {
            this.f25192a = obj;
            this.f25193b = method;
            method.setAccessible(true);
            this.f25194c = ((method.hashCode() + 31) * 31) + obj.hashCode();
            return;
        }
        throw new NullPointerException("EventProducer method cannot be null.");
    }

    /* renamed from: a */
    public void m11592a() {
        this.f25195d = false;
    }

    /* renamed from: b */
    public boolean m11591b() {
        return this.f25195d;
    }

    /* renamed from: c */
    public Object m11590c() throws InvocationTargetException {
        if (this.f25195d) {
            try {
                return this.f25193b.invoke(this.f25192a, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof Error) {
                    throw ((Error) e2.getCause());
                }
                throw e2;
            }
        }
        throw new IllegalStateException(toString() + " has been invalidated and can no longer produce events.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11135e.class == obj.getClass()) {
            C11135e c11135e = (C11135e) obj;
            return this.f25193b.equals(c11135e.f25193b) && this.f25192a == c11135e.f25192a;
        }
        return false;
    }

    public int hashCode() {
        return this.f25194c;
    }

    public String toString() {
        return "[EventProducer " + this.f25193b + "]";
    }
}
