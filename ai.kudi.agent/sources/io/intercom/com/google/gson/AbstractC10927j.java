package io.intercom.com.google.gson;

import io.intercom.com.google.gson.p418t.C10979l;
import io.intercom.com.google.gson.stream.C10942c;
import java.io.IOException;
import java.io.StringWriter;
/* compiled from: JsonElement.java */
/* renamed from: io.intercom.com.google.gson.j */
/* loaded from: classes3.dex */
public abstract class AbstractC10927j {
    /* renamed from: d */
    public C10924g m11931d() {
        if (m11928h()) {
            return (C10924g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: e */
    public C10929l m11930e() {
        if (m11926l()) {
            return (C10929l) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: f */
    public C10930m m11929f() {
        if (m11925m()) {
            return (C10930m) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: h */
    public boolean m11928h() {
        return this instanceof C10924g;
    }

    /* renamed from: k */
    public boolean m11927k() {
        return this instanceof C10928k;
    }

    /* renamed from: l */
    public boolean m11926l() {
        return this instanceof C10929l;
    }

    /* renamed from: m */
    public boolean m11925m() {
        return this instanceof C10930m;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C10942c c10942c = new C10942c(stringWriter);
            c10942c.m11871x0(true);
            C10979l.m11800b(this, c10942c);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
