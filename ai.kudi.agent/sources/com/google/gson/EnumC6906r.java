package com.google.gson;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongSerializationPolicy.java */
/* renamed from: com.google.gson.r */
/* loaded from: classes2.dex */
public abstract class EnumC6906r {

    /* renamed from: c */
    public static final EnumC6906r f16554c = new C6907a("DEFAULT", 0);

    /* renamed from: d */
    public static final EnumC6906r f16555d;

    /* renamed from: e */
    private static final /* synthetic */ EnumC6906r[] f16556e;

    /* compiled from: LongSerializationPolicy.java */
    /* renamed from: com.google.gson.r$a */
    /* loaded from: classes2.dex */
    enum C6907a extends EnumC6906r {
        C6907a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        EnumC6906r enumC6906r = new EnumC6906r("STRING", 1) { // from class: com.google.gson.r.b
        };
        f16555d = enumC6906r;
        f16556e = new EnumC6906r[]{f16554c, enumC6906r};
    }

    private EnumC6906r(String str, int i) {
    }

    public static EnumC6906r valueOf(String str) {
        return (EnumC6906r) Enum.valueOf(EnumC6906r.class, str);
    }

    public static EnumC6906r[] values() {
        return (EnumC6906r[]) f16556e.clone();
    }

    /* synthetic */ EnumC6906r(String str, int i, C6907a c6907a) {
        this(str, i);
    }
}
