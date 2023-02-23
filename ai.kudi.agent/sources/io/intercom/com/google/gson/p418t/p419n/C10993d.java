package io.intercom.com.google.gson.p418t.p419n;

import io.intercom.com.google.gson.AbstractC10936q;
import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.InterfaceC10926i;
import io.intercom.com.google.gson.InterfaceC10932o;
import io.intercom.com.google.gson.InterfaceC10938r;
import io.intercom.com.google.gson.p418t.C10948c;
import io.intercom.com.google.gson.p422u.C11058a;
import io.intercom.com.google.gson.s.b;
/* compiled from: JsonAdapterAnnotationTypeAdapterFactory.java */
/* renamed from: io.intercom.com.google.gson.t.n.d */
/* loaded from: classes3.dex */
public final class C10993d implements InterfaceC10938r {

    /* renamed from: c */
    private final C10948c f25011c;

    public C10993d(C10948c c10948c) {
        this.f25011c = c10948c;
    }

    @Override // io.intercom.com.google.gson.InterfaceC10938r
    /* renamed from: a */
    public <T> AbstractC10936q<T> mo11671a(C10916e c10916e, C11058a<T> c11058a) {
        b bVar = (b) c11058a.m11659c().getAnnotation(b.class);
        if (bVar == null) {
            return null;
        }
        return (AbstractC10936q<T>) m11790b(this.f25011c, c10916e, c11058a, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC10936q<?> m11790b(C10948c c10948c, C10916e c10916e, C11058a<?> c11058a, b bVar) {
        AbstractC10936q<?> c11011l;
        Object mo11808a = c10948c.m11846a(C11058a.m11661a(bVar.value())).mo11808a();
        if (mo11808a instanceof AbstractC10936q) {
            c11011l = (AbstractC10936q) mo11808a;
        } else if (mo11808a instanceof InterfaceC10938r) {
            c11011l = ((InterfaceC10938r) mo11808a).mo11671a(c10916e, c11058a);
        } else {
            boolean z = mo11808a instanceof InterfaceC10932o;
            if (!z && !(mo11808a instanceof InterfaceC10926i)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + mo11808a.getClass().getName() + " as a @JsonAdapter for " + c11058a.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            c11011l = new C11011l<>(z ? (InterfaceC10932o) mo11808a : null, mo11808a instanceof InterfaceC10926i ? (InterfaceC10926i) mo11808a : null, c10916e, c11058a, null);
        }
        return (c11011l == null || !bVar.nullSafe()) ? c11011l : c11011l.m11908a();
    }
}
