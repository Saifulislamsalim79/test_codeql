package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.p170o.InterfaceC6560b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ComponentDiscovery.java */
/* renamed from: com.google.firebase.components.p */
/* loaded from: classes2.dex */
public final class C5300p<T> {

    /* renamed from: a */
    private final T f13130a;

    /* renamed from: b */
    private final InterfaceC5303c<T> f13131b;

    /* compiled from: ComponentDiscovery.java */
    /* renamed from: com.google.firebase.components.p$b */
    /* loaded from: classes2.dex */
    private static class C5302b implements InterfaceC5303c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f13132a;

        /* renamed from: b */
        private Bundle m25200b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f13132a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.f13132a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // com.google.firebase.components.C5300p.InterfaceC5303c
        /* renamed from: c */
        public List<String> mo25198a(Context context) {
            Bundle m25200b = m25200b(context);
            if (m25200b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m25200b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m25200b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private C5302b(Class<? extends Service> cls) {
            this.f13132a = cls;
        }
    }

    /* compiled from: ComponentDiscovery.java */
    /* renamed from: com.google.firebase.components.p$c */
    /* loaded from: classes2.dex */
    interface InterfaceC5303c<T> {
        /* renamed from: a */
        List<String> mo25198a(T t);
    }

    C5300p(T t, InterfaceC5303c<T> interfaceC5303c) {
        this.f13130a = t;
        this.f13131b = interfaceC5303c;
    }

    /* renamed from: b */
    public static C5300p<Context> m25203b(Context context, Class<? extends Service> cls) {
        return new C5300p<>(context, new C5302b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static InterfaceC5305r m25202c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (InterfaceC5305r.class.isAssignableFrom(cls)) {
                return (InterfaceC5305r) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        }
    }

    /* renamed from: a */
    public List<InterfaceC6560b<InterfaceC5305r>> m25204a() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f13131b.mo25198a(this.f13130a)) {
            arrayList.add(new InterfaceC6560b() { // from class: com.google.firebase.components.c
                @Override // com.google.firebase.p170o.InterfaceC6560b
                public final Object get() {
                    InterfaceC5305r m25202c;
                    m25202c = C5300p.m25202c(str);
                    return m25202c;
                }
            });
        }
        return arrayList;
    }
}
