package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: MetadataBackendRegistry.java */
/* renamed from: com.google.android.datatransport.runtime.backends.k */
/* loaded from: classes2.dex */
class C2642k implements InterfaceC2634e {

    /* renamed from: a */
    private final C2643a f7414a;

    /* renamed from: b */
    private final C2640i f7415b;

    /* renamed from: c */
    private final Map<String, InterfaceC2645m> f7416c;

    /* compiled from: MetadataBackendRegistry.java */
    /* renamed from: com.google.android.datatransport.runtime.backends.k$a */
    /* loaded from: classes2.dex */
    static class C2643a {

        /* renamed from: a */
        private final Context f7417a;

        /* renamed from: b */
        private Map<String, String> f7418b = null;

        C2643a(Context context) {
            this.f7417a = context;
        }

        /* renamed from: a */
        private Map<String, String> m32454a(Context context) {
            Bundle m32451d = m32451d(context);
            if (m32451d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m32451d.keySet()) {
                Object obj = m32451d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m32452c() {
            if (this.f7418b == null) {
                this.f7418b = m32454a(this.f7417a);
            }
            return this.f7418b;
        }

        /* renamed from: d */
        private static Bundle m32451d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: b */
        InterfaceC2633d m32453b(String str) {
            String str2 = m32452c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC2633d) Class.forName(str2).asSubclass(InterfaceC2633d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2642k(Context context, C2640i c2640i) {
        this(new C2643a(context), c2640i);
    }

    @Override // com.google.android.datatransport.runtime.backends.InterfaceC2634e
    /* renamed from: b */
    public synchronized InterfaceC2645m mo32455b(String str) {
        if (this.f7416c.containsKey(str)) {
            return this.f7416c.get(str);
        }
        InterfaceC2633d m32453b = this.f7414a.m32453b(str);
        if (m32453b == null) {
            return null;
        }
        InterfaceC2645m create = m32453b.create(this.f7415b.m32459a(str));
        this.f7416c.put(str, create);
        return create;
    }

    C2642k(C2643a c2643a, C2640i c2640i) {
        this.f7416c = new HashMap();
        this.f7414a = c2643a;
        this.f7415b = c2640i;
    }
}
