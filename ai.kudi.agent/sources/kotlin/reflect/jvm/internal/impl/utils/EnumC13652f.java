package kotlin.reflect.jvm.internal.impl.utils;
/* compiled from: JavaTypeEnhancementState.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.utils.f */
/* loaded from: classes3.dex */
public enum EnumC13652f {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    

    /* renamed from: c */
    private final String f30092c;

    EnumC13652f(String str) {
        this.f30092c = str;
    }

    /* renamed from: b */
    public final String m4251b() {
        return this.f30092c;
    }

    /* renamed from: e */
    public final boolean m4250e() {
        return this == IGNORE;
    }

    /* renamed from: g */
    public final boolean m4249g() {
        return this == WARN;
    }
}
