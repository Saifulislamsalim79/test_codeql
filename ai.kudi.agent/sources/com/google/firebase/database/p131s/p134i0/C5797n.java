package com.google.firebase.database.p131s.p134i0;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p139u.C5921b;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: Validation.java */
/* renamed from: com.google.firebase.database.s.i0.n */
/* loaded from: classes2.dex */
public class C5797n {

    /* renamed from: a */
    private static final Pattern f14232a = Pattern.compile("[\\[\\]\\.#$]");

    /* renamed from: b */
    private static final Pattern f14233b = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    /* renamed from: a */
    private static boolean m23737a(String str) {
        return !f14232a.matcher(str).find();
    }

    /* renamed from: b */
    private static boolean m23736b(String str) {
        return str != null && str.length() > 0 && (str.equals(".value") || str.equals(".priority") || !(str.startsWith(".") || f14233b.matcher(str).find()));
    }

    /* renamed from: c */
    private static boolean m23735c(C5830l c5830l) {
        C5921b m23587Z = c5830l.m23587Z();
        return m23587Z == null || !m23587Z.m23298b().startsWith(".");
    }

    /* renamed from: d */
    private static void m23734d(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new DatabaseException("Invalid value: Value cannot be NaN, Inf or -Inf.");
        }
    }

    /* renamed from: e */
    public static void m23733e(String str) throws DatabaseException {
        if (m23737a(str)) {
            return;
        }
        throw new DatabaseException("Invalid Firebase Database path: " + str + ". Firebase Database paths must not contain '.', '#', '$', '[', or ']'");
    }

    /* renamed from: f */
    public static void m23732f(String str) throws DatabaseException {
        if (str.startsWith(".info")) {
            m23733e(str.substring(5));
        } else if (str.startsWith("/.info")) {
            m23733e(str.substring(6));
        } else {
            m23733e(str);
        }
    }

    /* renamed from: g */
    public static void m23731g(String str) throws DatabaseException {
        if (m23736b(str)) {
            return;
        }
        throw new DatabaseException("Invalid key: " + str + ". Keys must not contain '/', '.', '#', '$', '[', or ']'");
    }

    /* renamed from: h */
    public static void m23730h(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey(".sv")) {
                return;
            }
            for (Map.Entry entry : map.entrySet()) {
                m23731g((String) entry.getKey());
                m23730h(entry.getValue());
            }
        } else if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m23730h(obj2);
            }
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            m23734d(((Double) obj).doubleValue());
        }
    }

    /* renamed from: i */
    public static void m23729i(C5830l c5830l) throws DatabaseException {
        if (m23735c(c5830l)) {
            return;
        }
        throw new DatabaseException("Invalid write location: " + c5830l.toString());
    }
}
