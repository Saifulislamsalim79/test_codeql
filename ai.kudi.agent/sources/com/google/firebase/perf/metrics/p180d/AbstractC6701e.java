package com.google.firebase.perf.metrics.p180d;

import android.content.Context;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p178j.EnumC6625b;
import com.google.firebase.perf.p178j.EnumC6626c;
import com.google.firebase.perf.p179k.C6671i;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: PerfMetricValidator.java */
/* renamed from: com.google.firebase.perf.metrics.d.e */
/* loaded from: classes2.dex */
public abstract class AbstractC6701e {
    /* renamed from: a */
    private static List<AbstractC6701e> m21065a(C6671i c6671i, Context context) {
        ArrayList arrayList = new ArrayList();
        if (c6671i.mo21203k()) {
            arrayList.add(new C6700d(c6671i.mo21202l()));
        }
        if (c6671i.mo21201o()) {
            arrayList.add(new C6699c(c6671i.mo21200p(), context));
        }
        if (c6671i.m21214X()) {
            arrayList.add(new C6697a(c6671i.m21215W()));
        }
        if (c6671i.mo21204i()) {
            arrayList.add(new C6698b(c6671i.mo21199q()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m21064b(C6671i c6671i, Context context) {
        List<AbstractC6701e> m21065a = m21065a(c6671i, context);
        if (m21065a.isEmpty()) {
            C6609a.m21475e().m21479a("No validators found for PerfMetric.");
            return false;
        }
        for (AbstractC6701e abstractC6701e : m21065a) {
            if (!abstractC6701e.mo21063c()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static String m21062d(Map.Entry<String, String> entry) {
        String key = entry.getKey();
        String value = entry.getValue();
        if (key == null) {
            return "Attribute key must not be null";
        }
        if (value == null) {
            return "Attribute value must not be null";
        }
        if (key.length() > 40) {
            return String.format(Locale.US, "Attribute key length must not exceed %d characters", 40);
        }
        if (value.length() > 100) {
            return String.format(Locale.US, "Attribute value length must not exceed %d characters", 100);
        }
        if (key.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            return null;
        }
        return "Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_";
    }

    /* renamed from: e */
    public static String m21061e(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (str.startsWith("_")) {
            for (EnumC6625b enumC6625b : EnumC6625b.values()) {
                if (enumC6625b.toString().equals(str)) {
                    return null;
                }
            }
            return "Metric name must not start with '_'";
        }
        return null;
    }

    /* renamed from: f */
    public static String m21060f(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (str.startsWith("_")) {
            for (EnumC6626c enumC6626c : EnumC6626c.values()) {
                if (enumC6626c.toString().equals(str)) {
                    return null;
                }
            }
            if (str.startsWith("_st_")) {
                return null;
            }
            return "Trace name must not start with '_'";
        }
        return null;
    }

    /* renamed from: c */
    public abstract boolean mo21063c();
}
