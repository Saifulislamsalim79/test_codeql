package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p201g.p218e.C7521a;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.s5 */
/* loaded from: classes2.dex */
public final class C3985s5 implements InterfaceC4049w5 {

    /* renamed from: g */
    private static final Map<Uri, C3985s5> f9682g = new C7521a();

    /* renamed from: h */
    public static final String[] f9683h = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f9684a;

    /* renamed from: b */
    private final Uri f9685b;

    /* renamed from: e */
    private volatile Map<String, String> f9688e;

    /* renamed from: c */
    private final ContentObserver f9686c = new C3953q5(this, null);

    /* renamed from: d */
    private final Object f9687d = new Object();

    /* renamed from: f */
    private final List<InterfaceC4001t5> f9689f = new ArrayList();

    private C3985s5(ContentResolver contentResolver, Uri uri) {
        if (contentResolver == null) {
            throw null;
        }
        if (uri != null) {
            this.f9684a = contentResolver;
            this.f9685b = uri;
            contentResolver.registerContentObserver(uri, false, this.f9686c);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static C3985s5 m28980a(ContentResolver contentResolver, Uri uri) {
        C3985s5 c3985s5;
        synchronized (C3985s5.class) {
            c3985s5 = f9682g.get(uri);
            if (c3985s5 == null) {
                try {
                    C3985s5 c3985s52 = new C3985s5(contentResolver, uri);
                    try {
                        f9682g.put(uri, c3985s52);
                    } catch (SecurityException unused) {
                    }
                    c3985s5 = c3985s52;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c3985s5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static synchronized void m28977d() {
        synchronized (C3985s5.class) {
            for (C3985s5 c3985s5 : f9682g.values()) {
                c3985s5.f9684a.unregisterContentObserver(c3985s5.f9686c);
            }
            f9682g.clear();
        }
    }

    /* renamed from: b */
    public final Map<String, String> m28979b() {
        Map<String, String> map;
        Map<String, String> map2 = this.f9688e;
        if (map2 == null) {
            synchronized (this.f9687d) {
                map2 = this.f9688e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C4017u5.m28879a(new InterfaceC4033v5() { // from class: com.google.android.gms.internal.measurement.p5
                            @Override // com.google.android.gms.internal.measurement.InterfaceC4033v5
                            public final Object zza() {
                                return C3985s5.this.m28978c();
                            }
                        });
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.f9688e = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Map m28978c() {
        Map hashMap;
        Cursor query = this.f9684a.query(this.f9685b, f9683h, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new C7521a(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    /* renamed from: e */
    public final void m28976e() {
        synchronized (this.f9687d) {
            this.f9688e = null;
            AbstractC3892m6.m29397e();
        }
        synchronized (this) {
            for (InterfaceC4001t5 interfaceC4001t5 : this.f9689f) {
                interfaceC4001t5.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4049w5
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo28545f(String str) {
        return m28979b().get(str);
    }
}
