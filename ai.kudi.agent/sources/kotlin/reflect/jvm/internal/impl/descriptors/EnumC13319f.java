package kotlin.reflect.jvm.internal.impl.descriptors;
/* compiled from: ClassKind.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f */
/* loaded from: classes3.dex */
public enum EnumC13319f {
    CLASS,
    INTERFACE,
    ENUM_CLASS,
    ENUM_ENTRY,
    ANNOTATION_CLASS,
    OBJECT;

    /* renamed from: a */
    public boolean m5332a() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
