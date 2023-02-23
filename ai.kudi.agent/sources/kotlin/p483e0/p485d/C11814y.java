package kotlin.p483e0.p485d;

import kotlin.p493j0.InterfaceC11863b;
import kotlin.p493j0.InterfaceC11865d;
import kotlin.p493j0.InterfaceC11866e;
import kotlin.p493j0.InterfaceC11867f;
import kotlin.p493j0.InterfaceC11870h;
/* compiled from: ReflectionFactory.java */
/* renamed from: kotlin.e0.d.y */
/* loaded from: classes3.dex */
public class C11814y {
    /* renamed from: a */
    public InterfaceC11866e mo10157a(C11799i c11799i) {
        return c11799i;
    }

    /* renamed from: b */
    public InterfaceC11863b mo10156b(Class cls) {
        return new C11789e(cls);
    }

    /* renamed from: c */
    public InterfaceC11865d mo10155c(Class cls, String str) {
        return new C11806q(cls, str);
    }

    /* renamed from: d */
    public InterfaceC11867f mo10154d(AbstractC11803n abstractC11803n) {
        return abstractC11803n;
    }

    /* renamed from: e */
    public InterfaceC11870h mo10153e(AbstractC11807r abstractC11807r) {
        return abstractC11807r;
    }

    /* renamed from: f */
    public String mo10152f(InterfaceC11798h interfaceC11798h) {
        String obj = interfaceC11798h.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: g */
    public String mo10151g(AbstractC11802m abstractC11802m) {
        return mo10152f(abstractC11802m);
    }
}
