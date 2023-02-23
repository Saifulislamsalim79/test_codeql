package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldNamingPolicy.java */
/* renamed from: com.google.gson.d */
/* loaded from: classes2.dex */
public abstract class EnumC6776d implements InterfaceC6783e {

    /* renamed from: c */
    public static final EnumC6776d f16310c = new C6777a("IDENTITY", 0);

    /* renamed from: d */
    public static final EnumC6776d f16311d = new EnumC6776d("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.d.b
        @Override // com.google.gson.InterfaceC6783e
        /* renamed from: a */
        public String mo20774a(Field field) {
            return EnumC6776d.m20775e(field.getName());
        }
    };

    /* renamed from: e */
    public static final EnumC6776d f16312e = new EnumC6776d("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.d.c
        @Override // com.google.gson.InterfaceC6783e
        /* renamed from: a */
        public String mo20774a(Field field) {
            return EnumC6776d.m20775e(EnumC6776d.m20776b(field.getName(), " "));
        }
    };

    /* renamed from: f */
    public static final EnumC6776d f16313f = new EnumC6776d("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.d.d
        @Override // com.google.gson.InterfaceC6783e
        /* renamed from: a */
        public String mo20774a(Field field) {
            return EnumC6776d.m20776b(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: w */
    public static final EnumC6776d f16314w = new EnumC6776d("LOWER_CASE_WITH_DASHES", 4) { // from class: com.google.gson.d.e
        @Override // com.google.gson.InterfaceC6783e
        /* renamed from: a */
        public String mo20774a(Field field) {
            return EnumC6776d.m20776b(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: x */
    public static final EnumC6776d f16315x;

    /* renamed from: y */
    private static final /* synthetic */ EnumC6776d[] f16316y;

    /* compiled from: FieldNamingPolicy.java */
    /* renamed from: com.google.gson.d$a */
    /* loaded from: classes2.dex */
    enum C6777a extends EnumC6776d {
        C6777a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.InterfaceC6783e
        /* renamed from: a */
        public String mo20774a(Field field) {
            return field.getName();
        }
    }

    static {
        EnumC6776d enumC6776d = new EnumC6776d("LOWER_CASE_WITH_DOTS", 5) { // from class: com.google.gson.d.f
            @Override // com.google.gson.InterfaceC6783e
            /* renamed from: a */
            public String mo20774a(Field field) {
                return EnumC6776d.m20776b(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f16315x = enumC6776d;
        f16316y = new EnumC6776d[]{f16310c, f16311d, f16312e, f16313f, f16314w, enumC6776d};
    }

    private EnumC6776d(String str, int i) {
    }

    /* renamed from: b */
    static String m20776b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: e */
    static String m20775e(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }

    public static EnumC6776d valueOf(String str) {
        return (EnumC6776d) Enum.valueOf(EnumC6776d.class, str);
    }

    public static EnumC6776d[] values() {
        return (EnumC6776d[]) f16316y.clone();
    }

    /* synthetic */ EnumC6776d(String str, int i, C6777a c6777a) {
        this(str, i);
    }
}
