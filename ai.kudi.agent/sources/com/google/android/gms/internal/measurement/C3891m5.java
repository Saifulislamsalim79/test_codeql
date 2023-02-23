package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.m5 */
/* loaded from: classes2.dex */
public final class C3891m5 {

    /* renamed from: f */
    static HashMap<String, String> f9475f;

    /* renamed from: k */
    private static Object f9480k;

    /* renamed from: l */
    private static boolean f9481l;

    /* renamed from: a */
    public static final Uri f9470a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f9471b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f9472c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f9473d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    private static final AtomicBoolean f9474e = new AtomicBoolean();

    /* renamed from: g */
    static final HashMap<String, Boolean> f9476g = new HashMap<>();

    /* renamed from: h */
    static final HashMap<String, Integer> f9477h = new HashMap<>();

    /* renamed from: i */
    static final HashMap<String, Long> f9478i = new HashMap<>();

    /* renamed from: j */
    static final HashMap<String, Float> f9479j = new HashMap<>();

    /* renamed from: m */
    static final String[] f9482m = new String[0];

    /* renamed from: a */
    public static String m29404a(ContentResolver contentResolver, String str, String str2) {
        synchronized (C3891m5.class) {
            if (f9475f == null) {
                f9474e.set(false);
                f9475f = new HashMap<>();
                f9480k = new Object();
                f9481l = false;
                contentResolver.registerContentObserver(f9470a, true, new C3876l5(null));
            } else if (f9474e.getAndSet(false)) {
                f9475f.clear();
                f9476g.clear();
                f9477h.clear();
                f9478i.clear();
                f9479j.clear();
                f9480k = new Object();
                f9481l = false;
            }
            Object obj = f9480k;
            if (f9475f.containsKey(str)) {
                String str3 = f9475f.get(str);
                if (str3 != null) {
                    r3 = str3;
                }
                return r3;
            }
            int length = f9482m.length;
            Cursor query = contentResolver.query(f9470a, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    m29402c(obj, str, null);
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                m29402c(obj, str, string);
                return string != null ? string : null;
            } finally {
                query.close();
            }
        }
    }

    /* renamed from: c */
    private static void m29402c(Object obj, String str, String str2) {
        synchronized (C3891m5.class) {
            if (obj == f9480k) {
                f9475f.put(str, str2);
            }
        }
    }
}
