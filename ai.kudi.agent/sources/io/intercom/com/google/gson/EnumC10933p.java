package io.intercom.com.google.gson;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongSerializationPolicy.java */
/* renamed from: io.intercom.com.google.gson.p */
/* loaded from: classes3.dex */
public abstract class EnumC10933p {

    /* renamed from: c */
    public static final EnumC10933p f24896c = new C10934a("DEFAULT", 0);

    /* renamed from: d */
    public static final EnumC10933p f24897d;

    /* renamed from: e */
    private static final /* synthetic */ EnumC10933p[] f24898e;

    /* compiled from: LongSerializationPolicy.java */
    /* renamed from: io.intercom.com.google.gson.p$a */
    /* loaded from: classes3.dex */
    enum C10934a extends EnumC10933p {
        C10934a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        EnumC10933p enumC10933p = new EnumC10933p("STRING", 1) { // from class: io.intercom.com.google.gson.p.b
        };
        f24897d = enumC10933p;
        f24898e = new EnumC10933p[]{f24896c, enumC10933p};
    }

    private EnumC10933p(String str, int i) {
    }

    public static EnumC10933p valueOf(String str) {
        return (EnumC10933p) Enum.valueOf(EnumC10933p.class, str);
    }

    public static EnumC10933p[] values() {
        return (EnumC10933p[]) f24898e.clone();
    }

    /* synthetic */ EnumC10933p(String str, int i, C10934a c10934a) {
        this(str, i);
    }
}
