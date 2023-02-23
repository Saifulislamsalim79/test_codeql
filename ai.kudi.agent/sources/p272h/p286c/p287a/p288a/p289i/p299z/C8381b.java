package p272h.p286c.p287a.p288a.p289i.p299z;
/* compiled from: Retries.java */
/* renamed from: h.c.a.a.i.z.b */
/* loaded from: classes2.dex */
public final class C8381b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m16160a(int i, TInput tinput, InterfaceC8380a<TInput, TResult, TException> interfaceC8380a, InterfaceC8382c<TInput, TResult> interfaceC8382c) throws Throwable {
        TResult mo16161a;
        if (i < 1) {
            return interfaceC8380a.mo16161a(tinput);
        }
        do {
            mo16161a = interfaceC8380a.mo16161a(tinput);
            tinput = interfaceC8382c.mo16159a(tinput, mo16161a);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return mo16161a;
    }
}
