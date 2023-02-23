package com.google.gson.internal.p183m;

import com.google.gson.internal.C6873d;
import java.lang.reflect.AccessibleObject;
/* compiled from: ReflectionAccessor.java */
/* renamed from: com.google.gson.internal.m.b */
/* loaded from: classes2.dex */
public abstract class AbstractC6896b {

    /* renamed from: a */
    private static final AbstractC6896b f16547a;

    static {
        f16547a = C6873d.m20587c() < 9 ? new C6895a() : new C6897c();
    }

    /* renamed from: a */
    public static AbstractC6896b m20556a() {
        return f16547a;
    }

    /* renamed from: b */
    public abstract void mo20555b(AccessibleObject accessibleObject);
}
