package com.google.firebase.database.p129r;

import java.util.ArrayList;
import java.util.List;
/* compiled from: ConnectionUtils.java */
/* renamed from: com.google.firebase.database.r.k */
/* loaded from: classes2.dex */
public class C5687k {
    /* renamed from: a */
    public static void m24168a(boolean z) {
        m24167b(z, "", new Object[0]);
    }

    /* renamed from: b */
    public static void m24167b(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new AssertionError("hardAssert failed: " + String.format(str, objArr));
    }

    /* renamed from: c */
    public static Long m24166c(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    /* renamed from: d */
    public static String m24165d(List<String> list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : list) {
            if (!z) {
                sb.append("/");
            }
            z = false;
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static List<String> m24164e(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/", -1);
        for (int i = 0; i < split.length; i++) {
            if (!split[i].isEmpty()) {
                arrayList.add(split[i]);
            }
        }
        return arrayList;
    }
}
