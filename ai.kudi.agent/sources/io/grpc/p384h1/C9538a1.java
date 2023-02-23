package io.grpc.p384h1;

import com.google.common.base.C5051n;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.EnumC6913b;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: JsonParser.java */
/* renamed from: io.grpc.h1.a1 */
/* loaded from: classes2.dex */
public final class C9538a1 {

    /* renamed from: a */
    private static final Logger f22330a = Logger.getLogger(C9538a1.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonParser.java */
    /* renamed from: io.grpc.h1.a1$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C9539a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22331a;

        static {
            int[] iArr = new int[EnumC6913b.values().length];
            f22331a = iArr;
            try {
                iArr[EnumC6913b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22331a[EnumC6913b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22331a[EnumC6913b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22331a[EnumC6913b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22331a[EnumC6913b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22331a[EnumC6913b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private C9538a1() {
    }

    /* renamed from: a */
    public static Object m14486a(String str) throws IOException {
        C6911a c6911a = new C6911a(new StringReader(str));
        try {
            return m14482e(c6911a);
        } finally {
            try {
                c6911a.close();
            } catch (IOException e) {
                f22330a.log(Level.WARNING, "Failed to close", (Throwable) e);
            }
        }
    }

    /* renamed from: b */
    private static List<?> m14485b(C6911a c6911a) throws IOException {
        c6911a.mo20504c();
        ArrayList arrayList = new ArrayList();
        while (c6911a.mo20509V()) {
            arrayList.add(m14482e(c6911a));
        }
        boolean z = c6911a.mo20525C0() == EnumC6913b.END_ARRAY;
        C5051n.m25773u(z, "Bad token: " + c6911a.getPath());
        c6911a.mo20518J();
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: c */
    private static Void m14484c(C6911a c6911a) throws IOException {
        c6911a.mo20495w0();
        return null;
    }

    /* renamed from: d */
    private static Map<String, ?> m14483d(C6911a c6911a) throws IOException {
        c6911a.mo20502g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (c6911a.mo20509V()) {
            linkedHashMap.put(c6911a.mo20497o0(), m14482e(c6911a));
        }
        boolean z = c6911a.mo20525C0() == EnumC6913b.END_OBJECT;
        C5051n.m25773u(z, "Bad token: " + c6911a.getPath());
        c6911a.mo20514O();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: e */
    private static Object m14482e(C6911a c6911a) throws IOException {
        C5051n.m25773u(c6911a.mo20509V(), "unexpected end of JSON");
        switch (C9539a.f22331a[c6911a.mo20525C0().ordinal()]) {
            case 1:
                return m14485b(c6911a);
            case 2:
                return m14483d(c6911a);
            case 3:
                return c6911a.mo20493z0();
            case 4:
                return Double.valueOf(c6911a.mo20501g0());
            case 5:
                return Boolean.valueOf(c6911a.mo20503f0());
            case 6:
                return m14484c(c6911a);
            default:
                throw new IllegalStateException("Bad token: " + c6911a.getPath());
        }
    }
}
