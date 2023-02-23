package com.google.common.collect;

import com.google.common.base.InterfaceC5039g;
import java.util.Map;
/* compiled from: Maps.java */
/* renamed from: com.google.common.collect.q */
/* loaded from: classes2.dex */
public final class C5120q {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Maps.java */
    /* renamed from: com.google.common.collect.q$a */
    /* loaded from: classes2.dex */
    private static abstract class EnumC5121a implements InterfaceC5039g<Map.Entry<?, ?>, Object> {

        /* renamed from: c */
        public static final EnumC5121a f12787c = new C5122a("KEY", 0);

        /* renamed from: d */
        public static final EnumC5121a f12788d = new C5123b("VALUE", 1);

        /* renamed from: e */
        private static final /* synthetic */ EnumC5121a[] f12789e = m25587b();

        /* compiled from: Maps.java */
        /* renamed from: com.google.common.collect.q$a$a */
        /* loaded from: classes2.dex */
        enum C5122a extends EnumC5121a {
            C5122a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.base.InterfaceC5039g
            /* renamed from: e */
            public Object mo25585a(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* compiled from: Maps.java */
        /* renamed from: com.google.common.collect.q$a$b */
        /* loaded from: classes2.dex */
        enum C5123b extends EnumC5121a {
            C5123b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.base.InterfaceC5039g
            /* renamed from: e */
            public Object mo25585a(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private EnumC5121a(String str, int i) {
        }

        /* renamed from: b */
        private static /* synthetic */ EnumC5121a[] m25587b() {
            return new EnumC5121a[]{f12787c, f12788d};
        }

        public static EnumC5121a valueOf(String str) {
            return (EnumC5121a) Enum.valueOf(EnumC5121a.class, str);
        }

        public static EnumC5121a[] values() {
            return (EnumC5121a[]) f12789e.clone();
        }

        /* synthetic */ EnumC5121a(String str, int i, C5119p c5119p) {
            this(str, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m25590a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m25589b(Map<?, ?> map) {
        StringBuilder m25743a = C5069e.m25743a(map.size());
        m25743a.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                m25743a.append(", ");
            }
            z = false;
            m25743a.append(entry.getKey());
            m25743a.append('=');
            m25743a.append(entry.getValue());
        }
        m25743a.append('}');
        return m25743a.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <V> InterfaceC5039g<Map.Entry<?, V>, V> m25588c() {
        return EnumC5121a.f12788d;
    }
}
