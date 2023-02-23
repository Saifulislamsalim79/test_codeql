package io.intercom.com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldNamingPolicy.java */
/* renamed from: io.intercom.com.google.gson.c */
/* loaded from: classes3.dex */
public abstract class EnumC10908c implements InterfaceC10915d {

    /* renamed from: c */
    public static final EnumC10908c f24870c = new C10909a("IDENTITY", 0);

    /* renamed from: d */
    public static final EnumC10908c f24871d = new EnumC10908c("UPPER_CAMEL_CASE", 1) { // from class: io.intercom.com.google.gson.c.b
        @Override // io.intercom.com.google.gson.InterfaceC10915d
        /* renamed from: a */
        public String mo11971a(Field field) {
            return EnumC10908c.m11972g(field.getName());
        }
    };

    /* renamed from: e */
    public static final EnumC10908c f24872e = new EnumC10908c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: io.intercom.com.google.gson.c.c
        @Override // io.intercom.com.google.gson.InterfaceC10915d
        /* renamed from: a */
        public String mo11971a(Field field) {
            return EnumC10908c.m11972g(EnumC10908c.m11973e(field.getName(), " "));
        }
    };

    /* renamed from: f */
    public static final EnumC10908c f24873f = new EnumC10908c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: io.intercom.com.google.gson.c.d
        @Override // io.intercom.com.google.gson.InterfaceC10915d
        /* renamed from: a */
        public String mo11971a(Field field) {
            return EnumC10908c.m11973e(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: w */
    public static final EnumC10908c f24874w = new EnumC10908c("LOWER_CASE_WITH_DASHES", 4) { // from class: io.intercom.com.google.gson.c.e
        @Override // io.intercom.com.google.gson.InterfaceC10915d
        /* renamed from: a */
        public String mo11971a(Field field) {
            return EnumC10908c.m11973e(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: x */
    public static final EnumC10908c f24875x;

    /* renamed from: y */
    private static final /* synthetic */ EnumC10908c[] f24876y;

    /* compiled from: FieldNamingPolicy.java */
    /* renamed from: io.intercom.com.google.gson.c$a */
    /* loaded from: classes3.dex */
    enum C10909a extends EnumC10908c {
        C10909a(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.com.google.gson.InterfaceC10915d
        /* renamed from: a */
        public String mo11971a(Field field) {
            return field.getName();
        }
    }

    static {
        EnumC10908c enumC10908c = new EnumC10908c("LOWER_CASE_WITH_DOTS", 5) { // from class: io.intercom.com.google.gson.c.f
            @Override // io.intercom.com.google.gson.InterfaceC10915d
            /* renamed from: a */
            public String mo11971a(Field field) {
                return EnumC10908c.m11973e(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f24875x = enumC10908c;
        f24876y = new EnumC10908c[]{f24870c, f24871d, f24872e, f24873f, f24874w, enumC10908c};
    }

    private EnumC10908c(String str, int i) {
    }

    /* renamed from: b */
    private static String m11974b(char c, String str, int i) {
        if (i < str.length()) {
            return c + str.substring(i);
        }
        return String.valueOf(c);
    }

    /* renamed from: e */
    static String m11973e(String str, String str2) {
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

    /* renamed from: g */
    static String m11972g(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(m11974b(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }

    public static EnumC10908c valueOf(String str) {
        return (EnumC10908c) Enum.valueOf(EnumC10908c.class, str);
    }

    public static EnumC10908c[] values() {
        return (EnumC10908c[]) f24876y.clone();
    }

    /* synthetic */ EnumC10908c(String str, int i, C10909a c10909a) {
        this(str, i);
    }
}
