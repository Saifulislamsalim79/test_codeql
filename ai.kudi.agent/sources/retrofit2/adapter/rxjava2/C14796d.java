package retrofit2.adapter.rxjava2;

import retrofit2.C14840l;
/* compiled from: Result.java */
/* renamed from: retrofit2.adapter.rxjava2.d */
/* loaded from: classes3.dex */
public final class C14796d<T> {
    private C14796d(C14840l<T> c14840l, Throwable th) {
    }

    /* renamed from: a */
    public static <T> C14796d<T> m338a(Throwable th) {
        if (th != null) {
            return new C14796d<>(null, th);
        }
        throw new NullPointerException("error == null");
    }

    /* renamed from: b */
    public static <T> C14796d<T> m337b(C14840l<T> c14840l) {
        if (c14840l != null) {
            return new C14796d<>(c14840l, null);
        }
        throw new NullPointerException("response == null");
    }
}
