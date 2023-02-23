package com.google.gson;

import com.google.gson.internal.C6887k;
import com.google.gson.stream.C6914c;
import java.io.IOException;
import java.io.StringWriter;
/* compiled from: JsonElement.java */
/* renamed from: com.google.gson.l */
/* loaded from: classes2.dex */
public abstract class AbstractC6900l {
    /* renamed from: d */
    public C6793i m20550d() {
        if (m20547h()) {
            return (C6793i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: e */
    public C6902n m20549e() {
        if (m20545l()) {
            return (C6902n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: f */
    public C6903o m20548f() {
        if (m20544m()) {
            return (C6903o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: h */
    public boolean m20547h() {
        return this instanceof C6793i;
    }

    /* renamed from: k */
    public boolean m20546k() {
        return this instanceof C6901m;
    }

    /* renamed from: l */
    public boolean m20545l() {
        return this instanceof C6902n;
    }

    /* renamed from: m */
    public boolean m20544m() {
        return this instanceof C6903o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C6914c c6914c = new C6914c(stringWriter);
            c6914c.m20465x0(true);
            C6887k.m20561b(this, c6914c);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
