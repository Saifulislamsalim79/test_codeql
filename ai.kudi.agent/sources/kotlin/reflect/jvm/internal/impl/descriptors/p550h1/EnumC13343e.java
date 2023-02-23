package kotlin.reflect.jvm.internal.impl.descriptors.p550h1;

import kotlin.e0.d.g;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.p545m.C13176a;
/* compiled from: AnnotationUseSiteTarget.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.e */
/* loaded from: classes3.dex */
public enum EnumC13343e {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    

    /* renamed from: c */
    private final String f29509c;

    EnumC13343e(String str) {
        this.f29509c = str == null ? C13176a.m5710f(name()) : str;
    }

    /* renamed from: b */
    public final String m5322b() {
        return this.f29509c;
    }

    /* synthetic */ EnumC13343e(String str, int i, g gVar) {
        this((i & 1) != 0 ? null : str);
    }
}
